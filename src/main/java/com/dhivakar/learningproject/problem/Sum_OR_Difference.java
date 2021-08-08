package com.dhivakar.learningproject.problem;

public class Sum_OR_Difference {

    public int getRequiredSum(int value1,int value2){

        if(value1 > value2){
            return value1-value2;
        }else{
            return value1+value2;
        }
    }
}
