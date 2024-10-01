import java.util.Scanner;

public class TemperatureConverter{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double Celsius, fahrenheit, kelvin;
    System.out.println("Enter temperature in Celsius:  ");
    Celsius = sc.nextDouble();


    fahrenheit = Celsius*1.8+32;
    kelvin = Celsius+273.15;
    

    System.out.println("Temperature in Fahrenheit is:  "+fahrenheit);
    System.out.println("Temperature in Kelvin is:  "+kelvin);


}


}