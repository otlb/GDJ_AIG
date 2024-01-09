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
	<div>
	<form class="row g-3">
			<div class="col-auto">
				<select name=kind class="form-select" aria-label="Default select example">
				  <option value="kind1">제목</option>
				  <option value="kind2">내용</option>
				  <option value="kind3">작성자</option>
				  <option value="kind4">제목+내용+작성자</option>
				</select>
			</div>		
		  <div class="col-auto">
		    <label for="search" class="visually-hidden">Search</label>
		    <input type="text" name="search" class="form-control" id="search" placeholder="search">
		  </div>
		  <div class="col-auto">
		    <button type="submit" class="btn btn-primary mb-3">Search</button>
		  </div>
		</form>
	
	
	
	</div>


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
				<td><a href="./detail?productNum=${praductNum}">${pageScope.dto.productName}</a></td>
				<td>${pageScope.dto.productContents}</td>	
				<td>${pageScope.dto.productRate}</td>	
				<td>${pageScope.dto.productJumsu}</td>				
			</tr>		
		</c:forEach>


	</table>
	
	<nav aria-label="Page navigation example">
	  <ul class="pagination">
	  	<c:if test="${!pager.start}">
	    <li class="page-item">
	      <a class="page-link" href="./list?page=${pager.startNum-1}&search=${pager.search}" aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    </c:if>
	    
	    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
	    		<li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}">${i}</a></li>
	    </c:forEach>
	    
	    <c:if test="${!pager.last}">
	    <li class="page-item">
	      <a class="page-link" href="./list?page=${pager.lastNum+1}&search=${pager.search}" aria-label="Next">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
	    </c:if>
	  </ul>
	</nav>
	





<c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>