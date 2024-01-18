<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="row gx-5 justify-content-center">
	<div class="col-lg-11 col-xl-9 col-xxl-8">
		<form class="form-control" method="POST"
			enctype="multipart/form-data">
			<input type="hidden" name="boardNum" value="${boardDTO.boardNum}">
			<div class="mb-3">
				<label for="title" class="form-label">Title</label> <input
					type="text" class="form-control" id="title" name="boardName"
					value="${boardDTO.boardName}">
			</div>
			
<%-- 		<div class="mb-3">
				<label for="user" class="form-label">Writer</label> <input
					type="text" value="${member.userName}"
					class="form-control" id="user" name="boardUser">
			</div> --%>


			<div class="mb-3">
				<label for="contents" class="form-label">Contents</label>
				<textarea class="form-control" id="contents" rows="3"
					name="boardContents">${boardDTO.boardContents}</textarea>
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




