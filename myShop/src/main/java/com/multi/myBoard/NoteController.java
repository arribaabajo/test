package com.multi.myBoard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {
	@Autowired
	NoteDAO dao;

	@RequestMapping("insert")
	public void insert(NoteVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}

	@RequestMapping("delete")
	public void delete(int no) {
		System.out.println(no);
		dao.delete(no);
	}

	@RequestMapping("list")
	public void list(Model model) {
		List<NoteVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
