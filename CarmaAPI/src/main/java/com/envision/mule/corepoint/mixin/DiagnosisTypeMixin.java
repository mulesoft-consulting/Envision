package com.envision.mule.corepoint.mixin;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.corepoint.edims.carma.DiagnosisType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DiagnosisTypeMixin {
	@JsonProperty("ICDs")
    protected List<DiagnosisType.ICDs> icDs;
	@JsonProperty("OtherDiagnostics")
    protected String otherDiagnostics;
	
	public static class ICDs {
		@JsonProperty("DiagnosisID")
        protected String diagnosisID;
		@JsonProperty("DiagnosisType")
        protected String diagnosisType;
	}    
}
