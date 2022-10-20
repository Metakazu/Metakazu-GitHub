package com.brightstar.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.brightstar.model.Course;
import com.brightstar.model.Major;

@Mapper
public interface MajorMapper {
	//查看所有专门情报
	List<Major> selectAllMajor();

	List<Major> selectAllMajor2(int dpid);
	
	List<Course> selectAllMajor3(int mid);
}
