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
		<c:import url="../temps//header.jsp"></c:import>


		<section class="py-5">
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline"> 상품가입 </span>
				</h1>
			</div>
			<div class="row justify-content-center">
				<div class="col-4 align-self-center bg-light rounded-4">
					<div class="card my-3">
						<h3 class="card-header">상품정보</h3>
						<form action="./add" method="post">
							<div class="row card-body">
								<div class="card-body">
									<p class="card-text">상품이름 : ${dto.productName}</p>
								</div>
								<ul class="list-group list-group-flush">
									<li class="list-group-item">상품번호 : ${dto.productNum}<input
										type="hidden" name="productNum" value="${dto.productNum}" /></li>
									<li class="list-group-item">상품내용 : ${dto.productContents}</li>
									<li class="list-group-item">이자율 : ${dto.productRate}</li>
									<li class="list-group-item">평점 : ${dto.productJumsu}</li>
									<li class="list-group-item"><label for="pw">비밀번호 :
									</label><input class="form-control" id="pw" type="password"
										name="accountPw" /></li>

								</ul>









								<!-- Submit Button-->
								<div class="d-grid">
									<button class="btn btn-primary btn-lg" id="submitButton"
										type="submit">Submit</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>

	</main>
	<!-- footer -->
	<!-- 사용전 경로를 꼭 수정하세요-->
	<c:import url="../temps//footer.jsp"></c:import>
</body>
</html>
