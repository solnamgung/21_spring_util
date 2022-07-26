<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title"/></title>
<!-- 
	CSS , JS파일 import는 layout에서 1번만 선언해주면 된다.
 -->
</head>
<body>

	<div style="background-color: lime; height: 100px">
		<tiles:insertAttribute name="header" />
	</div>
	<div style="background-color: skyblue; height: 100px">
		<tiles:insertAttribute name="side"/>
	</div>
	<div style="height: 500px">
		<tiles:insertAttribute name="content"/>
	</div>
	<div style="background-color: pink; height: 100px">
		<tiles:insertAttribute name="footer"/>
	</div>

</body>
</html>

