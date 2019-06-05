package com.osyunge.controller;

import com.osyunge.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/getitem.action")
    private String getItemById(Long id) {
        id = 536563l;
        TbItem tbItem = itemService.getItemById(id);
        return tbItem.toString();
    }

}
