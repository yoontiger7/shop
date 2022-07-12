<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="URF-8">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

<title>회원 정보</title>

<style>
        .container {
            max-width: 400px;
        }
        
    </style>

</head>

</head>

<body>
	<div class="container">
		
		<form action="/login" method="post">
		
			<div class="py-5 text-center">
			<h2>로그인</h2>
			</div>
			
			<label>아이디</label>
			<div>
				<input id="name" name="name" type="text" class="form-control" >
			</div>
			
			<label>비밀번호</label>
			<div>
				<input id="password" name="password" type="password" class="form-control" >
			</div>
				
			<hr class="my-4">
						
			<button type="submit" class="btn btn-success btn">submit</button>
			<a href="/" type="button" class="btn btn-success btn">home</a>			
     			
		</form>
	</div>

</body>

</html>