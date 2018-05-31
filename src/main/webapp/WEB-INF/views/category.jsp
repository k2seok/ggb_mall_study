<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="kr.co.ggb.dto.CategoryDTO"%>

<ul class="list">
	<c:forEach items="${category}" var="CategoryDTO">
		<li><a href="${CategoryDTO.categoryId}">
				${CategoryDTO.categoryName}
			 </a>
		</li>
	</c:forEach>
</ul>
