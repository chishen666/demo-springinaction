package com.demo.springinaction.chapter3;

import com.demo.springinaction.chapter3.config.CalendarConfig;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CalendarConfig.class)
@ActiveProfiles({"test"})
public class CalendarConfigTest {

    @Autowired
    private Calendar calendar;

    @Test
    public void testCalendar() {
        System.out.println(DateFormatUtils.format(calendar, "yyyy-MM-dd"));
    }

}
