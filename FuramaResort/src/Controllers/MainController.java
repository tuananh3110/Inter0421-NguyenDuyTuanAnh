package Controllers;
import Commons.ScannerUtils;

import Models.Services;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainController  {




    public static void displayMainMenu(){

        System.out.println("\n1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Exit");
        switch(ScannerUtils.scanner.nextLine())
        {
            case "1" :
                addNewServies();
                break;
            case "2" :
                break;
            case "3" :
            case "4" :
            default:
                System.out.println("Fail --- Please choose 1-9");



        }

    }

    public static void addNewServies(){

        System.out.println("\n1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");
        System.out.println("5.Exit");
        switch(ScannerUtils.scanner.nextLine())
        {
            case "1" :
                addNewVilla();
                addNewServies();
                break;
            case "2":
                addNewHouse();
                addNewServies();
                break;
            case "3" :
                addNewRoom();
                addNewServies();
                break;
            case "4" :
                displayMainMenu();
                break;
            case "5" :
                break;
        }
    }
    private static String GetStr() {
        DataInputStream stream = new DataInputStream (System.in);
        try {
            return stream.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }


    public static void addNewVilla(){
        System.out.println("Nhập id: ");
        String id = GetStr();

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = GetStr();

        System.out.println("Diện tích: ");
        String areaUsed = GetStr();

        System.out.println("Giá: ");
        String rentalCosts = GetStr();

        System.out.println("Số người: ");
        int maxNumberOfPeople =  Integer.parseInt(GetStr());

        

    }




    public static void addNewHouse(){

    }

    public static void addNewRoom(){

    }



}
