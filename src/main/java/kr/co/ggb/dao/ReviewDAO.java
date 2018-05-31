package kr.co.ggb.dao;

import java.util.List;

import kr.co.ggb.dto.ReviewDTO;

public interface ReviewDAO {
	public int addReview(ReviewDTO reviewDTO); 
	public List<ReviewDTO> selectReview(String productId);
}
