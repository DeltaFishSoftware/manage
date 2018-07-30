package com.DeltaFish.mapper;

import com.DeltaFish.pojo.Books;

public interface BooksMapper {
    int insert(Books record);

    int insertSelective(Books record);
}