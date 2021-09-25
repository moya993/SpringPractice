<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="Pack01.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- View에서 제어문을 쓰고싶으면 자바코드를 써도 됨, 대신 jstl문법을 사용해야함(일종의 태그처럼 사용하는 문법) -->


	
	<!-- 받는방법 1 -->
	<%-- <h1>사자</h1>
	<h1>${name}</h1>
	<h1>${age}</h1> --%>
	


<%--  	<jsp:useBean id='recv' class='Pack01.Person' scope='page'/>
	<jsp:setProperty name='recv' property='*' />
	
	<%
	String checkName = recv.getName();
	int checkAge = recv.getAge();
	System.out.println("받아온 ID:" + checkName);
	System.out.println("받아온 PW:" + checkAge);
	out.println(checkName);
	out.println(checkAge);
	%>
 --%>

<%-- 
	<h1>사자</h1>
	<h1>${name}</h1>
	<h1>${age}</h1> --%>
<%-- 	<h1>${ppp.getName}</h1> --%>
 	
	<h1>${mmmm.get(0)}</h1>
	<h1>${mmmm.get(1)}</h1>
	<h1>${mmmm.get(2)}</h1>
  


	<!-- 받는방법 2 -->
	<!-- 밑에는 자바 코드로 변수 가져오는 방법, getParameter는 못씀 -->
	<!-- request와 타입을 맞추기 위해 캐스팅을 해주셈 -->
	<%-- 	
	<% 
		Person person = (Person)request.getAttribute("ppp");
		//String age = (String)request.getAttribute("cage");
	%>
	
	<%= person.getName() %>
	<%= age %>  --%>

</body>
</html>