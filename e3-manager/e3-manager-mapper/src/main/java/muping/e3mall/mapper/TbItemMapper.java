package muping.e3mall.mapper;

import muping.e3mall.domain.TbItem;
import muping.e3mall.query.TbItemQueryObject;

import java.util.List;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    List<TbItem> selectAll();

    int updateByPrimaryKey(TbItem record);

    /**
     * 条件查询总数（分页）
     * @param qo
     * @return
     */
    long selectCountCondition(TbItemQueryObject qo);

    /**
     *  条件查询结果集（分页）
     * @param qo
     * @return
     */
    List<TbItem> selectAllCondition(TbItemQueryObject qo);
}