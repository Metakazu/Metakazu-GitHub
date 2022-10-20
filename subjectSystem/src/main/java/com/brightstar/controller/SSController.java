package com.brightstar.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.brightstar.mapper.CourseMapper;
import com.brightstar.mapper.MajorMapper;
import com.brightstar.mapper.ScoreMapper;
import com.brightstar.mapper.StudentMapper;
import com.brightstar.model.Course;
import com.brightstar.model.CourseBean;
import com.brightstar.model.Major;
import com.brightstar.model.Score;
import com.brightstar.model.Student;

@Controller
public class SSController {
	@Autowired
	CourseMapper courseMapper;
	@Autowired
	ScoreMapper scoreMapper;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	MajorMapper majorMapper;

	/**
	 * 名称：查看所有课程内容/
	 * 更新者：yajima
	 * 最终更新日期：9/28
	 */
	@GetMapping("/selectAllCourse")
	public ModelAndView selectAllCourse(String contents) {
		List<Course> course=courseMapper.selectAllCourse();
		if("timetable".equals(contents)) {
			return new ModelAndView("outputTimetable").addObject("course", course);
		}else {
			return new ModelAndView("selectAllCourse").addObject("course", course);
		}
	}

	/**
	 * 名称：查看所有专门情报（左列）
	 * 更新者：yajima
	 * 最终更新日期：10/2
	 */
	 @GetMapping("/selectAllMajor")
	 public ModelAndView selectAllMajor() {
	  List<Major> major = majorMapper.selectAllMajor();
	  List<Major> major2 = majorMapper.selectAllMajor2(major.get(0).getDpid());
	  List<Course> major3 = majorMapper.selectAllMajor3(major.get(0).getMid());
	  ModelAndView mav = new ModelAndView("selectAllMajor");
	  mav.addObject("major", major);
	  mav.addObject("major2", major2);
	  mav.addObject("major3", major3);
	  return mav;
	 }

	 /**
	 * 名称：查看所有专门情报（右列）
	 * 更新者：yajima
	 * 最终更新日期：10/2
	 */
	 @PostMapping("/selectAllMajor")
	 @ResponseBody
	 public List<Major> majorList(int dpid) {
	  return majorMapper.selectAllMajor2(dpid);
	 }
	
	 @PostMapping("/selectAllMajor2")
	  @ResponseBody
	  public List<Course> courseList(int mid) {
	   return majorMapper.selectAllMajor3(mid);
	  }
	 
	/**
	 * 名称：查看所有学生情报（管理系统？？）
	 * 更新者：kon
	 * 最终更新日期：9/28
	 */
	@GetMapping("/selectAllStudent")
	public ModelAndView selectAllStudent() {
		List<Student> student = studentMapper.selectAllStudent();
		ModelAndView mav = new ModelAndView("selectAllStudent");
		mav.addObject("student", student);
		return mav;
	}

	/**
	 * 名称：登录学生查看自己的选课内容
	 * 更新者：sano
	 * 最终更新日期：9/28
	 */
	@PostMapping("/selectStuWithSAndC")
	public ModelAndView selectStuWithSAndC(int sid) {
		List<Student> students = studentMapper.selectStuWithSAndC(sid);
		ModelAndView mav = new ModelAndView("selectStuWithSAndC");
		String msg;
		if(students != null && students.size() != 0) {
			List<Score> scores = new ArrayList<>();
			for(Score score1 :students.get(0).getScores()) {
				scores.add(score1);
			};
			mav.addObject("scores", scores);
		}else {
			msg ="授業がありません。履修登録を急げよ❣";
			mav.addObject("msg",msg);
		}
		return mav;
	}

