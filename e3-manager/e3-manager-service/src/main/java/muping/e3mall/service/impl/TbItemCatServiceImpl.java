package muping.e3mall.service.impl;

import muping.e3mall.domain.TbItemCat;
import muping.e3mall.mapper.TbItemCatMapper;
import muping.e3mall.service.TbItemCatService;
import muping.e3mall.utils.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TbItemCatServiceImpl implements TbItemCatService {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<TreeNode> getChildrenNodes(Long parentId) {
        List<TbItemCat> tbItemCats=tbItemCatMapper.getChildrenNodes(parentId);
        List<TreeNode> treeNodes=new ArrayList<>();
        for (TbItemCat tbItemCat : tbItemCats) {
            TreeNode treeNode = new TreeNode();
            treeNode.setId(tbItemCat.getId());
            treeNode.setText(tbItemCat.getName());
            treeNode.setState(tbItemCat.getIsParent()?"closed":"open");
            treeNodes.add(treeNode);
        }
        return treeNodes;
    }
}
