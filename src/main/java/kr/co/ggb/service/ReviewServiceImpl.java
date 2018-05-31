package kr.co.ggb.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.ggb.dao.ReviewDAO;
import kr.co.ggb.dao.ReviewFileDAO;
import kr.co.ggb.dto.ReviewDTO;
import kr.co.ggb.dto.ReviewFileDTO;
@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO reviewDAO;
	@Autowired
	ReviewFileDAO reviewFileDAO;

	@Override
	public void writeReview(MultipartFile imageFile, HttpServletRequest request, String id) {
		HttpSession session = request.getSession();
		String content = request.getParameter("content");

		//String userId = (String)session.getAttribute("user");
		ReviewDTO reviewDTO = new ReviewDTO();

		reviewDTO.setContent(content);
		reviewDTO.setUsersId("alzzang");
		reviewDTO.setProductId(id);

		System.out.println(content+"_"+"_"+id);
		String saveDir="c:/images";
		File saveDirFile = new File(saveDir);
		String saveFileName=null;
		
		if(!saveDirFile.exists()){
			saveDirFile.mkdirs();
		}

		String saveRealPath = "";
		if(imageFile.getOriginalFilename() != null && !"".equals(imageFile.getOriginalFilename())){
			saveFileName = System.nanoTime()+"_"+Thread.currentThread().getId() +"_" +
					imageFile.getOriginalFilename();

			ReviewFileDTO file = new ReviewFileDTO();
			saveRealPath = saveDir + File.separator + saveFileName;
			try{
				imageFile.transferTo(new File(saveRealPath)); 
			}catch(Exception e){
				throw new RuntimeException("file save error :" + saveFileName + ":" + e);
			}

			file.setFileName(imageFile.getOriginalFilename());
			file.setSavefileName(saveFileName);
		}

		int reviewNum = reviewDAO.addReview(reviewDTO);
		
		ReviewFileDTO reviewFileDTO = new ReviewFileDTO();
		
		reviewFileDTO.setFileName(imageFile.getOriginalFilename());
		reviewFileDTO.setSavefileName(saveFileName);
		reviewFileDTO.setReviewNum(reviewNum);
		
		System.out.println(imageFile.getOriginalFilename()+"_"+saveFileName+"_"+reviewNum);
		reviewFileDAO.add(reviewFileDTO);
		//reviewFileDAO
	}
	@Override
	public List<ReviewDTO> reviewList(String productId){
		//List<ReviewDTO> list = new ArrayList<ReviewDTO>();
		List<ReviewDTO> reviewlist = reviewDAO.selectReview(productId);
		System.out.println(reviewlist.size());

		return reviewlist;
	}

/*	@Override
	public List<ReviewFileDTO> reviewFileList(int reviewNum) {
		List<ReviewFileDTO> reviewFileList = new ArrayList<ReviewFileDTO>();
		ReviewFileDTO reviewFiledto = reviewFileDAO.selectReviewFile(reviewNum);
		return reviewFileList;
	}*/

	@Override
	public void reviewFileDownload(HttpServletRequest request, HttpServletResponse response, int reviewNum, int idx) throws Exception{
		//String savefileName = fileName;
		List<ReviewFileDTO> reviewFileList = reviewFileDAO.selectReviewFile(reviewNum);
		
/*		String fileName = "051916_5_sh_07.jpg";
		String saveFileName= "onepiece.jpg";

		String imageFileName = "c:/images/" + saveFileName;
		String fnfFileName = "c:/images/fnf.jpg";*/

		ReviewFileDTO reviewFile = reviewFileList.get(idx);
		String fileName = reviewFile.getFileName();
		String saveFileName= reviewFile.getSavefileName();

		String imageFileName = "c:/images/" + saveFileName;
		String fnfFileName = "c:/images/fnf.jpg";
		
		File file = new File(imageFileName);

		if(!file.exists()){
			file = new File(fnfFileName);
			response.setContentType("image/jpeg");
			response.setContentLength((int)file.length());
		}else{
			response.setContentType("image/jpeg");
			response.setContentLength((int)file.length());
		}

		FileInputStream is = new FileInputStream(file);
		OutputStream os = response.getOutputStream();

		byte[] buffer = new byte[1024];
		int bytesread = -1;

		while((bytesread = is.read(buffer)) != -1){
			os.write(buffer, 0, bytesread);
		}
		is.close();
		os.close();
	}

}
