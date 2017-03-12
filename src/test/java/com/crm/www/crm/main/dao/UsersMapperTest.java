package com.crm.www.crm.main.dao;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.www.entity.Users;
import com.crm.www.utils.MD5Util;

/**
 * @author:12
 * @Time:2017年3月12日下午4:31:42
 * @Description:user表相关操作,测试能否正常操作
 * @FileInfo:com.crm.www.crm.main.dao.UsersMapperTest.java
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-dao.xml")
public class UsersMapperTest {
	@Autowired
	private UsersMapper userMapper;
	@Test
	public void testDeleteByPrimaryKey() {

	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
		Users user = new Users();
		user.setUserName("admin");
		user.setPassword(MD5Util.toMD5("admin"));
		user.setPhone(0714110);
		user.setUserStatus(true);
		user.setSignTime(new Date(System.currentTimeMillis()));
		user.setFunctionId(3);
		userMapper.insert(user);
	}

	@Test
	public void testSelectByPrimaryKey() {
		System.out.println(userMapper.selectByPrimaryKey(1));
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
