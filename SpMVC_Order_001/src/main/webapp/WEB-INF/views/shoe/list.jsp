<%@ page language="java"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        section {
            margin: 10px;
        }

        #buttons {
            padding: 10px;
            text-align: right;
        }

        #shoe_input {
            background-color: blue;
            color: white;
            padding: 5px;
            border: 0;
            border-bottom: 2px solid blue;
        }

        #shoe_input:hover {
            background-color: gray;
            color: black;
            border-bottom: 2px solid yellow;
        }

        td a {
            color: black;
            cursor: pointer;
        }
    </style>
    <%@ include file="/WEB-INF/views/include/include-head.jspf" %>
</head>
<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
<%@ include file="/WEB-INF/views/include/include-nav.jspf" %>
<section>
    <table>
        <thead>
        <tr>
            <th>No</th>
            <th>상품명</th>
            <th>발매일자</th>
            <th>금액</th>
            <th>발매수량</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${NIKE}" var="vo" varStatus="index">
            <tr>
                <td>${index.count}</td>
                <td>${vo.s_name}</td>
                <td>${vo.s_date}</td>
                <td>${vo.s_amount}</td>
                <td>${vo.s_qty}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
<section id="buttons">
    <button id="shoe_input">
        <a href="input">발매정보 작성</a>
    </button>
</section>
<%@include file="/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>
