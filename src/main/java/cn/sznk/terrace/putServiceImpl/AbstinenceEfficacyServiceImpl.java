package cn.sznk.terrace.putServiceImpl;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.TbGrademonthMapper;
import cn.sznk.terrace.mapper.TbPerformanceMapper;
import cn.sznk.terrace.mapper.TbTraineeMapper;
import cn.sznk.terrace.putService.AbstinenceEfficacyService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AbstinenceEfficacyServiceImpl implements AbstinenceEfficacyService {
    @Autowired
    private TbTraineeMapper tbTraineeMapper;
    @Autowired
    private TbPerformanceMapper tbPerformanceMapper;
    @Autowired
    private TbGrademonthMapper tbGrademonthMapper;
    //重点戒治人员
    public UserTable keyStudent(String pageNo, String pageSize){
        TbTraineeExample example = new TbTraineeExample();
        example.createCriteria().andUserGradeLessThan("60");
        List<TbTrainee> tbTrainees = tbTraineeMapper.selectByExample(example);

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
    //奖惩情况人数统计
    public List<TitileNumBean> performanceManNum(String date){
        List<TitileNumBean> titileNumBeans = tbPerformanceMapper.performanceNum(date);
        return  titileNumBeans;
    }

    //戒治下 奖惩详情页显示接口
    public UserTable performanDetil(String pageNo, String pageSize,String type){
        TbPerformanceExample example = new TbPerformanceExample();
        example.createCriteria().andPerformanceTypeEqualTo(type);
        List<TbPerformance> tbPerformances = tbPerformanceMapper.selectByExample(example);


        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbPerformances.size());
        userTable.setLast((int)Math.round(tbPerformances.size()/20+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbPerformances.size()/20+0.5)){
            for (int i=0;i<20;i++){
                int num  =(Integer.valueOf(pageNo)*20-20+i);
                list.add(tbPerformances.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*20-20;i<tbPerformances.size();i++){
                list.add(tbPerformances.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }

    //人员6大类分数显示
    public List<TbGrademonth> sixGrade(String id,String date){
        TbGrademonthExample example = new TbGrademonthExample();
        example.createCriteria().andUserIdEqualTo(id).andTimeEqualTo(date);
        List<TbGrademonth> tbGrademonths = tbGrademonthMapper.selectByExample(example);
        return tbGrademonths;
    }

    //戒治阶段分布（人数）
    public E3Result stageDistribution(){
        List<TitileNumBean> titileNumBeans = tbTraineeMapper.stageDistribution();
        TitileNumBean titileNumBean = new TitileNumBean();
        titileNumBean.setTitle("生理脱毒期");
        titileNumBean.setNumber("0");
        titileNumBeans.add(titileNumBean);
        return E3Result.ok(titileNumBeans);
    }

}
