package springmvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.Userdao;
import springmvcmodel.User;

@Service
public class UserService {
	
	@Autowired
	private Userdao userdao;
	
	public int createUser(User user)
	{
		return this.userdao.saveUser(user);
	}

}
