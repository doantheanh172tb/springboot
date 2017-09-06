package theanh.springmvc.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import theanh.springmvc.DataSource;

@Configuration
public class DataSourceConfig {

    @Value("${server}")
    private String server;

    @Value("${port}")
    private int port;

    @Bean(name = "datasource")
    @Profile("development")
    DataSource development() {
        return new DataSource(server, port);
    }

    @Bean(name = "datasource")
    @Profile("production")
    DataSource production() {
        return new DataSource(server, port);
    }
}
