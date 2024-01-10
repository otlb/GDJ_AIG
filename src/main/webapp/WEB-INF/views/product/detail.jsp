<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<body>
<c:import url="../temps/header.jsp"></c:import>
<section class="container-fluid">
<h1>Product Detail</h1>

    <section class="container-fluid">    	
    	
    	<c:if test="${dto != null }">
    	<table class="table table-hover">
    		<thead>
    			<tr>
    				<th>NUM</th>
    				<th>NAME</th>
    				<th>CONTENTS</th>
    				<th>RATE</th>
    				<th>JUMSU</th>
    			</tr>
    		</thead>
    		<tr>
    			<td>${dto.productNum}</td>    			
    			<td>${dto.productName}</td>
    			<td>${dto.productContents}</td>
    			<td>${dto.productRate}</td>
    			<td>${dto.productJumsu}</td>
    		</tr>
    	</table>
    	</c:if>
    	
    	<c:if test="${empty dto}">
    			<h3>없는 번호 입니다.</h3>
    		</c:if>
    		
    		<button id="up" data-product-Num="${dto.productNum}">UPDATE</button>
    		
    		<form action="./delete" id="frm" method="post">
    			<button type="" id="del">DELETE</button>    		
    			<input type="hidden" name="productNum" value="${dto.productNum}">
    		</form>
    		
    	    
			
    </section>





<c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>