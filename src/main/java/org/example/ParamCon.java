package org.example;

public class ParamCon {
String CarName ;
String Manufacture_Year;

ParamCon(String name , String Year ){
CarName= name;
Manufacture_Year= Year;

    }

    public static void main(String[] args){

    ParamCon arj = new ParamCon("abharath", "2014");
    System.out.print("My car is "+arj.CarName+ "Manufactured at"+arj.Manufacture_Year);

    }
}
