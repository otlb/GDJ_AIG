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
			<div class="container px-5">
				<!-- Contact form-->
				<div class="bg-light rounded-4 py-5 px-4 px-md-5">
					<div class="text-center mb-5">
						<div
							class="feature bg-primary bg-gradient-primary-to-secondary text-white rounded-3 mb-3">
							<i class="bi bi-envelope"></i>
						</div>
						<h1 class="fw-bolder">Get in Join</h1>
						<p class="lead fw-normal text-muted mb-0">Let's work together!</p>
					</div>
					<div class="row gx-5 justify-content-center">
						<div class="col-lg-8 col-xl-6">
						
							<form id="contactForm" action="./join" method="post"
								enctype="multipart/form-data">
								<input type="hidden" name="productNum" value="${dto.productNum}">
								<div class="mb-3">
									<label for="accountPw" class="form-label">비밀번호</label>
									<input type="password" class="form-control" id="accountPw" name="accountPw">
								</div>
								








								<!-- Submit Button-->
								<div class="d-grid">
									<button class="btn btn-primary btn-lg" id="submitButton"
										type="submit">Submit</button>
								</div>
							</form>
						</div>
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
