package ass_software;

import java.util.ArrayList;
import java.util.Scanner;



public class order {
    Scanner input=new Scanner (System.in);
    int order_id;
   // int customer_id;
   // String  customer_name="";
   
    
    /*public void place_order()
    {
        System.out.println("Enter your Address ");
        Address=input.nextLine();
    }
    */
    public void rate_us()
    {
        int rate;
        System.out.println("If uou like our services please rate us from 1 to 5");
        rate=input.nextInt();
    }
    
    public void favourite()
    {
        String favou_products="";
        String [] arr_of_favo_products=null;
        System.out.println("please enter your favourite prouducts");
        favou_products=input.nextLine();
        //arr_of_favo_products[] += favou_products;
        
        
        
    }
    
/*public void make_order( ){
       
       String m ="";
       ArrayList<String> orders= new ArrayList<String>();
       String []arr = null;
       
      
      System.out.println("enter your number of order");
      
      int x = input.nextInt();
         for (int i=0;i<x;i++){
            System.out.println("enter order");
            m=input.nextLine();
            arr[i]+=m;
            orders.add(arr[i]);
            
        }
         
    



} */     
}