package com.conan.service.TestRedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestJedis {

    @Test
    public void test(){
        Jedis jedis = new Jedis("");
        jedis.close();
        jedis.isConnected();
        jedis.disconnect();
    }

}
