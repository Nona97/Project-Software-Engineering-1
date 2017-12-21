package ass_software;

import java.util.Scanner;
import java.util.Vector;


public class Signup 
{
    
    Vector <String> data= new Vector();
    String Name="";
    String E_mail="";
    String password="";
    String mobile_phone="";
    String  AGE ;
    String gender;
    int index=0;
    
    public void sign_up()
    {    
        Scanner input = new Scanner(System.in);
        System.out.println("please inter your details :");
        System.out.println("please enter your name :");
        Name= input.nextLine();
        System.out.println("please enter your password :");
        password = input.nextLine();
        System.out.println("please enter your mobile_phone :");
        mobile_phone = input.nextLine();
        System.out.println("please enter your AGE :");
        AGE = input.nextLine();
        System.out.println("please enter your Gender :");
        gender = input.nextLine();
        System.out.println("please enter your E_mail :");
        E_mail = input.nextLine();
        
        data.add(index, Name);
        data.add(index, E_mail);
        data.add(index, gender);
        data.add(index, password);
        data.add(index, AGE);
        
        index++;
        
    }    
    


        
    
       
}
