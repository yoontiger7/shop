<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="URF-8">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

<title>회원 가입</title>

<style>
        .container {
            max-width: 400px;
        }
        
    </style>

</head>


<body>

	<div class="container">
		
		<div class="py-5 text-center">
			<h2>회원 가입</h2>
		</div>
		
	
		<form action="/member/join" method="post">
		
			<label>아이디</label>
			<div>
				<input id="name" name="name" type="text" class="form-control">
			</div>
			
			<label>비밀번호</label>
			<div>
				<input id="password" name="password" type="password" class="form-control">
			</div>
			
			<label>주소</label>
			<div>
				<input id="address" name="address" type="text" class="form-control">
			</div>
			
			<label>전화번호</label>
			<div>
				<input id="phone" name="phone" type="text" class="form-control">
			</div>
			
			<hr class="my-4">
			
			<button type="submit" class="btn btn-success btn">submit</button>
			<a href="/" type="button" class="btn btn-success btn">home</a>
			
			
		</form>
		
		
		
	</div>




</body>



</html>