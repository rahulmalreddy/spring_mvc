package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvcmodel.User;

@Repository
public class Userdao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveUser(User user)
	{
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}

}
