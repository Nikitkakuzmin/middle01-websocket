package kz.nik.websocket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChatCustomMessage {

    private String content;
    private String receiver;

}