package com.ctrip.xpipe.redis.console.migration.status.migration;

import com.ctrip.xpipe.redis.console.migration.model.MigrationCluster;
import com.ctrip.xpipe.redis.console.migration.status.MigrationStatus;

/**
 * @author shyin
 *
 * Dec 30, 2016
 */
public class MigrationForceEndState extends AbstractMigrationState {

	public MigrationForceEndState(MigrationCluster holder) {
		super(holder, MigrationStatus.ForceEnd);
		this.setNextAfterSuccess(this)
			.setNextAfterFail(this);
	}

	@Override
	protected void doRollback() {
		throw new UnsupportedOperationException("already force end, can not tryRollback:" + getStatus());

	}

	@Override
	public void doAction() {
		try{
			markDone();
			getHolder().stop();
		} catch (Exception e) {
			logger.info("[doAction][{}] stop fail", getHolder().clusterName());
		}
	}

	@Override
	public void refresh() {
		// Nothing to do
		logger.debug("[MigrationForceEnd]{}", getHolder().clusterName());
	}
}
