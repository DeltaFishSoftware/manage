package com.DeltaFish.service;

import com.DeltaFish.pojo.Book;

public interface BookService {

    //分页查询
    PageBean<Book>  listByPage(PageBean<Book> pageBean);
}
