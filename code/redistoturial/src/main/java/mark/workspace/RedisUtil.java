package mark.workspace;

import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedisUtil {
    private static RedisUtil redisUtils;
    private RedisUtil(){}

    public static RedisUtil getInstance(){
        if(redisUtils==null){
            synchronized (RedisUtil.class){
                if(redisUtils==null){
                    redisUtils = new RedisUtil();
                }
            }
        }
        return redisUtils;
    }

    public RedissonClient getClient(String host,String port){
        Config config = new Config();
        return null;
    }
}
