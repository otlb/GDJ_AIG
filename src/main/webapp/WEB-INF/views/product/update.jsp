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
    <c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	
    
        <section id="contents" class="container-fluid">
    	<div class="row mt-4">
			<form action="update" method="post">
				<input type="hidden" name="productNum" value="${dto.productNum}">
			  
			  
			  <div class="mb-3">
			    <label for="productname" class="form-label">ProductName</label>
			    <input type="text" name="productName" value="${dto.productNum}" class="form-control" id="productname">
			  </div>

			  <button type="submit" class="btn btn-primary">UPDATE</button>
			</form>    		
    	
    	</div>
    
    </section>
    
    
    
    
    <c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>