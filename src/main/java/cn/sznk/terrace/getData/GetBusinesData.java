package cn.sznk.terrace.getData;

import cn.sznk.terrace.TerraceApplication;
import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.*;
import cn.sznk.terrace.utils.E3Result;
import cn.sznk.terrace.utils.JsonUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@Service
public class GetBusinesData {
    @Autowired
    private TbTraineeMapper tbTraineeMapper;
    @Autowired
    private TbTraineeimageMapper tbTraineeimageMapper;
    @Autowired
    private TraineeVisitMapper traineeVisitMapper;
    @Autowired
    private TbInsidenumberMapper tbInsidenumberMapper;
    @Autowired
    private TbMonitorabnormalMapper tbMonitorabnormalMapper;
    @Autowired
    private TbEnvirmsgMapper tbEnvirmsgMapper;
    @Autowired
    private EnvirOidMapper envirOidMapper;
    private String ip="localhost";

    /*
    * 获取学员信息
    * */
    public String getTraineeData(String dept){
        String pString = "http://"+ip+":8081/business/allStudentList?dept="+dept;
        int entryNumber=0,totalNumber=0,outNumber=0;
        if (httpGetData(pString)==null||httpGetData(pString).equals("")){
            return "400";
        }else {
            String getData = httpGetData(pString);
            JSONObject jsonObject =JSONObject.parseObject(getData);
            //获取到数据
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            JsonUtils jsonUtils = new JsonUtils();
            //将数据自动转成对象
            List<Trainee> trainees = jsonUtils.jsonToList(jsonArray.toString(), Trainee.class);
            //遍历对象插入
            for (Trainee trainee:trainees){
                TbTrainee tbTrainee = new TbTrainee();
                //将对象复制给插入数据库的对象中
                BeanUtils.copyProperties(trainee, tbTrainee);
                //根据主键查询 无则插入 有则更新
                TbTrainee tbTrainee1 = tbTraineeMapper.selectByPrimaryKey(tbTrainee.getTraineecode());
                if (tbTrainee1==null){
                    tbTraineeMapper.insert(tbTrainee);
                    entryNumber++;
                }else {
                    TbTraineeExample example = new TbTraineeExample();
                    example.createCriteria().andTraineecodeEqualTo(tbTrainee.getTraineecode());
                    tbTraineeMapper.updateByExampleSelective(tbTrainee,example);

                }
            }
            TbTraineeExample example = new TbTraineeExample();
            example.createCriteria().andCurrentstatusEqualTo("在所").andDeptCodeEqualTo(dept);
            List<TbTrainee> tbTrainees = tbTraineeMapper.selectByExample(example);
            totalNumber=tbTrainees.size();

            TbInsidenumberExample example1 = new TbInsidenumberExample();
            example1.createCriteria().andDeptCodeEqualTo(dept);
            List<TbInsidenumber> tbInsidenumbers = tbInsidenumberMapper.selectByExample(example1);
            if (tbInsidenumbers.size()<=0){
                for (TbInsidenumber tbInsidenumber:tbInsidenumbers){
                    if (tbInsidenumber.getTotalnumber()==null){
                        tbInsidenumber.setTotalnumber("0");
                    }
                    if(Integer.valueOf(tbInsidenumber.getTotalnumber())-totalNumber+entryNumber<0){
                        outNumber=0;
                    }else {
                        outNumber=Integer.valueOf(tbInsidenumber.getTotalnumber())-totalNumber+entryNumber;
                    }
                }
                TbInsidenumber tbInsidenumber1 = new TbInsidenumber();
                tbInsidenumber1.setTotalnumber(String.valueOf(totalNumber));
                tbInsidenumber1.setEntrynumber(String.valueOf(entryNumber));
                tbInsidenumber1.setOutnumber(String.valueOf(outNumber));
                tbInsidenumber1.setDeptCode(dept);
                tbInsidenumber1.setId(null);
                tbInsidenumberMapper.insertSelective(tbInsidenumber1);
            }else {
                for (TbInsidenumber tbInsidenumber:tbInsidenumbers){
                    if (tbInsidenumber.getTotalnumber()==null){
                        tbInsidenumber.setTotalnumber("0");
                    }
                    if(Integer.valueOf(tbInsidenumber.getTotalnumber())-totalNumber+entryNumber<0){
                        outNumber=0;
                    }else {
                        outNumber=Integer.valueOf(tbInsidenumber.getTotalnumber())-totalNumber+entryNumber;
                    }
                    tbInsidenumber.setTotalnumber(String.valueOf(totalNumber));
                    tbInsidenumber.setEntrynumber(String.valueOf(entryNumber));
                    tbInsidenumber.setOutnumber(String.valueOf(outNumber));
                    tbInsidenumber.setDeptCode(dept);
                    tbInsidenumberMapper.updateByPrimaryKey(tbInsidenumber);
                }

            }

            return "200";
        }

    }

