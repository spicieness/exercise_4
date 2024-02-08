import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<String> set1 = new ArrayList<>();
        ArrayList<String> set2 = new ArrayList<>();
        ArrayList<String> set3 = new ArrayList<>();
        ArrayList<String> set4 = new ArrayList<>();
        ArrayList<String> set5 = new ArrayList<>();
        

        askInput(set1);
        askInput(set2);
        askInput(set3);
        askInput(set4);
        askInput(set5);


        calcTemp(set1);
        calcTemp(set2);
        calcTemp(set3);
        calcTemp(set4);
        calcTemp(set5);

        display(set1);
        display(set2);
        display(set3);
        display(set4);
        display(set5);


    }

    static ArrayList<String> askInput(ArrayList a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a city name");
        String city = input.nextLine();
        System.out.println("Enter the average temp on day 1");
        String temp1 = input.nextLine();
        System.out.println("Enter the average temp on day 2");
        String temp2 = input.nextLine();
        System.out.println("Enter the average temp on day 3");
        String temp3 = input.nextLine();
        System.out.println("Enter the average temp on day 4");
        String temp4 = input.nextLine();
        System.out.println("Enter the average temp on day 5");
        String temp5 = input.nextLine();

        a.add(city);
        a.add(temp1);
        a.add(temp2);
        a.add(temp3);
        a.add(temp4);
        a.add(temp5);

        //System.out.println(a);

        return a;
    }


    static ArrayList calcTemp(ArrayList a) {
        double temp1 = Integer.parseInt(a.get(1).toString());
        double temp2 = Integer.parseInt(a.get(2).toString());
        double temp3 = Integer.parseInt(a.get(3).toString());
        double temp4 = Integer.parseInt(a.get(4).toString());
        double temp5 = Integer.parseInt(a.get(5).toString());

        double calc = (temp1 + temp2 + temp3 + temp4 + temp5)/5;
        String avgTemp = Double.toString(calc);

        String city = a.get(0).toString();

        ArrayList<String> result = new ArrayList<>();

        result.add(city);
        result.add(avgTemp);

        return result;

    }

    static void display(ArrayList a) {
        System.out.println("The average temperature for "+ a.get(0) + " is "+ a.get(1) + " degrees.");
    }





}