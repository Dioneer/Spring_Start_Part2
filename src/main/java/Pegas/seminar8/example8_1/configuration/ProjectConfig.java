package Pegas.seminar8.example8_1.configuration;

import Pegas.seminar8.example8_1.aspect.LoggerAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "Pegas")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public LoggerAspect aspect()
    {
        return new LoggerAspect();
    }
}