     /*
    *
    * 获取学员头像信息
    *
    * */
    public String getTraineeImage(){
        String msg = "http://"+ip+":8081/business/studentImage?idCode=55180010";
        if(httpGetData(msg)==null||httpGetData(msg).equals("")){
            return "400";
        }
         TbTraineeExample example = new TbTraineeExample();
         List<TbTrainee> tbTrainees = tbTraineeMapper.selectByExample(example);
         for (TbTrainee tbTrainee:tbTrainees){
             String pString = "http://"+ip+":8081/business/studentImage?idCode="+tbTrainee.getTraineecode();
             String getData = httpGetData(pString);
             JSONObject jsonObject =JSONObject.parseObject(getData);
             String status = jsonObject.getString("status");
             if (status.equals("200")){
                 String data = jsonObject.getString("data");
                 GenerateImage(data,tbTrainee.getTraineecode());
             }
         }
         return "200";
     }

      /*
    *
    * 获取学员探访信息
    *
    * */
    public String getTraineeVisit(){
        String pString = "http://"+ip+":8081/business/visit";
        if (httpGetData(pString)==null||httpGetData(pString).equals("")){
            return "400";
        }
        String getData = httpGetData(pString);
        JSONObject jsonObject =JSONObject.parseObject(getData);
        //获取到数据
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        JsonUtils jsonUtils = new JsonUtils();
        //将数据自动转成对象
        List<TraineeVisit> traineeVisits = jsonUtils.jsonToList(jsonArray.toString(), TraineeVisit.class);
        //遍历对象插入
        for (TraineeVisit traineeVisit:traineeVisits){
            TraineeVisit traineeVisit1 = traineeVisitMapper.selectByPrimaryKey(traineeVisit.getVisitno());
            if (traineeVisit1==null){
                //插入
                traineeVisitMapper.insert(traineeVisit);
            }else {
                //更新
                traineeVisitMapper.updateByPrimaryKeySelective(traineeVisit);
            }
        }
        return "200";
    }

    /*
       *
       * 获取摄像头异常信息
       *
       * */
    public String getMonitorMsg(){
        String pString = "http://"+ip+":8081/downMonitorMsg";
        if (httpGetData(pString)==null||httpGetData(pString).equals("")){
            return "400";
        }
        String getData = httpGetData(pString);
        JSONObject jsonObject =JSONObject.parseObject(getData);
        //获取到数据
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        JsonUtils jsonUtils = new JsonUtils();
        //将数据自动转成对象
        List<TbMonitorabnormal> tbMonitorabnormals = jsonUtils.jsonToList(jsonArray.toString(), TbMonitorabnormal.class);
        //遍历对象插入
        for (TbMonitorabnormal tbMonitorabnormal:tbMonitorabnormals){
            TbMonitorabnormal tbMonitorabnormal1 = tbMonitorabnormalMapper.selectByPrimaryKey(tbMonitorabnormal.getMonitorIp());
            if (tbMonitorabnormal1==null){
                //插入
                tbMonitorabnormalMapper.insert(tbMonitorabnormal);
            }else {
                //更新
                tbMonitorabnormalMapper.updateByPrimaryKeySelective(tbMonitorabnormal);
            }
        }
        return "200";
    }

