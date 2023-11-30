
       import java.util.Scanner;
    
          public class Estudos {
             public static void main(String[] args) throws Exception {
            scanner scanner = new Scanner(System.in);
                double num1, num2, result;
                char operator;
        
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
        
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
        
                System.out.print("Enter the operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);
        
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
        
                    case '-':
                        result = num1 - num2;
                        break;
        
                    case '*':
                        result = num1 * num2;
                        break;
        
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error! Dividing by zero is not allowed.");
                            return;
                        }
                        break;
        
                    default:
                        System.out.println("Error! Invalid operator.");
                        return;
                }
        
                System.out.printf("The result of %.2f %c %.2f is: %.2f\n", num1, operator, num2, result);
            }
        } 



