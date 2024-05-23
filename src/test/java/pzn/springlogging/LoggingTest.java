package pzn.springlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void testLongLogging() {
        for (int index = 0; index < 100_000; index++) {
            log.warn("Hello World {}", index);
        }
    }

    @Test
    void testLog() {
        log.info("Learn Java");
        log.warn("Learn Spring");
        log.error("Learn PZN");
    }
}
