package com.wyDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyDemo.bean.Chapter;
import com.wyDemo.bean.ChapterExample;
import com.wyDemo.dao.ChapterMapper;
import com.wyDemo.service.ChapterService;

@Service
public class ChapterServiceImpl implements ChapterService {

	@Autowired
	ChapterMapper mapper;
	@Override
	public int countByExample(ChapterExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ChapterExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int insert(Chapter record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Chapter record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<Chapter> selectByExample(ChapterExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(Chapter record, ChapterExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Chapter record, ChapterExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

}
