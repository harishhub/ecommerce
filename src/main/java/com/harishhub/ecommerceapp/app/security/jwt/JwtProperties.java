package com.harishhub.ecommerceapp.app.security.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtProperties {
    private String jwtSecretKey = "12345";
    private long validityInMilliSec = 3600000;

}
