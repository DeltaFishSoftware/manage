package com.DeltaFish.controller;

import com.DeltaFish.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/itemRainLou")
    @ResponseBody
    public TUser getAllUser(){
        List<TUser> list = itemService.getAllUser();
        return list.get(2);
    }
}
