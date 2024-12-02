package com.drill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drill.svc.ScoreSvc;

@Controller
public class ScoreController {

	@Autowired
	ScoreSvc scoreSvc;
	
	@RequestMapping("/")
	@ResponseBody
	public String root() throws Exception {
		return "성적처리";
	}
	
	
	// 수험결과 입력 양식
	@RequestMapping("/write")
	public String write() {
		return "write";
	}
	
	
	// 수험결과 입력처리
	@RequestMapping("/insProc")
	public String insProc() {
		return "redirect:list";
	}
	
	
}










