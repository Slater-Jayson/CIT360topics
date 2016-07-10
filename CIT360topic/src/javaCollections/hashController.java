package javaCollections;

import java.util.HashMap;
import java.util.Scanner;

public class hashController {
    public static void main(String[] args){
      String prompt;
      theMap.populateHashMap();
      Scanner reader = new Scanner(System.in);
        
      System.out.println("Welcome!");
      prompt = reader.nextLine();
            
      if (prompt.isEmpty()) {
          enterValues();
         } 
    }
    public static void enterValues(){
        int v1;
        int v2;
        Scanner reader = new Scanner(System.in);
        
        do{
            System.out.print("Enter your favorite number between 1 and 25 -");
            v1 = reader.nextInt();
        	} while (v1 < 1 || v1 > 25);
            
        do{
            System.out.print("Enter your favorite number between 25 and 50 -");
            v2 = reader.nextInt();
        	} while (v2 < 25 || v2 > 50);
            theMap.controller(Integer.toString(v1), Integer.toString(v2));
    }
}

class theMap{ 
    static HashMap numbers = new HashMap();
    
    static void populateHashMap(){
        numbers.put("1",1);
        numbers.put("2",2);
        numbers.put("3",3);
        numbers.put("4",4);
        numbers.put("5",5); 
        numbers.put("6",6);
        numbers.put("7",7);
        numbers.put("8",8);
        numbers.put("9",9);
        numbers.put("10",10); 
        numbers.put("11",11);
        numbers.put("12",12);
        numbers.put("13",13);
        numbers.put("14",14);
        numbers.put("15",15); 
        numbers.put("16",16);
        numbers.put("17",17);
        numbers.put("18",18);
        numbers.put("19",19);
        numbers.put("20",20); 
        numbers.put("21",21);
        numbers.put("22",22);
        numbers.put("23",23);
        numbers.put("24",24);
        numbers.put("25",25); 
        numbers.put("26",26);
        numbers.put("27",27);
        numbers.put("28",28);
        numbers.put("29",29);
        numbers.put("30",30); 
        numbers.put("31",31);
        numbers.put("32",32);
        numbers.put("33",33);
        numbers.put("34",34);
        numbers.put("35",35); 
        numbers.put("36",36);
        numbers.put("37",37);
        numbers.put("38",38);
        numbers.put("39",39);
        numbers.put("40",40); 
        numbers.put("41",41);
        numbers.put("42",42);
        numbers.put("43",43);
        numbers.put("44",44);
        numbers.put("45",45); 
        numbers.put("46",46);
        numbers.put("47",47);
        numbers.put("48",48);
        numbers.put("49",49);
        numbers.put("50",50); 
        
    }
    
    static void controller(String number1, String number2){
        int difference = (int) numbers.get(number2) - (int) numbers.get(number1);
        System.out.println("The difference and your new favorite number is " + difference);
    }
}