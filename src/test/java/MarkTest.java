import org.example.Mark;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkTest {

    static Mark m;

    @BeforeAll
    public static void setUp(){
        m = new Mark(44594, 15);
    }

    @Test
    public void getNumStudentTest(){
        int expected = 44594;
        int actual = m.getNumStudent();
        assertEquals(expected, actual, "Resultado inesperado");
    }

    @Test
    public void getMarkTest() {
        double expected = 15;
        double actual = m.getMark();
        assertEquals(expected, actual, "Resultado inesperado");
    }

    @Test
    public void setNumStudentTest(){
        m.setNumStudent(12345);
        int expected = 12345;
        int actual = m.getNumStudent();
        assertEquals(expected, actual, "Resultado inesperado");
    }

    @Test
    public void setMarkTest(){
        m.setMark(10);
        double expected = 10;
        double actual = m.getMark();
        assertEquals(expected, actual, "Resultado inesperado");
    }
}
