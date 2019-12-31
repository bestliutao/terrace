package cn.sznk.terrace.init;

import cn.sznk.terrace.getData.GetBusinesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@EnableScheduling
@Component
public class DataScratch {
    @Autowired
    private GetBusinesData getBusinesData;
    @Scheduled(cron="0 0 1 * * *")
    private void process(){

//        System.out.println("this is scheduler task running");

        System.out.println("<<<<------------------------------初始化开始------------------------------>>>");
        System.out.println("Start time:"+new Date());
        // 初始化
        //1.更新学员信息
//        if (getBusinesData.getTraineeData()=="200"){
//            System.out.println("更新学员信息---->>>成功");
//        }else {
//            System.out.println("更新学员信息---->>>失败");
//        }

        //2.更新学员头像信息
//        if (getBusinesData.getTraineeImage()=="200"){
//            System.out.println("更新学员头像信息---->>>成功");
//        }else {
//            System.out.println("更新学员头像信息---->>>失败");
//        }
        //3.更新学员探访信息
//        if (getBusinesData.getTraineeVisit()=="200"){
//            System.out.println("更新学员探访信息---->>>成功");
//        }else {
//            System.out.println("更新学员探访信息---->>>失败");
//        }
        //4.更新监控异常信息
//        if (getBusinesData.getMonitorMsg()=="200"){
//            System.out.println("更新监控异常信息---->>>成功");
//        }else {
//            System.out.println("更新监控异常信息---->>>失败");
//        }
        //5.更新环控异常信息
//        if (getBusinesData.getEnviorMsg()=="200"){
//            System.out.println("更新环控异常信息---->>>成功");
//        }else {
//            System.out.println("更新环控异常信息---->>>失败");
//        }
        System.out.println("Complete time:"+new Date());
        System.out.println("<<<<-------------------------------初始化结束------------------------------>>>");
    }
}
