<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="/login" method="post">
 <label>ID: <input type="text" id="userId" name="userId" ></label>
 <label>PW: <input type="password" id="password" name="password" ></label>
 <input type="submit" id="submit"  value="로그인" >
</form>
<a href="/GGB_160520/views/join.jsp" >회원가입</a>


</body>
</html>