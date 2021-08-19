import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void toCheckNineIsAFizz(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(9);
        String actualResult=obj.fizzOrBuzz();
        String expectedResult="Fizz";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckTenIsABuzz(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(10);
        String actualResult=obj.fizzOrBuzz();
        String expectedResult="Buzz";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckNineteenIsNotAFizzOrBuzz(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(19);
        String actualResult=obj.fizzOrBuzz();
        String expectedResult="null";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckMinusNineIsNotAFizzOrBuzz(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(-9);
        String actualResult=obj.fizzOrBuzz();
        String expectedResult="null";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckOneFifteenIsNotAFizzOrBuzz(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(115);
        String actualResult=obj.fizzOrBuzz();
        String expectedResult="null";
        assertEquals(actualResult,expectedResult);
    }
}
