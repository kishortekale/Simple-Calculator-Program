import java.util.Scanner;
public class Calculator 
{
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int num1=sc.nextInt();
        System.out.println("Enter Second number");
        int num2=sc.nextInt();
        System.out.println("Select Symbol(+,*,/,%,-)");
        String sym=sc.next();
        int result;
        switch(sym)
        {
            case "+":result=num1+num2;
              System.out.println("Additon is "+ result);
            break;

            case "-":result=num1-num2;
            System.out.println("Subtraction is "+ result);
            break;
            
            case "*": result=num1*num2;
            System.out.println("Multiplacation is "+ result);
            break;

            case "/": result=num1/num2;
            System.out.println("Result is "+ result);
            break;

            case "%": result=num1%num2;
            System.out.println("Result is "+ result);
            break;

            default: System.out.println("invalid symbol");


        }
    }
}
