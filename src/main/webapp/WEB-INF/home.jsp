<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="URF-8">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

<title>Home</title>

</head>

<body>


<div class="container">

    <div class="py-3 text-center">
        <h1 class="mb-4">HOME</h1>
        <c:if test="${member != null}">
        	<h5>${member.name}님 로그인 되었습니다</h5>
        </c:if>
    </div>


    <div class="py-3 text-center">
        <hr class="my-4">
        <h4 class="mb-4">회원</h4>
        <div>
            <a class="btn btn-danger btn" href="/login">로그인</a>
            <a class="btn btn-danger btn" href="/logout">로그아웃</a>
            <a class="btn btn-danger btn" href="/member/join">회원 가입</a>
            <a class="btn btn-danger btn" href="/member/info">내 정보</a>
        </div>
    </div>

    <div class="py-3 text-center">
    
        <hr class="my-4">
        <h4 class="mb-4">오픈 마켓</h4>
        <div>
            <a class="btn btn-danger btn" href="/board/list">오픈 마켓</a>        
        </div>
        
        <hr class="my-4">
        <h4 class="mb-4">게시판</h4>
        <div>
            <a class="btn btn-danger btn" href="/board/list">게시판 목록</a>        
        </div>
    </div>

    

</div>

</body>
</html>