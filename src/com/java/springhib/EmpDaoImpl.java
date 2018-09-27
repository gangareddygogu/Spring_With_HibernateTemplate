package com.java.springhib;

import java.util.List;

import org.springframework.orm.hibernate.HibernateTemplate;

public class EmpDaoImpl implements EmpDAO {

	private HibernateTemplate template;
	@Override
	public void insert(Employee e) {
		template.save(e);
	}

	@Override
	public void update(Employee e) {
		//template.update(e);
		
	}

	@Override
	public void delete(Employee e) {
		//template.delete(e);
		
	}

	@Override
	public List<Employee> fetch() {
		return template.loadAll(Employee.class);
		
	}

}
