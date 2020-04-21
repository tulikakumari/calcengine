package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        double [] leftVals = {100.0d,25.0d,225.0d,11.0d};
//        double [] rightVals = {50.0d,17.0d,92.0d,3.0d};
//        char [] opCodes = {'d','a','s','m'};
//        double [] results = new double [opCodes.length];
//       double val1 = 100.0d;
//        double val2 = 0.0d;
//        double result = 0.0d;
//        char opCode = 'd';
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d,50.0d,'d');
        equations[1] = create(120.0d,90.0d,'s');
        equations[2] = create(80.0d,50.0d,'a');
        equations[3] = create(90.0d,40.0d,'m');

        for (MathEquation equation: equations ){
            equation.execute();
            System.out.print("results = ");
            System.out.println(equation.getResult());
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation  equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;

    }
}

