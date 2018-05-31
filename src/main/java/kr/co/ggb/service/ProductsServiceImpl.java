package kr.co.ggb.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.ggb.dto.ProductsDTO;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Override
	public ProductsDTO selectProduct(String productId) {
		
		ProductsDTO pdto = new ProductsDTO();
		pdto.setProductId("1");
		pdto.setStock(10);
		pdto.setProductName("상품1");
		pdto.setPrice(100000);
		pdto.setContent("~~~~~~~~~~~~~");
		pdto.setProductRegdate("16/05/23");
		pdto.setCategoryId(1);
		
		return pdto;
	}
	@Override
	public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String savefileName = fileName;
		String fileName = "051916_5_sh_07.jpg";
		String savefileName = "61072174663660_28_051916_5_sh_07.jpg";
		String imageFileName = "c:/images/" + savefileName;
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
