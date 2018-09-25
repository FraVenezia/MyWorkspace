package it.html.tutorial.library.json;


import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class JsonFloatDeSerializer extends JsonDeserializer<Float>{

    @Override
    public Float deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
       
        float d=Float.parseFloat(jp.getText());
        
        return d;
    }

   
}