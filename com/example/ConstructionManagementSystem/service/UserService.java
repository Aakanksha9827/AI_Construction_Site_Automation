package com.example.ConstructionManagementSystem.service;

import com.example.ConstructionManagementSystem.model.LoginModel;
import com.example.ConstructionManagementSystem.model.RegistrationModel;
import com.example.ConstructionManagementSystem.user.User;

public interface UserService {

	public boolean validateUser(LoginModel log);

	public boolean regUser(RegistrationModel reg);

}
