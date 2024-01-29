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
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">Product Detail</span>
				</h1>
			</div>
		</div>
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
							<th>COUNT</th>
							<th>SALE</th>
							<th>FILE</th>
						</tr>
					</thead>
					<tr>
						<td id="productNum">${dto.productNum}</td>
						<td>${dto.productName}</td>
						<td>${dto.productContents}</td>
						<td>${dto.productRate}</td>
						<td>${dto.productJumsu}</td>
						<td>${dto.productCount}</td>
						<td>${dto.productSale}</td>
						<c:forEach items="${dto.productFileDTOs}" var="f">
							<td><a href="/resources/upload/product/${f.fileName}">${f.oriName}</a></td>
						</c:forEach>
					</tr>
				</table>
			</c:if>
			

			<div class="my-3" >
				<table class="table table-hover">
					<thead>
						<tr>
							<th>REPLYCONTENTS</th>			
							<th>USERNAME</th>							
							<th>REPLYDATE</th>							
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody id="replyList" data-userName="${userName}">

					</tbody>
				</table>
				<div>					
					<button id="more" data-replyList-page="1" data-replyList-totalPage="1">더보기</button>					
				</div>
			</div>


			<div class="my-3">
				<form id="replyForm">
					<input type="hidden" name="productNum" value="${dto.productNum}" />
					<div class="mb-3">
						<textarea class="form-control" name="replyContents"
							id="replyContents" rows="3"></textarea>
					</div>
					<div class="mb-3">
						<select class="form-select" name="replyJumsu"
							aria-label="Default select example">
							<option value="5">★★★★★</option>
							<option value="4">★★★★</option>
							<option value="3">★★★</option>
							<option value="2">★★</option>
							<option value="1">★</option>
						</select>
					</div>
					<div>
						<button id="replyAdd" type="button" class="btn btn-primary">댓글달기</button>
					</div>
				</form>
			</div>




			<a id="update" href="#" class="btn btn-info">Update</a> <a
				id="delete" href="#" class="btn btn-danger">Delete</a>
			<form id="frm" action="./update" method="get">
				<input type="hidden" name="productNum" value="${dto.productNum}">
			</form>

			<c:if test="${not empty member}">
				<div>
					<a href="../account/join?productNum=${dto.productNum}"
						class="btn btn-light">상품구매</a>

					<button id="wish" class="btn btn-primary" type="button"
						name="productNum">상품찜</button>

				</div>
			</c:if>


		</section>

	</main>
	<!-- footer -->
	<!-- 사용전 경로를 꼭 수정하세요-->
	<c:import url="../temps/footer.jsp"></c:import>
	<script src="/resources/js/boardDetail.js"></script>
	<script src="/resources/js/wish/wishreply.js"></script>
</body>
</html>
