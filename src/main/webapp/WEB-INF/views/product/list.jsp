<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<body>
<c:import url="../temps/header.jsp"></c:import>

<h1>Product List</h1>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>PRODUCTNUM</th>
				<th>PRODUCTNAME</th>	
				<th>PRODUCTCONTENTS</th>	
				<th>PRODUCTRATE</th>	
				<th>PRODUCTJUMSU</th>		
			</tr>
		</thead>
		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.productNum}</td>
				<td>${pageScope.dto.productName}</td>
				<td>${pageScope.dto.productContents}</td>	
				<td>${pageScope.dto.productRate}</td>	
				<td>${pageScope.dto.productJumsu}</td>				
			</tr>		
		</c:forEach>


	</table>





<c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>