<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <!-- summernote -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
    <c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
    
    <section id="contents" class="container-fluid">
    	<div class="row mt-4">
			<form action="add" method="post" enctype="multipart/form-data">
			
			  			  
			  <div class="mb-3">
			    <label for="productName" class="form-label">ProductName</label>
			    <input type="text" name="productName" class="form-control" id="productName">
			  </div>
			  
			  <div class="mb-3">
			  	<label for="productcontents" class="form-label">ProductContents</label>
			  	<textarea class="form-control" name="productContents" id="productcontents" ></textarea>
			  </div>
			  
			  <div class="mb-3">
			  	<label for="productrate" class="form-label">ProductRate</label>
			  	<textarea class="form-control" name="productRate" id="productrate" ></textarea>
			  </div>
			  
			  <div class="mb-3">
			  	<label for="productjumsu" class="form-label">ProductJumsu</label>
			  	<textarea class="form-control" name="productJumsu" id="productjumsu" ></textarea>
			  </div>
			  

			  <button type="submit" class="btn btn-primary">ADD</button>
			  <div class="mb-3">
			  	<input type="file" name="photo">
			  	<input type="file" name="photo">
			  	<input type="file" name="photo">			  	
			  </div>
			</form>    		
    	
    	</div>
    
    </section>
    
    <script>
    	$('#productcontents').summernote()    
    
    </script>
    
    
    
    <c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>