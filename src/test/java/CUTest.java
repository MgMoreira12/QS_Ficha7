import org.example.CU;
import org.example.Mark;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CUTest {
    static CU cu;

    @BeforeAll
    public static void setUp(){
        cu = new CU("QS", 3);
        cu.insertMarkCU(11111, 11);
        cu.insertMarkCU(22222, 12);
        cu.insertMarkCU(33333, 13);
    }

    @Test
    public void insertMarkCUTest(){
        cu.insertMarkCU(44444, 14);
        int expected = 4;
        int actual = cu.getArraySize();
        assertEquals(expected, actual, "Resultado inesperado");
    }

    @ParameterizedTest
    @ValueSource(ints = {11111, 22222, 33333})
    public void searchStudentTest(int number){
        double actual_grade = cu.searchStudent(number);
        double notAStudent = -1.0;
        assertNotEquals(notAStudent, actual_grade, "Resultado inesperado");
    }

    @Test
    public void averageCUTest(){
        double expected = 12;
        double actual = cu.averageCU();
        assertEquals(expected, actual, "Resultado inesperado");
    }

    @ParameterizedTest
    @ValueSource(ints = {11111, 22222, 33333})
    public void isApproved(int number){
        assertTrue(cu.isApproved(number));
    }

    @Test
    public void getArraySizeTest(){
        int expected = 3;
        int actual = cu.getArraySize();
        assertEquals(expected, actual, "Resultado inesperado");
    }
}
