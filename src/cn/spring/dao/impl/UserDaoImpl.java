package cn.spring.dao.impl;

import cn.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("使用Ioc方式获得对象！");
	}

}
