package ru.mirea.lab22;
import java.util.Objects;
import java.util.Stack;

public class RpnCalculator {
    private static boolean checkIsNum(String st)
    {
        try {
            Double.parseDouble(st);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static Double evaulate(String expression)
    {
        System.out.println(expression);
        Stack<Double> stack = new Stack<>();
        String[] parts = expression.trim().split(" ");
        for (int i = 0;i<parts.length;i++)
        {
            if (checkIsNum(parts[i]))
            {
                stack.push(Double.parseDouble(parts[i]));
            }
            else
            {
                Double op2 = stack.pop();
                Double op1 = stack.pop();
                if (Objects.equals(parts[i], "/") && op2 == 0) throw new ArithmeticException("Error");
                Double res = switch (parts[i]) {
                    case "+" -> op1 + op2;
                    case "-" -> op1 - op2;
                    case "/" -> op1 / op2;
                    case "*" -> op1 * op2;
                    default -> null;
                };
                stack.push(res);
            }
        }
        return stack.pop();
    }
}
