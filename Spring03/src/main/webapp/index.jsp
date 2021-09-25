<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<title>메인 페이지</title>
</head>
<body>

	<%=new Date()%>
	<h2>Hi</h2>
	<a href="t1">링크1</a><br />
	<a href="t2">링크2</a><br />	<!-- t2를 쓰기위해서는 java파일에 가서 매핑해줘야함 -->
	<a href="t3">링크3</a><br />
	<a href="t4?name=코끼리">링크4</a><br />		<!-- 인수 전달을 하기 위해 ?를 씀 -->
	<a href="t5?name=코끼리&age=30">링크5</a><br />	<!-- 인수전달 2개 -->
	<a href="t6?name=강동하&age=30">링크6</a><br />
	<a href="t7">링크7</a><br/>
	<a href="t8?name=김경도&age=50">링크8</a><br />
	<a href="t9?name=강아지&age=10">링크9</a><br />
	<a href="t10">링크10</a><br />
	<a href="t12">링크11</a><br />


	<!-- form태그는 무엇인가를 전달하고 싶을 때 사용 -->
	<form Method="post" action="t12">
		<input type='text' name='name' Value = "말미잘"/><br/>
		<input type='text' name='age' Value = 262><br/>
		<input type='submit' value="전송"></input>
	</form>


</body>
