<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>實例驅動學習之Spring框架:</h2>
	<p>----Spring Boot+MySQL 構建一個簡單的登錄註冊系統</p>
	<br>
	<p th:text="'Hello, ' + ${name} + '!'" />
	<div class="add">
		<h2>註冊新帳號</h2>
		<form action="/add" method="post">
			名稱 :<input type="text" name="name"><br> 
			信箱 :<input type="text" name="email"><br> 
			密碼 :<input type="password" name="password"><br><br> 
				 <input type="submit" value="註冊">
		</form>
	</div>
	<div class="login">
		<h2>登錄已有帳號</h2>
		<form action="/login" method="post">
			信箱 :<input type="text" name="email"><br> 
			密碼 :<input type="password" name="password"><br><br> 
				 <input type="submit" value="登錄">
		</form>
	</div>
	<div class="all">
		<h2>
			<a href="/all">查看所有註冊帳號資訊</a>
		</h2>
	</div>
</body>
</html>