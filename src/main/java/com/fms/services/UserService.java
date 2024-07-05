package com.fms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.fms.model.User;
import com.fms.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void saveUser( User user, Model model)
	{		
		User findByEmail = userRepository.findByEmail(user.getEmail());
		
		if(findByEmail==null)
		{
			//userRepository.save(user);
		}
		
		
		else{
		model.addAttribute("errorMsg", "Email Already Exits...");
		}
		
		
	}

	
	public List<User> listOfUser()
	{
		System.out.println("List of user 000 in user seice");
		return userRepository.findAll();
	}
}
