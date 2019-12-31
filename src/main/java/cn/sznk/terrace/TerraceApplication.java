package cn.sznk.terrace;


import cn.sznk.terrace.bean.Trainee;
import cn.sznk.terrace.utils.JsonUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@MapperScan("cn.sznk.terrace.mapper")
@SpringBootApplication
public class TerraceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerraceApplication.class, args);
	}

}
