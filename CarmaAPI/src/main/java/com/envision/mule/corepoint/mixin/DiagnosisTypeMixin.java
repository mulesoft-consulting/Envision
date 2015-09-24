package com.envision.mule.corepoint.mixin;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.corepoint.edims.carma.DiagnosisType;
import com.corepoint.edims.carma.ZsegType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DiagnosisTypeMixin {
	@JsonProperty("ICDs")
    protected List<DiagnosisType.ICDs> icDs;
	@JsonProperty("OtherDiagnostics")
    protected String otherDiagnostics;
	@JsonProperty("ZSegment")
    protected List<ZsegType> zSegment;
	
	public static class ICDs {
		@JsonProperty("DiagnosisID")
        protected String diagnosisID;
		@JsonProperty("DiagnosisType")
        protected String diagnosisType;
		@JsonProperty("ZSegment")
	    protected List<ZsegType> zSegment;
	}    
}
