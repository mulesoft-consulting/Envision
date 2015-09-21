package com.envision.mule.corepoint.mixin;

import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class InsuranceTypeMixin {
    @JsonProperty("PrimaryInsuranceTypeId")
    protected String primaryInsuranceTypeId;
    @JsonProperty("PrimaryCompanyName")
    protected String primaryCompanyName;
    @JsonProperty("OtherPrimaryInsurance")
    protected String otherPrimaryInsurance;
    @JsonProperty("PrimaryCardHolderName")
    protected String primaryCardHolderName;
    @JsonProperty("PrimaryCardHolderSSN")
    protected String primaryCardHolderSSN;
    @JsonProperty("PrimaryPatientGroupId")
    protected String primaryPatientGroupId;
    @JsonProperty("PrimaryPatientMemberId")
    protected String primaryPatientMemberId;
    @JsonProperty("SecondaryInsuranceTypeId")
    protected String secondaryInsuranceTypeId;
    @JsonProperty("SecondaryCompanyName")
    protected String secondaryCompanyName;
    @JsonProperty("OtherSecondaryInsurance")
    protected String otherSecondaryInsurance;
    @JsonProperty("SecondaryCardHolderName")
    protected String secondaryCardHolderName;
    @JsonProperty("SecondaryCardHolderSSN")
    protected String secondaryCardHolderSSN;
    @JsonProperty("SecondaryPatientGroupId")
    protected String secondaryPatientGroupId;
    @JsonProperty("SecondaryPatientMemberId")
    protected String secondaryPatientMemberId;
    @JsonProperty("AdditionalInsuranceInfo")
    protected String additionalInsuranceInfo;
}
