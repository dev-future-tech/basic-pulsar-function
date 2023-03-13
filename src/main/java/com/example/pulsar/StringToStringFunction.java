package com.example.pulsar;

import org.apache.pulsar.functions.api.Context;
import org.apache.pulsar.functions.api.Function;
import org.slf4j.Logger;

public class StringToStringFunction implements Function<String, String> {

    @Override
    public String process(String input, Context context) throws Exception {
        Logger log = context.getLogger();
        log.info("Processing message {}", input);
        return String.format("Received: %s", input);
    }
}
