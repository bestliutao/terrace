package cn.sznk.terrace.init;

import cn.sznk.terrace.getData.GetBusinesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Initialization implements CommandLineRunner {
    @Autowired
    private GetBusinesData getBusinesData;
    private String[] dept={"0005","0006","0007","0008","0009","0010","0012","0011","0014"};
    @Override
    public void run(String... args) {

        System.out.println("The Program starts to initialize ...");

        System.out.println("<<<<------------------------------初始化开始------------------------------>>>");
        System.out.println("Start time:"+new Date());
        // 初始化
        //1.更新学员信息
//        for (int i=0;i<dept.length;i++){
//            if (getBusinesData.getTraineeData(dept[i])=="200"){
//                System.out.println("更新"+dept[i]+"学员信息---->>>成功");
//            }else {
//                System.out.println("更新"+dept[i]+"学员信息---->>>失败");
//            }
//        }


        //2.更新学员头像信息
        if (getBusinesData.getTraineeImage()=="200"){
            System.out.println("更新学员头像信息---->>>成功");
        }else {
            System.out.println("更新学员头像信息---->>>失败");
        }
        //3.更新学员探访信息
//        if (getBusinesData.getTraineeVisit()=="200"){
//            System.out.println("更新学员探访信息---->>>成功");
//        }else {
//            System.out.println("更新学员探访信息---->>>失败");
//        }
//        4.更新监控异常信息
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
