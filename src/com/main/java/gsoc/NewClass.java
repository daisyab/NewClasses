/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main.java.gsoc;

import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.main.JavaCompiler;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import javax.tools.JavaFileObject;

/**
 *
 * @author guestu
 */
public class NewClass extends JavaCompiler{
     static Context contexts = new Context();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass nc = new NewClass(contexts);
        
        //FIXME: deprecated method, use instead nc.parse(JavaFileObject)
        nc.parse("/home/guestu/NetBeansProjects/NewClass/src/newclass/SecondClass.java"); //FIXME deprecated method, use instead     
    }

    public NewClass(Context cntxt) {
        super(cntxt);        
    }   
    
     @Override
    public JCTree.JCCompilationUnit parse(String filename) {
        JavacFileManager fm = (JavacFileManager)fileManager;

        JavaFileObject next = fm.getJavaFileObjectsFromStrings(List.of(filename)).iterator().next();
        return parse(next);
        }
    }
