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
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;
import static javax.tools.StandardLocation.SOURCE_PATH;

/**
 *
 * @author guestu
 */
public class NewClass extends JavaCompiler{
     static Context contexts = new Context();
    private static StandardLocation file =SOURCE_PATH ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        NewClass nc = new NewClass(contexts);
        JavaFileManager jfo = nc.fileManager;
        System.out.printf("%s", file);
        String name = jfo.getJavaFileForOutput(SOURCE_PATH, fullVersion(), JavaFileObject.Kind.SOURCE, null).getName();
        System.out.printf("%s", name);
        String files = "/home/guestu/NetBeansProjects/NewClass/src/newclass/SecondClass.java";
        
        nc.parse("/home/guestu/NetBeansProjects/NewClass/src/newclass/SecondClass.java");        
    }

    public NewClass(Context cntxt) {
        super(cntxt);        
    }   
    
     @Override
    public JCTree.JCCompilationUnit parse(JavaFileObject filename) {
        JavaFileObject prev = log.useSource(filename);
        try {
            JCTree.JCCompilationUnit t = parse(filename, readSource(filename));
            if (t.endPositions != null)
                log.setEndPosTable(filename, t.endPositions);
            return t;
        } finally {
            log.useSource(prev);
        }
    }
    
    
}