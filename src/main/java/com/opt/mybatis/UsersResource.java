package com.opt.mybatis;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	private UserMapper userMapper;

	public UsersResource(UserMapper userMapper) {
		
		this.userMapper = userMapper;
	}
	
	@GetMapping("/all")
	public List<Users>getAll(){
		return userMapper.findAll();
	}
	
	@GetMapping("/update")
	private List<Users> update(){
		Users usersX = new Users();
		
		usersX.setName("name1");
		usersX.setSalary(2929L);
		userMapper.insert(usersX);
		return userMapper.findAll();
		
	}
	

}
