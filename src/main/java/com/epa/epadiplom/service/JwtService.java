package com.epa.epadiplom.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service    
public class JwtService {

    private static final String SECRET_KEY = "77217A25432A462D4A614E645267556B58703273357538782F413F4428472B4B";
    public String extractUsername(String jwToken) {
        return extractClaim(jwToken, Claims::getSubject);
    }

    public <T> T extractClaim(String jwToken, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(jwToken);
        return claimsResolver.apply(claims);
    }

    public String generateToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails
    ){
        return Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1200 * 60 * 24))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public String generateToken(UserDetails userDetails){
        return generateToken(new HashMap<>(), userDetails);
    }

    public boolean isTokenValid (String jwToken, UserDetails userDetails){
        final String username = extractUsername(jwToken);
        return (username.equals(userDetails.getUsername())) &&
                !isTokenExpired(jwToken);
    }

    private boolean isTokenExpired(String jwToken) {
        return extractExpiration(jwToken).before(new Date());
    }

    private Date extractExpiration(String jwToken) {
        return extractClaim(jwToken, Claims::getExpiration);
    }

    private Claims extractAllClaims(String jwToken){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(jwToken)
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
