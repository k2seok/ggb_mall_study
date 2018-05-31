package kr.co.ggb.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ggb.dao.QnaDAO;
import kr.co.ggb.dto.QnaDTO;

@Service
public class QnaServiceImpl implements QnaService{

	@Autowired
	QnaDAO qnaDAO;

	@Override
	public void writeQna(HttpServletRequest request,String pId) {
		QnaDTO qnaDTO = new QnaDTO();
		HttpSession session = request.getSession();
		//String userId = (String)session.getAttribute("user");
		
		String productId = pId;
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		qnaDTO.setProductId(productId);
		qnaDTO.setUsersId("alzzang");
		qnaDTO.setQnaContent(content);
		qnaDTO.setQnatitle(title);
		
		qnaDAO.insertQna(qnaDTO);
	}
	
	@Override
	public List<QnaDTO> qnaList(String productId) {
		List<QnaDTO> qdto = qnaDAO.selectQna(productId);
		return qdto;
	}	
}
