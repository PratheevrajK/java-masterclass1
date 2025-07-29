package section4;

public class OperatorPrecedence {
    public static void main(String[] args){
        double value1 = 20.00;
        double value2 = 80.00;
        double calcValue = (value1 + value2) * 100.00;
        double remainder = calcValue % 40.00;
        boolean isRemainderZero = (remainder == 0.00);
        if(!isRemainderZero){
            System.out.println("Got some remainder!");
        }
    }
}
