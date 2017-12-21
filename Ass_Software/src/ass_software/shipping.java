/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass_software;
import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class shipping {
    int shipping_id;
    String shipping_type="";
    float shipping_cost;
    String shipping_region="";
    
    Scanner input=new Scanner (System.in);
     public void place_order()
    {
        System.out.println("Enter your Address ");
        shipping_region=input.nextLine();
    }

    
}
