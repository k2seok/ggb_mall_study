<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

price : ${productDTO.price}<br>
content : ${productDTO.content }<br>
productName : ${productDTO.productName }<br>
<br><br>

<c:forEach items="${productFileList}" var = "ProductFileDTO">
<img src="/download/1"/>
</c:forEach>