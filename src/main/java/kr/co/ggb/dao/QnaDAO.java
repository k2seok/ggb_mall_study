package kr.co.ggb.dao;

import java.util.List;

import kr.co.ggb.dto.QnaDTO;

public interface QnaDAO {
	public int insertQna(QnaDTO qnaDTO);
	public List<QnaDTO> selectQna(String productId);
}
