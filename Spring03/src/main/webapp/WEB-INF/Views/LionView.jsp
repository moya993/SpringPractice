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
	<!-- View���� ����� ��������� �ڹ��ڵ带 �ᵵ ��, ��� jstl������ ����ؾ���(������ �±�ó�� ����ϴ� ����) -->


	
	<!-- �޴¹�� 1 -->
	<%-- <h1>����</h1>
	<h1>${name}</h1>
	<h1>${age}</h1> --%>
	


<%--  	<jsp:useBean id='recv' class='Pack01.Person' scope='page'/>
	<jsp:setProperty name='recv' property='*' />
	
	<%
	String checkName = recv.getName();
	int checkAge = recv.getAge();
	System.out.println("�޾ƿ� ID:" + checkName);
	System.out.println("�޾ƿ� PW:" + checkAge);
	out.println(checkName);
	out.println(checkAge);
	%>
 --%>

<%-- 
	<h1>����</h1>
	<h1>${name}</h1>
	<h1>${age}</h1> --%>
<%-- 	<h1>${ppp.getName}</h1> --%>
 	
	<h1>${mmmm.get(0)}</h1>
	<h1>${mmmm.get(1)}</h1>
	<h1>${mmmm.get(2)}</h1>
  


	<!-- �޴¹�� 2 -->
	<!-- �ؿ��� �ڹ� �ڵ�� ���� �������� ���, getParameter�� ���� -->
	<!-- request�� Ÿ���� ���߱� ���� ĳ������ ���ּ� -->
	<%-- 	
	<% 
		Person person = (Person)request.getAttribute("ppp");
		//String age = (String)request.getAttribute("cage");
	%>
	
	<%= person.getName() %>
	<%= age %>  --%>

</body>
</html>