	/**
	 * 名称：登录学生选课
	 * 更新者：sano
	 * 最终更新日期：9/29
	 */
	//（标签的参数名等于 jsp的选择器name）
	@PostMapping("/selectAllCourse")
	@ResponseBody
	public Map<Integer, String> insertCourse(int[] cid,int sid) {
		Score score = new Score();
		score.setSid(sid);
		Map<Integer,String> msgs = new HashMap<>();
		if(cid != null && cid.length != 0 ) {//选中后提交
			for(int i = 0;i < cid.length;i++) {
				score.setCid(cid[i]);
				if(scoreMapper.checkOneCourse(score)!=null) {//确认是否选择同一节课
					String name = scoreMapper.checkOneCourse(score).getCourse().getCname();
					int id = scoreMapper.checkOneCourse(score).getCid();
					msgs.put(id,"『"+ name +"』が既に登録されています。ご確認してください!");
				}else {
					String std_max = courseMapper.selectTimeOfOneCourse(cid[i]).getStd_max();
					String std = courseMapper.selectTimeOfOneCourse(cid[i]).getStd();
					int newstd_max = Integer.valueOf(std_max.replace("人",""));
					int newstd = Integer.valueOf(std.replace("人",""));
					if(newstd_max <= newstd) {
						String name = courseMapper.selectOneCourse(cid[i]).getCname();
						System.out.println(name);
						msgs.put(-3, "『"+ name +"』の人数がいっぱいです。ほかの授業を選んでください！");
					}else {
						int temp = 0;
						switch(courseMapper.selectTimeOfOneCourse(cid[i]).getWeekday()) {
						case "月曜日":temp = 1;break;
						case "火曜日":temp = 2;break;
						case "水曜日":temp = 3;break;
						case "木曜日":temp = 4;break;
						case "金曜日":temp = 5;break;
						}
						score.setWeekday(temp);
//						score.setWeekday(courseMapper.selectTimeOfOneCourse(cid[i]).getWeekday());
						int tempA = 0;
						switch(courseMapper.selectTimeOfOneCourse(cid[i]).getCtime()) {
						case "一時限目": tempA = 1;break;
						case "二時限目": tempA = 2;break;
						case "三時限目": tempA = 3;break;
						case "四時限目": tempA = 4;break;
						case "五時限目": tempA = 5;break;
						case "六時限目": tempA = 6;break;
						}
						score.setCtime(tempA);
//						score.setCtime(courseMapper.selectTimeOfOneCourse(cid[i]).getCtime());
						System.out.println(scoreMapper.checkOneCourseBytime(score));
						if (scoreMapper.checkOneCourseBytime(score)== null) {//确认是否选了同一时间的课
							scoreMapper.insertCourseWithProcedure(score);
							msgs.put(-1,"お疲れ様です。無事に登録しました!");
						}else {
							String name = courseMapper.selectOneCourse(cid[i]).getCname();
							int id = courseMapper.selectOneCourse(cid[i]).getCid();
							msgs.put(id,"『"+ name +"』が同じ曜日と時限の授業が既に登録されています。ご確認してください!");
						}
					}
					
				}
			}
		}else {//无内容提交时
			msgs.put(-1,"選択欄にチェックを入れた上で送信してください。");
		}
		List<Course> course=courseMapper.selectAllCourse();
		ModelAndView mav = new ModelAndView("selectAllMajor");
		if(course != null && course.size() != 0) {
			mav.addObject("course", course);
		}
			mav.addObject("msgs",msgs);
		return msgs;
	}
	

	/**
	 * 名称：登录页面跳转
	 * 更新者：boss
	 * 最终更新日期：9/29
	 */
	@GetMapping("/nam")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	/**
	 * 名称：学生登录核对以及homePage跳转
	 * 更新者：boss
	 * 最终更新日期：9/29
	 */
	@PostMapping("/nama")
	public ModelAndView check(Student account,HttpSession session) {
		Student student= studentMapper.findAllStudent(account);
		String msg;
		if (student != null) {
			session.setAttribute("name",student.getSname());
			session.setAttribute("id",student.getSid());
			ModelAndView mav1 = new ModelAndView("homePage");
			return mav1;
		} else {
			msg = "登录失败";
		}
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("msg",msg);
		return mav;
	}

	/**
	 * 名称：退回homePage
	 * 更新者：sano
	 * 最终更新日期：9/30
	 */
	@GetMapping("/nama")
	public ModelAndView check() {
		return new ModelAndView("homePage");
	}

	/** 
	 * 名称：登录学生删除自己的个别登录科目
	 * 更新者：sano
	 * 最终更新日期：9/30
	 */
	@GetMapping("/deleteOneCourse")
	public ModelAndView deleteOneCourse(int sid,int cid) {
		Score score = new Score();
		score.setCid(cid);
		score.setSid(sid);
		scoreMapper.deleteOneCourse(score);
		
		List<Student> students = studentMapper.selectStuWithSAndC(sid);
		ModelAndView mav = new ModelAndView("selectStuWithSAndC");
		String msg;
		if(students != null && students.size() != 0) {
			List<Score> scores = new ArrayList<>();
			for(Score score1 :students.get(0).getScores()) {//舍去sname，cid，只取登录学生的cid,cname,master的情报
				scores.add(score1);
			};
			mav.addObject("scores", scores);
		}else {
			msg ="授業がありません。履修登録を急げよ❣";
			mav.addObject("msg",msg);
		}
		return mav;
	}

