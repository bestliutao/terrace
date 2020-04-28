package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.utils.E3Result;

import java.util.List;

public interface SafeRiskService {
    //全部视频监控
    public E3Result allVideoSurveillance(String dept);
    //视频监控
    public E3Result videoSurveillance(Integer id,String dept);
    //7天监控异常设备数量接口
    public List<TitileNumBean> safeRiskMonitorNum(String date,String dept);
    //7天环控异常设备数量接口
    public List<TitileNumBean> safeRiskEnvirNum(String date,String dept);
    //当天设备异常个数接口
    public BadEuiqment safeRiskTodayBadNum(String date,String dept);
    //当天监控设备状态接口
    public UserTable todayMonitorStatus(String pageNo,String pageSize,String date,String group,String dept);
    //当天环控设备状态接口
    public UserTable todayEnvirStatus(String pageNo,String pageSize,String date,String dept);
    //设备异常详细页 线性图表接口 监控
    public List<TitileNumBean> safeRiskDetilsNum(String date,String dept);
    //设备异常详细页 线性图表接口 环控
    public List<TitileNumBean> safeRiskEnvir(String date,String dept);

    //监控设备异常详细页 说明图表接口
    public UserTable safeRiskDetilsData(String pageNo,String pageSize,String date,String dept);
    //环控设备异常详细页 说明图表接口
    public UserTable safeRiskEnvirData(String pageNo,String pageSize,String date,String dept);

    //重点危险性人员展示
    public List<TbKeyman> safeRiskKeyMan(String dept);
}
