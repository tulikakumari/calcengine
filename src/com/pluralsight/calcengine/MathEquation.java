package com.pluralsight.calcengine;

public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode = 'a';
     public double result;


    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal)
    {
        this.leftVal = leftVal;

    }

    public double getRightVal() {
        return rightVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode){
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }
    public MathEquation(){}

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode,double leftVal,double rightVal){
        this(opCode);
        this.leftVal=leftVal;
        this.rightVal=rightVal;
    }

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
