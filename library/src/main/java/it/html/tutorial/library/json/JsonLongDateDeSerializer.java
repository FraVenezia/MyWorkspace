package it.html.tutorial.library.json;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class JsonLongDateDeSerializer extends JsonDeserializer<Date>{

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    	
    	String date=jp.getText();
    	
    	if (date!=null)date=date.replace("-", "").replace(":", "").replace(" ", "");
    	
    	if (date!=null && date.trim().length()==8)date=date.concat("000000");
    	
    	if (!UtilityFormatType.checkLongDateFormat(date)){
    		throw new JsonProcessingException(String.format("ERROR FORMAT LONG DATE : %s", jp.getText())){};
    	}
        
    	SimpleDateFormat dt = new SimpleDateFormat("yyyyMMddHHmmss"); 
        Date dateResult=null;
		
        try {
			dateResult = dt.parse(date);
		} catch (ParseException e) {
			throw ctxt.weirdStringException( Date.class, "invalid date the correct path is  yyyy-MM-dd HH:mm:ss ");
		}
		
        return dateResult;
        
    }

    public static void main(String[] args){
    	String date="2018-03-26 23:12:11".replace("-", "").replace(":", "").replace(" ", "");
        if (date!=null && date.trim().length()==8)date=date.concat("000000");
    	
    	
    	if (!UtilityFormatType.checkLongDateFormat(date)){
    		System.out.println("ERROR FORMAT LONG DATE " );
    	}
        SimpleDateFormat dt = new SimpleDateFormat("yyyyMMddHHmmss"); 
        Date dateResult=null;
		try {
			dateResult = dt.parse(date);
			System.out.println(dt.format(dateResult));
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
   
}