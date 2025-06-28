package com.bookinventory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookInventoryApplicationTests {

    @Test
    void contextLoads() {
        // This ensures Spring Boot context loads without crashing
    }

    @Test
    void sampleTest() {
        assertEquals(2, 1 + 1);
    }
}
