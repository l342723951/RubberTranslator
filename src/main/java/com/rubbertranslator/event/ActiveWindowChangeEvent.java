package com.rubbertranslator.event;

/**
 * @author Raven
 * @version 1.0
 * date  2020/5/20 21:54
 * 活动窗口变化事件
 */
public class ActiveWindowChangeEvent {
    private String currentProcessName;

    public void setCurrentProcessName(String currentProcessName) {
        this.currentProcessName = currentProcessName;
    }

    public String getCurrentProcessName() {
        return currentProcessName;
    }

}
