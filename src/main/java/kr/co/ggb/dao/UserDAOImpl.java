package kr.co.ggb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ggb.dto.UsersDTO;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	SqlSession session;
	
	@Override
	public UsersDTO select(String userId) throws Exception {
		UsersDTO user = new UsersDTO();
		user = session.selectOne("Users.select", userId);
		return user;
	}

	@Override
	public int insert(UsersDTO user) throws Exception {
		int result = 0;
		result = session.insert("Users.insert", user);
		
		return result;
	}
}
