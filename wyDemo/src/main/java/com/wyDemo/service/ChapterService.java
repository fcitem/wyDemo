package com.wyDemo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wyDemo.bean.Chapter;
import com.wyDemo.bean.ChapterExample;

public interface ChapterService {

	int countByExample(ChapterExample example);

    int deleteByExample(ChapterExample example);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    List<Chapter> selectByExample(ChapterExample example);

    int updateByExampleSelective(@Param("record") Chapter record, @Param("example") ChapterExample example);

    int updateByExample(@Param("record") Chapter record, @Param("example") ChapterExample example);
}
