package kr.co.ggb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.co.ggb.dto.ProductFileDTO;
import kr.co.ggb.dto.ProductsDTO;
import kr.co.ggb.dto.QnaDTO;
import kr.co.ggb.dto.ReviewDTO;
import kr.co.ggb.service.CategoryService;
import kr.co.ggb.service.ProductFileService;
import kr.co.ggb.service.ProductsService;
import kr.co.ggb.service.QnaService;
import kr.co.ggb.service.ReviewService;

@Controller
public class BoardController {

	@Autowired
	QnaService qnaService; // QNA
	@Autowired
	ReviewService reviewService;
	@Autowired
	ProductsService productService;
	@Autowired
	ProductFileService productFileService;
	@Autowired
	CategoryService CategoryServiceImpl;

	@RequestMapping(value = "/QnaWriteForm/{productId}", method = { RequestMethod.GET })
	public String qnaWriteForm(Model model, @PathVariable("productId") String productId) {
		model.addAttribute("category", CategoryServiceImpl.category());
		model.addAttribute("productId", productId);
		return "writeForm";
	}

	@RequestMapping(value = "/QnaWrite/{productId}", method = { RequestMethod.GET })
	public String qnaWrite(HttpServletRequest request, Model model, @PathVariable("productId") String productId) {
		qnaService.writeQna(request, productId);
		return "redirect:/productBoard";
	}

	@RequestMapping(value = "/reviewWrite", method = { RequestMethod.POST })
	public String reviewWrite(@RequestParam("image") MultipartFile imageFile, HttpServletRequest request, Model model) {
		/*
		 * HttpSession session = request.getSession(); String UserId =
		 * (String)session.getAttribute("user"); String
		 * content=request.getParameter("content");
		 */

		String id = request.getParameter("productId");
		reviewService.writeReview(imageFile, request, id);
		return "redirect:/productBoard";
	}

	@RequestMapping(value = "/main", method = { RequestMethod.GET })
	public String main(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "main";
	}

	@RequestMapping(value = "/ReviewDownload/{reviewNum}/{idx}", method = { RequestMethod.GET })
	public void reviewDownload(HttpServletRequest request, HttpServletResponse response, Model model,
			@PathVariable("reviewNum") int reviewNum, @PathVariable("idx") int idx) throws Exception {
		// System.out.println(fileName);
		reviewService.reviewFileDownload(request, response, reviewNum, idx);
	}

	@RequestMapping(value = "/download/{idx}", method = { RequestMethod.GET })
	public void download(HttpServletRequest request, HttpServletResponse response, Model model,
			@PathVariable("idx") int idx) throws Exception {
		productService.download(request, response);
	}

	@RequestMapping(value = "/productBoard", method = { RequestMethod.GET })
	public String product(Model model) {
		ProductsDTO pdto = productService.selectProduct("1");
		model.addAttribute("productDTO", pdto);

		List<ProductFileDTO> productFileList = productFileService.productFileList();
		model.addAttribute("productFileList", productFileList);

		List<QnaDTO> qdto = qnaService.qnaList(pdto.getProductId());
		model.addAttribute("qdto", qdto);

		List<ReviewDTO> reviewList = reviewService.reviewList(pdto.getProductId());
		model.addAttribute("reviewList", reviewList);

		// List<ReviewFileDTO> reviewFileList = reviewService.reviewFileList(1);
		// model.addAttribute("reviewFileList",reviewFileList);

		model.addAttribute("category", CategoryServiceImpl.category());
		return "product";
	}
	
	@RequestMapping(value = "/productList", method = { RequestMethod.GET })
	public String productList(Model model) {
		
//		List<ProductsDTO> productList = new ArrayList<ProductsDTO>();
		///////////////products add 
//		ProductsDTO pA = new ProductsDTO("A", 10, "A반팔", 5000, "상품내용", 1, "20150525");
//		ProductsDTO pB = new ProductsDTO("B", 10, "B반팔", 5000, "상품내용", 1, "20150525");
//		ProductsDTO pC = new ProductsDTO("C", 10, "C반팔", 5000, "상품내용", 1, "20150525");
//		
//		productList.add(pA);
//		productList.add(pB);
//		productList.add(pC);
//		
		
		List<ProductFileDTO> productFileList = new ArrayList<ProductFileDTO>();
		
		ProductFileDTO pA = new ProductFileDTO("A",1, "Web","http://i2.imgtong.com/1106/28314_11072312070256.jpg", "20150525");
		ProductFileDTO pB = new ProductFileDTO("B",1, "Web","http://www.androidside.com/data/file/B10/1893324618_3hC8dbjl_EC87BCED9591EBAAB0EAB384EAB095EBAFBCEAB2BD01.jpg", "20150525");
		ProductFileDTO pC = new ProductFileDTO("C",1, "Web","http://www.style1.co.kr/upload/style1/20150608225824732805804.JPG", "20150525");

		productFileList.add(pA);
		productFileList.add(pB);
		productFileList.add(pC);
		
		
//		ProductsDTO pdto = productService.selectProduct("1");
//		model.addAttribute("productDTO", pdto);
//w
//
//
//
		
		
//		model.addAttribute("products", productList);
		model.addAttribute("productFile", productFileList);
		model.addAttribute("category", CategoryServiceImpl.category());
		
		return "productList";
	}
	
}



















