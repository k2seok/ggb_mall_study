package kr.co.ggb.dao;

import java.util.List;

import kr.co.ggb.dto.CategoryDTO;

public interface CategoryDAO {

//	public void select() throws Exception;

	int insert(CategoryDTO category) throws Exception;

	List<CategoryDTO> selectAll() throws Exception;
}
