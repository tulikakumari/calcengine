package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0d;
        double val2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        if(opCode=='a')
        {
            result = val1 +val2;
        }
        else if(opCode == 's'){
            result = val1 - val2;
        }
        else if(opCode == 'd'){
            result = val2 != 0.0d ? val1/val2 : 0.0d;
//            if(val2!=0.0){
//            result = val1 / val2;}
//            else{
//                result=0.0d;
//            }
        }
        else if(opCode == 'm'){
            result = val1 - val2;
        }
        else{
            System.out.println("Error or invalid opcode");
            result = 0.0d;
        }

       System.out.print(result);
    }
}
