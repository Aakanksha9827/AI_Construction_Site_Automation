package com.example.ConstructionManagementSystem.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConstructionManagementSystem.model.LoginModel;
import com.example.ConstructionManagementSystem.model.RegistrationModel;
import com.example.ConstructionManagementSystem.repository.UserRepository;
import com.example.ConstructionManagementSystem.user.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public boolean regUser(RegistrationModel reg) {
		try {
			if(repo.getByEmail(reg.getEmail()) != null) {
				return false;
			}
			if(!reg.getConfirmPassword().equals(reg.getPassword())){
				return false;
			}
			else {
			User user = new User();
			BeanUtils.copyProperties(reg, user);			
			repo.save(user);
			return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean validateUser(LoginModel log) {
		try {
			User u = repo.getByEmail(log.getEmail());
			
			if(u  != null && u.getPassword().equals(log.getPassword())) {
				return true;
			}
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
