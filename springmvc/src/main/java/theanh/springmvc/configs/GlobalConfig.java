package theanh.springmvc.configs;

import org.springframework.stereotype.Component;

@Component
public class GlobalConfig {
    private long timestamp = System.currentTimeMillis();

    public long getTimestamp() {
        return timestamp;
    }
}
