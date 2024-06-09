package org.provider.paymentprovider.rest;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
@Tag(name="Тестовый контроллен", description="Для проведения тестовых методов")
public class TestRestController {

    @GetMapping
    public String test() {
        return "test";
    }

    @GetMapping("/{message}")
    public String post(@PathVariable @Parameter(description = "Тестовое сообзщения")String message) {
        return message;
    }
}
