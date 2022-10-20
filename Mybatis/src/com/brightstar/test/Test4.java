package com.brightstar.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.brightstar.model.Order;
import com.brightstar.model.OrderItem;

public class Test4 {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		
		Map<String, Object> paramsMap = new HashMap<>();
		paramsMap.put("oid", 1);
		paramsMap.put("pid", 3);
		paramsMap.put("number", 20);

		session.insert("insertOrderItem", paramsMap);
		
		Map<String, Object>params=new HashMap<>();
		params.put("oid", 1);
		params.put("pid", 3);
		
		
		session.delete("deleteOrderItem",params);
		
		
		
		//ManyToMany
		List<Order> orderList = session.selectList("selectOWithOis");
		for (Order order : orderList) {
			System.out.println(order.getName());

			for (OrderItem item : order.getItems()) {
				System.out.println(
						item.getProduct().getId() + item.getProduct().getName() + item.getProduct().getPrice());

			}

		}

		session.commit();
		session.close();
	}
}
