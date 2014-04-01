/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dev.amit.xargon.common;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amit
 */
public class StringProcessing {
    
     public String[] speachHypothesis(String googleReturnedHypothesis){
	 
	 String actuallHypothesis[]=new String[2];
         
	 int confidenceIndex=googleReturnedHypothesis.indexOf("confidence");
	 int utteranceIndex=googleReturnedHypothesis.indexOf("utterance");
	
	 actuallHypothesis[0]=googleReturnedHypothesis.substring(utteranceIndex+12,confidenceIndex-3);
	 actuallHypothesis[1]=googleReturnedHypothesis.substring(confidenceIndex+12,confidenceIndex+21);
         
         Logger.getLogger(StringProcessing.class.getName()).log(Level.INFO, "GoogleHypothesis:"+googleReturnedHypothesis);
         Logger.getLogger(StringProcessing.class.getName()).log(Level.INFO, "utterenecIndex:"+utteranceIndex);         
         Logger.getLogger(StringProcessing.class.getName()).log(Level.INFO, "confidenceIndex:"+confidenceIndex);
         Logger.getLogger(StringProcessing.class.getName()).log(Level.INFO, "actuallHypothesis:"+actuallHypothesis[0]);
         Logger.getLogger(StringProcessing.class.getName()).log(Level.INFO, "confidence:"+actuallHypothesis[1]);
	 
	return actuallHypothesis;
	 
 }
     
     public String getProgram(String originalString, String fromword) {
	
		originalString=originalString.replaceAll("  ", " ");
		String[] arrayWord=originalString.split(" ");
		String string="";
		int i=0;
		try{
			for(int j=0;j<arrayWord.length;j++){
				if(arrayWord[j].equals(fromword)){
					i=j;
				}
			}
			for(int k=i;k<arrayWord.length;k++){
				if(k+1>=arrayWord.length){break;}
				else{string+=arrayWord[k+1]+" ";}
				
			}
		}catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
			string= "arrayIndexOutOfBoundsException error in StringCalculation.java ";	
		}
		return string;
	}
    
}
