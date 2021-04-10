package com.springboot.util;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TockenUtil {
    private static final Long Expre_time = 10*1000l;
    private static final String Tocken_Script = "swltockenscript";
    public static String sign(String userid, String username) {
        Date date = new Date(System.currentTimeMillis() + Expre_time);
        //设置头信息
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("typ", "JWT");
        map.put("alg", "HS256");
        //附带user,信息生成签名
        return JWT.create().withHeader(map)
                .withClaim("loginname", username)
                .withClaim("useid", userid)
                .withExpiresAt(date)
                .sign(Algorithm.HMAC256(Tocken_Script));
    }

    public static boolean veirty(String tocken) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(Tocken_Script);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(tocken);
            return true;
        } catch (Exception e) {
            e.fillInStackTrace();
            return false;
        }
    }
}
