package kr.co.ggb.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import kr.co.ggb.dto.ReviewDTO;
import kr.co.ggb.dto.ReviewFileDTO;

public interface ReviewService {
	public void writeReview(MultipartFile imageFile,HttpServletRequest request, String id);
	public List<ReviewDTO> reviewList(String productId);
	//public List<ReviewFileDTO> reviewFileList(int reviewNum);
	public void reviewFileDownload(HttpServletRequest request, HttpServletResponse response, int reviewNum, int idx) throws Exception;

}
