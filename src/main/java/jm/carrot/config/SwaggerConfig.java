package jm.carrot.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(
                        new Info().title("스웨거 테스트")
                        .description("스웨거를 테스트하는 명세서입니다.")
                        .version("v0.0.1"))

                ;
    }
}
