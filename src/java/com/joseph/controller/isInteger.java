/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseph.controller;

/**
 * boolean test =  studId.isIntegera(studentIdStr);
        
        
        if (test==false){  
         request.setAttribute("errorMessage", "fuck you motherfucker"); 
        } 
 * @author Admin
 */
 public class isInteger {
     
     //

    public boolean isIntegera( String input ) {
    try {
        Integer.parseInt( input );
        return true;
    }
    catch( Exception e ) {
        return false;
    }
}
    
}
