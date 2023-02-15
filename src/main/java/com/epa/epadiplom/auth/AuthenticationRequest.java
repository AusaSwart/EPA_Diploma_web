package com.epa.epadiplom.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    private String login;  // mb there's users login, cuz' loggin through login+pass, not mail
    String password;
}
