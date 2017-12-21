package ass_software;

import ass_software.data_base;
import java.util.Scanner;

public class product 
{
    Scanner input = new Scanner(System.in);
    String product_name="";
    String description ="";
    int product_id;
    float price ;
    String brand;
    String tybe_of_product; 
    
    public void Display_product()
    {
        data_base b = null;
        b.display_category();
    }
    
   
    public void get_product_details(product p)
    {
        data_base b = null;
        System.out.println("Enter your product brand which you want to show details ");
        p.brand=input.nextLine();
       
        System.out.println("Enter your product Name which you want to show details ");
        p.product_name=input.nextLine();
        
        b.Get_Product_Details(p);
    }
    
public void Search(product h){
       System.out.println("write your productName you want");
       input.nextLine();
       data_base j=new data_base();
       h.product_name=input.nextLine();
       j.Get_Product_Details(h);
   }
}
