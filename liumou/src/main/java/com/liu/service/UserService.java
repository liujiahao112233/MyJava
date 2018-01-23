package com.liu.service;

import java.util.List;


import com.liu.model.User;

public interface UserService {
	  int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
	    
	    List<User> selectAll();
}
