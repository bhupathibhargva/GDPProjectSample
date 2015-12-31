/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import sessionBeans.StuRecordFacade;
/**
 *
 * @author S519458
 */
public class NewClass {
    
    
    public static void main(String arg[])
    {
        StuRecordFacade s = new StuRecordFacade();
        System.out.println(s.findAll());
    }
}
