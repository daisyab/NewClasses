/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main.java.gsoc;

import annotation.Action;




/**
 *
 * @author guestu
 */

public class SecondClass extends SecondClass2 {
    
    @Action
    private String stuff;
    
    public static void main(String[] args){
        new SecondClass().actionStuff("hello");
    }    
}