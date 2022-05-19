package Operators;

public class Operators {

    public static void run(){
        double myFirstVariable = 20.00d;
        double mySecondVariable = 80.00d;
        //double totalValues = myFirstVariable + mySecondVariable * 100.00d; // 8020.0

        // Check out

        double totalValues = (myFirstVariable + mySecondVariable) * 100.00d; // 10000.0
        System.out.println(totalValues);
        double remainderVariable = totalValues % 40.00d;
        System.out.println(remainderVariable);
        boolean isNoRemainder = (remainderVariable == 0) ? true : false;
        System.out.println(isNoRemainder);
        if (isNoRemainder != true){
            System.out.println("got a remainder");
        }
    }
}
