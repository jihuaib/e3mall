package muping.e3mall.mapper;

import muping.e3mall.domain.TbItemCat;

import java.util.List;

public interface TbItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    TbItemCat selectByPrimaryKey(Long id);

    List<TbItemCat> selectAll();

    int updateByPrimaryKey(TbItemCat record);

    /**
     * 根据父节点查询所有子节点
     * @param parentId
     * @return
     */
    List<TbItemCat> getChildrenNodes(Long parentId);
}