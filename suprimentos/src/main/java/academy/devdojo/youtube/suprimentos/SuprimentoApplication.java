package academy.devdojo.youtube.suprimentos;

import academy.devdojo.youtube.core.property.JwtConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"academy.devdojo.youtube.core.model"})
@EnableJpaRepositories({"academy.devdojo.youtube.core.repository"})
@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("academy.devdojo.youtube")
public class SuprimentoApplication{

    public static void main(String[] args) {
         SpringApplication.run(SuprimentoApplication.class, args);
    }
}
