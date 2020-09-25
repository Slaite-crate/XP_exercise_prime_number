package dk.kea.xp_exercise_prime_number;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XpExercisePrimeNumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XpExercisePrimeNumberApplication.class, args);
        Prime p = new Prime();
        p.isPrime(10);
    }

}
