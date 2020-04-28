package cn.sznk.terrace.controller;


import cn.sznk.terrace.bean.TbUser;
import cn.sznk.terrace.bean.TbUserExample;
import cn.sznk.terrace.mapper.TbUserMapper;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private TbUserMapper tbUserMapper;

    @ResponseBody
    @GetMapping(value = "/user/login")
    public E3Result login(String username, String password,
                          Map<String,Object> map, HttpSession session){
        System.out.println(username+"  "+password);
        TbUserExample example = new TbUserExample();
        example.createCriteria().andUserIdEqualTo(username.trim()).andUserPasswordEqualTo(password);
        List<TbUser> tbUsers = tbUserMapper.selectByExample(example);
        String name = null;
        String dept=null;
        //System.out.println(username+""+password+"file"+" "+tbUsers.size());
        if(tbUsers.size()>0){
            for (TbUser tb : tbUsers) {
                name=tb.getUserName();
                dept=tb.getDeptCode();
            }
           // System.out.println("success");
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("username",name);
            session.setAttribute("userId",username);
            session.setAttribute("deptCode",dept);
            if (dept.equals("0000")){
                return E3Result.build(201,"");
            }
            return E3Result.ok();
        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return E3Result.build(400,"212");
        }

    }
    @ResponseBody
    @GetMapping("/user/out")
    public E3Result tologout(String date,HttpServletRequest request){
        Enumeration em = request.getSession().getAttributeNames();
        while(em.hasMoreElements()){
            request.getSession().removeAttribute(em.nextElement().toString());
        }
        return E3Result.ok();
    }

}
