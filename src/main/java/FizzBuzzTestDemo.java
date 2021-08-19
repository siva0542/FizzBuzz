public class FizzBuzzTestDemo {
    int value;
    public FizzBuzzTestDemo(int value){
        this.value=value;
    }
    public String fizzOrBuzz() {
        if(value>0 && value<101) {
            if (value % 3 == 0)
                return "Fizz";
            else if (value % 5 == 0)
                return "Buzz";
            else
                return "null";
        }
        else
            return "null";
    }
}
