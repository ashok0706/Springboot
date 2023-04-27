package com.UserManagementSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserManagementSystem.model.UMS;
import com.UserManagementSystem.repo.UserRepo;

@Service
public class UserService {

//	@Autowired
//	UserRepo userrepo;
	public  List<UMS> userlist = new ArrayList<UMS>();
	
	public List<UMS> getAllusers() {
	
		return userlist;
	}

	public boolean adduser(UMS ums) {
		userlist.add(ums);
		return true;		
	}

	public boolean updateuserinfo(UMS ums) {
//		String id = ums.getUserId();
		List<UMS> byid = userlist.stream().filter(userlist -> userlist.getUserId().equals(ums.getUserId())).collect(Collectors.toList());
		if(!byid.isEmpty()) {
			UMS us = byid.get(0);
		int index  = userlist.indexOf(us);
	       userlist.add(index, ums);
				return true;
		}
		else {
			return false;
		}
	}

	public List<UMS> getUserbyId(String id) {
		List<UMS> byid = userlist.stream().filter(userlist -> userlist.getUserId().equals(id)).collect(Collectors.toList());
		return byid;
	}

	public boolean deletainguser(String id) {
//		int id = Integer.parseInt(id);
		List<UMS> byid = userlist.stream().filter(userlist -> userlist.getUserId().equals(id)).collect(Collectors.toList());
		if(!byid.isEmpty()) {
			UMS us = byid.get(0);
		int index = userlist.indexOf(us);
		userlist.remove(index);
		 return true;
		}
		else {
			 return false;
		}
		}
		
	} 


