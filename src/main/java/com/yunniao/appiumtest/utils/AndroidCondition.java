package com.yunniao.appiumtest.utils;

import com.google.common.base.Function;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by melinda on 1/28/16.
 */
public interface AndroidCondition<T> extends Function<AndroidDriver, T> {
}
