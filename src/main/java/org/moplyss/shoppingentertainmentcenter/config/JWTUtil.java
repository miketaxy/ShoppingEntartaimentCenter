package org.moplyss.shoppingentertainmentcenter.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.moplyss.shoppingentertainmentcenter.model.User;

import javax.crypto.SecretKey;
import java.util.Date;

public class JWTUtil {
    public static final SecretKey SECRET_KEY = getSigningKey();


    public static String generateToken(User user) {
        return Jwts
                .builder()
                .subject(user.getUsername())
                .expiration(new Date(System.currentTimeMillis() + 864000000))
                .signWith(SECRET_KEY)
                .compact();
    }
    private static SecretKey getSigningKey(){
        return Jwts.SIG.HS256.key().build();
    }


    public static Claims parseToken(String token){
        return Jwts.parser()
                .verifyWith(SECRET_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    public static String getUsername(String bearerToken){
        String token = bearerToken.substring(7);
        return parseToken(token).getSubject();
    }
}
