package muping.e3mall.controller;

import muping.e3mall.domain.TbItem;
import muping.e3mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TbItemController {

    @Autowired
    private TbItemService tbItemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem queryById(@PathVariable Long itemId) {
        return tbItemService.queryById(itemId);
    }
}
