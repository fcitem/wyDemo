package com.wyDemo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wyDemo.bean.Book;
import com.wyDemo.bean.BookExample;

public interface BookService {

	int countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExampleWithBLOBs(BookExample example);

    List<Book> selectByExample(BookExample example);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExampleWithBLOBs(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);
}
