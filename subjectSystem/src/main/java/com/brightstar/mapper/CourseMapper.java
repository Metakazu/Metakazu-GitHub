package com.brightstar.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.brightstar.model.Course;
import com.brightstar.model.CourseBean;

@Mapper
public interface CourseMapper {
	//查看所有课程内容
	List<Course> selectAllCourse();
	
	//查看选中课程内容
	Course selectOneCourse(int cid);
	
	//查询先修科目
	String selectPreCourse(int cid);
	
	//查询科目时间
	Course selectTimeOfOneCourse(int cid);
	
	//メイン検索
	List<Course> mainSelectAllCourse(CourseBean course);
}