	/**
	 * 名称：登录学生删除自己的所有登录科目
	 * 更新者：sano
	 * 最终更新日期：9/30
	 */
	@PostMapping("/deleteAllCourse")
	public ModelAndView deleteAllCourse(int sid){
		scoreMapper.deleteAllCourse(sid);
		List<Student> students = studentMapper.selectStuWithSAndC(sid);
		ModelAndView mav = new ModelAndView("selectStuWithSAndC");
		String msg;
		if(students != null && students.size() != 0) {
			List<Score> scores = new ArrayList<>();
			for(Score score1 :students.get(0).getScores()) {//舍去sname，cid，只取登录学生的cid,cname,master的情报
				scores.add(score1);
			};
			mav.addObject("scores", scores);
		}else {
			msg ="授業がありません。履修登録を急げよ❣";
			mav.addObject("msg",msg);
		}
		return mav;
	}

	/**
	 * 名称：登录学生替换自己的登录科目（本页）
	 * 更新者：sano
	 * 最终更新日期：9/30
	 */
	@PostMapping("/updateOneCourse")
	public ModelAndView updateOneCourse(int sid,int cid,int newcid){

		Score score = new Score();
		score.setCid(cid);
		score.setSid(sid);
		score.setNewcid(newcid);
		Map<Integer,String> msgs = new HashMap<>();
		String std_max = courseMapper.selectTimeOfOneCourse(cid).getStd_max();
		String std = courseMapper.selectTimeOfOneCourse(cid).getStd();
		int newstd_max = Integer.valueOf(std_max.replace("人",""));
		int newstd = Integer.valueOf(std.replace("人",""));
		if(newstd_max <= newstd) {
			String name = courseMapper.selectOneCourse(cid).getCname();
			System.out.println(name);
			msgs.put(-3, "『"+ name +"』の人数がいっぱいです。ほかの授業を選んでください！");
		}else {
			int temp = 0;
			switch(courseMapper.selectTimeOfOneCourse(cid).getWeekday()) {
			case "月曜日":temp = 1;break;
			case "火曜日":temp = 2;break;
			case "水曜日":temp = 3;break;
			case "木曜日":temp = 4;break;
			case "金曜日":temp = 5;break;
			}
			score.setWeekday(temp);
			int tempA = 0;
			switch(courseMapper.selectTimeOfOneCourse(cid).getCtime()) {
			case "一時限目": tempA = 1;break;
			case "二時限目": tempA = 2;break;
			case "三時限目": tempA = 3;break;
			case "四時限目": tempA = 4;break;
			case "五時限目": tempA = 5;break;
			case "六時限目": tempA = 6;break;
			}
			score.setCtime(tempA);
			System.out.println(scoreMapper.checkOneCourseBytime(score));
			if (scoreMapper.checkOneCourseBytime(score)== null) {//确认是否选了同一时间的课
				scoreMapper.updateOneCourse(score);
				msgs.put(-1,"お疲れ様です。無事に登録しました!");
			}else {
				String name = courseMapper.selectOneCourse(cid).getCname();
				int id = courseMapper.selectOneCourse(cid).getCid();
				msgs.put(id,"『"+ name +"』が同じ曜日と時限の授業が既に登録されています。ご確認してください!");
			}
		}
		
		List<Student> students = studentMapper.selectStuWithSAndC(sid);//显示更改内容
		ModelAndView mav = new ModelAndView("selectStuWithSAndC");
		String msg;
		if(students != null && students.size() != 0) {
			List<Score> scores = new ArrayList<>();
			for(Score score1 :students.get(0).getScores()) {
				scores.add(score1);
			};
			mav.addObject("scores", scores);
		}else {
			msg ="授業がありません。履修登録を急げよ❣";
			mav.addObject("msg",msg);
		}
		mav.addObject("msgs",msgs);
		return mav;
	}

	/**
	 * 名称：登录学生替换自己的登录科目(中途跳转页)
	 * 更新者：sano
	 * 最终更新日期：9/30
	 */
	@GetMapping("/updateOneCourse")
	public ModelAndView updateOneCourse(int cid) {
		List<Course> course=courseMapper.selectAllCourse();
		ModelAndView mav = new ModelAndView("updateOneCourse");
		mav.addObject("course", course);
		mav.addObject("cid", cid);
		return mav;
	}

