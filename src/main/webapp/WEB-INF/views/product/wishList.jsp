<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		
			
					<tbody id="replyList" data-userName="${userName}">
					<c:forEach items="${list}" var="re">
						<tr>							
							<td>${re.replyContents}</td>
							<td>${re.userName}</td>							
							<td>${re.replyDate}</td>							
							<td><c:if test="${re.userName eq member.userName}"><button>삭제</button></c:if></td>
							<td><c:if test="${re.userName eq member.userName}"><button>수정</button></c:if></td>							
						</tr>
					</c:forEach>
					</tbody>
					

		