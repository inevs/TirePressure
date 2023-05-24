package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AlarmTest {

    @Test
    public void alarmIsOffByDefault() {
        Alarm alarm = new Alarm();
        assertThat(alarm.isAlarmOn(), equalTo(false));
    }

}