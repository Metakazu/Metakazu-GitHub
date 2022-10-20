package com.brightstar.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.brightstar.model.Category;

public class Test {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		//增加
		//session.insert("insertCategory", "Category3");
		//修改
		//session.update("updateCategory",new Category(4,"我被修改了"));
//		Map<String,Object>params=new HashMap<>();
//		params.put("id", 2);
//		params.put("name", "yoyoyo");
//		
//		session.update("updateCategory",params);
		//删除
		//session.delete("deleteCategory", 3);

//		Category category = session.selectOne("selectOneCategory", 2);
//		System.out.println(category);

				List<Category> categortList = session.selectList("selectCategoryLike","c");
				for (Category category : categortList) {
					System.out.println(category);
				}

		session.commit();
		session.close();
	}
}
