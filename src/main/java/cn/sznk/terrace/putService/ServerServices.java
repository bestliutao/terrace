package cn.sznk.terrace.putService;

import cn.sznk.terrace.utils.E3Result;

public interface ServerServices {
    //获取CPU使用率
    public E3Result getCpu();
    //获取内存使用率
    public E3Result getMemory();
    //获取磁盘使用率
    public E3Result getDisk();
    //获取网络速率
    public E3Result getIntent();
    //服务运行状态监测
    public E3Result getStatus();
    //服务 start
    public E3Result serviceStart();
    //服务stop
    public E3Result serivceStop();
}