    /*
       *
       * 获取环控异常信息
       *
       * */
    public String getEnviorMsg(){
        String pString = "http://"+ip+":8081/selectEnvirValue";
        if (httpGetData(pString)==null||httpGetData(pString).equals("")){
            return "400";
        }
        String getData = httpGetData(pString);
        JSONObject jsonObject =JSONObject.parseObject(getData);
        //获取到数据
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        JsonUtils jsonUtils = new JsonUtils();
        //将数据自动转成对象
        List<TbEnvirmsg> tbEnvirmsgs = jsonUtils.jsonToList(jsonArray.toString(), TbEnvirmsg.class);
        //遍历对象插入
        for (TbEnvirmsg tbEnvirmsg:tbEnvirmsgs){
            TbEnvirmsg tbEnvirmsg1 = tbEnvirmsgMapper.selectByPrimaryKey(tbEnvirmsg.getEnvirOid());
            if (tbEnvirmsg1==null){
                //插入
                EnvirOid envirOid = envirOidMapper.selectByPrimaryKey(tbEnvirmsg.getEnvirOid());
                //大于上限
                if (Double.parseDouble(tbEnvirmsg.getEnvirValue())>=envirOid.getMaxValue()){
                    tbEnvirmsg.setEnvirStatus("0");
                    tbEnvirmsg.setEnvirLevel("A");
                    tbEnvirmsg.setEnvirType("超出上限值");
                    tbEnvirmsgMapper.insertSelective(tbEnvirmsg);
                }else if (Double.parseDouble(tbEnvirmsg.getEnvirValue())<=envirOid.getMinValue()){
                    tbEnvirmsg.setEnvirStatus("0");
                    tbEnvirmsg.setEnvirLevel("A");
                    tbEnvirmsg.setEnvirType("低于下限值");
                    tbEnvirmsgMapper.insertSelective(tbEnvirmsg);
                }
            }else {
                //更新
                EnvirOid envirOid = envirOidMapper.selectByPrimaryKey(tbEnvirmsg.getEnvirOid());
                //大于上限
                if (Double.parseDouble(tbEnvirmsg.getEnvirValue())>=envirOid.getMaxValue()){
                    tbEnvirmsg.setEnvirStatus("0");
                    tbEnvirmsg.setEnvirLevel("A");
                    tbEnvirmsg.setEnvirType("超出上限值");
                    tbEnvirmsgMapper.updateByPrimaryKeySelective(tbEnvirmsg);
                }else if (Double.parseDouble(tbEnvirmsg.getEnvirValue())<=envirOid.getMinValue()){
                    tbEnvirmsg.setEnvirStatus("0");
                    tbEnvirmsg.setEnvirLevel("A");
                    tbEnvirmsg.setEnvirType("低于下限值");
                    tbEnvirmsgMapper.updateByPrimaryKeySelective(tbEnvirmsg);
                }else {
                    tbEnvirmsg.setEnvirStatus("1");
                    tbEnvirmsgMapper.updateByPrimaryKeySelective(tbEnvirmsg);
                }
            }
        }
        return "200";
    }


    //base64字符串转化成图片
    public static boolean GenerateImage(String imgStr,String code)
    {   //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try
        {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成目录
            File path=new File(ResourceUtils.getURL("classpath:").getPath());
            if(!path.exists()){
                path=new File("");
            }
            //如果上传目录为/static/images/upload/,则可以如下获取
            File upload=new File(path.getAbsolutePath(),"static/photo");
            if(!upload.exists()) {
                upload.mkdirs();
            }
            //生成jpeg图片
            OutputStream out = new FileOutputStream(upload.getAbsolutePath()+"\\"+code+".jpg");
            out.write(b);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }


    public String httpGetData(String path) {
        StringBuffer document = null ;
        BufferedReader reader = null;
        String line = null;
        try {
            URL url = new URL(path);
            document = new StringBuffer();
            URLConnection conn = url.openConnection();
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            while ((line = reader.readLine()) != null) {
                document.append(line);
            }
        } catch (Exception e) {
            System.out.println(path+"失败原因:"+e.getMessage());
            return document.toString();
//            throw new RuntimeException("获取外部数据失败，原因：" + e.getMessage());
        } finally {
            try {
                if (reader!=null){
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return document.toString();
    }
}
