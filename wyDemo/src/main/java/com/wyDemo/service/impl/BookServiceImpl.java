package com.wyDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyDemo.bean.Book;
import com.wyDemo.bean.BookExample;
import com.wyDemo.dao.BookMapper;
import com.wyDemo.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookMapper mapper;
	@Override
	public int countByExample(BookExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(BookExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int insert(Book record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Book record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<Book> selectByExampleWithBLOBs(BookExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Book> selectByExample(BookExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(Book record, BookExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(Book record, BookExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(Book record, BookExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	
}
