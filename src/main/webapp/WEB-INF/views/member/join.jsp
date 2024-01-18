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
<title>Join</title>
<!-- Favicon-->
<!-- 사용전 경로를 꼭 수정하세요-->
<c:import url="../temps/head_css.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<!-- Navigation-->
		<!-- 사용전 경로를 꼭 수정하세요-->
		<c:import url="../temps/header.jsp"></c:import>

		<section class="py-5">
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">JOIN</span>
				</h1>
			</div>

			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">
					<form class="form-control" method="POST" action="./join"
						enctype="multipart/form-data">						
						<div class="mb-3">
							<label for="username" class="form-label">아이디</label> <input
								type="text" class="form-control" id="username" name="userName"
								value="${memberDTO.userName}">
						</div>
						<div class="mb-3">
							<label for="password" class="form-label">비밀번호</label> <input
								type="password" class="form-control" id="password" name="password"
								value="${memberDTO.password}">
						</div>
						<div class="mb-3">
							<label for="phone" class="form-label">핸드폰번호</label> <input
								type="text" class="form-control" id="phone" name="phone"
								value="${memberDTO.phone}">
						</div>
						<div class="mb-3">
							<label for="email" class="form-label">이메일</label> <input
								type="text" class="form-control" id="email" name="email"
								value="${memberDTO.email}">
						</div>
						<div class="mb-3">
							<label for="address" class="form-label">주소</label> <input
								type="text" class="form-control" id="address" name="address"
								value="${memberDTO.address}">
						</div>
						<div class="mb-3">
							<label for="name" class="form-label">이름</label> <input
								type="text" class="form-control" id="name" name="name"
								value="${memberDTO.name}">
						</div>
						
						<div class="mb-3">
							<input type="file" name="photo" class="form-control"> 
						</div>

						<div class="d-grid">
							<button class="btn btn-primary btn-lg" id="submitButton"
								type="submit">Submit</button>
						</div>
					</form>
				</div>
			</div>


		</section>



	</main>
	<!-- footer -->
	<!-- 사용전 경로를 꼭 수정하세요-->
	<c:import url="../temps/footer.jsp"></c:import>
</body>
</html>