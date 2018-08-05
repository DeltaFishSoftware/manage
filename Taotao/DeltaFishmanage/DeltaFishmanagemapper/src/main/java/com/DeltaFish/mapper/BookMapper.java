package com.DeltaFish.mapper;

import com.DeltaFish.pojo.Book;
import com.DeltaFish.pojo.BookExample;
import java.util.List;

public interface BookMapper {
    int deleteByExample(BookExample example);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);
}