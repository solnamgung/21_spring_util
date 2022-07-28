<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />	

<!DOCTYPE html>
<meta charset="utf-8">
<script src="${contextPath }/resources/jquery-3.6.0.min.js"></script>
<script>

	$().ready(function(){
		var fileCnt = 1;
		
		$("#addFile").click(function() {
			
			var data = "<input type='file' name='upFile"+ fileCnt +"' />";
			
			fileCnt++;
			
			$("#fileUploadTable > tr:eq(1) > td:eq(1)").appendTo(data);
			
		});
		
		$("#removeFile").click(function() {
						
			$("#fileUploadTable").remove();
			fileCnt--;
			
		});
		
	});
	
</script>
<head>
</head>
<body>

	<form action="upload" method="post" enctype="multipart/form-data">
		<h1>파일 업로드</h1>
		<table border="1" id="fileUploadTable">			
			<tr>
				<td>등록자</td> 
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>업로드 파일</td>
				<td><input type="file" name="upFile1" /></td>
			</tr>
		</table>
		<p>
			<input type="button" id="addFile" value="추가">		
			<input type="button" id="removeFile" value="삭제">		
			<input type="submit" value="등록하기" >
		</p>
	</form>	
	
	<hr>
	
	<h1>썸네일 및 파일 다운로드</h1>
	<table border="1">			
		<tr>
			<th>이미지</th>
			<th>파일명</th>
			<th>다운로드</th>
		</tr>
		<tr>
			<td><img src="${contextPath }/file/thumbnails?fileName=404.PNG" width="40px" height="40px"></td>
			<td>404 이미지</td>
			<td><a href="${contextPath }/file/download?fileName=404.PNG">다운로드</a></td>
		</tr>
		<tr>
			<td><img src="${contextPath }/file/thumbnails?fileName=500.PNG" width="40px" height="40px"></td>
			<td>500 이미지</td>
			<td><a href="${contextPath }/file/download?fileName=500.PNG">다운로드</a></td>
		</tr>
	</table>
	
	<hr>
	
	<form action="delete" method="post" >
		<h1>파일 삭제</h1>
		<table>			
			<tr>
				<td>삭제할 파일명 : </td>
				<td><input type="text" name="fileName">&emsp;		<input type="submit" value="삭제" ></td>
			</tr>
		</table>	
	</form>
	
		
</body>
 