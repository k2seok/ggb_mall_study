package kr.co.ggb.dao;

import java.util.List;

import kr.co.ggb.dto.ReviewFileDTO;

public interface ReviewFileDAO {
	public void add(ReviewFileDTO reviewFileDTO);
	public List<ReviewFileDTO> selectReviewFile(int reviewNum);
}
