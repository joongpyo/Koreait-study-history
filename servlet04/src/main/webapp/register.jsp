<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<link href="css.style.css" rel="stylesheet"/>
</head>
<body>	
	<a href="/servlet04">메인페이지로 이동</a>
	<br />
	<form method="post" action="/servlet04/register.do">
		<label>아이디</label>
		<input type="text" name="userid" /><br/>
		<label>비밀번호</label>
		<input type="text" name="passwd" /><br/>		
		<label>취미</label><br/>
		<input type="checkbox" name="hobby" value="독서"/>독서
		<input type="checkbox" name="hobby" value="낚시"/>낚시
		<input type="checkbox" name="hobby" value="등산"/>등산
		<br/>
		
		<input type="submit" value="회원가입"/>
	</form>
</body>
