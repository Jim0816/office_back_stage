package com.ljm.utils;

import redis.clients.jedis.Jedis;

/**
 * @author ljm
 *
 * @date 2018��12��1��
 *
 * @function ��redis�洢session_key��openid
 */
public class RedisUtils {
	private static Jedis jedis;
	public static void main(String args[]) {
	
	}
	
	static {
		jedis = new Jedis("47.107.127.101",6379);
	}
	
	public static void closeRedis() {
		jedis.close();
	}
}
