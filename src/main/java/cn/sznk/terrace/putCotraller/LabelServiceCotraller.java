package cn.sznk.terrace.putCotraller;

import cn.sznk.terrace.bean.MenLabelMsg;
import cn.sznk.terrace.bean.TbLabellib;
import cn.sznk.terrace.bean.TbManlablel;
import cn.sznk.terrace.bean.TbModulus;
import cn.sznk.terrace.mapper.TbModulusMapper;
import cn.sznk.terrace.putService.LabelService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LabelServiceCotraller {
    @Autowired
    private LabelService labelService;
    @Autowired
    private TbModulusMapper tbModulusMapper;
    @ResponseBody
    @GetMapping(value = "/label")
    public E3Result label(String userId,String userName,String type,HttpSession session){
        session.setAttribute("userId",userId);
        session.setAttribute("userName",userName);
        session.setAttribute("type",type);

        TbModulus tbModulus = tbModulusMapper.selectByPrimaryKey(1);
        session.setAttribute("modulus",tbModulus);
        return E3Result.ok();
    }
    //标签库接口
    @ResponseBody
    @GetMapping(value = "/label/lib")
    public E3Result lib(String type,String date,HttpSession session){
        List<TbLabellib> tbLabellibs = labelService.labelLib(type);
        session.setAttribute("type",type);
        return E3Result.ok(tbLabellibs);
    }

    //人员标签接口
    @ResponseBody
    @GetMapping(value = "/label/man")
    public E3Result manLabel(String date,HttpSession session){
        String userId = (String) session.getAttribute("userId");
        String type = (String) session.getAttribute("type");
        List<TbManlablel> tbManlablels=new ArrayList<>();
        if (userId!=null){
            tbManlablels = labelService.manLablel(userId, type);
        }
        return E3Result.ok(tbManlablels);
    }
    //更多人员标签接口
    @ResponseBody
    @GetMapping(value = "/label/manMore")
    public E3Result manMore(String id,String type){
        List<TbManlablel> tbManlablels=new ArrayList<>();
        if (id!=null){
            tbManlablels = labelService.manLablel(id, type);
        }
        return E3Result.ok(tbManlablels);
    }
    //添加人员标签接口
    @ResponseBody
    @GetMapping(value = "/label/add")
    public E3Result addLable(String id,HttpSession session){
        String userId = (String) session.getAttribute("userId");
        String userName = (String) session.getAttribute("userName");
        E3Result e3Result = labelService.addManLabel(userId, userName, id);
        return e3Result;
    }

    //删除人员标签接口
    @ResponseBody
    @GetMapping(value = "/label/delete")
    public E3Result deleteLable(String id,HttpSession session){
        String userId = (String) session.getAttribute("userId");
        labelService.deleteManLable(id,userId);
        return E3Result.ok();
    }

    //5个标签类接口
    @ResponseBody
    @GetMapping(value = "/label/fiveLabel")
    public E3Result fiveLabel(String id){
        List<MenLabelMsg> menLabelMsgs = labelService.fiveLabel(id);
        return E3Result.ok(menLabelMsgs);
    }
    //三个小标签
    @ResponseBody
    @GetMapping(value = "/label/threeLabel")
    public E3Result threeLabel(String userId,String type){
        List<TbManlablel> tbManlablels = labelService.threeLabel(userId, type);
        return E3Result.ok(tbManlablels);
    }

    //新增标签库标签
    @ResponseBody
    @GetMapping(value = "/label/addLib")
    public E3Result addLib(String labelName,String level,String zs,String cs,String tt,String xx,String type){
        E3Result e3Result = labelService.addLibLabel(labelName, level, zs, cs, tt, xx, type);
        return e3Result;
    }

    //删除人员标签
    @ResponseBody
    @GetMapping(value = "/label/deleteLib")
    public E3Result deleteLib(String id){
        E3Result e3Result = labelService.deleteLibLable(id);
        return  e3Result;
    }
}
