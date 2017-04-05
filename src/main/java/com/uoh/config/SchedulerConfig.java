package com.uoh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * com.uoh.config.SchedulerConfig Class holds long values that represent time. These values are used
 * for task scheduling.
 *
 * Created by James Millner on 28/03/2017 at 11:13.
 */
@Configuration
@EnableScheduling
public class SchedulerConfig {

    public static final long ONE_SECOND = 1_000;
    public static final long FIVE_SECONDS = ONE_SECOND * 5;
    public static final long TEN_SECONDS = FIVE_SECONDS * 2;
    public static final long FIFTEEN_SECONDS = FIVE_SECONDS * 3;
    public static final long ONE_MINUTE = ONE_SECOND * 60;
    public static final long TEN_MINUTES = ONE_MINUTE * 10;
    public static final long THIRTY_MINUTES = TEN_MINUTES * 3;
    public static final long ONE_HOUR = THIRTY_MINUTES * 2;
    public static final long ONE_DAY = ONE_HOUR * 24;
    public static final long ONE_WEEK = ONE_DAY * 7;
}