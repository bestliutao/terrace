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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public String getTraineeData(){
        String pString = "http://"+ip+":8081/business/allStudentList";
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
            example.createCriteria().andCurrentstatusEqualTo("在所");
            List<TbTrainee> tbTrainees = tbTraineeMapper.selectByExample(example);
            totalNumber=tbTrainees.size();
            TbInsidenumber tbInsidenumber = tbInsidenumberMapper.selectByPrimaryKey(1);
            if (tbInsidenumber.getTotalnumber()==null){
                tbInsidenumber.setTotalnumber("0");
            }
            if(Integer.valueOf(tbInsidenumber.getTotalnumber())-totalNumber+entryNumber<0){
                outNumber=0;
            }else {
                outNumber=Integer.valueOf(tbInsidenumber.getTotalnumber())-totalNumber+entryNumber;
            }
            TbInsidenumber tbInsidenumber1 = new TbInsidenumber();
            tbInsidenumber1.setTotalnumber(String.valueOf(totalNumber));
            tbInsidenumber1.setEntrynumber(String.valueOf(entryNumber));
            tbInsidenumber1.setOutnumber(String.valueOf(outNumber));
            tbInsidenumber1.setId(1);
            tbInsidenumberMapper.updateByPrimaryKeySelective(tbInsidenumber1);
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
                 TbTraineeimage tbTraineeimage = tbTraineeimageMapper.selectByPrimaryKey(tbTrainee.getTraineecode());
                 if (tbTraineeimage!=null){
                     //更新
                     TbTraineeimage tbTrainee1 = new TbTraineeimage();
                     tbTrainee1.setTraineecode(tbTrainee.getTraineecode());
                     tbTrainee1.setTraineeimage(data);
                     tbTraineeimageMapper.updateByPrimaryKeySelective(tbTrainee1);
                 }else {
                     //插入
                     TbTraineeimage tbTrainee1 = new TbTraineeimage();
                     tbTrainee1.setTraineecode(tbTrainee.getTraineecode());
                     tbTrainee1.setTraineeimage(data);
                     tbTraineeimageMapper.insert(tbTrainee1);
                 }
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
