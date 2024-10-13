package com.huke.shedlock.config;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author xh
 * @date 2024/9/16 22:48
 */
@AutoConfiguration
@EnableConfigurationProperties(ShedLockProperties.class)
@EnableSchedulerLock(defaultLockAtMostFor = "10s")
public class ShedLockAutoConfiguration {

    @Bean
    public LockProvider lockProvider(DataSource dataSource, ShedLockProperties shedLockProperties) {
        return new JdbcTemplateLockProvider(
                JdbcTemplateLockProvider.Configuration.builder()
                        .withJdbcTemplate(new JdbcTemplate(dataSource))
                        .usingDbTime()
                        .withTableName(shedLockProperties.getTableName())
                        .build()
        );
    }

}
