package com.envision.mule.corepoint.mixin;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HospitalTypeMixin {
	@JsonProperty("RoomNo")
    protected String roomNo;
	@JsonProperty("RoomLocation")
    protected String roomLocation;
	@JsonProperty("MedicalRecordNumber")
    protected String medicalRecordNumber;
}
