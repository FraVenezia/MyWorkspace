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

public class JsonShortDateDeSerializer extends JsonDeserializer<Date>{

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException { 
    	if (!UtilityFormatType.checkShortDateFormat(jp.getText())){    	
    		throw new JsonProcessingException(String.format("ERROR FORMAT SHORT DATE : %s", jp.getText())){};
    	}
        SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd"); 
        Date date=null;
		try {
			date = dt.parse(jp.getText());
		} catch (ParseException e) {
			throw ctxt.weirdStringException( Date.class, "invalid date the correct path is yyyy-MM-dd");
		} 
        return date;
    }  
}