<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


Q & A<br>
<table border="1" width="900" cellpadding="0" cellspacing="0" >
<tr height="30">
	<th align="center" width="50">No</th>
	<th align="center" width="50">subject</th>
	<th align="center" width="50">writer</th>
	<th align="center" width="50">date</th>
</tr>
<c:forEach items="${qdto}" var="QnaDTO">
<tr>
	<td align="center" width="50">${QnaDTO.qnaboardId }</td>
	<td align="center" width="50">${QnaDTO.qnatitle }</td>
	<td align="center" width="50">${QnaDTO.usersId }</td>
	<td align="center" width="50">${QnaDTO.qnaRegdate }</td>
</tr>
</c:forEach>
</table>
<input id="wirteButton" type="button" onclick="location.href='/QnaWriteForm/${productDTO.productId }'"/>