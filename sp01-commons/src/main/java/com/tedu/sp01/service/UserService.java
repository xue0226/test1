package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {

	User getUser(Integer id);
	//增加积分
	void addScore(Integer id,Integer score);
}