	/**
	 * 名称：科目一览
	 * 更新者：sano
	 * 最终更新日期：9/30
	 */
	@GetMapping("/confirmCourse")
	public ModelAndView confirmCourse() {
		List<Course> course=courseMapper.selectAllCourse();
		ModelAndView mav = new ModelAndView("confirmCourse");
		mav.addObject("course", course);
		return mav;
		
	}

	/**
	 * 名称：学生个人成绩一览
	 * 更新者：sano
	 * 最终更新日期：9/30
	 */
	@PostMapping("/confirmOneScore")
	public ModelAndView confirmOneScore(int sid) {
		List<Student> students = studentMapper.selectStuWithSAndC(sid);
		ModelAndView mav = new ModelAndView("confirmOneScore");
		String msg;
		if(students != null && students.size() != 0) {
			List<Score> scores = new ArrayList<>();
			for(Score score1 :students.get(0).getScores()) {
				scores.add(score1);
			};
			mav.addObject("scores", scores);
		}else {
			msg ="授業がありません。履修登録を急げよ❣";
			mav.addObject("msg",msg);
		}
		return mav;
		
	}

	/**
	 * 名称：個別授業内容
	 * 更新者：sano
	 * 最终更新日期：10/2
	 */
	@GetMapping("/selectOneCourse")
	public ModelAndView selectOneCourse(int cid) {
		
		Course course = courseMapper.selectOneCourse(cid);
		String name = "無し";
		if(course.getCpreid()!= 0) {
			 name = courseMapper.selectPreCourse(course.getCpreid());
		}
		ModelAndView mav = new ModelAndView("selectOneCourse");
		mav.addObject("course", course);
		mav.addObject("prename", name);
		return mav;
	}

	/**
	 * 名称：時間割表出力
	 * 更新者：sano
	 * 最终更新日期：10/3
	 */
	@GetMapping("/outputTimetable")
	public ModelAndView outputTimetable(int sid) {
		List<Student> students = studentMapper.selectStuWithSAndC(sid);
		ModelAndView mav = new ModelAndView("outputTimetable");
		if(students != null && students.size() != 0) {
			List<Course> scores = new ArrayList<>();
			List<Score> newscore = new ArrayList<>();
			for(int i = 0;i< students.get(0).getScores().size();i++) {				
				Score score = new Score();
				score.setName(students.get(0).getScores().get(i).getCourse().getCname());
				int temp = 0;
				switch(students.get(0).getScores().get(i).getCourse().getWeekday()) {
				case "月曜日":temp = 1 ;break;
				case "火曜日":temp = 2 ;break;
				case "水曜日":temp = 3 ;break;
				case "木曜日":temp = 4 ;break;
				case "金曜日":temp = 5 ;break;
				}
				score.setWeekday(temp);
				int tempA = 0;
				switch(students.get(0).getScores().get(i).getCourse().getCtime()) {
				case "一時限目": tempA = 1;break;
				case "二時限目": tempA = 2;break;
				case "三時限目": tempA = 3;break;
				case "四時限目": tempA = 4;break;
				case "五時限目": tempA = 5;break;
				case "六時限目": tempA = 6;break;
				}
				score.setCtime(tempA);
				newscore.add(score);
			}
			mav.addObject("scores",newscore);
//			for(Score score1 :students.get(0).getScores()) {
//				scores.add(score1.getCourse());
//			};
//			System.out.println(scores);
//			mav.addObject("scores", scores);
		}
		return mav;
	}

	@GetMapping("/mainSelectAllCourse")
	public ModelAndView mainSelectAllCourse() {
		
		return new ModelAndView("mainSelectAllCourse");
	}
	/**
	 * 名称：個別授業内容
	 * 更新者：sano
	 * 最终更新日期：10/2
	 */
	/*@PostMapping("/mainSelectAllCourse")
	@ResponseBody
	public ModelAndView  mainSelectAllCourse(Course course) {
		
		List<Course> courses = courseMapper.mainSelectAllCourse(course);
		System.out.println(courses);
		
		String msg ="該当する授業がみつかりませんでした！";
		ModelAndView mav = new ModelAndView("mainSelectAllCourse");
		if(courses != null && courses.size()!=0) {
			
			mav.addObject("courses",courses);
		}else {
			System.out.println(msg);
			mav.addObject("msg",msg);
		}
		return mav;
	}*/
	
	@PostMapping("/mainSelectAllCourse")
	@ResponseBody
	public List<Course> mainSelectAllCourse(CourseBean course){
		return courseMapper.mainSelectAllCourse(course);
	}
}



