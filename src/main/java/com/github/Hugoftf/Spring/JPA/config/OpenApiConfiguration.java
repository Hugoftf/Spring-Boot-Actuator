package com.github.Hugoftf.Spring.JPA.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

//Hugo de Franca Torres Ferreira
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Estudando Spring Framework",
                version = "v1",
                contact = @Contact(
                        name = "Hugo de França",
                        email = "f3rreirahugo@hotmail.com",
                        url = "https://www.linkedin.com/in/hugo-de-fran%C3%A7a-torres-5a9058287/"
                )
        ),
        security = {
                @SecurityRequirement(name = "bearerAuth")
        }
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfiguration {
}
