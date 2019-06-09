package com.mac.main;


public class Mac {

    public static void main(String[] args) {

        // String , Integer , Boolean ,

        String initialWord = "abcDeFghiJkLLLLmno";
        int myInt = 5;
        Integer myInteger = 5;

        loopThroughString();
        outputs("String args");

        System.out.println("IS THIS A VALID AGE? "+isValidSmokingAge(17));
    }

    public static boolean isValidSmokingAge(int age){

        for(int i = 0 ; i < age ; i++){
            System.out.println(i);
        }

        if(age < 10){
            return false;
        }else if(age > 10 && age <17){
            return false;
        }else{
            return true;
        }


    }

    public static void loopThroughString() {

        System.out.println("this is not working");
    }


    public static void outputs(String args) {
        int gil = 5;
        int love = 7;
        System.out.println(gil + love);
    }


}