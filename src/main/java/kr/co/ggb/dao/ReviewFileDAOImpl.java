package kr.co.ggb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ggb.dto.ReviewFileDTO;

@Repository
public class ReviewFileDAOImpl implements ReviewFileDAO{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void add(ReviewFileDTO reviewFileDTO) {
		sqlSession.insert("kr.co.ggb.mapper.ReviewFile.addReviewFile", reviewFileDTO);
	}
	@Override
	public List<ReviewFileDTO> selectReviewFile(int reviewNum) {
		List<ReviewFileDTO> reviewFileList =  sqlSession.selectList("kr.co.ggb.mapper.ReviewFile.selectReviewFile", reviewNum);
		return reviewFileList;
	}
}
