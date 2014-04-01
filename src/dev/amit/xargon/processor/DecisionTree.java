/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dev.amit.xargon.processor;

import dev.amit.xargon.common.StringProcessing;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amit
 */
public class DecisionTree {
    
              static Runner          runner;
            private boolean          isRunning=false;
      final  String words[]          =new String[]{"open","run","execute"};
    static StringProcessing          stringProcessing;    

   
    public boolean programDecider(String _speach) {
        
        for (String w : words) {

            if (_speach.contains(w)) {
                    
                stringProcessing   =new StringProcessing();
                String program     =stringProcessing.getProgram(_speach, w);
                runner             = new Runner();
                isRunning          = runner.RunnerMethod(program);
               
                break;
                
            } else {

                isRunning = false;
                
            }

        }

       
       
        
    
    
    
     return isRunning;
    }
}
