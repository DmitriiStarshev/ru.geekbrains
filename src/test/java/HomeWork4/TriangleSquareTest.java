package HomeWork4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static HomeWork4.TriangleSquare.function;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class TriangleSquareTest {
    @Test
   public void calcArea () throws BadTringleExeption, BadTringleExeption2 {
        double result = function(8,10,16);
        Assertions.assertEquals( 32.72613634390714, result);
    }

    @Test
    public void badTriangleTest (){
        assertThatExceptionOfType(BadTringleExeption.class).isThrownBy(() -> function(-1,8,10));
    }

    @Test
    public void badTriangleTest2 () {
        assertThatExceptionOfType(BadTringleExeption.class).isThrownBy(() -> function(1,2,3));
    }
}
