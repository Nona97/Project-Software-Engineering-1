package ass_software;

import java.util.ArrayList;
import java.util.HashMap;
import ass_software.product;
import java.util.Scanner;
import java.util.Vector;

public class data_base 
{
    Scanner input=new Scanner (System.in);
    HashMap<Integer,product> category=new HashMap();
    
            
    /*public void set_brand(product p)
    {
        product l = null;
        l.brand=p.brand;
        
        for (int i=0; i<category.size(); i++)
        {
            product Value = category.get(i);
            
            //to get the index of the brand 
            int position_of_Value=Value.brand.hashCode();

//------------------------------------------------------------------------------

            ///to save first character of each brand
        //--------------------------------------------//

            String brand_ch=Value.brand.substring(0);
            //char brand_ch=Value.brand.charAt(0);
            
            String curr_brand_ch=l.brand.substring(0);
            //char curr_brand_ch=l.brand.charAt(0);
            
//------------------------------------------------------------------------------
            
            ///if the brand not found at the HashMap
        //--------------------------------------------//
            if(brand_ch.equals(curr_brand_ch))
            {
             
                brand_ch=Value.brand.substring(i++);
                //brand_ch=Value.brand.charAt(i++);
              
                curr_brand_ch=Value.brand.substring(i++);
                //curr_brand_ch=l.brand.charAt(i++);
            
                while(brand_ch.equals(curr_brand_ch))
                {
                    brand_ch=Value.brand.substring(i++);
                    //brand_ch=Value.brand.charAt(i++);
                
                    curr_brand_ch=Value.brand.substring(i++);
                    //curr_brand_ch=l.brand.charAt(i++);
                }
                
                System.out.println("Sorry it was found before");
            }
//------------------------------------------------------------------------------
            
        ///if the first char at new brand < the first char at old brand
    //---------------------------------------------------------------------//
            if(curr_brand_ch.charAt(0)<brand_ch.charAt(0))
            {
                category.put(position_of_Value-1,l);
                System.out.println("Your process done");
                break;
            } 
        
        ///if the first char at new brand > the first char at old brand
    //---------------------------------------------------------------------//
            else 
            {
                category.put(position_of_Value+1,l);
                System.out.println("Your process done");
                break;
            }
            
        }
    }
    
///--------------------------------------------------------------------------/// 
*/
    /*-----------------------------------------------------------------*/
    public void set_brand(product p)
    {
        for (int i=0; i<category.size(); i++)
        {
            if(category.containsValue(p))
            {
                System.out.println("Sorry It Was Found Before You Can't Put this Brand Again");
                break;
            }
            else
            {
                category.put(category.size()-1, p);
                System.out.println("process is done");
                break;
            }
                
        }
    }

    /*-----------------------------------------------------------------------*/
    
    void display_category()
    {
        for(int i=0; i<category.size(); i++)
        {
            System.out.println(category.get(i));
        }
    }
    /*----------------------------------------------------------------------*/
    
