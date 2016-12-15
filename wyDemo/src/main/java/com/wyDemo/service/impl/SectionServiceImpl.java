package com.wyDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyDemo.bean.Section;
import com.wyDemo.bean.SectionExample;
import com.wyDemo.dao.SectionMapper;
import com.wyDemo.service.SectionService;

@Service
public class SectionServiceImpl implements SectionService{

	@Autowired
	SectionMapper mapper;
	
	@Override
	public int countByExample(SectionExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SectionExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int insert(Section record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Section record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<Section> selectByExample(SectionExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(Section record, SectionExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Section record, SectionExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

}
