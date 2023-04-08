package org.ormond;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ImportResource({"classpath:database.xml", "classpath:dao.xml"})
public class AppConfig {

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate();
    }

}


