package dk.kea.xp_exercise_prime_number;

public class Prime {

    public Prime(){}


    public String isPrime(int number) {
        for (int i = 2; i < number; i++){
            int okay = number % i;
            if (okay == 0){
                return i + " * " + number/i;
            }
        }
        return "Prime";
    }
}
