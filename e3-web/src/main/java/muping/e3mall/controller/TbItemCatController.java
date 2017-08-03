package muping.e3mall.controller;

import muping.e3mall.service.TbItemCatService;
import muping.e3mall.utils.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TbItemCatController {

    @Autowired
    private TbItemCatService tbItemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<TreeNode> getChildrenNodes(@RequestParam(name = "id",defaultValue = "0") Long parentId){
        return tbItemCatService.getChildrenNodes(parentId);
    }
}
