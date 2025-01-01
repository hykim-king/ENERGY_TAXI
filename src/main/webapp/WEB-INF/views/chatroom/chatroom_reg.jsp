<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채팅방 생성</title>
<script src = "/ehr/resources/assets/js/jquery_3_7_1.js"></script> <!-- jQuery 스크립트 (AJAX 송신을 위해 필요) -->
<script src = "/ehr/resources/assets/js/cmn/common.js"></script> <!-- 공통 Util -->
<script src = "/ehr/resources/assets/js/user/user_reg.js?date=<%=new Date()%>"></script> <!--  서버 전송 -->
</head>
<body>
    <div>
	    <input type = "button" id = "doSave" value = "등록">
	    <input type = "button" id = "moveToPrevious" value = "돌아가기">
    </div>
    
    <div>
        <form action = "#" method = "post">
            <div>
                <label for = "roomId">채팅방 번호</label>
                <input type = "text" maxlength = "4" name = "roomId" id = "roomId" value = "채팅방번호">
            </div>
            
            <div>
                <label for = "userId1">유저 1</label>
                <input type = "text" maxlength = "4" name = "userId1" id = "userId1" value = "유저1">
            </div>
            
            <div>
                <label for = "userId2">유저 2</label>
                <input type = "text" maxlength = "4" name = "userId2" id = "userId2" value = "유저2">
            </div>        
        </form>
    </div>
</body>
</html>