    void add_data()
    {
        ///0=>"Samsung brand"
        product a=new product();
        a.brand="Samsung";
        
        product b = new product();
        b.tybe_of_product="Mobile phone";
        b.price=2000;
        b.product_name="Samsung j3";
        b.description="5 migabixel front camera ,2 RAM";
        b.product_id=20150001;
        
        
        product c = new product();
        c.tybe_of_product="tv";
        c.price=7000;
        c.product_name="Samsung 2005";
        c.description="LCD ,42 inches";
        c.product_id=20150002;
       
        product d = new product();
        d.tybe_of_product="laptop";
        d.price=5000;
        d.product_name="Sumsung 4056D";
        d.description="8 processor, 15.6 ansh";
        d.product_id=20150003;
        
        category.put(0,a);
        category.put(0,b);
        category.put(0,c);
        category.put(0,d);
        
        //----------------------------------------------------------------------
        
        ///1=>Toshiba brand
        product w=new product();
        w.brand="Toshiba";
        
        product x = new product();
        x.tybe_of_product="tv";
        x.price=4000;
        x.product_name="Toshiba 88u";
        x.description="LCD ,66 inches";
        x.product_id=20100001;
        
        product y = new product();
        y.tybe_of_product="laptop";
        y.price=4500;
        y.product_name="Toshiba 687H";
        y.description="6 processor, 11.1 inches";
        y.product_id=20100002;
       
        product z = new product();
        z.tybe_of_product="vacuum cleaner";
        z.price=1500;
        z.product_name="V612";
        z.description="12 watt";
        z.product_id=20100003;
        
        category.put(1,w);
        category.put(1,x);
        category.put(1,y);
        category.put(1,z);
        
        
        //----------------------------------------------------------------------
       
        ///2=>Nike
        product m=new product();
        m.brand="Nike";
        
        product n = new product();
        n.tybe_of_product="sporting suit";
        n.price=250;
        n.product_name="112j";
        n.description="sizes=> l/xl/xxl,colour=> blue";
        n.product_id=20110001;
        
        product o = new product();
        o.tybe_of_product="bag";
        o.price=150;
        o.product_name="99k";
        o.description="black";
        o.product_id=20110002;
       
        product p = new product();
        p.tybe_of_product="sporting shoes";
        p.price=350;
        p.product_name="98g";
        p.description="blue,from size 36 to 42";
        p.product_id=20110003;
        
        category.put(2,m);
        category.put(2,n);
        category.put(2,o);
        category.put(2,p);
        
        //----------------------------------------------------------------------
       
        ///3=>MAC
        product e=new product();
        e.brand="MAC";
        
        product r = new product();
        r.tybe_of_product="beauty blender";
        r.price=250;
        r.product_name="8b";
        r.description="very soft, all colours are available";
        r.product_id=20120001;
        
        product t = new product();
        t.tybe_of_product="lip gloss";
        t.price=150;
        t.product_name="45A";
        t.description="lip gloss,mat with vitamin B,all colours are available";
        t.product_id=20120002;
       
        product q = new product();
        q.tybe_of_product="eye shadow";
        q.price=350;
        q.product_name="7E";
        q.description="bronze,all colours are available ";
        q.product_id=20120003;
        
        category.put(3,e);
        category.put(3,r);
        category.put(3,t);
        category.put(2,q);
    }
    
///--------------------------------------------------------------------------///
    /*-----------------------------------------------------------------------------*/
    
    float Buy_Product(Vector<Integer> Products_id)
    {
        float total=0;
        for(int i=0; i<Products_id.size(); i++)
        {
            
            product c = new product();
            c.product_id=Products_id.get(i);
            if(category.containsValue(c.product_id))
            {
                total=total+c.price;
            }
        }
        return total;
    }
    
///--------------------------------------------------------------------------///
    /*---------------------------------------------------------------------------*/
            
    void Get_Product_Details(product p)
    {
        product c = new product();
        c.brand=p.brand;
        c.product_name=p.product_name;
        for(int i=0; i<category.size(); i++)
        {
            product Value = category.get(i);
            if(Value.brand==c.brand)
            {
                if(category.containsValue(c.product_name))
                {
                    System.out.println(Value.description + Value.tybe_of_product +Value.product_id +Value.price);
                    break;
                }
                else
                {
                    System.out.println("Sorry this product not available");
                    break;
                }
            }
        }
    }
    
///--------------------------------------------------------------------------///
    /*--------------------------------------------------------------------------------*/
    
    boolean Accept_Product(product y)
    {
        product c = new product();
        c.brand=y.brand;
        c.product_id=y.product_id;
        
        for(int i=0; i<category.size(); i++)
        {
            product Value = category.get(i);
            if(Value.brand==c.brand)
            {
                if(category.containsValue(c.product_id))
                {
                   System.out.println("the product was found before !!");
                   return false;
                }
                else
                {
                   System.out.println("the product wasn't found before !!");
                   return true;
                }
            }
        }
         return true;
        
    }
    
///--------------------------------------------------------------------------///
    /*------------------------------------------------------------------------------*/
    
    void add_product()
    {
        


        product x = new product();
        System.out.println("Enter price of product");
        x.price=input.nextInt();
        System.out.println("Enter name of product");
        x.product_name=input.next();
        System.out.println("Enter description of product");
        x.description=input.next();
        System.out.println("Enter product_id");
        x.product_id=input.nextInt();   
    }
    
///--------------------------------------------------------------------------///
    /*---------------------------------------------------------------------------*/
    void delete_product(product p)
    {
        for(int i=0; i<category.size(); i++)
        {
            if(p==category.get(i)) 
            {
                category.remove(i,p);
            } 
        }
    }
    
///--------------------------------------------------------------------------///
    
    void update_product(product p)
    {
        for(int i=0; i<category.size(); i++)
        {
            if(p==category.get(i)) 
            {
                category.replace(i, p);
            } 
        }
    }
/*--------------------------------------------------------------------------------*/    
}
