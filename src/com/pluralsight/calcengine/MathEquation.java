package com.pluralsight.calcengine;

public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;


     public void execute(){
         switch (opCode) {
             case 'a':
                 result = leftVal + rightVal;
                 break;
             case 's':
                 result = leftVal - rightVal;
                 break;
             case'd':
                 result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                 break;
//            if(val2!=0.0){
//            result = val1 / val2;}
//            else{
//                result=0.0d;
//            }
             case 'm':
                 result = leftVal - rightVal;
                 break;
             default :
                 System.out.println("Error or invalid opcode");
                 result = 0.0d;

         }
     }




}
