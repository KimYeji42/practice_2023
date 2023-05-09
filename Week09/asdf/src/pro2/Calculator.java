package pro2;
import java.util.Scanner;

interface Math {
    String getExpression();

    int getIndex();
    int getOperator();
    double getResult();
}

class Count implements Math {
    private String count;
    private int operator;
    private double result;

    public String getExpression() { return this.count; }

    @Override
    public int getIndex() { return 0; }

    public int getOperator() { return this.operator; }

    public double getResult() { return this.result; }

    public void setExpression(String count) {
        this.count = count;
        this.operator = findOperator(count);
    }

    private double plus(double a, double b) { return a + b; }
    private double minus(double a, double b) { return a - b; }
    private double multiply(double a, double b) { return a * b; }
    private double divide(double a, double b) { return a / b; }

    private int findOperator(String count) {
        int operator = -1;
        if (count.contains("+")) {
            operator = count.indexOf("+");
        } else if (count.contains("-")) {
            operator = count.indexOf("-");
        } else if (count.contains("*")) {
            operator = count.indexOf("*");
        } else if (count.contains("/")) {
            operator = count.indexOf("/");
        }
        return operator;
    }

    public void calculate() {
        double num1 = Double.parseDouble(count.substring(0, operator));
        double num2 = Double.parseDouble(count.substring(operator + 1));

        switch (count.charAt(operator)) {
            case '+':
                result = plus(num1, num2);
                break;
            case '-':
                result = minus(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("수식을 입력하세요 : ");
            String count =in.nextLine();

            Count c = new Count();
            c.setExpression(count);
            c.calculate();
            System.out.println("결과 : " + c.getResult());
        }
    }
}


