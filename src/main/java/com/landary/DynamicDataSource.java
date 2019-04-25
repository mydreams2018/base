package com.landary;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    public static final ThreadLocal<String> currentThread = new ThreadLocal<>();

    @Override
    protected Object determineCurrentLookupKey() {
        return currentThread.get();
    }
}