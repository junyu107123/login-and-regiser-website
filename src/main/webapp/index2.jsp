<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<h1>登錄頁面</h1>
	<form action="hall" method="POST">
	<table border="1">
	<tr><td>名稱</td><td><input type="text" name="name"/></td></tr>
	<tr><td>信箱</td><td><input type="text" name="email"/></td></tr>
	<tr><td>密碼</td><td><input type="password" name="password"/></td></tr>
	<tr><td><input type="submit" value="登錄"/></td><td><input type="reset" value="清除 "/></td></tr>
	</form>
	
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.min.js"></script>
</body>
</html>