package muping.e3mall.service;

import muping.e3mall.domain.TbItem;
import muping.e3mall.query.JSONResult;
import muping.e3mall.query.TbItemQueryObject;

public interface TbItemService {

    /**
     * 主键查询
     * @param id
     * @return
     */
    public TbItem queryById(Long id);

    /**
     * 分页查询
     * @param qo
     * @return
     */
    JSONResult queryPage(TbItemQueryObject qo);
}
