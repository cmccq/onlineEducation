package com.onlineeducation.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.onlineeducation.entity.User;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

/**
 * javaWebToken工具类
 * 用于生成和校验javaWebToken
 */
public class JWTUtil {

    // javaWebToken的秘钥
    @Value("${jwtConfig.secret}")
    private String jwtSecret;

    // javaWebToken的失效时间
    @Value("${jwtConfig.expirationTime}")
    private long expirationTime;

    // javaWebToken的头
    @Value("${jwtConfig.header}")
    private String jwtHeader;

    public String createToken(User user) {
        Date nowDate = new Date();
        Date expirationDate = new Date(nowDate.getTime() + expirationTime);
//        创建jwt，依次设置Jwt的userId,roleId,userName,过期时间和签名方式
        return JWT.create()
                .withClaim("userId", user.getUserId())
                .withClaim("roleId", user.getUserRole())
                .withClaim("userName", user.getUserName())
                .withExpiresAt(expirationDate)
                .sign(Algorithm.HMAC256(jwtSecret));
    }

    public Boolean verifyToken(String token) {
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(token)).build();
            verifier.verify(token);
            System.out.println("token验证成功");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("token验证失败");
            return false;
        }
    }

}
