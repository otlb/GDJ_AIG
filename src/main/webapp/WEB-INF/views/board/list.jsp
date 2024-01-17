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
<title>${board}List</title>
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
					<span class="text-gradient d-inline">${board} List</span>
				</h1>
			</div>
			<section class="py-5">
				<div class="text-center mb-5">
					<h1 class="display-5 fw-bolder mb-0">
						<span class="text-gradient d-inline">Projects</span>
					</h1>
				</div>
				<div class="row gx-5 justify-content-center">
					<div class="col-lg-11 col-xl-9 col-xxl-8">
						<!-- table-->
						<table class="table table-hover">
							<thead>
								<tr class="table-dark">
									<th>NUM</th>
									<th>NAME</th>
									<th>CONTENTES</th>
									<th>USER</th>
									<th>Date</th>
									<th>HIT</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${list}" var="dto">
									<c:set var="f" value="0"></c:set>
									<c:catch>
										<c:set var="f" value="${dto.flag}"></c:set>
										<c:if test="${f eq 1}">
											<tr>
												<td></td>
												<td>삭제된 게시판입니다</td>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</c:if>
									</c:catch>
									<c:if test="${f eq 0}">
										<tr>
											<td>${dto.boardNum}</td>
											<td><a href="./detail?boardNum=${dto.boardNum}"> <c:catch>
														<c:forEach begin="1" end="${dto.boardDepth}">--</c:forEach>
													</c:catch> ${dto.boardName}
											</a></td>
											<td>${dto.boardContents}</td>
											<td>${dto.boardUser}</td>
											<td>${dto.boardDate}</td>
											<td>${dto.boardHits}</td>
										</tr>
									</c:if>
								</c:forEach>
							</tbody>
						</table>
						<div>
							<form id="searchForm" class="row g-3" action="./list">
								<input id="page" type="hidden" name="page" value="1">
								<div class="col-auto">
									<select name=kind id="kind" data-kind="${pager.kind} class="
										form-select" aria-label="Default select example">
										<option class="a" value="kind1">제목</option>
										<option class="a" value="kind2">내용</option>
										<option class="a" value="kind3">작성자</option>
										<option class="a" value="kind4">제목+내용+작성자</option>
									</select>
								</div>
								<div class="col-auto">
									<label for="search" class="visually-hidden">Search</label> <input
										type="text" name="search" class="form-control" id="search"
										placeholder="search" value="${pager.search}">
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
											aria-label="Previous"> <span class="pager"
												aria-hidden="true" data-page="${pager.startNum-1}">&laquo;</span>
										</a></li>
									</c:if>

									<c:forEach begin="${pager.startNum}" end="${pager.lastNum}"
										var="i">
										<li class="page-item"><a class="page-link pager"
											data-page="${i}"
											href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}">${i}</a></li>
									</c:forEach>

									<c:if test="${!pager.last}">
										<li class="page-item"><a class="page-link"
											href="./list?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}"
											aria-label="Next"> <span class="pager" aria-hidden="true"
												data-page="${pager.lastNum+1}">&raquo;</span>
										</a></li>
									</c:if>
								</ul>
							</nav>
							<a href="./add" class="btn btn-light">글쓰기</a>
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
