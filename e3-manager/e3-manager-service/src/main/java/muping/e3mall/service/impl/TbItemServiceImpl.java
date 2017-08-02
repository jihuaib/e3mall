package muping.e3mall.service.impl;

import muping.e3mall.domain.TbItem;
import muping.e3mall.mapper.TbItemMapper;
import muping.e3mall.query.JSONResult;
import muping.e3mall.query.TbItemQueryObject;
import muping.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem queryById(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public JSONResult queryPage(TbItemQueryObject qo) {
        //查询总数
        long count=tbItemMapper.selectCountCondition(qo);
        //查询结果集
        List<TbItem> items=tbItemMapper.selectAllCondition(qo);
        //创建结果对象
        JSONResult result = new JSONResult();
        result.setTotal(count);
        result.setRows(items);
        return result;
    }
}
