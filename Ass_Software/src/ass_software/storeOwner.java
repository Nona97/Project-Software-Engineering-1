/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass_software;

/**
 *
 * @author Admin
 */
public class storeOwner 
{
    data_base s=new data_base();
    Adminstrator a =new Adminstrator ();

    public void suggest_product (product y )
    {
        a.accept_product(y);
        
    }
    
}
