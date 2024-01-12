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
				<c:import url="../temps//header.jsp"></c:import>
				
				
				<section class="py-5">
                <div class="container px-5">
                    <!-- Contact form-->
                    <div class="bg-light rounded-4 py-5 px-4 px-md-5">
                        <div class="text-center mb-5">
                            <div class="feature bg-primary bg-gradient-primary-to-secondary text-white rounded-3 mb-3"><i class="bi bi-envelope"></i></div>
                            <h1 class="fw-bolder">Get in Add</h1>
                            <p class="lead fw-normal text-muted mb-0">Let's work together!</p>
                        </div>
                        <div class="row gx-5 justify-content-center">
                            <div class="col-lg-8 col-xl-6">
                                <!-- * * * * * * * * * * * * * * *-->
                                <!-- * * SB Forms Contact Form * *-->
                                <!-- * * * * * * * * * * * * * * *-->
                                <!-- This form is pre-integrated with SB Forms.-->
                                <!-- To make this form functional, sign up at-->
                                <!-- https://startbootstrap.com/solution/contact-forms-->
                                <!-- to get an API token!-->
                                <form id="contactForm" action="./add" method="post" enctype="multipart/form-data" >
                                    <!-- Name-->
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="name" name="productName" type="text" placeholder="상품명 입력" data-sb-validations="required" />
                                        <label for="name">Product Name</label>
                                        <div class="invalid-feedback" data-sb-feedback="name:required">상품명을 적으시오.</div>
                                    </div>                                                               


                                    <!-- Contents-->
                                    <div class="form-floating mb-3">
                                        <textarea class="form-control" name="productContents" id="contents" type="text" placeholder="상품 상세 설명" style="height: 10rem" data-sb-validations="required"></textarea>
                                        <label for="contents">Product Contents</label>
                                        <div class="invalid-feedback" data-sb-feedback="contents:required">상품내용을 적으시오.</div>
                                    </div>

                                    <!-- Rate-->
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="rate" name="productRate" type="text" placeholder="이자율 입력" data-sb-validations="required" />
                                        <label for="rate">Product Rate</label>
                                        <div class="invalid-feedback" data-sb-feedback="rate:required">이자율을 적으시오.</div>
                                    </div> 

                                    <!-- Files-->
                                    <div class="mb-3">
                                        <label for="rate">Product File</label>
                                        <input class="form-control" type="file" name="attach"/>
                                        <input class="form-control" type="file" name="attach"/>
                                        <input class="form-control" type="file" name="attach"/>
                                        <input class="form-control" type="file" name="attach"/>
                                        <input class="form-control" type="file" name="attach"/>
                                        
                                    </div>                                     
                                   
                                   
                                    <div class="d-none" id="submitErrorMessage"><div class="text-center text-danger mb-3">Error sending message!</div></div>
                                    <!-- Submit Button-->
                                    <div class="d-grid"><button class="btn btn-primary btn-lg" id="submitButton" type="submit">Submit</button></div>
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
