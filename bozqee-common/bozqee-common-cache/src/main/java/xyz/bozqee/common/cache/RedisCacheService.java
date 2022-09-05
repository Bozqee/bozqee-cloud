package xyz.bozqee.common.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
@Component
public class RedisCacheService implements CacheService {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public RedisCacheService() {
        System.out.println(1);
    }

    @Autowired
    private RedisTemplate redisTemplate;
    
    @Override
    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public boolean delete(String key) {
        if (key != null) {
            return redisTemplate.delete(key);
        }
        return false;
    }

    @Override
    public <T> T get(String key) {
        return key == null ? null : (T) this.redisTemplate.opsForValue().get(key);
    }

    @Override
    public <T> boolean set(String key, T value) {
        return this.set(key, value, ONE_WEEK);
    }

    @Override
    public <T> boolean set(String key, T value, long time) {
        try {
            if (time <= 0) {
                time = Integer.MAX_VALUE;
            }
            this.redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return false;
        }
    }

    @Override
    public <T> boolean add(String key, T value) {
        return this.add(key, value, ONE_WEEK);
    }

    @Override
    public <T> boolean add(String key, T value, long time) {
        boolean result = this.redisTemplate.opsForValue().setIfAbsent(key, value);
        if (result) {
            this.redisTemplate.expire(key, time, TimeUnit.SECONDS);
        }
        return result;
    }

    @Override
    public void lock(String key) {
        logger.warn("暂不支持");
    }

    @Override
    public void lock(String key, long time) {
        logger.warn("暂不支持");
    }

    @Override
    public void unlock(String key) {
        logger.warn("暂不支持");
    }

    @Override
    public boolean tryLock(String key) {
        logger.warn("暂不支持");
        return false;
    }

    @Override
    public boolean tryLock(String key, long timeout) {
        logger.warn("暂不支持");
        return false;
    }

    @Override
    public boolean tryLock(String key, long timeout, long leaseSeconds) {
        logger.warn("暂不支持");
        return false;
    }

}
