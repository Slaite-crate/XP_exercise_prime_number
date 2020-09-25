package dk.kea.xp_exercise_prime_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


public class PrimeTest {
    Prime prime;

    @BeforeEach
    void setPrime(){
        prime = new Prime();
    }

    @Test
    void testIsPrime(){
        assertAll(
                () -> assertEquals("Prime", prime.isPrime(2)),
                () -> assertEquals("Prime", prime.isPrime(3)),
                () -> assertNotEquals("Prime", prime.isPrime(4)),
                () -> assertEquals("Prime", prime.isPrime(7)),
                () -> assertEquals("Prime", prime.isPrime(11))
        );
    }

    @Test
    void testOutPut(){
        assertAll(
                () -> assertEquals("2 * 2", prime.isPrime(4)),
                () -> assertEquals("2 * 3", prime.isPrime(6)),
                () -> assertEquals("3 * 3", prime.isPrime(9)),
                () -> assertEquals("2 * 5", prime.isPrime(10))
        );
    }
}
