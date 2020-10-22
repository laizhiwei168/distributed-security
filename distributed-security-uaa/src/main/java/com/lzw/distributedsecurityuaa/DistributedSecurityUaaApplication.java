package com.lzw.distributedsecurityuaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistributedSecurityUaaApplication {

    /**
     * 认证 http://127.0.0.1:8080/oauth/authorize?client_id=c1&response_type=code&scpe=all&%20redirect_uri=http://www.baidu.com
     *
     * 授权 http://127.0.0.1:8080/oauth/token
     *   body x-www
     *      client_id          c1
     *      client_secret      secret
     *      grant_type         authorization_code
     *      code
     *      redirect_uri       http://www.baidu.com
     *
     * ---------------------------
     *
     * 令牌模式
     * http://127.0.0.1:8080/oauth/authorize?client_id=c1&response_type=token&scpe=all&redirect_uri=http://www.baidu.com
     *
     *
     * -----------------------
     * 密码模式
     *
     * http://127.0.0.1:8080/oauth/token?client_id=c1&grant_type=password&username=admin&password=123
     *
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(DistributedSecurityUaaApplication.class, args);
    }

}
