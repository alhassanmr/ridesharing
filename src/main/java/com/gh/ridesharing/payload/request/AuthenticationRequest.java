package com.gh.ridesharing.payload.request;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;
    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
