package kr.co.ggb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ggb.dao.CategoryDAO;
import kr.co.ggb.dto.CategoryDTO;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDAO categoryDAO;

	@Override
	public List<CategoryDTO> category() {
		List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();

		// ////make DTO
		try {
			System.out.println("카테고리 읽어오는 중..");
			categoryList = categoryDAO.selectAll();
		} catch (Exception e) {
			System.out.println("Category DB select  실패!");
		}

		return categoryList;
	}

}
