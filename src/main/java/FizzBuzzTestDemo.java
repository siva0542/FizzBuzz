public class FizzBuzzTestDemo {
    int value,reminder=0;
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

    public String fizzBuzz() {
        int currentValue=value;
        while(currentValue!=0){
            reminder=currentValue%10;
            if(reminder==3 || reminder==5)
                break;
            currentValue=currentValue/10;
        }
        if(value>0 && value<101){
            if(value%3==0 && value%5==0)
                return "FizzBuzz";
            else if(value%3==0 || reminder==3)
                return "Fizz";
            else if(value%5==0 || reminder==5)
                return "Buzz";
            else
                return "null";
        }
        else
            return "null";

    }
}
