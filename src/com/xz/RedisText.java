package com.xz;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/8/8.
 */
public class RedisText {
    public static void main(String[] args) {
        // 1、redis 单实例连接
        /*
            获取一个Jedis 对象  参数为1、linux连接ip 2、6379 redis端口
        Jedis jedis=new Jedis("192.168.158.128",6379);
        选择数据库 默认为 0
        jedis.select(0);
        保存数据到 第一个数据库中 0
        jedis.set("s1","111");
        从第一个数据库中 键为s1 的值
        String s1 = jedis.get("s1");
        System.out.print(s1);
        jedis.close();*/
        // 2、创建连接池连接
        JedisPool jedisPool=new JedisPool("192.168.158.128",6379);
        // 3、通过连接池获取 Jedis 对象
        Jedis jedis = jedisPool.getResource();
        // 批量添加数据
        //jedis.mset("s2","222","s3","333","s4","444");
        // 批量获取数据
        //List<String> mget = jedis.mget("s1", "s2", "s3");
       // for (int i=0;i<mget.size();i++){
          //  System.out.println(mget.get(i));
        //}
        // 删除s4 相对应的数据
        //jedis.del("s4");
        // incr 自增默认为1
        //jedis.incr("s1");
        // decr 自减默认为1
        //jedis.decr("s1");
        // incrBy 自增 步长为2
        //jedis.incrBy("s1",2);
        // decrBy 自减 步长为2
        //jedis.decrBy("s1",2);
        // 追加
        //jedis.append("s2","1");
        //  获取 长度
        //Long s2 = jedis.strlen("s2");
        // 设置 hash 散列 user <<username<<xiaozhi
//        jedis.hset("user","username","xiaozhi");
//        jedis.hset("user","password","123456");
//        jedis.hset("user","age","21");
//        jedis.hset("user","username","小智");
        //  获取 制定的 对象属性
//        String hget = jedis.hget("user", "username");
        // 获取 所有的 user对象属性
//        Map<String, String> user = jedis.hgetAll("user");
//        Iterator<Map.Entry<String, String>> iterator = user.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> next = iterator.next();
//            System.out.println(next.getKey()+"="+next.getValue());
//        }
        //System.out.print(hget);
         // 删除 hash 散列的
//        Long hdel = jedis.hdel("user", "age");
        // 修改 hash 散列
//        Long hset = jedis.hset("user", "age", "21");
//        System.out.print(hset);
        // 查询 所有 s开头的 key
//        Set<String> keys = jedis.keys("s*");
//        System.out.println(keys);
        // 查询 s3 key是否存在
//        Boolean s4 = jedis.exists("s3");
//        System.out.println(s4);
        // 选择数据库
//        jedis.select(15);
//        String s1 = jedis.get("s1");
//        System.out.println(s1);
        // 修改key 名称
//        jedis.rename("s1","x1");
        // 获取 x1 value 的类型
//        String x1 = jedis.type("x1");
//        String user = jedis.type("user");
//        System.out.println(x1);
//        System.out.println(user);
        // 设置 key 的存在时间
//        jedis.expire("s4",1);
//        jedis.expireAt("s3",1);

        // 关闭 jedisPool 流
        jedis.close();
        // 关闭 jedis 流
        jedisPool.close();
    }
}
