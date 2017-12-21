package ass_software;

import ass_software.product;

import ass_software.product;
import java.util.Scanner;

public class Ass_Software 
{
    public static void main(String[] args)
    {   String m;
        System.out.println("welcome to zenda store !! Do you have any account before? yes or no " );
        Scanner input;
        input = new Scanner(System.in);
         m=input.nextLine();
         if("yes".equals(m)){
            login in = new login();
            in.log_in();
         /*   in.verify_login();*/
           
         }
         else  {
           System.out.println(" you need to create an account ");
           Signup si = new Signup();
            si.sign_up();
             }
          Homepage h =new Homepage();
            h.Homepage();
         System.out.println("please choose your type from C -- A -- S ");
         String b;
          b =input.next();
          if("A".equals(b))
          {
                System.out.println("Welcome Admin ");
                while(true)
                {
                    Adminstrator A =new Adminstrator();
                    product p = new product();
                    System.out.println("if you need to add brand please enter 1");
                    System.out.println("if you need to accept product please enter 2");
                    System.out.println("if you need to add product to the system please enter 3");
                    System.out.println("if you need to provide vocher card please enter 4");
                    System.out.println("if you need to exit please enter 5");
                    int a;
                    a=input.nextInt();
        
                    switch (a) 
                    {
                        case 1:
                            A.Add_brand(p);
                            break;
                        
                        case 2:
                            A.accept_product(p);
                            break;
            
                        case 3:
                            A.add_product_to_the_system();
                            break;
            
                        case 4:
                            A.provide_vocher_card();
                            break;
                        
                        case 5:
                            break;
                    }
                    System.out.println("Thanks for using our site ,we hope you enjoy it and we want see you again :D ");
                    break;
                }
        }
          if("C".equals(b))
          {
                
                System.out.println("Welcome My customer ");
                while(true)
                {
                    System.out.println("if you need help you can send your mobile and e-mail and we can help you !!");
                    String ew ="";
                    if(ew=="yes")
                    {
                        Help he =new Help();
                        System.out.println("if you need help please enter help");
                        he.contactUS();
                    }
                    
                    
               
                    System.out.println("if you need to use vocher card please enter 1");
                    System.out.println("if you need to buy product please enter 2");
                    System.out.println("if you need to make order  please enter 3");
                    System.out.println("if you need to exit please enter 4");
                    System.out.println("if you need help please enter 5");
                    System.out.println("if you need to search please enter 6");
                    
                    int w;
                    w = input.nextInt();
                    user u =new user();
                
                    switch (w) 
                    {
                        case 1:
                            u.use_vocher_card();
                            break;
                       
                        case 2:
                            System.out.println("please enter your num of products");
                            int num_of_products ;
                            num_of_products = input.nextInt();
                            u.buy_product(num_of_products);
                            shipping p =new shipping ();
                            p.place_order();
                            payment v =new payment();
                            System.out.println("if you need to pay with cach enter 1 ");
                            System.out.println("if you need to pay with visa enter 2 ");
                            int q ;
                            q=input.nextInt();
                            if (q==1)
                            {
                              v.pay_with_cach();  
                            }
                            else if (q==2)
                            {
                               v.pay_with_visa();

                            }
                            break;
                        
                        case 3:
                            u.make_order();
                            break;
                        
                        case 4:
                            break;
                        case 5:
                            Help he =new Help();
                            he.contactUS();
                            break;
                        case 6:
                            product as = new product();
                            as.Search(as);
                    }
                    System.out.println("Thanks for using our site ,we hope you enjoy it and we want see you again :D ");
                    break;
                }
          }
          
          if("S".equals(b))
          {
            System.out.println("welcome store owner ");
            while(true)
            {
                System.out.println("if you need to suggest product please enter 1");
                System.out.println("if you need to exit please enter 2");
                int t;
                product r =new product();
                t=input.nextInt();
                storeOwner s=new storeOwner();
                if(t==1)
                {
                    s.suggest_product(r);
                }
                else if (t==2)
                {
                    break;
                }
                System.out.println("Thanks for using our site ,we hope you enjoy it and we want see you again :D ");
            }
          
          }
        
    }
}