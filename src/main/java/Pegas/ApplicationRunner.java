package Pegas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationRunner {
    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    };

    @Bean
    public HttpHeaders headers()
    {
        return new HttpHeaders();
    }
    public static void main(String[] args) {
        var context = SpringApplication.run(ApplicationRunner.class, args);
    }
}
