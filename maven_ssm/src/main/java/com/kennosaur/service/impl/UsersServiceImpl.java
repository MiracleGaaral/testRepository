package com.kennosaur.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kennosaur.mapper.UsersMapper;
import com.kennosaur.pojo.Users;
import com.kennosaur.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;
	@Override
	public List<Users> show() {
		return usersMapper.selAll();
	}

}
