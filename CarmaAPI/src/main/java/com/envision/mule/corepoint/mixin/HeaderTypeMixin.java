package com.envision.mule.corepoint.mixin;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.corepoint.edims.carma.ZsegType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HeaderTypeMixin {
	@JsonProperty("ZSegment")
	protected List<ZsegType> zSegment;
}
