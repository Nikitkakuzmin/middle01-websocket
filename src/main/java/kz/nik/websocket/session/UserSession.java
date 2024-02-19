package kz.nik.websocket.session;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.socket.WebSocketSession;

@Getter
@Setter
@AllArgsConstructor
public class UserSession {

    private WebSocketSession session;
    private String username;

}