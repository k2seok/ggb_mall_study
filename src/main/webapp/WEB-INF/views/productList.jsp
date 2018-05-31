<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="kr.co.ggb.dto.ProductFileDTO"%>


<section>
	<article id="product">
		<c:forEach items="${productFile}" var="ProductFileDTO">
			<section>
				<img class="productImage" width="500" height="500" src="${ProductFileDTO.savefileName}">
			</section>			<!-- 		productDTO.productContent -->
			<footer >${ProductFileDTO.productFileId}</footer>
		</c:forEach>
	</article>
</section>
