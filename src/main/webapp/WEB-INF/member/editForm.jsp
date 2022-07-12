<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="URF-8">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

<title>회원 정보</title>

<style>
        .container {
            max-width: 500px;
        }
        
    </style>

</head>

</head>

<body>
	<div class="container">
		
		<div class="py-5 text-center">
			<h2>회원 정보</h2>
		</div>
		
		<form action="/member/edit/${member.id}" method="post">
		
		
			<label>아이디</label>
			<div>
				<input value="${member.name}" id="name" name="name" type="text" class="form-control" readonly>
			</div>
			
			<label>비밀번호</label>
			<div>
				<input value="${member.password}" id="password" name="password" type="password" class="form-control" >
			</div>
			
			<label>주소</label>
			<div>
				<input value="${member.address}" id="address" name="address" type="text" class="form-control" >
			</div>
			
			<label>전화번호</label>
			<div>
				<input value="${member.phone}" id="phone" name="phone" type="text" class="form-control" >
			</div>
			
			<hr class="my-4">
			
			<div class="row">
		
				<div class="col">
					<button type="submit" class="btn btn-success btn">수정</button>
				</div>
			
				<div class="col">
					<a href="/" type="button" class="btn btn-success btn">홈으로</a>
				</div>
			
			</div>
			
		</form>	      		
	
	
	</div>

</body>

</html>