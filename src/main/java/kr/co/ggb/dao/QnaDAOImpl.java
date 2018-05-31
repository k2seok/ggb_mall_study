package kr.co.ggb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.co.ggb.dto.QnaDTO;

@Repository
public class QnaDAOImpl implements QnaDAO{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insertQna(QnaDTO qnaDTO) {
		sqlSession.insert("kr.co.ggb.mapper.Qna.addQna", qnaDTO);
		return 0;
	}
	@Override
	public List<QnaDTO> selectQna(String productId) {
		List<QnaDTO> review = sqlSession.selectList("kr.co.ggb.mapper.Qna.selectQna", productId);
		return review;
	}
}
