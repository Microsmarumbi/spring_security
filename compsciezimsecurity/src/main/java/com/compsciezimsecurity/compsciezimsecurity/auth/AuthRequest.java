package com.compsciezimsecurity.compsciezimsecurity.auth;

import lombok.Data;

@Data
public class AuthRequest {
    private String password;
    private String username;
}
