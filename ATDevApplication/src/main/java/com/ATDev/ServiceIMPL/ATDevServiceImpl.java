package com.ATDev.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ATDev.Model.Student;
import com.ATDev.Repository.ATDevRepo;
import com.ATDev.Service.ATDevservice;

@Service
public class ATDevServiceImpl implements ATDevservice{

	@Autowired ATDevRepo r;
	@Override
	public Student saveuser(Student user) 
	{
		r.save(user);
		return user;
	}
	@Override
	public List<Student> getuserdata() 
	{
		
		return r.findAll();
	}
	@Override
	public void deletedata(int id) {
		
	 r.deleteById(id);
		
		
	}
	
	

}
