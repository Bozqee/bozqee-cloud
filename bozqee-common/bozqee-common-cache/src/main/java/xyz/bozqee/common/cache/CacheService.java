package xyz.bozqee.common.cache;

public interface CacheService {

    int ONE_WEEK = 604800;
    int ONE_DAY = 86400;
    int ONE_HOUR = 3600;
    int HALF_HOUR = 1800;

    boolean hasKey(String key);

    boolean delete(String key);

    <T> T get(String key);

    <T> boolean set(String key, T value);

    <T> boolean set(String key, T value, long time);

    <T> boolean add(String key, T value);

    <T>  boolean add(String key, T value, long time);

    void lock(String key);

    void lock(String key, long time);

    void unlock(String key);

    boolean tryLock(String key);

    boolean tryLock(String key, long timeout);

    boolean tryLock(String key, long time, long leaseSeconds);

}
