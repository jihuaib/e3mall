package muping.e3mall.service;

import muping.e3mall.utils.TreeNode;

import java.util.List;

public interface TbItemCatService {

    /**
     * 根据父节点查询所有子节点
     * @param parentId
     * @return
     */
    List<TreeNode> getChildrenNodes(Long parentId);
}
