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

    @Test
    public void toCheckFifteenIsAFizzBuzz(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(15);
        String actualResult=obj.fizzBuzz();
        String expectedResult="FizzBuzz";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckThirteenIsAFizzBecauseItIsHavingThree(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(13);
        String actualResult=obj.fizzBuzz();
        String expectedResult="Fizz";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckFiftyTwoIsABuzzBecauseItIsHavingFive(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(52);
        String actualResult=obj.fizzBuzz();
        String expectedResult="Buzz";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckMinusFiftyTwoIsABuzzOrNot(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(-52);
        String actualResult=obj.fizzBuzz();
        String expectedResult="null";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void toCheckOneFiftyTwoIsABuzzOrNot(){
        FizzBuzzTestDemo obj=new FizzBuzzTestDemo(152);
        String actualResult=obj.fizzBuzz();
        String expectedResult="null";
        assertEquals(actualResult,expectedResult);
    }
}
