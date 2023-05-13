package com.multi.myBoard;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NoteDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(NoteVO bag) {
		my.insert("create", bag);
	}
	
	public void delete(int no) {
		int result = my.delete("del", no);
		System.out.println(result);
	}
	public List<NoteVO> list() {
		List<NoteVO> list = my.selectList("all");
		System.out.println(list.size());
		return list;
	}
}
