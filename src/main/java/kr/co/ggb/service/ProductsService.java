package kr.co.ggb.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ggb.dto.ProductsDTO;

public interface ProductsService {
	public ProductsDTO selectProduct(String productId);
	public void download(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
