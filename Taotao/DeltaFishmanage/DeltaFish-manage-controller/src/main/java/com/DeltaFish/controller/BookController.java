package com.DeltaFish.controller;

import com.DeltaFish.pojo.Book;
import com.DeltaFish.service.BookService;
import com.DeltaFish.service.PageBean;
import com.DeltaFish.utils.ResponseUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping("/List")
    public String showList() {
        return "List";
    }

    @RequestMapping("/list")
    public String listBook(
            @RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows",required = false) String rows,
            HttpServletResponse response) throws Exception{
        //定义分页 Bean
        PageBean<Book> pageBean = new PageBean<>(Integer.parseInt(page),Integer.parseInt(rows));
        //拿到分页结果已经记录 总数的 pageBean
        pageBean = bookService.listByPage(pageBean);
        //JSON 序列化
        JSONObject result = new JSONObject();
        String jsonArray = JSON.toJSONString(pageBean.getResult());
        JSONArray array = JSONArray.parseArray(jsonArray);
        result.put("rows",array);
        result.put("total",pageBean.getTotal());

        //向 response 中写入数据
        ResponseUtil.write(response,result);
        return null;
    }

}
