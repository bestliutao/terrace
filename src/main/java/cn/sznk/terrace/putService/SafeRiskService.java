package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.utils.E3Result;

import java.util.List;

public interface SafeRiskService {
    //全部视频监控
    public E3Result allVideoSurveillance();
    //视频监控
    public E3Result videoSurveillance(Integer id);
    //7天监控异常设备数量接口
    public List<TitileNumBean> safeRiskMonitorNum(String date);
    //7天环控异常设备数量接口
    public List<TitileNumBean> safeRiskEnvirNum(String date);
    //当天设备异常个数接口
    public BadEuiqment safeRiskTodayBadNum(String date);
    //当天监控设备状态接口
    public UserTable todayMonitorStatus(String pageNo,String pageSize,String date,String group);
    //当天环控设备状态接口
    public UserTable todayEnvirStatus(String pageNo,String pageSize,String date);
    //设备异常详细页 线性图表接口 监控
    public List<TitileNumBean> safeRiskDetilsNum(String date);
    //设备异常详细页 线性图表接口 环控
    public List<TitileNumBean> safeRiskEnvir(String date);

    //监控设备异常详细页 说明图表接口
    public UserTable safeRiskDetilsData(String pageNo,String pageSize,String date);
    //环控设备异常详细页 说明图表接口
    public UserTable safeRiskEnvirData(String pageNo,String pageSize,String date);

    //重点危险性人员展示
    public List<TbKeyman> safeRiskKeyMan();
}
