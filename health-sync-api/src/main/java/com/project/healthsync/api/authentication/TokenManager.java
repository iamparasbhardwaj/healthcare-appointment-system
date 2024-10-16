package com.project.healthsync.api.authentication;

import com.project.healthsync.api.entites.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serial;
import java.io.Serializable;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class TokenManager implements Serializable {
    @Serial
    private static final long serialVersionUID = 1428555070032647479L;

    @Value("${security.jwt.secret-key}")
    private String jwtSecret;
    @Value("${security.jwt.expiration-time}")
    private Long expirationTime;

    public String generateJWTToken(User user){
        Map<String, Object> claims = new HashMap<String,Object>();
        return Jwts.builder().setClaims(claims).setSubject(user.getEmail()).setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + expirationTime)).signWith(getKey(), SignatureAlgorithm.HS256).compact();
    }

    Boolean isToken 

    String getUserNameFromToken(){

    }

    private Key getKey(){
        byte[] keyBytes = Decoders.BASE64.decode(jwtSecret);
        Key key = Keys.hmacShaKeyFor(keyBytes);
        return key;
    }
}
