<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>List</title>
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
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">Account List</span>
				</h1>
			</div>
			<section class="py-5">				
				<div class="row gx-5 justify-content-center">
					<div class="col-lg-11 col-xl-9 col-xxl-8">
						<!-- table-->
						<table class="table table-hover">
							<thead>
								<tr class="table-dark">
									<th>PRODUCTNAME</th>
									<th>ACCOUNTNUM</th>
									<th>ACCOUNTBALNACE</th>
									<th>ACCOUNTDATE</th>
									<th>PRODUCTRATE</th>									
								</tr>
							</thead>
							<tbody>
								<c:if test="${list.size()==0}">
									<tr>
										<td colspan="4">검색결과가 없습니다.</td>
									</tr>
								</c:if>
								<c:forEach items="${list}" var="dto">								
										<tr>
											<td>${dto.productDTO.productName}</td>
											<td>${dto.accountNum}</td>
											<td>${dto.accountBlanace}</td>
											<td>${dto.accountDate}</td>
											<td>${dto.productDTO.productRate}</td>											
										</tr>
								</c:forEach>
							</tbody>
						</table>
						<div>
							<form class="row g-3" action="./list">
								<div class="col-auto">
									<select name=kind class="form-select"
										aria-label="Default select example">
										<option value="kind1">상품명</option>
										<option value="kind2">계좌번호</option>
										<option value="kind3">가입일</option>
										<option value="kind4">상품명+계좌번호+가입일</option>
									</select>
								</div>
								<div class="col-auto">
									<label for="search" class="visually-hidden">Search</label> <input
										type="text" name="search" class="form-control" id="search" value="${pager.search}"
										placeholder="search">
								</div>
								<div class="col-auto">
									<button type="submit" class="btn btn-primary mb-3">Search</button>
								</div>
							</form>

							<nav aria-label="Page navigation example">
								<ul class="pagination">
									<c:if test="${!pager.start}">
										<li class="page-item"><a class="page-link"
											href="./list?page=${pager.startNum-1}&search=${pager.search}&kind=${pager.kind}"
											aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
										</a></li>
									</c:if>

									<c:forEach begin="${pager.startNum}" end="${pager.lastNum}"
										var="i">
										<li class="page-item"><a class="page-link"
											href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}">${i}</a></li>
									</c:forEach>

									<c:if test="${!pager.last}">
										<li class="page-item"><a class="page-link"
											href="./list?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}"
											aria-label="Next"> <span aria-hidden="true">&raquo;</span>
										</a></li>
									</c:if>
								</ul>
							</nav>
						</div>
					</div>
				</div>
			</section>
	</main>
	<!-- footer -->
	<!-- 사용전 경로를 꼭 수정하세요-->
	<c:import url="../temps/footer.jsp"></c:import>
</body>
</html>
