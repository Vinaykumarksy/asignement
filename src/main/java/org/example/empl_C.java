package org.example;

public class empl_C {
    int reg;
    String name;
    empl_C(int register_No, String  emplyee_Name){

        reg = register_No;
        name= emplyee_Name;

    }

   /* public void details(){
      empl_C rac = new empl_C(420, "Arjuna");
System.out.print(rac);
    } */
    public static void main(String[] args){
       empl_C arj = new empl_C(67,"janaki");

   System.out.println(arj);



    }
}
