package cn.sznk.terrace.putServiceImpl;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.*;
import cn.sznk.terrace.pojo.VisitBean;
import cn.sznk.terrace.putService.HazardAnalysiService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HazardAnalysisServiceImpl implements HazardAnalysiService {
    @Autowired
    private TbModulusMapper tbModulusMapper;
    @Autowired
    private TbTraineeMapper tbTraineeMapper;
    @Autowired
    private TbOutapplicationMapper tbOutapplicationMapper;
    @Autowired
    private TbConsumptionMapper tbConsumptionMapper;
    @Autowired
    private TbManlablelMapper tbManlablelMapper;
    @Autowired
    private TraineeVisitMapper traineeVisitMapper;
    @Autowired
    private TbTraineeimageMapper tbTraineeimageMapper;


    //危险性学员展示
    public UserTable hazardStudentShow(String pageNo,String pageSize,String dept){
        TbModulus tbModulus=new TbModulus();
        TbModulusExample example = new TbModulusExample();
        example.createCriteria().andDeptCodeEqualTo(dept);
        List<TbModulus> tbModuluses = tbModulusMapper.selectByExample(example);
        for (TbModulus tbModulus1:tbModuluses){
            tbModulus=tbModulus1;
        }

        List<TbTrainee> hazardMan = tbTraineeMapper.findHazardMan(String.valueOf(tbModulus.getIdioctonia()), String.valueOf(tbModulus.getGetaway()), String.valueOf(tbModulus.getSuddendeath()), String.valueOf(tbModulus.getCommitmurder()),dept);

        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(hazardMan.size());
        userTable.setLast((int)Math.round(hazardMan.size()/3+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(hazardMan.size()/3+0.5)){
            for (int i=0;i<3;i++){
                int num  =(Integer.valueOf(pageNo)*3-3+i);
                list.add(hazardMan.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*3-3;i<hazardMan.size();i++){
                list.add(hazardMan.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }

    //全部人员搜索
    public UserTable allStudentShow(String pageNo,String pageSize,String value,String dept){
        List<TbTrainee> tbTrainees;
        tbTrainees = tbTraineeMapper.findUserByUserId(value,dept);
        if (tbTrainees.size()<=0){
            tbTrainees = tbTraineeMapper.findUserByUsername(value,dept);
        }
//        List<TbTrainee> tbTrainees=new ArrayList<>();
//        for (TbTrainee trainee:trainees){
//            if (tbTraineeimageMapper.selectByPrimaryKey(trainee.getTraineecode())!=null){
//                tbTrainees.add(trainee);
//            }
//        }
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbTrainees.size());
        userTable.setLast((int)Math.round(tbTrainees.size()/3+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbTrainees.size()/3+0.5)){
            for (int i=0;i<3;i++){
                int num  =(Integer.valueOf(pageNo)*3-3+i);
                list.add(tbTrainees.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*3-3;i<tbTrainees.size();i++){
                list.add(tbTrainees.get(i));
            }
        }

        userTable.setData(list);
        return userTable;
    }

    //三类外出申请人数统计
    public List<TitileNumBean> outNumStatistics(String date,String dept){
        List<TitileNumBean> titileNumBeans = tbOutapplicationMapper.outTypeNumberCensus(date,dept);
        if (titileNumBeans.size()<=0){
            TitileNumBean titileNumBean1=new TitileNumBean();
            titileNumBean1.setTitle("司法程序");
            titileNumBean1.setNumber("0");
            titileNumBeans.add(titileNumBean1);

            TitileNumBean titileNumBean2=new TitileNumBean();
            titileNumBean2.setTitle("外出就医");
            titileNumBean2.setNumber("0");
            titileNumBeans.add(titileNumBean2);

            TitileNumBean titileNumBean3=new TitileNumBean();
            titileNumBean3.setTitle("家庭变故");
            titileNumBean3.setNumber("0");
            titileNumBeans.add(titileNumBean3);
        }
        return titileNumBeans;
    }

    //学员消费金额人数统计
    public List<TitileNumBean> consumeMoneyNum(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        TitileNumBean titileNumBean1 = new TitileNumBean();
        titileNumBean1.setTitle("0-100");
        titileNumBean1.setNumber(String.valueOf(tbConsumptionMapper.consumptionNumber("0","100",date,dept)));
        titileNumBeans.add(titileNumBean1);

        TitileNumBean titileNumBean2 = new TitileNumBean();
        titileNumBean2.setTitle("100-500");
        titileNumBean2.setNumber(String.valueOf(tbConsumptionMapper.consumptionNumber("100","500",date,dept)));
        titileNumBeans.add(titileNumBean2);

        TitileNumBean titileNumBean3 = new TitileNumBean();
        titileNumBean3.setTitle("500-1000");
        titileNumBean3.setNumber(String.valueOf(tbConsumptionMapper.consumptionNumber("500","1000",date,dept)));
        titileNumBeans.add(titileNumBean3);

        TitileNumBean titileNumBean4 = new TitileNumBean();
        titileNumBean4.setTitle("1000-1500");
        titileNumBean4.setNumber(String.valueOf(tbConsumptionMapper.consumptionNumber("1000","1500",date,dept)));
        titileNumBeans.add(titileNumBean4);

        TitileNumBean titileNumBean5 = new TitileNumBean();
        titileNumBean5.setTitle("1500-2000");
        titileNumBean5.setNumber(String.valueOf(tbConsumptionMapper.consumptionNumber("1500","2000",date,dept)));
        titileNumBeans.add(titileNumBean5);

        TitileNumBean titileNumBean6 = new TitileNumBean();
        titileNumBean6.setTitle(">2000");
        titileNumBean6.setNumber(String.valueOf(tbConsumptionMapper.consumptionNumberTwo("2000",date,dept)));
        titileNumBeans.add(titileNumBean6);

        return  titileNumBeans;
    }

    //人员危险性分析人数统计
    public List<TitileNumBean> hazardPeopleNum(String dept){
        TbModulus tbModulus=new TbModulus();
        TbModulusExample example = new TbModulusExample();
        example.createCriteria().andDeptCodeEqualTo(dept);
        List<TbModulus> tbModuluses = tbModulusMapper.selectByExample(example);
        for (TbModulus tbModulus1:tbModuluses){
            tbModulus=tbModulus1;
        }

        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        TbTraineeExample example1 = new TbTraineeExample();
        example1.createCriteria().andUserIdioctoniaGreaterThan(tbModulus.getIdioctonia()).andDeptCodeEqualTo(dept);
        List<TbTrainee> tbTrainees = tbTraineeMapper.selectByExample(example1);
        TitileNumBean titileNumBean1 = new TitileNumBean();
        titileNumBean1.setTitle("自杀");
        titileNumBean1.setNumber(String.valueOf(tbTrainees.size()));
        titileNumBeans.add(titileNumBean1);

        TbTraineeExample example2 = new TbTraineeExample();
        example2.createCriteria().andUserWoundGreaterThan(tbModulus.getCommitmurder()).andDeptCodeEqualTo(dept);
        List<TbTrainee> tbTrainees2 = tbTraineeMapper.selectByExample(example2);
        TitileNumBean titileNumBean2 = new TitileNumBean();
        titileNumBean2.setTitle("行凶");
        titileNumBean2.setNumber(String.valueOf(tbTrainees2.size()));
        titileNumBeans.add(titileNumBean2);

        TbTraineeExample example3 = new TbTraineeExample();
        example3.createCriteria().andUserSuddendeathGreaterThan(tbModulus.getSuddendeath()).andDeptCodeEqualTo(dept);
        List<TbTrainee> tbTrainees3 = tbTraineeMapper.selectByExample(example3);
        TitileNumBean titileNumBean3 = new TitileNumBean();
        titileNumBean3.setTitle("猝死");
        titileNumBean3.setNumber(String.valueOf(tbTrainees3.size()));
        titileNumBeans.add(titileNumBean3);

        TbTraineeExample example4 = new TbTraineeExample();
        example4.createCriteria().andUserGetawayGreaterThan(tbModulus.getGetaway()).andDeptCodeEqualTo(dept);
        List<TbTrainee> tbTrainees4 = tbTraineeMapper.selectByExample(example4);
        TitileNumBean titileNumBean4 = new TitileNumBean();
        titileNumBean4.setTitle("逃脱");
        titileNumBean4.setNumber(String.valueOf(tbTrainees4.size()));
        titileNumBeans.add(titileNumBean4);

        TitileNumBean titileNumBean5 = new TitileNumBean();
        titileNumBean5.setTitle("其他");
        titileNumBean5.setNumber("0");
        titileNumBeans.add(titileNumBean5);
        return titileNumBeans;
    }

    //人员危险性细节页
    public UserTable hazardDetilsMan(String pageNo,String pageSize,String type,String dept){
        TbModulus tbModulus=new TbModulus();
        TbModulusExample modulusExample = new TbModulusExample();
        modulusExample.createCriteria().andDeptCodeEqualTo(dept);
        List<TbModulus> tbModuluses = tbModulusMapper.selectByExample(modulusExample);
        for (TbModulus tbModulus1:tbModuluses){
            tbModulus=tbModulus1;
        }

        TbTraineeExample example = new TbTraineeExample();
        List<TbTrainee> tbTrainees = new ArrayList<>();
        switch (type){
            case "自杀":
                example.createCriteria().andUserIdioctoniaGreaterThan(tbModulus.getIdioctonia()).andDeptCodeEqualTo(dept);
                tbTrainees = tbTraineeMapper.selectByExample(example);
                break;
            case "猝死":
                example.createCriteria().andUserSuddendeathGreaterThan(tbModulus.getSuddendeath()).andDeptCodeEqualTo(dept);
                tbTrainees = tbTraineeMapper.selectByExample(example);
                break;
            case "行凶":
                example.createCriteria().andUserWoundGreaterThan(tbModulus.getCommitmurder()).andDeptCodeEqualTo(dept);
                tbTrainees = tbTraineeMapper.selectByExample(example);
                break;
            case "逃脱":
                example.createCriteria().andUserGetawayGreaterThan(tbModulus.getGetaway()).andDeptCodeEqualTo(dept);
                tbTrainees = tbTraineeMapper.selectByExample(example);
                break;
            default:
                break;
        }
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbTrainees.size());
        userTable.setLast((int)Math.round(tbTrainees.size()/20+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbTrainees.size()/20+0.5)){
            for (int i=0;i<20;i++){
                int num  =(Integer.valueOf(pageNo)*20-20+i);
                list.add(tbTrainees.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*20-20;i<tbTrainees.size();i++){
                list.add(tbTrainees.get(i));
            }
        }

        userTable.setData(list);
        return userTable;
    }

    //外出申请细节页
    public UserTable outDetilsMan(String pageNo,String pageSize,String type,String dept){
        TbOutapplicationExample example = new TbOutapplicationExample();
        example.createCriteria().andOutTypeEqualTo(type).andDeptCodeEqualTo(dept);
        List<TbOutapplication> tbOutapplications = tbOutapplicationMapper.selectByExample(example);
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbOutapplications.size());
        userTable.setLast((int)Math.round(tbOutapplications.size()/20+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbOutapplications.size()/20+0.5)){
            for (int i=0;i<20;i++){
                int num  =(Integer.valueOf(pageNo)*20-20+i);
                list.add(tbOutapplications.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*20-20;i<tbOutapplications.size();i++){
                list.add(tbOutapplications.get(i));
            }
        }

        userTable.setData(list);
        return userTable;
    }

    //人员消费细节页
    public UserTable consumeMoneyDetils(String pageNo,String pageSize,String type,String dept){
        String[] money=type.split("-");
        TbConsumptionExample example = new TbConsumptionExample();
        if (Integer.valueOf(money[0])>=2000){
            example.createCriteria().andConsumptionMoneyGreaterThan(Integer.valueOf(money[0])).andDeptCodeEqualTo(dept);
        }else {
            example.createCriteria().andConsumptionMoneyBetween(Integer.valueOf(money[0]),Integer.valueOf(money[1])).andDeptCodeEqualTo(dept);
        }
        List<TbConsumption> tbConsumptions = tbConsumptionMapper.selectByExample(example);
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbConsumptions.size());
        userTable.setLast((int)Math.round(tbConsumptions.size()/20+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbConsumptions.size()/20+0.5)){
            for (int i=0;i<20;i++){
                int num  =(Integer.valueOf(pageNo)*20-20+i);
                list.add(tbConsumptions.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*20-20;i<tbConsumptions.size();i++){
                list.add(tbConsumptions.get(i));
            }
        }
        userTable.setData(list);
        return userTable;

    }


    //人员详细档案标签展示
    public List<TbManlablel> hazardManLabel(String id){
        TbManlablelExample example = new TbManlablelExample();
        example.createCriteria().andUserIdEqualTo(id);
        List<TbManlablel> tbManlablels = tbManlablelMapper.selectByExample(example);
        return tbManlablels;
    }


    //探访次数统计
    public E3Result visitNumber(String dept){
        List<String> strings = traineeVisitMapper.visitNumber("5",dept);
        List<String> strings1 = traineeVisitMapper.visitNumber("10",dept);
        List<String> strings2 = traineeVisitMapper.visitNumber("20",dept);
        List<String> strings3 = traineeVisitMapper.visitNumber("300",dept);
        VisitBean visitBean = new VisitBean();
        if (strings.size()>0){
            visitBean.setLessThanFive(String.valueOf(strings.size()));
        }else {
            visitBean.setLessThanFive(String.valueOf(0));
        }
        if (strings1.size()-strings.size()>0){
            visitBean.setLessThanTen(String.valueOf(strings1.size()-strings.size()));
        }else {
            visitBean.setLessThanTen(String.valueOf(0));
        }
        if (strings2.size()-strings1.size()>0){
            visitBean.setLessThanTwenty(String.valueOf(strings2.size()-strings1.size()));
        }else {
            visitBean.setLessThanTwenty(String.valueOf(0));
        }
        if (strings3.size()-strings2.size()>0){
            visitBean.setGressThanTwenty(String.valueOf(strings3.size()-strings2.size()));
        }else {
            visitBean.setGressThanTwenty(String.valueOf(0));
        }
        return E3Result.ok(visitBean);
    }

    //人员头像
    public E3Result manPhoto(String id){
        String s = tbTraineeimageMapper.traineePhoto(id);
        if (s==null){
            return E3Result.ok();
        }
        return E3Result.ok(s);
    }
}
