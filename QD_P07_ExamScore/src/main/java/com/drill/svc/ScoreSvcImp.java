package com.drill.svc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drill.dao.ScoreDao;
import com.drill.dto.ScoreDto;

@Service
public class ScoreSvcImp implements ScoreSvc {

	@Autowired
	ScoreDao scoreDao;
	
	// 성적 입력
	@Override
	public void scoreIns(Map<String, String> map) {
		scoreDao.scoreIns(map);
	}
	
	
	// 성적 리스트
	@Override
	public List<ScoreDto> scoreList() {
		return scoreDao.scoreList();
	}

	
	// 성적 상세보기
    @Override
    public ScoreDto scoreDetail(String num) {
    
    	return scoreDao.scoreDetail(num);
    }	

	// 수험결과 수정하기 실행
    @Override
    public void scoreModProc(Map<String, String> map) {
		scoreDao.scoreModProc(map);
    }

	// 삭제하기 	
    @Override
    public void scoreDelProc(String num) {
    	scoreDao.scoreDelProc(num);
    }


	// 평균 석차 보기
    @Override
    public List<ScoreDto> avgList() {
    	return scoreDao.avgList();
    }
	
	
}



