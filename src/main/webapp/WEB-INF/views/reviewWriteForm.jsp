<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<form action="/reviewWrite" enctype="multipart/form-data" method="POST">
	REVIEW<br> 
	<input type="hidden" name="productId" value="${productDTO.productId }" />
	<textarea name="content" cols="60" rows="6"></textarea><br> 
	<input type="file" name="image" /> 
	<input type="submit" value="submit" />
</form>