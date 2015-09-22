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
import com.corepoint.edims.carma.StatusType;

public class StatusTypeDeserializer extends JsonDeserializer<StatusType> {

	@Override
	public StatusType deserialize(JsonParser arg0, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		StatusType type = StatusType.fromValue(arg0.getText());
        if (type != null) {
            return type;
        }
        throw new JsonMappingException("The value must be one of 'PatientNoShow_FollowUp', 'AssignProvider', 'EditAppointment_FollowUp', 'PatientNoShow', 'EndService', 'DischargeFromPostAcute', 'Referral', 'PatientDeceased', 'FollowUpComplete', 'VisitComplete', 'ScheduleInLogis_FollowUp', 'FollowUpCall', 'FortyEightHourCall', 'ScheduleVisit', 'CallPatient', 'UnderReview'"); 
 	}
}

