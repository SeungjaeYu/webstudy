package kr.co.mlec.websocket.handler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component("test02")
public class Test02Handler extends TextWebSocketHandler {
	// 전체 사용자 정보 관리하기
	private Map<String, WebSocketSession> users = new HashMap<>();
	
	public Test02Handler() {
		System.out.println("Test02Handler 객체 생성");
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// WebSocketSession => 웹소켓 연결한 브라우저의 정보를 가지고 있다. 페이지가 이동됬을 경우 웹소켓이 끊긴다.
		System.out.println(session.getId() + " 연결되었음..");
		users.put(session.getId(), session);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("보낸 아이디 : " + session.getId());
		System.out.println("보낸 데이터 : " + message.getPayload());
		Set<String> keys = users.keySet();
		for (String key : keys) {
			WebSocketSession user = users.get(key);
			user.sendMessage(new TextMessage(session.getId() + " : " + message.getPayload()));
		}
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println(session.getId() + " 연결 종료되었음..");
		users.remove(session.getId());
	}
	
	
	
}
