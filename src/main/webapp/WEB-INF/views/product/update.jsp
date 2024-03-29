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


		<section class="py-5">
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">UPDATE</span>
				</h1>
			</div>

			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">
					<form class="form-control" method="POST"
						enctype="multipart/form-data">
						<input type="hidden" name="productNum" value="${dto.productNum}">
						<div class="mb-3">
							<label for="name" class="form-label">Name</label> <input
								type="text" class="form-control" id="name" name="productName"
								value="${dto.productName}">
						</div>

						<div class="mb-3">
							<label for="contents" class="form-label">Contents</label>
							<textarea class="form-control" id="contents" rows="3"
								name="productContents">${dto.productContents}</textarea>
						</div>

						<div class="mb-3">
							<label for="rate" class="form-label">Rate</label>
							<textarea class="form-control" id="rate" rows="3"
								name="productRate">${dto.productRate}</textarea>
						</div>

						<div class="mb-3">
							<input type="file" name="attachs" class="form-control"> <input
								type="file" name="attachs" class="form-control"> <input
								type="file" name="attachs" class="form-control">
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
