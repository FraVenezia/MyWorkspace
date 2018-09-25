package it.html.tutorial.library.deserializer;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.html.tutorial.library.model.Ingredients;

public class IngredientsDeserializer extends JsonDeserializer<List<Ingredients>> {

	@Override
	public List<Ingredients> deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(p);
		List<Ingredients> ingredients = mapper.convertValue(node.findValues("ingredients"), new TypeReference<List<Ingredients>>() {
		});
		return ingredients;
	}

}
