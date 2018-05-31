package kr.co.ggb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.ggb.dto.ProductFileDTO;
@Service
public class ProductFileServiceImpl implements ProductFileService{

	@Override
	public List<ProductFileDTO> productFileList() {
		List<ProductFileDTO> dto = new ArrayList<ProductFileDTO>();
		ProductFileDTO fdto = new ProductFileDTO();
		fdto.setFileName("1");
		fdto.setSavefileName("onepiece2.jpg");
		fdto.setFileRegdate("160523");
		fdto.setProductFileId("1");
		fdto.setProductId(1);
		
		ProductFileDTO fdto2 = new ProductFileDTO();
		fdto2.setFileName("2");
		fdto2.setSavefileName("onepiece.jpg");
		fdto2.setFileRegdate("160523");
		fdto2.setProductFileId("1");
		fdto2.setProductId(1);
		dto.add(fdto);
		dto.add(fdto2);
		return dto;
	}
}
