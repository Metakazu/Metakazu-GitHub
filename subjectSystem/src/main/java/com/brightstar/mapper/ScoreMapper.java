package com.brightstar.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.brightstar.model.Score;

@Mapper
public interface ScoreMapper {

	//登录学生添加科目
	void insertCourse(Score score);
//	void insertCourse(Map<String,Object> map);
	
	//登录学生删除指定登陆科目
	void deleteOneCourse(Score score);
	//登录学生删除所有登陆科目
	void deleteAllCourse(int sid);
	//登录学生替换自己的登录科目
	void updateOneCourse(Score score);
	//科目IDで登録履修の同じ科目の重複確認
	Score checkOneCourse(Score score);
	//曜日と時限で登録履修の時間における重複確認
	Score checkOneCourseBytime(Score score);
	
	void insertCourseWithProcedure(Score score);
	
}
