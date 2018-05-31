package kr.co.ggb.service;

import javax.servlet.http.HttpSession;

public interface UserService {

	public int loginUser(HttpSession session, String userId, String password);
	public void logoutUser(HttpSession session);
}
