package com.product.star.account.manager.config;

import com.product.star.account.manager.AccountDao;
import com.product.star.account.manager.NamedJdbcAccountDao;
import com.product.star.common.JdbcConfig;
import com.product.star.common.PropertiesConfiguration;
import com.product.star.homework.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
//@ComponentScan("com.product.star.account.manager")
@Import({JdbcConfig.class, PropertiesConfiguration.class})
public class ApplicationConfiguration {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public ApplicationConfiguration(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Bean
    public AccountDao contactDao() {
        return new NamedJdbcAccountDao(namedParameterJdbcTemplate);
    }
}
