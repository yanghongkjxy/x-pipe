package com.ctrip.xpipe.redis.console.healthcheck;

/**
 * @author lishanglin
 * date 2021/1/15
 */
public interface RedisHealthCheckActionFactory<T extends HealthCheckAction> extends HealthCheckActionFactory<T, RedisHealthCheckInstance> {

}
