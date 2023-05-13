<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>쪽지함</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
table {
	border-collapse: collapse;
	width: 100%;
	margin-top: 20px;
}

th, td {
	text-align: left;
	padding: 8px;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: lightgray;
}

h1 {
	text-align: center;
	margin-top: 30px;
	font-size: 36px;
}

h2 {
	text-align: left;
	margin-top: 0px;
	font-size: 24px;
}
button{
	float:right;
}
</style>
</head>
<body>
	<h1>쪽지함</h1>
	<h2>메인으로</h2>
		<div>
		<button type="button" onclick="showSentMessages()">보낸 쪽지함</button>
		<button type="button" onclick="showReceivedMessages()">받은 쪽지함</button>
	</div>
	<table id="messageTable">
		<tr>
			<th>보낸 사람</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
	</table>
	<button type = "button" onclick="location.href='Note.jsp'">쪽지 보내기</button>
	<script>
     
    </script>
</body>
</html>