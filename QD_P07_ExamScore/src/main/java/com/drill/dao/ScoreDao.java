package com.drill.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreDao {

	// 성적 입력
	public void scoreIns(Map<String, Integer> map);

}
