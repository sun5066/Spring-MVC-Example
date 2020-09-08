<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <title>Cisum Player</title>
</head>
<body>
<h3>Cisum Player</h3>
<p>유튜브 동영상 플레이어</p>
<section>
    <c:choose>
        <c:when test="${BODY == 'LOGIN'}">
            <%@include file="/WEB-INF/views/component/member/member-login.jspf" %>
        </c:when>
    </c:choose>
</section>
</body>
</html>
