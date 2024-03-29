package com.ATDev.Service;

import java.util.List;

import com.ATDev.Model.Student;

public interface ATDevservice {

	Student saveuser(Student user);

	List<Student> getuserdata();

	public void deletedata(int id);

	

}
