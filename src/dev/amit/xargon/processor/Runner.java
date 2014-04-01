/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dev.amit.xargon.processor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amit
 */
public class Runner {
    
             Runtime          r;
     private boolean          isRunning=false;

    public boolean RunnerMethod(String _program) {
        
             r=Runtime.getRuntime();
             
        
         try {
             r.exec("/usr/bin/xterm "+_program);
             isRunning=true;
              Logger.getLogger(Runner.class.getName()).log(Level.SEVERE,"in runner isRunning="+isRunning);
         } catch (IOException ex) {
             isRunning=false;
             Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, "could not execute", ex);
         }
                return isRunning;
			
		
    }
    
    public static void main(String... a) throws IOException{
       new Runner().RunnerMethod("gedit");
//        
//          String line;
//        Process p = Runtime.getRuntime().exec("tasklist.exe");
//        BufferedReader input =
//                new BufferedReader(new InputStreamReader(p.getInputStream()));
//        while ((line = input.readLine()) != null) {
//            System.out.println(line); //-- Parse data here.
//        }
//        
//        ProcessBuilder pb=new ProcessBuilder("cmd");
//            pb.redirectErrorStream(true);
//            Process process=pb.start();
//            BufferedReader inStreamReader = new BufferedReader(
//               new InputStreamReader(process.getInputStream())); 
//                String s=null;
//                while((s=inStreamReader.readLine()) != null){
//                    System.out.println(s);
//}
//
//    	try {
//    		String command= "/usr/bin/xterm";
//    		Runtime rt = Runtime.getRuntime();
//    		Process pr = rt.exec(command);
//    		
//    	} catch (IOException ex) {
//    	    ex.printStackTrace();
//    	}
    }
}
    
    
    

