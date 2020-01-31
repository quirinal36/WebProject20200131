<%@page import="www.jca.com.Waste"%>
<%@page import="java.util.List"%>
<%@page import="www.jca.com.WasteController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	WasteController controller = new WasteController();
	List<Waste> list = controller.selectList(new Waste());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<colgroup>
			<col width="10%">
			<col width="30%">
			<col width="30%">
			<col width="30%">
		</colgroup>
		<thead>
			<tr>
				<th>
					번호
				</th>
				<th>
					연도
				</th>
				<th>
					공사명
				</th>
				<th>
					공사금액
				</th>
			</tr>
		</thead>
		<tbody>
			<% for(Waste waste : list){ %>
				<tr>
					<td><%=waste.getId() %></td>
					<td><%=waste.getYear() %></td>
					<td><%=waste.getTitle() %></td>
					<td><%=waste.getBudget() %></td>
				</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>