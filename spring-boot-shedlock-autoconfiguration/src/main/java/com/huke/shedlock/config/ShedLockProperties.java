package com.huke.shedlock.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xh
 * @date 2024/9/16 22:45
 */
@ConfigurationProperties(prefix = "shedlock")
public class ShedLockProperties {

    private String lockAtMost;
    private String lockAtLeast;
    private String lockAtMostInSeconds;
    private String lockAtLeastInSeconds;

    private String tableName;

    public String getLockAtMost() {
        return lockAtMost;
    }

    public void setLockAtMost(String lockAtMost) {
        this.lockAtMost = lockAtMost;
    }

    public String getLockAtLeast() {
        return lockAtLeast;
    }

    public void setLockAtLeast(String lockAtLeast) {
        this.lockAtLeast = lockAtLeast;
    }

    public String getLockAtMostInSeconds() {
        return lockAtMostInSeconds;
    }

    public void setLockAtMostInSeconds(String lockAtMostInSeconds) {
        this.lockAtMostInSeconds = lockAtMostInSeconds;
    }

    public String getLockAtLeastInSeconds() {
        return lockAtLeastInSeconds;
    }

    public void setLockAtLeastInSeconds(String lockAtLeastInSeconds) {
        this.lockAtLeastInSeconds = lockAtLeastInSeconds;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
