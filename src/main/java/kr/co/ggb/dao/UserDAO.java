package kr.co.ggb.dao;

import kr.co.ggb.dto.UsersDTO;

public interface UserDAO {

	int insert(UsersDTO user) throws Exception;

	UsersDTO select(String userId) throws Exception;


}
