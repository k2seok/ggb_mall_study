package kr.co.ggb.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ggb.dao.UserDAO;
import kr.co.ggb.dto.UsersDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userdao;

	@Override
	public int loginUser(HttpSession session, String userId, String password) {
		boolean idCheck = false;
		boolean pwCheck = false;
		System.out.println("로그인중..");

		if (session.getAttribute("user") != null) {// Check session already exist
			System.out.println(userId + "로그인!");
		}

		try {///// Id, PW is Correct?
			UsersDTO user = new UsersDTO();
			user = userdao.select(userId);
			idCheck = user.getUsersId().equals(userId) ? true : false;
			pwCheck = user.getPassword().equals(password) ? true : false;
		} catch (Exception e) {
			// System.out.println("DB에서 ID 불러오기 실패! Path:UserServiceImpl.java");
			System.out.println(userId + "User DB select시, 값을 찾을 수 없습니다!");

		}

		if (idCheck && pwCheck) { ///////// make Session
			session.setAttribute("user", userId);
			System.out.println(userId + "로그인!");
		} else if (idCheck == false) {
			System.out.println(userId + "는 없는 ID 입니다!");
			return 0;
		} else if (pwCheck == false) {
			System.out.println("비밀번호가 잘못 되었습니다");
			return 0;
		}
		return 1;
	}

	@Override
	public void logoutUser(HttpSession session) {
		System.out.println("로그아웃중..");
		Object objUser = session.getAttribute("user");

		if (objUser == null) {
			System.out.println("로그인 되어있지 않음!");
		} else {
			session.removeAttribute("user");
			System.out.println((String) objUser + "접속 종료!");
		}
	}

}
