<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title /></title>
<jsp:include page="/layout/header.jsp" />
<dec:head />
</head>
<body>
	 <div class="preloader">
		<div class="cssload-speeding-wheel"></div>
	</div>
	<div id="wrapper">
		<jsp:include page="/layout/navbar.jsp" />
		<jsp:include page="/layout/sidebar.jsp" />
		<dec:body />
		<jsp:include page="/layout/footer.jsp" />
	</div>
</body>
</html>