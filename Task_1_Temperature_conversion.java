import java.util.Scanner;
public class Task_1_Temperature_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature value");
        float t = sc.nextFloat(),tout=0;
        System.out.println("Enter the temperature unit");
        char in = sc.next().charAt(0);
        char fin = Character.toUpperCase(in);
        if(fin=='K' || fin=='k'){
            tout = (float) (t - 273.15);
            System.out.println("Temperature is : " + tout + "°C"  );
            tout = (float)(((t - 273.15)*9)/5 + 32);
            System.out.println("Temperature is : " + tout + "°F" );
        }
        else if(fin=='C'|| fin=='c'){
            tout = (float)(((t*9)/5) + 32);
            System.out.println("Temperature is : " + tout + "°F" );
            tout = (float)(t + 273.15);
            System.out.println("Temperature is : " + tout + "°K" );
        }
        else if(fin=='F' || fin=='f'){
            tout = (float)(((t - 32)*5)/9 + 273.15);
            System.out.println("Temperature is : " + tout + "°K" );
            tout = (float)(((t - 32)*5)/9);
            System.out.println("Temperature is : " + tout + "°C" );
        }
    }
}