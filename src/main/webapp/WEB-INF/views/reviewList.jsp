<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border="1" width="900">
	<c:forEach items="${reviewList}" var="review">
		<tr>
			<td>${review.content }</td>
		</tr>
		<tr>
			<td>
				<table>
					<tr>
	<%-- 					<c:forEach items="${reviewFileList }" var="reviewFile">
							<td>${reviewFile.savefileName }
							<img src="/ReviewDownload/1/1" width="200" height="200"></td>
						</c:forEach> --%>
						<td><img src="/ReviewDownload/${review.reviewNum }/0" width="200" height="200"></td>
					</tr>
				</table>
			</td>
		</tr>
	</c:forEach>
</table>