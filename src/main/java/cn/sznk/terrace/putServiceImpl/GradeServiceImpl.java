package cn.sznk.terrace.putServiceImpl;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.TbGrademonthMapper;
import cn.sznk.terrace.mapper.TbGradeyearMapper;
import cn.sznk.terrace.putService.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private TbGradeyearMapper tbGradeyearMapper;
    @Autowired
    private TbGrademonthMapper tbGrademonthMapper;

    //全部 一年 平均分接口
    public List<TitileNumBean> avgGradeAll(String year,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        for (int i = 1; i <=12 ; i++) {
            String s = tbGrademonthMapper.sixMonth(year + "-" + i,dept);
            TitileNumBean titileNumBean = new TitileNumBean();
            titileNumBean.setTitle(i+"月");
            titileNumBean.setNumber(s);
            titileNumBeans.add(titileNumBean);
        }
        return  titileNumBeans;
    }
    //一年期 一年 平均分接口
    public List<TitileNumBean> avgGradeOtherYear(String statge,String year,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        for (int i = 1; i <=12 ; i++) {
            String s = tbGrademonthMapper.sixMonthOther(year + "-" + i,"一年期",dept);
            TitileNumBean titileNumBean = new TitileNumBean();
            titileNumBean.setTitle(i+"月");
            titileNumBean.setNumber(s);
            titileNumBeans.add(titileNumBean);
        }
        return  titileNumBeans;
    }
    //期满 一年 平均分接口
    public List<TitileNumBean> avgGradeOtherAll(String statge,String year,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        for (int i = 1; i <=12 ; i++) {
            String s = tbGrademonthMapper.sixMonthOther(year + "-" + i,"期满",dept);
            TitileNumBean titileNumBean = new TitileNumBean();
            titileNumBean.setTitle(i+"月");
            titileNumBean.setNumber(s);
            titileNumBeans.add(titileNumBean);
        }
        return  titileNumBeans;
    }
    //生理戒毒期 一年 平均分接口
    public List<TitileNumBean> avgGradeOtherAbs(String statge,String year,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        for (int i = 1; i <=12 ; i++) {
            String s = tbGrademonthMapper.sixMonthOther(year + "-" + i,"生理脱毒期",dept);
            TitileNumBean titileNumBean = new TitileNumBean();
            titileNumBean.setTitle(i+"月");
            titileNumBean.setNumber(s);
            titileNumBeans.add(titileNumBean);
        }
        return  titileNumBeans;
    }



    //戒治效能统计（人数/分数）
    public List<AbstinenceGradeBean> abstinenceGrade(String date,String dept){
        List<AbstinenceGradeBean> gradeBeans = new ArrayList<>();
        AbstinenceGradeBean gradeBean = new AbstinenceGradeBean();
        List<TitileNumBean> titileNumBeans = tbGrademonthMapper.gradeMonthOne(date,dept);
        gradeBean.setType("60分以下");
        gradeBean.setNumber(titileNumBeans);
        gradeBeans.add(gradeBean);

        AbstinenceGradeBean gradeBean1 = new AbstinenceGradeBean();
        List<TitileNumBean> titileNumBeans1 = tbGrademonthMapper.gradeMonthTwo("60","70",date,dept);

        gradeBean1.setType("60-70");
        gradeBean1.setNumber(titileNumBeans1);
        gradeBeans.add(gradeBean1);

        AbstinenceGradeBean gradeBean2 = new AbstinenceGradeBean();
        List<TitileNumBean> titileNumBeans2 = tbGrademonthMapper.gradeMonthTwo("70","80",date,dept);
        gradeBean2.setType("70-80");
        gradeBean2.setNumber(titileNumBeans2);
        gradeBeans.add(gradeBean2);

        AbstinenceGradeBean gradeBean3 = new AbstinenceGradeBean();
        List<TitileNumBean> titileNumBeans3 = tbGrademonthMapper.gradeMonthTwo("80","90",date,dept);
        gradeBean3.setType("70-80");
        gradeBean3.setNumber(titileNumBeans3);
        gradeBeans.add(gradeBean3);

        AbstinenceGradeBean gradeBean4 = new AbstinenceGradeBean();
        List<TitileNumBean> titileNumBeans4 = tbGrademonthMapper.gradeMonthTwo("90","100",date,dept);
        gradeBean4.setType("90-100");
        gradeBean4.setNumber(titileNumBeans4);
        gradeBeans.add(gradeBean4);
        return gradeBeans;
    }

    //全部 6个月 平均分统计
    public List<TitileNumBean> sixMonths(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd= date.split("-");
        if(Integer.valueOf(dd[1])>=6){
            for (int i=5;i>=0;i--){
                int month = Integer.valueOf(dd[1])-i;
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonth(dd[0] + "-" + month,dept);
                titileNumBean.setTitle(month+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }else {
            for (int i=6-Integer.valueOf(dd[1]);i>0;i--){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonth((Integer.valueOf(dd[0])-1)+"-"+(13-i),dept);
                titileNumBean.setTitle((13-i)+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
            for (int i=1;i<=Integer.valueOf(dd[1]);i++){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonth(dd[0]+"-"+i,dept);
                titileNumBean.setTitle(i+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }
        return titileNumBeans;
    }

    //一年期 6个月 平均分
    public List<TitileNumBean> sixMonthsYear(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd= date.split("-");
        if(Integer.valueOf(dd[1])>=6){
            for (int i=5;i>=0;i--){
                int month = Integer.valueOf(dd[1])-i;
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther(dd[0] + "-" + month,"一年期",dept);
                titileNumBean.setTitle(month+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }else {
            for (int i=6-Integer.valueOf(dd[1]);i>0;i--){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther((Integer.valueOf(dd[0])-1)+"-"+(13-i),"一年期",dept);
                titileNumBean.setTitle((13-i)+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
            for (int i=1;i<=Integer.valueOf(dd[1]);i++){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther(dd[0]+"-"+i,"一年期",dept);
                titileNumBean.setTitle(i+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }
        return titileNumBeans;
    }

    //期满 6个月 平均分
    public List<TitileNumBean> sixMonthsAll(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd= date.split("-");
        if(Integer.valueOf(dd[1])>=6){
            for (int i=5;i>=0;i--){
                int month = Integer.valueOf(dd[1])-i;
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther(dd[0] + "-" + month,"期满",dept);
                titileNumBean.setTitle(month+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }else {
            for (int i=6-Integer.valueOf(dd[1]);i>0;i--){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther((Integer.valueOf(dd[0])-1)+"-"+(13-i),"期满",dept);
                titileNumBean.setTitle((13-i)+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
            for (int i=1;i<=Integer.valueOf(dd[1]);i++){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther(dd[0]+"-"+i,"期满",dept);
                titileNumBean.setTitle(i+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }
        return titileNumBeans;
    }
    //生理戒毒期 6个月 平均分
    public List<TitileNumBean> sixMonthsAbs(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd= date.split("-");
        if(Integer.valueOf(dd[1])>=6){
            for (int i=5;i>=0;i--){
                int month = Integer.valueOf(dd[1])-i;
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther(dd[0] + "-" + month,"生理脱毒期",dept);
                titileNumBean.setTitle(month+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }else {
            for (int i=6-Integer.valueOf(dd[1]);i>0;i--){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther((Integer.valueOf(dd[0])-1)+"-"+(13-i),"生理戒毒期",dept);
                titileNumBean.setTitle((13-i)+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
            for (int i=1;i<=Integer.valueOf(dd[1]);i++){
                TitileNumBean titileNumBean = new TitileNumBean();
                String s = tbGrademonthMapper.sixMonthOther(dd[0]+"-"+i,"生理戒毒期",dept);
                titileNumBean.setTitle(i+"月");
                titileNumBean.setNumber(s);
                titileNumBeans.add(titileNumBean);
            }
        }
        return titileNumBeans;
    }


    //人员6大类分数
    public List<TbGrademonth> manSixMonth(String id,String date,String dept){
        TbGrademonthExample example = new TbGrademonthExample();
        example.createCriteria().andUserIdEqualTo(id).andTimeEqualTo(date).andDeptCodeEqualTo(dept);
        List<TbGrademonth> tbGrademonths = tbGrademonthMapper.selectByExample(example);
        return tbGrademonths;
    }

    //全部人员分数
    public UserTable statgeStudentGrade(String type,String statge,String time,String pageNo,String pageSize,String dept){

        List<TbGrademonth> tbGrademonths=new ArrayList<>();
        if(statge.equals("全部")){
            switch (type){
                case "全部":
                    TbGrademonthExample example = new TbGrademonthExample();
                    example.createCriteria().andTimeEqualTo(time).andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example);
                    break;
                case "60分以下":
                    TbGrademonthExample example1 = new TbGrademonthExample();
                    example1.createCriteria().andTimeEqualTo(time).andUserGradeLessThan("60").andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example1);
                    break;
                case "60-70":
                    TbGrademonthExample example2 = new TbGrademonthExample();
                    example2.createCriteria().andTimeEqualTo(time.trim()).andUserGradeGreaterThan("60").andUserGradeLessThan("70").andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example2);
                    break;
                case "70-80":
                    TbGrademonthExample example3 = new TbGrademonthExample();
                    example3.createCriteria().andTimeEqualTo(time.trim()).andUserGradeGreaterThan("70").andUserGradeLessThan("80").andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example3);
                    break;
                case "80-90": ;
                    TbGrademonthExample example4 = new TbGrademonthExample();
                    example4.createCriteria().andTimeEqualTo(time.trim()).andUserGradeGreaterThan("80").andUserGradeLessThan("90").andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example4);
                    break;
                case "90-100":
                    TbGrademonthExample example5 = new TbGrademonthExample();
                    example5.createCriteria().andTimeEqualTo(time).andUserGradeGreaterThan("90").andUserGradeLessThan("100").andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example5);
                    break;
            }
        }else {
            switch (type){
                case "全部":
                    TbGrademonthExample example = new TbGrademonthExample();
                    example.createCriteria().andTimeEqualTo(time).andStatgeEqualTo(statge).andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example);
                    break;
                case "60分以下":
                    TbGrademonthExample example1 = new TbGrademonthExample();
                    example1.createCriteria().andTimeEqualTo(time).andUserGradeLessThan("60").andStatgeEqualTo(statge).andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example1);
                    break;
                case "60-70":
                    TbGrademonthExample example2 = new TbGrademonthExample();
                    example2.createCriteria().andTimeEqualTo(time).andUserGradeGreaterThan("60").andUserGradeLessThan("70").andStatgeEqualTo(statge).andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example2);
                    break;
                case "70-80":
                    TbGrademonthExample example3 = new TbGrademonthExample();
                    example3.createCriteria().andTimeEqualTo(time).andUserGradeGreaterThan("70").andUserGradeLessThan("80").andStatgeEqualTo(statge).andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example3);
                    break;
                case "80-90":
                    TbGrademonthExample example4 = new TbGrademonthExample();
                    example4.createCriteria().andTimeEqualTo(time).andUserGradeGreaterThan("80").andUserGradeLessThan("90").andStatgeEqualTo(statge).andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example4);
                    break;
                case "90-100":
                    TbGrademonthExample example5 = new TbGrademonthExample();
                    example5.createCriteria().andTimeEqualTo(time).andUserGradeGreaterThan("90").andUserGradeLessThan("100").andStatgeEqualTo(statge).andDeptCodeEqualTo(dept);
                    tbGrademonths = tbGrademonthMapper.selectByExample(example5);
                    break;
            }
        }
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbGrademonths.size());
        userTable.setLast((int)Math.round(tbGrademonths.size()/12+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbGrademonths.size()/12+0.5)){
            for (int i=0;i<12;i++){
                int num  =(Integer.valueOf(pageNo)*12-12+i);
                list.add(tbGrademonths.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*12-12;i<tbGrademonths.size();i++){
                list.add(tbGrademonths.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }

    //扣分最多
    public UserTable deductPoints(String type, String statge, String time, String pageNo, String pageSize,String dept){
        List<TbGrademonth> tbGrademonths=new ArrayList<>();
        if(statge.equals("全部")){
            System.out.println(type+""+statge+""+time);
            switch (type){
                case "全部":
                    tbGrademonths = tbGrademonthMapper.deductPointsMoreThree(time,dept);
                    break;
                case "60分以下":
                    tbGrademonths = tbGrademonthMapper.deductPointsMoreTwo(time,"","60",dept);
                    break;
                case "60-70":
                    tbGrademonths = tbGrademonthMapper.deductPointsMoreTwo(time,"60","70",dept);
                    break;
                case "70-80":
                    tbGrademonths = tbGrademonthMapper.deductPointsMoreTwo(time,"70","80",dept);
                    break;
                case "80-90":
                    tbGrademonths = tbGrademonthMapper.deductPointsMoreTwo(time,"80","90",dept);
                    break;
                case "90-100":
                    tbGrademonths = tbGrademonthMapper.deductPointsMoreTwo(time,"90","100",dept);
                    break;
            }
        }else {
            switch (type){
                case "全部":
                    tbGrademonths = tbGrademonthMapper.deductPointsMoreOne(statge,time,dept);
                    break;
                case "60分以下":
                    tbGrademonths = tbGrademonthMapper.deductPointsMore(statge,time,"","60",dept);
                    break;
                case "60-70":
                    tbGrademonths = tbGrademonthMapper.deductPointsMore(statge,time,"60","70",dept);
                    break;
                case "70-80":
                    tbGrademonths = tbGrademonthMapper.deductPointsMore(statge,time,"70","80",dept);
                    break;
                case "80-90":
                    tbGrademonths = tbGrademonthMapper.deductPointsMore(statge,time,"80","90",dept);
                    break;
                case "90-100":
                    tbGrademonths = tbGrademonthMapper.deductPointsMore(statge,time,"90","100",dept);
                    break;
            }
        }
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbGrademonths.size());
        userTable.setLast((int)Math.round(tbGrademonths.size()/12+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbGrademonths.size()/12+0.5)){
            for (int i=0;i<12;i++){
                int num  =(Integer.valueOf(pageNo)*12-12+i);
                list.add(tbGrademonths.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*12-12;i<tbGrademonths.size();i++){
                list.add(tbGrademonths.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }

    //加分最多
    public UserTable bonusPoints(String type, String statge, String time, String pageNo, String pageSize,String dept){
        List<TbGrademonth> tbGrademonths=new ArrayList<>();
        if(statge.equals("全部")){
            switch (type){
                case "全部":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMoreThree(time,dept);
                    break;
                case "60分以下":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMoreTwo(time,"","60",dept);
                    break;
                case "60-70":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMoreTwo(time,"60","70",dept);
                    break;
                case "70-80":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMoreTwo(time,"70","80",dept);
                    break;
                case "80-90":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMoreTwo(time,"80","90",dept);
                    break;
                case "90-100":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMoreTwo(time,"90","100",dept);
                    break;
            }
        }else {
            switch (type.trim()){
                case "全部":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMoreOne(statge,time,dept);
                    break;
                case "60分以下":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMore(statge,time,"","60",dept);
                    break;
                case "60-70":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMore(statge,time,"60","70",dept);
                    break;
                case "70-80":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMore(statge,time,"70","80",dept);
                    break;
                case "80-90":
                    tbGrademonths = tbGrademonthMapper.bonusPointsMore(statge,time,"80","90",dept);
                    break;
                case "90-100":
                    tbGrademonths = tbGrademonthMapper.deductPointsMore(statge,time,"90","100",dept);
                    break;
            }
        }
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbGrademonths.size());
        userTable.setLast((int)Math.round(tbGrademonths.size()/12+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbGrademonths.size()/12+0.5)){
            for (int i=0;i<12;i++){
                int num  =(Integer.valueOf(pageNo)*12-12+i);
                list.add(tbGrademonths.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*12-12;i<tbGrademonths.size();i++){
                list.add(tbGrademonths.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }



}
