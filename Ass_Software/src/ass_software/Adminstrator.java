/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass_software;
//import ass_software.product;
//import ass_software.Data_Base;
import java.util.Scanner;

public class Adminstrator 
{
    Scanner input = new Scanner(System.in);
    
    /*---------------------------------------------------------------------*/
    public void Add_brand(product p)
    {
        data_base b = new data_base();
        b.add_data();
        System.out.println("please Enter your job (A , S or C)");
        String x=input.nextLine();
        if(x.equalsIgnoreCase("A"))
        {
            System.out.println("please Enter Brand which you want to add");
            p.brand=input.nextLine();
            b.set_brand(p);
        }
    }
     /*----------------------------------------------------------------------*/
    public void add_product_to_the_system()
    {
        data_base a =new data_base();
        a.add_product();
        
    }
    /*-------------------------------------------------------------------------*/
    /*public void accept_product(product y)
    {
        data_base x = null;
        
        x.Accept_Product(y);
        
        if(x.Accept_Product(y))
        {
            System.out.println("I allowed to add the product");
        }
        else 
        {
           System.out.println("I'm Not allowed to add the product"); 
        }
        
    }*/
    public void accept_product(product y)
    {
        data_base x = new data_base();
        x.add_data();
        System.out.println("Enter the product brand ");
        y.brand=input.nextLine();
        System.out.println("Enter the product id ");
        y.brand=input.nextLine();
        x.Accept_Product(y);
        
        if(x.Accept_Product(y))
        {
            System.out.println("I allowed to add the product");
        }
        else 
        {
           System.out.println("I'm Not allowed to add the product"); 
        }
    }
    /*--------------------------------------------------------------------------*/
      public void provide_vocher_card()
    {
        System.out.println("this product has sale, do you need to buy it :" 
                + "if you need to buy please press yes " + "if no prees No");
        String flag = input.nextLine();
        if (flag == "yes")
        {
            System.out.println("your code is:" + "878484");
        }
        else 
        {
            System.out.println("ok,you are welcome");
        }
        
        
        
    }
      /*-----------------------------------------------------------------------*/

}
