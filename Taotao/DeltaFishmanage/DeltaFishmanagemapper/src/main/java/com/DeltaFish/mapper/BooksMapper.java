package com.DeltaFish.mapper;

import com.DeltaFish.pojo.Books;

import java.util.List;

public interface BooksMapper {
    int insertBook(Books record);

    int insertSelective(Books record);

    int deleteBook(String id);

    public Books findBookById(String id) throws Exception;

    public  List<Books> findBookByName(String name) throws Exception;

    public  List<Books> findBookByAuthor(String author) throws Exception;

    public  List<Books> findBookByPress(String press) throws Exception;
}