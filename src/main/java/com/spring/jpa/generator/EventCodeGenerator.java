package com.spring.jpa.generator;

import com.spring.jpa.Event;
import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;

public class EventCodeGenerator implements ValueGenerator<String> {
    @Override
    public String generateValue(Session session, Object owner) {
        Event event = (Event) owner;
        String code = event.getName().replace(" ","") + "-"
                + event.getStartDate().getMonth().name() + "-"
                + event.getStartDate().getYear();
        return code;
    }
}
