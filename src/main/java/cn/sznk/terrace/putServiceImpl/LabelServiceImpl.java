package cn.sznk.terrace.putServiceImpl;

import cn.sznk.terrace.bean.*;
import cn.sznk.terrace.mapper.TbLabellibMapper;
import cn.sznk.terrace.mapper.TbManlablelMapper;
import cn.sznk.terrace.mapper.TbTraineeMapper;
import cn.sznk.terrace.putService.LabelService;
import cn.sznk.terrace.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LabelServiceImpl implements LabelService{
    @Autowired
    private TbLabellibMapper tbLabellibMapper;
    @Autowired
    private TbManlablelMapper tbManlablelMapper;
    @Autowired
    private TbTraineeMapper tbTraineeMapper;
    //标签库接口
    public List<TbLabellib> labelLib(String type){
        TbLabellibExample example = new TbLabellibExample();
        example.createCriteria().andTypeEqualTo(type.trim());
        List<TbLabellib> tbLabellibs = tbLabellibMapper.selectByExample(example);
        return  tbLabellibs;
    }

    //人员标签接口
    public List<TbManlablel> manLablel(String userId,String type){
        TbManlablelExample example = new TbManlablelExample();
        List<TbManlablel> tbManlablels=new ArrayList<>();

        if(userId!=null&&type!=null){
            example.createCriteria().andUserIdEqualTo(userId.trim()).andLabelTypeEqualTo(type.trim());
            tbManlablels = tbManlablelMapper.selectByExample(example);
            return  tbManlablels;
        }
        return tbManlablels;
    }

    //给人员添加标签接口
    public E3Result addManLabel(String userId, String userName, String id){
        int number = 68;
        TbLabellib tbLabellib = tbLabellibMapper.selectByPrimaryKey(Integer.valueOf(id));
        TbManlablelExample example = new TbManlablelExample();
        example.createCriteria().andLabelIdEqualTo(Integer.valueOf(id)).andUserIdEqualTo(userId);
        List<TbManlablel> tbManlablels = tbManlablelMapper.selectByExample(example);
        if (tbManlablels==null||tbManlablels.size()<=0){
            TbManlablel tbManlablel = new TbManlablel();
            tbManlablel.setId(null);
            tbManlablel.setLabelId(Integer.valueOf(id));
            tbManlablel.setUserId(userId);
            tbManlablel.setUserName(userName);
            tbManlablel.setLabelName(tbLabellib.getName());
            tbManlablel.setLabelType(tbLabellib.getType());
            tbManlablel.setIdioctonia(tbLabellib.getIdioctonia());
            tbManlablel.setGetaway(tbLabellib.getGetaway());
            tbManlablel.setCommitmurder(tbLabellib.getCommitmurder());
            tbManlablel.setSuddendeath(tbLabellib.getSuddendeath());
            tbManlablel.setProposal(tbLabellib.getProposal());
            tbManlablel.setLevel(tbLabellib.getLevel());
            tbManlablelMapper.insert(tbManlablel);
        }else {
            return E3Result.build(300,"标签重复");
        }
        //每次标签做出更改都需要统计系数更新到档案
        TbManlablelExample example1 = new TbManlablelExample();
        example1.createCriteria().andUserIdEqualTo(userId);
        List<TbManlablel> tbManlablels1 = tbManlablelMapper.selectByExample(example1);
        int zs=0;
        int cs=0;
        int xx=0;
        int tt=0;
        for (TbManlablel tb:tbManlablels1) {
            zs=zs+tb.getIdioctonia();
            cs=cs+tb.getSuddendeath();
            xx=xx+tb.getCommitmurder();
            tt=tt+tb.getGetaway();
            //取标签最高等级作为人物标签
            if (tb.getLevel().charAt(0)<number) {
                number=tb.getLevel().charAt(0);
            }
        }

        TbTraineeExample example2 = new TbTraineeExample();
        example2.createCriteria().andTraineecodeEqualTo(userId);
        TbTrainee tbTrainee = new TbTrainee();
        //标签最高等级取值
        switch (number) {
            case 68:
                tbTrainee.setUserLevel("D");
                break;
            case 67:
                tbTrainee.setUserLevel("C");
                break;
            case 66:
                tbTrainee.setUserLevel("B");
                break;
            case 65:
                tbTrainee.setUserLevel("A");
                break;
        }
        tbTrainee.setUserIdioctonia(zs);
        tbTrainee.setUserGetaway(tt);
        tbTrainee.setUserSuddendeath(cs);
        tbTrainee.setUserWound(xx);
        tbTraineeMapper.updateByExampleSelective(tbTrainee,example2);
        return E3Result.ok();
    }

    //删除人员标签
    public E3Result deleteManLable(String id,String userId){
        int number=68;
        tbManlablelMapper.deleteByPrimaryKey(Integer.valueOf(id));
        //每次标签做出更改都需要统计系数更新到档案
        TbManlablelExample example1 = new TbManlablelExample();
        example1.createCriteria().andUserIdEqualTo(userId);
        List<TbManlablel> tbManlablels1 = tbManlablelMapper.selectByExample(example1);
        int zs=0;
        int cs=0;
        int xx=0;
        int tt=0;
        for (TbManlablel tb:tbManlablels1) {
            zs=zs+tb.getIdioctonia();
            cs=cs+tb.getSuddendeath();
            xx=xx+tb.getCommitmurder();
            tt=tt+tb.getGetaway();
            //取标签最高等级作为人物标签
            if (tb.getLevel().charAt(0)<number) {
                number=tb.getLevel().charAt(0);
            }
        }
        TbTraineeExample example2 = new TbTraineeExample();
        example2.createCriteria().andTraineecodeEqualTo(userId);
        TbTrainee tbTrainee = new TbTrainee();
        //标签最高等级取值
        switch (number) {
            case 68:
                tbTrainee.setUserLevel("D");
                break;
            case 67:
                tbTrainee.setUserLevel("C");
                break;
            case 66:
                tbTrainee.setUserLevel("B");
                break;
            case 65:
                tbTrainee.setUserLevel("A");
                break;
        }
        tbTrainee.setUserIdioctonia(zs);
        tbTrainee.setUserGetaway(tt);
        tbTrainee.setUserSuddendeath(cs);
        tbTrainee.setUserWound(xx);
        tbTraineeMapper.updateByExampleSelective(tbTrainee,example2);
        return E3Result.ok();
    }

    //五个大标签类接口
    public List<MenLabelMsg> fiveLabel(String id){
        List<MenLabelMsg> eLabelMsgs = new ArrayList<MenLabelMsg>();
        for(int i=0;i<5;i++) {
            int number = 68;
            String type=null;
            switch (i){
                case 0:
                    type="康复训练";
                    break;
                case 1:
                    type="行为表现";
                    break;
                case 2:
                    type="心理情绪";
                    break;
                case 3:
                    type="档案信息";
                    break;
                case 4:
                    type="生命体征";
                    break;
            }
            MenLabelMsg menLabelMsg = new MenLabelMsg();
            TbManlablelExample example = new TbManlablelExample();
            example.createCriteria().andUserIdEqualTo(id).andLabelTypeEqualTo(type);
            List<TbManlablel> selectByExample = tbManlablelMapper.selectByExample(example);
            if(selectByExample.size()>0) {
                for (TbManlablel tbLabel : selectByExample) {
                    if (tbLabel.getLevel().charAt(0)<number) {
                        number=tbLabel.getLevel().charAt(0);
                    }
                }
                switch (number) {
                    case 68:
                        menLabelMsg.setLevel("D");
                        break;
                    case 67:
                        menLabelMsg.setLevel("C");
                        break;
                    case 66:
                        menLabelMsg.setLevel("B");
                        break;
                    case 65:
                        menLabelMsg.setLevel("A");
                        break;
                }
            }else {
                menLabelMsg.setLevel("D");
            }
            menLabelMsg.setUserId(id);
            menLabelMsg.setType(i);
            eLabelMsgs.add(menLabelMsg);
        }
        return eLabelMsgs;
    }

    //三个小标签
    public List<TbManlablel> threeLabel(String userId,String type){
        TbManlablelExample example = new TbManlablelExample();
        example.createCriteria().andLabelTypeEqualTo(type).andUserIdEqualTo(userId);
        List<TbManlablel> tbManlablels = tbManlablelMapper.selectByExample(example);
        return tbManlablels;
    }

    //新增标签库标签
    public E3Result addLibLabel(String labelName,String level,String zs,String cs,String tt,String xx,String type){
        TbLabellib tbLabellib = new TbLabellib();
        tbLabellib.setLevel(level);
        tbLabellib.setName(labelName);
        tbLabellib.setGetaway(Integer.valueOf(tt));
        tbLabellib.setIdioctonia(Integer.valueOf(zs));
        tbLabellib.setSuddendeath(Integer.valueOf(cs));
        tbLabellib.setCommitmurder(Integer.valueOf(xx));
        tbLabellib.setId(null);
        tbLabellib.setType(type);
        tbLabellibMapper.insert(tbLabellib);
        return E3Result.ok();
    }

    //删除人员标签
    public E3Result deleteLibLable(String id){
        int i = tbLabellibMapper.deleteByPrimaryKey(Integer.valueOf(id));
        return  E3Result.ok();
    }
}
