/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass_software;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class payment {
    Scanner input=new Scanner (System.in);
    int customer_id ;
    int total;
    String paid_date;
    String details;
    String code_of_vocher_card="";
    String  flag="";
    int visa_num;
    
    public void pay_with_cach()
    {
        System.out.println("pay when the duty comes");   
    }
    public void pay_with_visa()
    {
        System.out.println("please inter your visa number");
        visa_num=input.nextInt();
    }
    




}
