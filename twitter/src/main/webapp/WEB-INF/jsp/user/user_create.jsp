<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>유저 생성</title>
</head>
<body>
<form action="user_created.jsp" method="post">
	<input name="email" type="email">
	<input name="password" type="password">
	<input name="name" type="text">
	<button type="submit">전송</button>
</form>
</body>
</html>