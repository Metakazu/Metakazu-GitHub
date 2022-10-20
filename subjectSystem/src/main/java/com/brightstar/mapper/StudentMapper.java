package com.brightstar.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.brightstar.model.Student;

@Mapper
public interface StudentMapper {
	
//	 登录学生查看自己的登录科目 
	List<Student> selectStuWithSAndC(int sid);
//	确认在籍学生
	List<Student> selectAllStudent();
//	学生登录核对
	Student findAllStudent(Student student);
}
