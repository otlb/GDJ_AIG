<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Personal - Start Bootstrap Theme</title>
        <!-- Favicon-->
        <!-- 사용전 경로를 꼭 수정하세요-->
		<c:import url="../temps/head_css.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <!-- 사용전 경로를 꼭 수정하세요-->
				<c:import url="../temps/header.jsp"></c:import>
				<div class="container px-5 my-5">
				    <div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Product List</span></h1>
                </div>
				</div>
				
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
				<th>PRODUCTCOUNT</th>
				<th>PRODUCTSALE</th>		
			</tr>
		</thead>
		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.productNum}</td>
				<td><a href="./detail?productNum=${dto.productNum}">${pageScope.dto.productName}</a></td>
				<td>${pageScope.dto.productContents}</td>	
				<td>${pageScope.dto.productRate}</td>	
				<td>${pageScope.dto.productJumsu}</td>
				<td>${pageScope.dto.productCount}</td>
				<td>${pageScope.dto.productSale}</td>				
			</tr>		
		</c:forEach>


	</table>
	
	<nav aria-label="Page navigation example">
	  <ul class="pagination">
	  	<c:if test="${!pager.start}">
	    <li class="page-item">
	      <a class="page-link" href="./list?page=${pager.startNum-1}&search=${pager.search}&kind=${pager.kind}" aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    </c:if>
	    
	    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
	    		<li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}">${i}</a></li>
	    </c:forEach>
	    
	    <c:if test="${!pager.last}">
	    <li class="page-item">
	      <a class="page-link" href="./list?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}" aria-label="Next">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
	    </c:if>
	  </ul>
	</nav>
				
				
				
				
				<div>
					<a href="./add" class="btn btn-light">상품등록</a>
				</div>
				

        </main>
		<!-- footer -->
        <!-- 사용전 경로를 꼭 수정하세요-->
		<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
