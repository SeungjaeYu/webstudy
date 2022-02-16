<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="<c:url value="/notify/notify.js" />"></script>
</head>
<body>
	<h2>웹소켓 테스트01</h2>
	<div>
		<input type="text" id="message" />
		<button id="sendBtn" type="button">클릭</button>
	</div>
	<div id="result"></div>
	<script>
		let ws = null;
		
		$(() => {
			// 접속 주소 설정 : 웹소켓 핸들러 구현 클래스와 연결된 URL
			ws = new WebSocket("ws://localhost/21_spring/test01.do");	
			ws.onopen = () => {
				$("#result").append("<div>웹소켓 핸들러 연결 성공</div>");
			};
			ws.onmessage = (evt) => {
				$.notify(evt.data, {position:"top right"} );
				$("#result").append("<div>서버메세지 : " + evt.data + "</div>");
			};
			ws.onerror = (evt) => {
				$("#result").append("<div>웹소켓 에러 발생 : " + evt.data + "</div>");
			};
			ws.onclose = () => {
				$("#result").append("<div>웹소켓 연결 종료</div>");
			};
			
		});
		
		$("#sendBtn").click(() => {
			// 웹소켓을 이용해서 서버에 데이터 전송
			let $msg = $("#message");
			ws.send($msg.val());
			$msg.val("");
		});
	</script>
</body>
</html>













