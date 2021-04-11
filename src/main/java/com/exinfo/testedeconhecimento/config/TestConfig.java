package com.exinfo.testedeconhecimento.config;

import com.exinfo.testedeconhecimento.services.DbService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

    private final DbService dbService;

    public TestConfig(DbService dbService) {
        this.dbService = dbService;
    }

    @Bean
    public boolean iniciarDB() throws ParseException {
        dbService.iniciarConstrucaoDB();
        return true;
    }

}
