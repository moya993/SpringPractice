<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<title>메인 페이지</title>
<style>
		tr { text-align: center }
		a { color: black; text-decoration: none; }
	</style>
</head>
<body>

	<h1><center>대통령 선거</center></h1>
	<FORM METHOD=Post action="t1">
					<table width='100' border='1'  cellpadding='3' cellspacing='5'align = 'center'>
						<tr>
							<td width='100%'>이름</td>
							<td><input type='text' name='name'></td>
							<td rowspan="2">
							<button style='background-color: #C0C0C0; color: #ffffff; border: 0; border-radius: 20px; width: 100px; height: 30px;'>인증</button> </div></td>
						</tr>
						<tr>
							<td>전화번호</td>
							<td><input type='text' name='phone'></td>
						</tr>
					</table>
				</FORM><br/>

</body>
