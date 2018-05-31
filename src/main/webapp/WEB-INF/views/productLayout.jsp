<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<table id="frame" border="2" width = "1000" >
       <tr>
             <td width = "400" height="30" colspan="2"><tiles:insertAttribute name="header" /></td>
       </tr>
       <tr>
             <td width = "400" height="400"><tiles:insertAttribute name="menu" /></td>
             <td width="600"><%-- <tiles:insertAttribute name="body" /> --%>
	             <table border="0" align="center" width="500">
	             	<tr>
	             		<td><tiles:insertAttribute name="product" /></td>
	             	</tr>
	             	<tr>
	             		<td><tiles:insertAttribute name="reviewWrite" /></td>
	             	</tr>
	             	<tr>
	             		<td><tiles:insertAttribute name="reviewList" /></td>
	             	</tr>
	             	<tr>
	             		<td><tiles:insertAttribute name="qnaList" /></td>
	             	</tr>
	             </table>
             </td>
       </tr>
       <tr>
             <td height="20" colspan="2"><tiles:insertAttribute name="footer" />
             </td>
       </tr>

</table>
</body>
</html>