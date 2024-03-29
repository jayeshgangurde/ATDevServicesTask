package com.ATDev.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ATDev.Model.Student;
import com.ATDev.Service.ATDevservice;

@RestController
public class ATDevController 
{
 @Autowired ATDevservice s;
 
 
	@PostMapping("/savedata")
	public Student savedata(@RequestBody Student user) 
	{
		
        Student u= s.saveuser(user);
		return u;
	}
	
	@GetMapping("/getuserdata")
	public List<Student> getuserdata() 
	{
		List<Student> uu =s.getuserdata();
		return uu;
	}
	
	@PutMapping("/updateuserdata/{id}")
	public Student updateuserdata(@PathVariable int id ,@RequestBody Student user) 
	{
	   Student ud=s.saveuser(user);	
		return ud;
	}
	
	@DeleteMapping("/deleteuserdata/{id}")
	public String deletedata(@PathVariable int id) 
	{
	      s.deletedata(id);
		return "Data Deleted";
	}
	}