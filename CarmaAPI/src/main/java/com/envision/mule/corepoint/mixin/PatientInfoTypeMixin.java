package com.envision.mule.corepoint.mixin;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.corepoint.edims.carma.GenderType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PatientInfoTypeMixin {
    @JsonProperty("PatientRecordId")
    public long patientRecordId;
    @JsonProperty("PatientFirstName")
    public String patientFirstName;
    @JsonProperty("PatientLastName")
    public String patientLastName;
    @JsonProperty("SocialSecurityNumber")
    public String socialSecurityNumber;
    @JsonProperty("DateOfBirth")
    public String dateOfBirth;
    @JsonProperty("PatientGender")
    @JsonDeserialize(using = PatientGenderDeserializer.class)
    public GenderType patientGender;
    @JsonProperty("PatientCell")
    public String patientCell;
    @JsonProperty("PatientSecondaryPhone")
    public String patientSecondaryPhone;
    @JsonProperty("PatientEmail")
    public String patientEmail;
    @JsonProperty("PatientAddress1")
    public String patientAddress1;
    @JsonProperty("PatientAddress2")
    public String patientAddress2;
    @JsonProperty("City")
    public String city;
    @JsonProperty("State")
    public String state;
    @JsonProperty("Zip")
    public String zip;
    @JsonProperty("PatientHeightFeet")
    public BigDecimal patientHeightFeet;
    @JsonProperty("PatientHeightInches")
    public BigDecimal patientHeightInches;
    @JsonProperty("PatientWeight")
    public BigDecimal patientWeight;
    @JsonProperty("PatientTrackingId")
    public String patientTrackingId;
    @JsonProperty("SenderFacilityId")
    public short senderFacilityId;
    @JsonProperty("HosptialName")
    public String hosptialName;
    @JsonProperty("HospitalEMR")
    public String hospitalEMR;
    @JsonProperty("HospitalFIN")
    public String hospitalFIN;
    @JsonProperty("HomePhone")
    public String homePhone;
    @JsonProperty("PrimaryCare")
    public String primaryCare;
    @JsonProperty("PrimaryCareRelationship")
    public String primaryCareRelationship;
    @JsonProperty("PrimaryCarePhone")
    public String primaryCarePhone;
    @JsonProperty("PrimaryCareEmail")
    public String primaryCareEmail;
    @JsonProperty("PCPName")
    public String pcpName;
    @JsonProperty("PCPAddress")
    public String pcpAddress;
    @JsonProperty("PCPPhone")
    public String pcpPhone;
    @JsonProperty("PCPEmail")
    public String pcpEmail;
    @JsonProperty("InPatientAdmitDate")
    public String inPatientAdmitDate;
    @JsonProperty("InPatientDischargeDate")
    public String inPatientDischargeDate;
    @JsonProperty("InPatientCareType")
    public String inPatientCareType;
    @JsonProperty("InPatientAdmitDiagnosis")
    public String inPatientAdmitDiagnosis;
    @JsonProperty("HospitalAssignedDRG")
    public String hospitalAssignedDRG;
    @JsonProperty("AMRFacilityId")
    public int amrFacilityId;
    @JsonProperty("AMRRecordNo")
    public String amrRecordNo;
    @JsonProperty("AmrFacilityName")
    public String amrFacilityName;
    @JsonProperty("HospiceRecordNo")
    public String hospiceRecordNo;
    @JsonProperty("HospiceFacilityId")
    public int hospiceFacilityId;
    @JsonProperty("HospiceFacilityName")
    public String hospiceFacilityName;

}
