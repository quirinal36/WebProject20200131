<%@page import="www.jca.com.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	User user = new User();
	user.setId(1);
	user.setUsername("leehg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print(user.toString());
%>
</body>
</html>