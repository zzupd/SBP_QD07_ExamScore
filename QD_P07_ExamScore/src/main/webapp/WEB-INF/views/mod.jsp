<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>수험결과 수정</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap" class="modWrap">
		<h1>수험결과 수정</h1>
		<hr>
		<form action="/modProc" id="insForm">
		
			<label>
				<span>수험번호</span>
				<input type="text" name="code" value="${detailData.code }" class="readOnly" readonly>
			</label>
		
			<label>
				<span>이름</span>
				<input type="text" name="userName" value="${detailData.userName }" class="readOnly" readonly>
			</label>
		
			<label>
				<span>국어</span>
				<input type="text" name="kor" value="${detailData.kor }" required>
			</label>
		
			<label>
				<span>한국사</span>
				<input type="text" name="history" value="${detailData.history }" required>
			</label>
		
			<label>
				<span>연락처</span>
				<input type="text" name="phone" value="${detailData.phone }" required>
			</label>
		
		<hr>
		
		<div id="btnArea">
			<button>수정</button>
			<button type="button" id="listBtn">목록</button>
		</div>
		
		<input type="hidden" name="num" value="${detailData.num }">
		</form>
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    