package com.school.oa.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtilTest {
	JedisPool pool;
	Jedis jedis;
	
	@Before
	public void setUp() {
		pool = new JedisPool(new JedisPoolConfig(), "127.0.0.1");
		jedis = pool.getResource();
	}
	/*
	@Test
	public void testGet() {
		System.out.println(jedis.set("guoyu","123"));
		System.out.println(jedis.get("guoyu"));
	}
	
	@Test
	public void testBasicString() {
		jedis.set("name", "guoyu");
		System.out.println(jedis.get("name"));
		
		jedis.append("name", "guocong");
		System.out.println(jedis.get("name"));
		
		jedis.set("name", "666");
		System.out.println(jedis.get("name"));
		
		jedis.del("name");
		System.out.println(jedis.get("name"));
		
		jedis.mset("sss","apple","vvv","123");
		System.out.println(jedis.mget("sss","vvv"));
	}
	*/
	
	/*@Test
	public void testMap() {
		Map<String,String> user = new HashMap<>();
		user.put("name", "minner");
		user.put("pwd", "password");
		jedis.hmset("user", user);
		
		List<String> rsmap = jedis.hmget("user","name","pwd");
		System.out.println(rsmap);
		
		System.out.println(jedis.hlen("user"));
		System.out.println(jedis.exists("user"));
		System.out.println(jedis.hkeys("user"));
		System.out.println(jedis.hvals("user"));
		
		Iterator<String> iter = jedis.hkeys("user").iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(jedis.hmget("user", key));
		}
	}*/
	
	/*@Test
	public void testList() {
		jedis.del("java framework");
		System.out.println(jedis.lrange("java framework", 0, -1));
		jedis.lpush("java framework","spring");   
		jedis.lpush("java framework","struts");   
		jedis.lpush("java framework","hibernate"); 
		System.out.println(jedis.lrange("java framework",0,-1)); 
	}*/
	
	/*@Test
	public void testSet() {
		jedis.sadd("sname", "minxr");
		jedis.sadd("sname","jarorwar");
		jedis.sadd("sname","guoyu");
		jedis.sadd("sname", "noname");
		
		jedis.srem("sname", "noname");
		System.out.println(jedis.smembers("sname"));
		System.out.println(jedis.sismember("sname", "minxr"));
		System.out.println(jedis.srandmember("sname"));
		System.out.println(jedis.scard("sname"));
	}*/
	
	@Test
	public void test() throws InterruptedException {
		/*jedis.set("name", "guoyu");
		System.out.println(jedis.keys("*"));
		System.out.println(jedis.keys("*name"));
		System.out.println(jedis.del("name"));
		System.out.println(jedis.ttl("sname"));
		jedis.setex("timekey", 10, "min");

		System.out.println(jedis.exists("timekey"));
		System.out.println(jedis.get("time"));*/
		jedis.del("a");
		jedis.lpush("a", "1");
		jedis.lpush("a", "6");
		jedis.lpush("a", "3");
		jedis.lpush("a", "9");
		System.out.println(jedis.lrange("a", 0, -1));
		System.out.println(jedis.sort("a"));
		System.out.println(jedis.lrange("a",0,-1)); 
	}
}
