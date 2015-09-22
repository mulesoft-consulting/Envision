package com.envision.mule.corepoint.mixin;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;

import com.corepoint.edims.carma.GenderType;

public class PatientGenderDeserializer extends JsonDeserializer<GenderType> {

	@Override
	public GenderType deserialize(JsonParser arg0, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		GenderType type = GenderType.fromValue(arg0.getText());
        if (type != null) {
            return type;
        }
        throw new JsonMappingException("The value must vbe one of 'Male' or 'Female'"); 
 
	}

	

}
