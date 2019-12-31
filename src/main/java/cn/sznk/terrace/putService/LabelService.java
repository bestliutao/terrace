package cn.sznk.terrace.putService;

import cn.sznk.terrace.bean.MenLabelMsg;
import cn.sznk.terrace.bean.TbLabellib;
import cn.sznk.terrace.bean.TbManlablel;
import cn.sznk.terrace.utils.E3Result;

import java.util.List;

public interface LabelService {
    //标签库接口
    public List<TbLabellib> labelLib(String type);
    //给人员添加标签接口
    public E3Result addManLabel(String userId,String userName,String id);
    //人员标签接口
    public List<TbManlablel> manLablel(String userId,String type);
    //删除人员标签
    public E3Result deleteManLable(String id,String userId);
    //五个大标签类接口
    public List<MenLabelMsg> fiveLabel(String id);
    //三个小标签
    public List<TbManlablel> threeLabel(String userId,String type);
    //新增标签库标签
    public E3Result addLibLabel(String labelName,String level,String zs,String cs,String tt,String xx,String type);
    //删除人员标签
    public E3Result deleteLibLable(String id);
}
