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
<title>MyPage</title>
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
					<span class="text-gradient d-inline">MyPage</span>
				</h1>
			</div>
		</div>
            <section class="py-5">
                <div class="container px-5 mb-5">
                    <div class="text-center mb-5">
                        <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Projects</span></h1>
                    </div>
                    <div class="row gx-5 justify-content-center">
                        <div class="col-lg-11 col-xl-9 col-xxl-8">
                            <!-- Project Card 1-->
                            <div class="card overflow-hidden shadow rounded-4 border-0 mb-5">
                                <div class="card-body p-0">
                                    <div class="d-flex align-items-center">
                                        <div class="p-5">
                                            <h2 class="fw-bolder">${member.userName}</h2>

                                            <table class="table table-hover">
                                                
                                                    <tr>
                                                        <td class="table-dark">Name</td>
                                                        <td>${member.name}</td>                                                        
                                                    </tr>

                                                    <tr>
                                                        <td class="table-dark">Phone</td>
                                                        <td>${member.phone}</td>
                                                    </tr>

                                                    <tr>
                                                        <td class="table-dark">Email</td>
                                                        <td>${member.email}</td>
                                                    </tr>

                                                    <tr>
                                                        <td class="table-dark">Address</td>
                                                        <td>${member.address}</td>
                                                    </tr>
                                            </table>
                                            <a href="./update" class="btn btn-info">수정</a>
                                            <a href="./updatePassword" class="btn btn-primary">비밀번호 수정</a>
                                            <a href="./delete" class="btn btn-danger">탈퇴</a>
                                        </div>
                                        <img class="img-fluid" src="/resources/upload/member/${member.avatarDTO.fileName}" alt="..." />
                                        
                                    </div>
                                </div>
                            </div>
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
