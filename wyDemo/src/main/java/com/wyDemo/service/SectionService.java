package com.wyDemo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wyDemo.bean.Section;
import com.wyDemo.bean.SectionExample;

public interface SectionService {

	int countByExample(SectionExample example);

    int deleteByExample(SectionExample example);

    int insert(Section record);

    int insertSelective(Section record);

    List<Section> selectByExample(SectionExample example);

    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);
}
