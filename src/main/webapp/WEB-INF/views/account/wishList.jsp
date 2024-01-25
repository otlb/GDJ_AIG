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
						<div class="col-auto d-flex justify-content-end">
							<button class="btn btn-danger mb-3" id="del">찜삭제</button>
						</div>
						<!-- table-->
						<table class="table table-hover">
							<thead>
								<tr class="table-dark">
									<th>
										<div class="form-check">
											<input class="form-check-input" type="checkbox" value=""
												id="checkAll"> <label class="form-check-label"
												for="checkAll"> 전체선택 </label>
										</div>
									</th>
									<th>No</th>
									<th>PRODUCTNAME</th>
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
										<td>
											<div class="form-check">
												<input class="form-check-input checks" type="checkbox"
													value="${dto.productNum}">
											</div>
										</td>
										<td>${dto.productNum}</td>
										<td><a
											href="../product/detail?productNum=${dto.productNum}">${dto.productName}</a></td>
										<td>${dto.productRate}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</section>
	</main>
	<!-- footer -->
	<!-- 사용전 경로를 꼭 수정하세요-->
	<c:import url="../temps/footer.jsp"></c:import>
	<script src="../resources/js/wish/wishlist.js" type="text/javascript"></script>
</body>
</html>
