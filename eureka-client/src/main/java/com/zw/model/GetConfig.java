package com.zw.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-08 下午5:32
 * @Version 1.0
 */

@Configuration
@ConfigurationProperties(prefix = "data")
public class GetConfig {
    private UserInfo user;
    private String env;

    public static class UserInfo{
        public String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return "GetConfig{" +
                "user=" + user +
                ", env='" + env + '\'' +
                '}';
    }
}
