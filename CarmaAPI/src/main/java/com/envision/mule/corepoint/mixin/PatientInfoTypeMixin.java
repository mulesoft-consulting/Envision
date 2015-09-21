package com.envision.mule.corepoint.mixin;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.corepoint.edims.carma.GenderType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PatientInfoTypeMixin {
    @JsonProperty("PatientRecordId")
    protected long patientRecordId;
    @JsonProperty("PatientFirstName")
    protected String patientFirstName;
    @JsonProperty("PatientLastName")
    protected String patientLastName;
    @JsonProperty("SocialSecurityNumber")
    protected String socialSecurityNumber;
    @JsonProperty("DateOfBirth")
    protected String dateOfBirth;
    @JsonProperty("PatientGender")
    protected GenderType patientGender;
    @JsonProperty("PatientCell")
    protected String patientCell;
    @JsonProperty("PatientSecondaryPhone")
    protected String patientSecondaryPhone;
    @JsonProperty("PatientEmail")
    protected String patientEmail;
    @JsonProperty("PatientAddress1")
    protected String patientAddress1;
    @JsonProperty("PatientAddress2")
    protected String patientAddress2;
    @JsonProperty("City")
    protected String city;
    @JsonProperty("State")
    protected String state;
    @JsonProperty("Zip")
    protected String zip;
    @JsonProperty("PatientHeightFeet")
    protected BigDecimal patientHeightFeet;
    @JsonProperty("PatientHeightInches")
    protected BigDecimal patientHeightInches;
    @JsonProperty("PatientWeight")
    protected BigDecimal patientWeight;
    @JsonProperty("PatientTrackingId")
    protected String patientTrackingId;
    @JsonProperty("SenderFacilityId")
    protected short senderFacilityId;
    @JsonProperty("HosptialName")
    protected String hosptialName;
    @JsonProperty("HospitalEMR")
    protected String hospitalEMR;
    @JsonProperty("HospitalFIN")
    protected String hospitalFIN;
    @JsonProperty("HomePhone")
    protected String homePhone;
    @JsonProperty("PrimaryCare")
    protected String primaryCare;
    @JsonProperty("PrimaryCareRelationship")
    protected String primaryCareRelationship;
    @JsonProperty("PrimaryCarePhone")
    protected String primaryCarePhone;
    @JsonProperty("PrimaryCareEmail")
    protected String primaryCareEmail;
    @JsonProperty("PCPName")
    protected String pcpName;
    @JsonProperty("PCPAddress")
    protected String pcpAddress;
    @JsonProperty("PCPPhone")
    protected String pcpPhone;
    @JsonProperty("PCPEmail")
    protected String pcpEmail;
    @JsonProperty("InPatientAdmitDate")
    protected String inPatientAdmitDate;
    @JsonProperty("InPatientDischargeDate")
    protected String inPatientDischargeDate;
    @JsonProperty("InPatientCareType")
    protected String inPatientCareType;
    @JsonProperty("InPatientAdmitDiagnosis")
    protected String inPatientAdmitDiagnosis;
    @JsonProperty("HospitalAssignedDRG")
    protected String hospitalAssignedDRG;
    @JsonProperty("AMRFacilityId")
    protected int amrFacilityId;
    @JsonProperty("AMRRecordNo")
    protected String amrRecordNo;
    @JsonProperty("AmrFacilityName")
    protected String amrFacilityName;
    @JsonProperty("HospiceRecordNo")
    protected String hospiceRecordNo;
    @JsonProperty("HospiceFacilityId")
    protected int hospiceFacilityId;
    @JsonProperty("HospiceFacilityName")
    protected String hospiceFacilityName;
}
