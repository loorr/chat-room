package org.example.chat.room.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@EnableWebSocket
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WebSocketLauncher {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketLauncher.class, args);
    }

}
