
package ass_software;

import ass_software.Signup;
import java.util.Scanner;


public class login {
    
    String Email="";
    String password="";
    String Type;
    public void log_in()
    {
        
      /*  System.out.println("please choose your type from C -- A -- S ");
        Type =input.nextLine();
        switch (Type) {
            case "C":
                System.out.println("Welcome in Zenda Store ");
                System.out.println("please inter your username and password : ");
                Email = input.nextLine();
                password = input.nextLine();
                break;
            case "A":
                System.out.println("Welcome Admin ");
                System.out.println("please inter your username and password : ");
                Email    = input.nextLine();
                password = input.nextLine();
                break;*/
         System.out.println("please inter your username and password : ");
           Scanner input = new Scanner(System.in);
           String password;
           String username;
            
            username= input.nextLine();
            password = input.nextLine();
          /*Email = input.nextLine();*/
          
          /*  case "S":
                System.out.println("Welcome store owner");
                System.out.println("please inter your username and password : ");
                Email = input.nextLine();
                password = input.nextLine();
                break;
            default:
                break;*/
        }
  

    
    public void verify_login()
    {
        Signup data = new Signup();
        if ((Email == null ? data.E_mail == null : Email.equals(data.E_mail)) && (password == null ? data.password == null : password.equals(data.password)))
        {
            System.out.println("log in is true");
        }
        
    }
    }
