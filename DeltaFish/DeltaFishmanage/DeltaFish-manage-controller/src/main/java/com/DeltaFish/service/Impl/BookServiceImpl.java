package com.DeltaFish.service.Impl;

import com.DeltaFish.mapper.BookMapper;
import com.DeltaFish.pojo.Book;
import com.DeltaFish.service.BookService;
import com.DeltaFish.service.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService{
    @Resource
    private BookMapper bookMapper;

    @Override
    public PageBean<Book> listByPage(PageBean<Book> pageBean) {

        //查询分页结果
        pageBean.setResult(bookMapper.listByPage(pageBean.getStart(),pageBean.getEnd()));

        //查询记录总数
        pageBean.setTotal(bookMapper.getTotal());

        return pageBean;

    }
}
