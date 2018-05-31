<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<table id="frame" border="1" align="center" width = "1000">
       <tr>
             <td height="30" colspan="2"><tiles:insertAttribute name="header" /></td>
       </tr>
       <tr>
             <td width = "200"height="200"><tiles:insertAttribute name="menu" /></td>
             <td width="800"><tiles:insertAttribute name="body" /></td>
       </tr>
       <tr>
             <td height="20" colspan="2"><tiles:insertAttribute name="footer" />
             </td>
       </tr>

</table>
</body>
</html>