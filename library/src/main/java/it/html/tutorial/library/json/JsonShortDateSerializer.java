package it.html.tutorial.library.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * Used to serialize Java.util.Date, which is not a common JSON
 * type, so we have to create a custom serialize method;.
 *
 */
public class JsonShortDateSerializer extends JsonSerializer<Date>{

    @Override
    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
    	
    	SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd"); 
        String formattedDate = dt.format(date);
        gen.writeString(formattedDate);
        
    }   
}
