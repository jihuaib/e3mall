package muping.e3mall.service.impl;

import muping.e3mall.domain.TbItem;
import muping.e3mall.mapper.TbItemMapper;
import muping.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem queryById(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }
}
