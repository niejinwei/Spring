package cn.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.spring.dao.UserDao;

public class UserDaoTest {

	@Test
	public void test(){
		//���������ļ�
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
		//ͨ��������ó�ʼ������
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		userDao.say();
	}
}
