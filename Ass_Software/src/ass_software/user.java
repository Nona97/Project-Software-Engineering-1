
package ass_software;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
public class user {
    Scanner input = new Scanner(System.in);
        String x= "";

    

    public void use_vocher_card()
    {
        
        System.out.println("please enter your vocher card num :");
        x=input.nextLine();
    }
    /*-------------------------------------------------------------------*/
    public void buy_product(int Num_of_products)
    {
        Vector<Integer> x=new Vector();
        data_base a = new data_base();
        a.add_data();
        for(int i=0; i<Num_of_products; i++)
        {
            System.out.println("Please Enter products id which you want to buy it");
            int ID=input.nextInt();
            x.add(i, ID);
        }
        System.out.println("the total price = "+a.Buy_Product(x));
    }
    /*--------------------------------------------------------------------*/
    public void make_order( ){
       
       String m =" ";
       //ArrayList<String> orders= new ArrayList<String>();
       
        String [] orders;
       // orders = new String[x];

      System.out.println("enter your number of order");
      
         int x = input.nextInt();
         orders = new String[100];
         System.out.println("enter order");
         for (int i=0;i<=x;i++){
           // System.out.println("enter order");
            m=input.nextLine();
            orders[i]+=m;
            
            
        }
/*----------------------------------------------------------------------------*/
}
}