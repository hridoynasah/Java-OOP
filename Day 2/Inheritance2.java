/*
### Multilevel inheritance : One Super class and more than one sub class.
*/

import java.util.Objects;
import java.util.Scanner;
//Super class:
class Add_sub{
    float x; float y;
    protected float addition(float a, float b){
        this.x = a;
        this.y = b;
        return x + y;
    }
    float subtraction(float a, float b){
        this.x = a;
        this.y = b;
        return x + y;
    }
}
// Sub class1
class Multi extends Add_sub{
    float multiplication(float a, float b){
        this.x = a;
        this.y = b;
        return x * y;
    }
}
// Sub class2
class Div extends Multi{
    float division(float a, float b){
        this.x = a;
        this.y = b;
        return x / y;
    }
}
// Sub class3
class Full_Calculator extends Div{
    float reminder(float a, float b){
        this.x = a;
        this.y = b;
        return x % y;
    }
}


public class Inheritance2 {
    public static void main(String[] args){
        Full_Calculator cal = new Full_Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the value of the second number: ");
        float num2 = sc.nextFloat();
        System.out.print("| '+', '-', '*', '/', '%' | Choose a symbol: ");
        String ch = sc.next();
        if(Objects.equals(ch, "+")){
            float ans = cal.addition(num1, num2);
            System.out.println(num1 +" "+ ch +" "+num2 + " = " + ans);
        }else if(Objects.equals(ch,"-")){
            float ans = cal.subtraction(num1, num2);
            System.out.println(num1 +" "+ ch +" "+num2 + " = " + ans);
        }else if(Objects.equals(ch,"*")){
            float ans = cal.multiplication(num1, num2);
            System.out.println(num1 +" "+ ch +" "+num2 + " = " + ans);
        }else if(Objects.equals(ch,"/")){
            float ans = cal.division(num1, num2);
            System.out.println(num1 +" "+ ch +" "+num2 + " = " + ans);
        }else if(Objects.equals(ch,"%")){
            float ans = cal.reminder(num1, num2);
            System.out.println(num1 +" "+ ch +" "+num2 + " = " + ans);
        }
    }
}
