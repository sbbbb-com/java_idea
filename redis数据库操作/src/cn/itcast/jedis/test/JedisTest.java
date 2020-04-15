package cn.itcast.jedis.test;

import cn.itcast.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static cn.itcast.jedis.util.JedisPoolUtils.*;

/**
 * jedis的测试类
 */
public class JedisTest {

    /**
     * 快速入门
     */
    @Test
    public void test1(){
        //1.获取连接
        Jedis jedis=new Jedis("localhost",6379);
        //2.操作
        jedis.set("username","zhangsan");
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test2(){
        //1.获取连接
        Jedis jedis=new Jedis();  //如果使用空参构造，默认值“"localhost",6379”
        //2.操作
       //存储
        jedis.set("username","zhangsan");
        //获取
        String username = jedis.get("username");
        System.out.println(username);

        //可以使用setex（）方法存储可以指定过期时间的 key value
        //将activecode：hehe键值对存入redis，并且20秒后自动删除该键值对
        jedis.setex("activecode",20,"hehe");
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test3(){
        //1.获取连接
        Jedis jedis=new Jedis();  //如果使用空参构造，默认值“"localhost",6379”
        //2.操作
        //存储hash
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","female");

        //获取hash
        String name = jedis.hget("user", "name");
        System.out.println(name);

        //获取hash的所有map中的数据
        Map<String,String> user=jedis.hgetAll("user");

        //keyset
        Set<String> keySet=user.keySet();
        for (String key : keySet) {
            //获取value
            String value = user.get(key);
            System.out.println(key+":"+value);
        }

        //3.关闭连接
        jedis.close();
    }


    @Test
    public void test4(){
        //1.获取连接
        Jedis jedis=new Jedis();  //如果使用空参构造，默认值“"localhost",6379”
        //2.操作
        //存储 list
        jedis.lpush("mylist","a","b","c"); //从左边存
        jedis.rpush("mylist","a","b","c"); //从右边存

        //list 范围获取
        List<String> mylist=jedis.lrange("mylist",0,-1);
        System.out.println(mylist);

        //list 弹出
        String emlement1=jedis.lpop("mylist");  //c 左边弹出
        System.out.println(emlement1);

        String emlement2=jedis.rpop("mylist");  //c 右边弹出
        System.out.println(emlement2);

        //list 范围获取
        List<String> mylist2=jedis.lrange("mylist",0,-1);
        System.out.println(mylist2);

        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test5(){
        //1.获取连接
        Jedis jedis=new Jedis();  //如果使用空参构造，默认值“"localhost",6379”
        //2.操作
        //存储set
        jedis.sadd("myset","java","c++","php","python");

        // set 获取
        Set<String> myset=jedis.smembers("myset");
        System.out.println(myset);

        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test6(){
        //1.获取连接
        Jedis jedis=new Jedis();  //如果使用空参构造，默认值“"localhost",6379”
        //2.操作
        //存储sortedset
        jedis.zadd("mysortedset",3,"亚索");
        jedis.zadd("mysortedset",30,"后裔");
        jedis.zadd("mysortedset",52,"孙悟空");

        //sortedset 获取
        Set<String> mysortedset=jedis.zrange("mysortedset",0,-1);

        System.out.println(mysortedset);


        //3.关闭连接
        jedis.close();
    }

    @Test
    public  void  test7(){
        //0.创建一个配置对象
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        //1.创建jedispool连接池对象
        JedisPool jedisPool=new JedisPool(config,"localhost",6379);

        //2.获取连接
        Jedis jedis=jedisPool.getResource();
        //3.使用
        jedis.set("hehe","haha2");

        //4.关闭， 归还到连接池中
        jedis.close();
    }

    @Test
    public  void  test8(){
        //通过连接池工具类获取
        Jedis jedis= getJedis();



        //3.使用
        jedis.set("hehe","world");

        //4.关闭， 归还到连接池中
        jedis.close();
    }
}
