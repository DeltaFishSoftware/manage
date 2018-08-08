package com.DeltaFish.mapper;

import com.DeltaFish.pojo.Book;
import com.DeltaFish.pojo.BookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int deleteByExample(BookExample example);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> listByPage(@Param("start") Integer start, @Param("end") Integer end);

    long getTotal();

    List<Book> selectByExample(BookExample example);
}