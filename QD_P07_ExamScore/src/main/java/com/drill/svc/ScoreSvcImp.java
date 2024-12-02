package com.drill.svc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drill.dao.ScoreDao;

@Service
public class ScoreSvcImp implements ScoreSvc {

	@Autowired
	ScoreDao scoreDao;
	
	// 성적 입력
	@Override
	public void scoreIns(Map<String, Integer> map) {
		scoreDao.scoreIns(map);
	}
	
	
	
}
