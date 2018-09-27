package com.java.springhib;

import java.util.List;

public interface EmpDAO {
	
	public void insert(Employee e);
	public void update(Employee e);
	public void delete(Employee e);
	public List<Employee> fetch();
	
}
