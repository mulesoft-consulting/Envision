package com.envision.mule.corepoint.mixin;

import java.io.IOException;

import javax.xml.bind.annotation.XmlEnumValue;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;

import com.corepoint.edims.carma.GenderType;
import com.corepoint.edims.carma.ReferralType;

public class ReferralTypeDeserializer extends JsonDeserializer<ReferralType> {

	@Override
	public ReferralType deserialize(JsonParser arg0, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		ReferralType type = ReferralType.fromValue(arg0.getText());
        if (type != null) {
            return type;
        }
        throw new JsonMappingException("The value must be one of 'OutPatient', 'InPatient' or 'Discharge'"); 
 
	}
}
