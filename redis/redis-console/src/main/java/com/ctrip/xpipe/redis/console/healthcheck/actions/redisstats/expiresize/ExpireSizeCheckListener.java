package com.ctrip.xpipe.redis.console.healthcheck.actions.redisstats.expiresize;

import com.ctrip.xpipe.redis.console.healthcheck.ActionContext;
import com.ctrip.xpipe.redis.console.healthcheck.HealthCheckAction;
import com.ctrip.xpipe.redis.console.healthcheck.HealthCheckActionListener;

public interface ExpireSizeCheckListener extends HealthCheckActionListener<ExpireSizeActionContext, HealthCheckAction> {

    @Override
    default boolean worksfor(ActionContext t) {
        return t instanceof ExpireSizeActionContext;
    }

}
