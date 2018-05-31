<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="kr.co.ggb.dto.CategoryDTO"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GGB</title>

</head>
<body>
	<!-- 	<div id="frame" border="2" width="1000"> -->
	<header>
		<p width="400" height="30" colspan="2">
			<tiles:insertAttribute name="header" />
		</p>
	</header>

	<section>
		<nav>
			<tiles:insertAttribute name="menu" />
		</nav>
		<article width="600">
			<tiles:insertAttribute name="productList" />
		</article>
	</section>
	<footer>
		<td height="20" colspan="2"><tiles:insertAttribute name="footer" /></td>
	</footer>
</body>
</html>