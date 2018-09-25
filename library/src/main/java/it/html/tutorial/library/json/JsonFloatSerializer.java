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
public class JsonFloatSerializer extends JsonSerializer<Float>{

    @Override
    public void serialize(Float d, JsonGenerator gen, SerializerProvider provider)
            throws IOException, JsonProcessingException {   	 
        String result = d.toString();
        gen.writeString(result);
    }
    
}
