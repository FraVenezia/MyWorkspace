package it.html.tutorial.library.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UtilityFormatType {

	private static boolean isValidFormat(String format, String value) {
	        Date date = null;
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat(format);
	            date = sdf.parse(value);
	            if (!value.equals(sdf.format(date))) {
	                date = null;
	            }
	        } catch (ParseException ex) {
	            return false;
	        }
	        return date != null;
	 }
    
    public static void main(String[] args){
    	System.out.println(checkLongDateFormat("2018-01-26 12:01:01"));
    }
    public static boolean checkShortDateFormat(String date){
    	return isValidFormat("yyyyMMdd",date);
    }   
    
    public static boolean checkLongDateFormat(String date){
    	
    	return isValidFormat("yyyyMMddHHmmss",date);
    }
    public static String trasformDataToLongFormat(Date date){
    	String result="";
    	try{
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    		result=sdf.format(date);
    	} catch (Exception ex) {
            return "";  
        }
    	return result;
    }
    public static String trasformDataToLShortFormat(Date date){
    	String result="";
    	try{
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    		result=sdf.format(date);
    	} catch (Exception ex) {
            return "";
        }
    	return result;
    }    
    public static boolean checkFloatFormat(String f){
    	try{
    	     Float.parseFloat(f);
    	}catch(Exception e){
    		return false;
    	}
    	return true;
    }     
    
   
}
