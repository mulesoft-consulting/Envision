package com.envision.mule.corepoint.mixin;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.corepoint.edims.carma.DischargeToType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DischargeTypeMixin {
    @JsonProperty("DischargeInfoId")
    protected int dischargeInfoId;
    @JsonProperty("ReferralTrackerId")
    protected long referralTrackerId;
    @JsonProperty("DischartgeToType")
    @JsonDeserialize(using = DischargeToTypeDeserializer.class)
    protected DischargeToType dischartgeToType;
    @JsonProperty("DischargeWithType")
    protected String dischargeWithType;
    @JsonProperty("AgencyName")
    protected String agencyName;
    @JsonProperty("AgencyAddress")
    protected String agencyAddress;
    @JsonProperty("AgencyPhone")
    protected String agencyPhone;
    @JsonProperty("AgencyFAX")
    protected String agencyFAX;
    @JsonProperty("FacilityTypeId")
    protected String facilityTypeId;
    @JsonProperty("FacilityType")
    protected String facilityType;
    @JsonProperty("FacilityName")
    protected String facilityName;
    @JsonProperty("FacilityAddress")
    protected String facilityAddress;
    @JsonProperty("FacilityCity")
    protected String facilityCity;
    @JsonProperty("FacilityZip")
    protected String facilityZip;
    @JsonProperty("FacilityPhone")
    protected String facilityPhone;
    @JsonProperty("FacilityFax")
    protected String facilityFax;
    @JsonProperty("FacilityState")
    protected String facilityState;
    @JsonProperty("PostAcuteProvider")
    protected String postAcuteProvider;
    @JsonProperty("RemindDays")
    protected String remindDays;
    @JsonProperty("DischargeDate")
    protected String dischargeDate;
    @JsonProperty("TransferDate")
    protected String transferDate;
}
