package com.example.fizzbuzz2;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

public class FizzBuzz {

    @NotNull
    @Min(1)
    private int startNum;

    @NotNull
    @Min(2)
    private int endNum;

    private ArrayList<String> fizzBuzzArray;

    public int getStartNum() {
        return startNum;
    }

    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }

    public int getEndNum() {
        return endNum;
    }

    public void setEndNum(int endNum) {
        this.endNum = endNum;
    }

    public ArrayList<String> getFizzBuzzArray() {
        return fizzBuzzArray;
    }

    public void setFizzBuzzArray(ArrayList<String> fizzBuzzArray) {
        this.fizzBuzzArray = fizzBuzzArray;
    }

    public ArrayList<String> fizzBuzzNums(){
        fizzBuzzArray = new ArrayList(); // ??

        for(int i=startNum; i<=endNum; i++){
            if(i % 5 == 0 && i % 3 != 0)
                fizzBuzzArray.add("Buzz");
            else if(i % 3 == 0 && i % 5 != 0)
                fizzBuzzArray.add("Fizz");
            else if(i % 15 == 0)
                fizzBuzzArray.add("Fizz Buzz");
            else
                fizzBuzzArray.add(Integer.toString(i)); // ??
        }
        return fizzBuzzArray;
    }
}
