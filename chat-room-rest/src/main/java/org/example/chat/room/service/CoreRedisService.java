package org.example.chat.room.service;

import org.example.chat.common.ws.UserInfo;

public interface CoreRedisService {
    void setUserInfo(String token, UserInfo userInfo);
}
