package kr.co.ggb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ggb.dto.CategoryDTO;

@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired
	SqlSession session;
	
	@Override
	public List<CategoryDTO> selectAll() throws Exception {
		List<CategoryDTO> list = session.selectList("Category.selectAll");
		return list;
	}

	@Override
	public int insert(CategoryDTO category) throws Exception {
		return 0;
	}
}
