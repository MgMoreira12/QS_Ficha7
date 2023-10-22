import org.example.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTeste {

    static Main teste;
   @BeforeAll
    public static void setUp(){
       teste = new Main();
   }
    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void isPrimeTest(int number){
       assertTrue(teste.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32,54,2,20,30,26})
    public void isEvenTest(int number){
       assertTrue(teste.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"23,23", "46,23", "115,23", "184,23", "207,23", "230,23"})
    public void isMultipleTest(int number, int divisor){
       assertTrue(teste.isMultiple(number, divisor));
    }



}
