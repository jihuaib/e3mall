package muping.e3mall.service;

import muping.e3mall.domain.TbItem;

public interface TbItemService {

    /**
     * 主键查询
     * @param id
     * @return
     */
    public TbItem queryById(Long id);

}
