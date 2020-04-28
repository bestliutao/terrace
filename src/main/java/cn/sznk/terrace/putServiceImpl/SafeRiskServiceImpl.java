package cn.sznk.terrace.putServiceImpl;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.*;
import cn.sznk.terrace.putService.SafeRiskService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SafeRiskServiceImpl implements SafeRiskService{

    @Autowired
    private TbMonitorabnormalMapper tbMonitorabnormalMapper;
    @Autowired
    private TbCameraMapper tbCameraMapper;
    @Autowired
    private TbKeymanMapper tbKeymanMapper;
    @Autowired
    private TbEnvirmsgMapper tbEnvirmsgMapper;

    //全部视频接口
    public E3Result allVideoSurveillance(String dept){
        TbCameraExample example = new TbCameraExample();
        example.createCriteria().andDeptCodeEqualTo(dept);
        List<TbCamera> tbCameras = tbCameraMapper.selectByExample(example);
        for (TbCamera tbCamera:tbCameras) {
            tbCamera.setIp("rtsp://admin:12345678a@"+tbCamera.getIp()+":554/cam/realmonitor?channel=1&subtype=0");
        }
        return E3Result.ok(tbCameras);
    }

    //视频监控
    public E3Result videoSurveillance(Integer id,String dept){
        TbCameraExample example = new TbCameraExample();
        example.createCriteria().andSortIdEqualTo(1).andFloorEqualTo(id).andDeptCodeEqualTo(dept);
        List<TbCamera> selectByExample = tbCameraMapper.selectByExample(example);
        if(selectByExample.size()>0) {
            return E3Result.ok(selectByExample);
        }else {
            return E3Result.build(400, "error");
        }
    }
    //7天监控异常设备数量接口
    public List<TitileNumBean> safeRiskMonitorNum(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd=date.split("-");
        if(Integer.valueOf(dd[2])>=7){
            for (int i=6;i>=0;i--){
                String today = dd[0]+"-"+dd[1]+"-"+(Integer.valueOf(dd[2])-i);
                TitileNumBean titileNumBean = new TitileNumBean();
                titileNumBean.setTitle(dd[1]+"/"+(Integer.valueOf(dd[2])-i));
                int i1 = tbMonitorabnormalMapper.todayBadMonitorNum(today,dept);
                if (String.valueOf(i1)==null||i1==0){
                    titileNumBean.setNumber("0");
                }else {
                    titileNumBean.setNumber(String.valueOf(i1));
                }
                titileNumBeans.add(titileNumBean);
            }
        }else {
            for (int i=7-Integer.valueOf(dd[2]);i>0;i--){
                String today=dd[0]+"-"+(Integer.valueOf(dd[1])-1)+"-"+(30-i);
                TitileNumBean titileNumBean = new TitileNumBean();
                titileNumBean.setTitle((Integer.valueOf(dd[1])-1)+"/"+(30-i));
                int i1 = tbMonitorabnormalMapper.todayBadMonitorNum(today,dept);
                if (String.valueOf(i1)==null||i1==0){
                    titileNumBean.setNumber("0");
                }else {
                    titileNumBean.setNumber(String.valueOf(i1));
                }
                titileNumBeans.add(titileNumBean);
            }
            for (int i=1;i<=Integer.valueOf(dd[2]);i++){
               String today = dd[0]+"-"+dd[1]+"-"+i;
                TitileNumBean titileNumBean = new TitileNumBean();
                titileNumBean.setTitle(dd[1]+"/"+i);
                int i1 = tbMonitorabnormalMapper.todayBadMonitorNum(today,dept);
                if (String.valueOf(i1)==null||i1==0){
                    titileNumBean.setNumber("0");
                }else {
                    titileNumBean.setNumber(String.valueOf(i1));
                }
                titileNumBeans.add(titileNumBean);
            }
        }
        return titileNumBeans;
    }

    //7天环控异常设备数量接口
    public List<TitileNumBean> safeRiskEnvirNum(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd=date.split("-");
        if(Integer.valueOf(dd[2])>=7){
            for (int i=6;i>=0;i--){
                String today = dd[0]+"-"+dd[1]+"-"+(Integer.valueOf(dd[2])-i);
                TitileNumBean titileNumBean = new TitileNumBean();
                titileNumBean.setTitle(dd[1]+"/"+(Integer.valueOf(dd[2])-i));
                int i1 = tbEnvirmsgMapper.todayBadEnvirNum(today,dept);
                if (String.valueOf(i1)==null||i1==0){
                    titileNumBean.setNumber("0");
                }else {
                    titileNumBean.setNumber(String.valueOf(i1));
                }
                titileNumBeans.add(titileNumBean);
            }
        }else {
            for (int i=7-Integer.valueOf(dd[2]);i>0;i--){
                String today=dd[0]+"-"+(Integer.valueOf(dd[1])-1)+"-"+(30-i);
                TitileNumBean titileNumBean = new TitileNumBean();
                titileNumBean.setTitle((Integer.valueOf(dd[1])-1)+"/"+(30-i));
                int i1 = tbEnvirmsgMapper.todayBadEnvirNum(today,dept);
                if (String.valueOf(i1)==null||i1==0){
                    titileNumBean.setNumber("0");
                }else {
                    titileNumBean.setNumber(String.valueOf(i1));
                }
                titileNumBeans.add(titileNumBean);
            }
            for (int i=1;i<=Integer.valueOf(dd[2]);i++){
                String today = dd[0]+"-"+dd[1]+"-"+i;
                TitileNumBean titileNumBean = new TitileNumBean();
                titileNumBean.setTitle(dd[1]+"/"+i);
                int i1 = tbEnvirmsgMapper.todayBadEnvirNum(today,dept);
                if (String.valueOf(i1)==null||i1==0){
                    titileNumBean.setNumber("0");
                }else {
                    titileNumBean.setNumber(String.valueOf(i1));
                }
                titileNumBeans.add(titileNumBean);
            }
        }
        return titileNumBeans;
    }

    //设备异常详细页 线性图表接口
    public List<TitileNumBean> safeRiskDetilsNum(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd=date.split("-");
        for (int i=1;i<=30;i++){
            TitileNumBean titileNumBean = new TitileNumBean();
            titileNumBean.setTitle(dd[1]+"/"+i);
            int i1=0;
            if (i<10){
                i1= tbMonitorabnormalMapper.todayBadMonitorNum(dd[0] + "-0" + dd[1] + "-" + i,dept);
            }else {
                i1= tbMonitorabnormalMapper.todayBadMonitorNum(dd[0] + "-" + dd[1] + "-" + i,dept);
            }
            if (String.valueOf(i1)==null||i1==0){
                titileNumBean.setNumber("0");
            }else {
                titileNumBean.setNumber(String.valueOf(i1));
            }
            titileNumBeans.add(titileNumBean);
        }
        return titileNumBeans;
    }

    //设备异常详细页 线性图表接口 环控
    public List<TitileNumBean> safeRiskEnvir(String date,String dept){
        List<TitileNumBean> titileNumBeans = new ArrayList<>();
        String[] dd=date.split("-");
        for (int i=1;i<=30;i++){
            TitileNumBean titileNumBean = new TitileNumBean();
            titileNumBean.setTitle(dd[1]+"/"+i);
            int i1=0;
            if (i<10){
                i1= tbEnvirmsgMapper.todayBadEnvirNum(dd[0] + "-0" + dd[1] + "-" + i,dept);
            }else {
                i1= tbEnvirmsgMapper.todayBadEnvirNum(dd[0] + "-" + dd[1] + "-" + i,dept);
            }
            if (String.valueOf(i1)==null||i1==0){
                titileNumBean.setNumber("0");
            }else {
                titileNumBean.setNumber(String.valueOf(i1));
            }
            titileNumBeans.add(titileNumBean);
        }
        return titileNumBeans;
    }


    //设备异常详细页 说明图表接口
    public UserTable safeRiskDetilsData(String pageNo, String pageSize, String date,String dept){
        List<TbMonitorabnormal> tbMonitorabnormals = tbMonitorabnormalMapper.todayBadMonitor(date,dept);

        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbMonitorabnormals.size());
        userTable.setLast((int)Math.round(tbMonitorabnormals.size()/9+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbMonitorabnormals.size()/9+0.5)){
            for (int i=0;i<9;i++){
                int num  =(Integer.valueOf(pageNo)*9-9+i);
                list.add(tbMonitorabnormals.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*9-9;i<tbMonitorabnormals.size();i++){
                list.add(tbMonitorabnormals.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }

    //环控设备异常详细页 说明图表接口
    public UserTable safeRiskEnvirData(String pageNo,String pageSize,String date,String dept){
        List<TbEnvirmsg> tbEnvirmsgs = tbEnvirmsgMapper.todayBadEnvir(date,dept);

        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        userTable.setTotal(tbEnvirmsgs.size());
        userTable.setLast((int)Math.round(tbEnvirmsgs.size()/9+0.5));
        //添加三个对应数据
        if(Integer.valueOf(pageNo)<(int)Math.round(tbEnvirmsgs.size()/9+0.5)){
            for (int i=0;i<9;i++){
                int num  =(Integer.valueOf(pageNo)*9-9+i);
                list.add(tbEnvirmsgs.get(num));
            }
        }else {
            for (int i=Integer.valueOf(pageNo)*9-9;i<tbEnvirmsgs.size();i++){
                list.add(tbEnvirmsgs.get(i));
            }
        }
        userTable.setData(list);
        return userTable;
    }


    //当天设备异常个数接口
    public BadEuiqment safeRiskTodayBadNum(String date,String dept){
        List<TbMonitorabnormal> tbMonitorabnormals = tbMonitorabnormalMapper.todayBadMonitor(date,dept);
        BadEuiqment euiqment = new BadEuiqment();
        euiqment.setMonitor(tbMonitorabnormals.size());
        euiqment.setDoor(0);
        euiqment.setEnvironmen(tbEnvirmsgMapper.todayBadEnvirNum(date,dept));
        euiqment.setLocation(0);
        return euiqment;
    }

    //当天监控设备状态接口
    public UserTable todayMonitorStatus(String pageNo,String pageSize,String date,String group,String dept){
        List<TbMonitorabnormal> tbMonitorabnormals = tbMonitorabnormalMapper.todayBadMonitorMsg(group, date,dept);

        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        if (tbMonitorabnormals.size()>0){
            userTable.setTotal(tbMonitorabnormals.size());
            userTable.setLast((int)Math.round(tbMonitorabnormals.size()/5+0.5));
            //添加三个对应数据
            if(Integer.valueOf(pageNo)<(int)Math.round(tbMonitorabnormals.size()/5+0.5)){
                for (int i=0;i<5;i++){
                    int num  =(Integer.valueOf(pageNo)*5-5+i);
                    list.add(tbMonitorabnormals.get(num));
                }
            }else {
                for (int i=Integer.valueOf(pageNo)*5-5;i<tbMonitorabnormals.size();i++){
                    list.add(tbMonitorabnormals.get(i));
                }
            }
            userTable.setData(list);
        }
        return userTable;
    }
    //当天环控设备状态接口
    public UserTable todayEnvirStatus(String pageNo,String pageSize,String date,String dept){
        List<TbEnvirmsg> tbEnvirmsg = tbEnvirmsgMapper.todayBadEnvir(date,dept);
        List<Object> list = new ArrayList<>();
        UserTable userTable = new UserTable();
        if (tbEnvirmsg.size()>0){
            userTable.setTotal(tbEnvirmsg.size());
            userTable.setLast((int)Math.round(tbEnvirmsg.size()/5+0.5));
            //添加三个对应数据
            if(Integer.valueOf(pageNo)<(int)Math.round(tbEnvirmsg.size()/5+0.5)){
                for (int i=0;i<5;i++){
                    int num  =(Integer.valueOf(pageNo)*5-5+i);
                    list.add(tbEnvirmsg.get(num));
                }
            }else {
                for (int i=Integer.valueOf(pageNo)*5-5;i<tbEnvirmsg.size();i++){
                    list.add(tbEnvirmsg.get(i));
                }
            }
            userTable.setData(list);
        }
        return userTable;
    }


    //重点危险性人员展示
    public List<TbKeyman> safeRiskKeyMan(String dept){
        TbKeymanExample example = new TbKeymanExample();
        example.createCriteria().andDeptCodeEqualTo(dept);
        List<TbKeyman> tbKeymen = tbKeymanMapper.selectByExample(example);
        return tbKeymen;
    }
}
