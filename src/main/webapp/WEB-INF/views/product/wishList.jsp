<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="my-3" id="replyList">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>REPLYNUM</th>
							<th>PRODUCTNUM</th>
							<th>USERNAME</th>
							<th>REPLYCONTENTS</th>
							<th>REPLYDATE</th>
							<th>REPLYJUMSU</th>
						</tr>
					</thead>
					<c:forEach items="${list}" var="re">
						<tr>
							<td>${re.replyNum}</td>
							<td>${re.productNum}</a></td>
							<td>${re.userName}</td>
							<td>${re.replyContents}</td>
							<td>${re.replyDate}</td>
							<td>${re.replyJumsu}</td>							
						</tr>
					</c:forEach>
				</table>
				<div>					
					<button id="more" data-replyList-page="${pager.page}">더보기(${pager.page}/${pager.totalPage})</button>					
				</div>
			</div>