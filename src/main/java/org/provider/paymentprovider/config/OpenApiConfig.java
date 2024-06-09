package org.provider.paymentprovider.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Payment provider Api",
                description = "Loyalty System", version = "1.0.0",
                contact = @Contact(
                        name = "Kovtunov Vladimir",
                        email = "kovrynov.vladimir@gmail.com",
                        url = "https://t.me/K_Waldemar"
                )
        )
)
public class OpenApiConfig {
}
