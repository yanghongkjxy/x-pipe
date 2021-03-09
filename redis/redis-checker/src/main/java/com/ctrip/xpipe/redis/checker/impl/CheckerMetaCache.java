package com.ctrip.xpipe.redis.checker.impl;

import com.ctrip.xpipe.cluster.ClusterType;
import com.ctrip.xpipe.endpoint.HostPort;
import com.ctrip.xpipe.redis.core.entity.RouteMeta;
import com.ctrip.xpipe.redis.core.entity.XpipeMeta;
import com.ctrip.xpipe.redis.core.exception.MasterNotFoundException;
import com.ctrip.xpipe.redis.core.meta.MetaCache;
import com.ctrip.xpipe.tuple.Pair;

import java.util.List;
import java.util.Set;

/**
 * @author lishanglin
 * date 2021/3/9
 */
public class CheckerMetaCache implements MetaCache {

    @Override
    public XpipeMeta getXpipeMeta() {
        return null;
    }

    @Override
    public boolean inBackupDc(HostPort hostPort) {
        return false;
    }

    @Override
    public HostPort findMasterInSameShard(HostPort hostPort) {
        return null;
    }

    @Override
    public Set<HostPort> getAllKeepers() {
        return null;
    }

    @Override
    public Pair<String, String> findClusterShard(HostPort hostPort) {
        return null;
    }

    @Override
    public String getSentinelMonitorName(String clusterId, String shardId) {
        return null;
    }

    @Override
    public Set<HostPort> getActiveDcSentinels(String clusterId, String shardId) {
        return null;
    }

    @Override
    public HostPort findMaster(String clusterId, String shardId) throws MasterNotFoundException {
        return null;
    }

    @Override
    public String getDc(HostPort hostPort) {
        return null;
    }

    @Override
    public Pair<String, String> findClusterShardBySentinelMonitor(String monitor) {
        return null;
    }

    @Override
    public RouteMeta getRouteIfPossible(HostPort hostPort) {
        return null;
    }

    @Override
    public boolean isCrossRegion(String activeDc, String backupDc) {
        return false;
    }

    @Override
    public List<HostPort> getAllActiveRedisOfDc(String activeDc, String dcId) {
        return null;
    }

    @Override
    public String getActiveDc(String clusterId, String shardId) {
        return null;
    }

    @Override
    public String getActiveDc(HostPort hostPort) {
        return null;
    }

    @Override
    public long getLastUpdateTime() {
        return 0;
    }

    @Override
    public ClusterType getClusterType(String clusterId) {
        return null;
    }
}
