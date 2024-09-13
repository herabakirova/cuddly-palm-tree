package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GreetingControllerTest {

    @Test
    public void testGreet() {
        GreetingController controller = new GreetingController();
        String result = controller.greet("DevOps");
        assertThat(result).isEqualTo("Hello, DevOps!");
    }
}
