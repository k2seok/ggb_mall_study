package kr.co.ggb.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;
import kr.co.ggb.dto.QnaDTO;

public interface QnaService {
//	public List<QnaDTO> writeQna(String productId);
	public void writeQna(HttpServletRequest request,String productId);
	public List<QnaDTO> qnaList(String productId);
}
