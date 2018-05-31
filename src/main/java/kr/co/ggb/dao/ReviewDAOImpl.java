package kr.co.ggb.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ggb.dto.ReviewDTO;

@Repository
public class ReviewDAOImpl implements ReviewDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int addReview(ReviewDTO reviewDTO) {
		int count = 0;
		count = sqlSession.insert("kr.co.ggb.mapper.Review.addReview", reviewDTO);	
		return reviewDTO.getReviewNum();
	}
	
	@Override
	public List<ReviewDTO> selectReview(String productId) {
		List<ReviewDTO> review = sqlSession.selectList("kr.co.ggb.mapper.Review.selectReview", productId);
		return review;
	}
}
