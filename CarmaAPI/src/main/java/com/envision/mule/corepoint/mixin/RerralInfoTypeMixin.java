package com.envision.mule.corepoint.mixin;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.corepoint.edims.carma.ReferralType;
import com.corepoint.edims.carma.StatusType;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RerralInfoTypeMixin {
    @JsonProperty("ReferralId")
    protected int referralId;
    @JsonProperty("ReferralNumber")
    protected String referralNumber;
    @JsonProperty("TrackingNumber")
    protected String trackingNumber;
    @JsonProperty("ReferralType")
    protected ReferralType referralType;
    @JsonProperty("CurrentStatus")
    protected StatusType currentStatus;
    @JsonProperty("SenderFacilityId")
    protected int senderFacilityId;
    @JsonProperty("SenderFacilityName")
    protected String senderFacilityName;
    @JsonProperty("SenderUserId")
    protected int senderUserId;
    @JsonProperty("SenderName")
    protected String senderName;
    @JsonProperty("ReceiverFacilityId")
    protected int receiverFacilityId;
    @JsonProperty("RecieverFacilityName")
    protected String recieverFacilityName;
    @JsonProperty("ReceiverUserId")
    protected String receiverUserId;
    @JsonProperty("RecieverName")
    protected String recieverName;
    @JsonProperty("ExpirationOption")
    protected String expirationOption;
    @JsonProperty("ReferralExpirationTime")
    protected String referralExpirationTime;
    @JsonProperty("PublishType")
    protected String publishType;
    @JsonProperty("CancelReason")
    protected String cancelReason;
    @JsonProperty("OtherCancelrefReason")
    protected String otherCancelrefReason;
    @JsonProperty("ReferralAssessment")
    protected String referralAssessment;
    @JsonProperty("ReferralReminderDate")
    protected String referralReminderDate;
    @JsonProperty("ExpectedDischargeDate")
    protected String expectedDischargeDate;
    @JsonProperty("ActualDischargeDate")
    protected String actualDischargeDate;
    @JsonProperty("Diagnosis")
    protected String diagnosis;
    @JsonProperty("FollowUpRequired")
    protected boolean followUpRequired;
    @JsonProperty("ScheduledInLogis")
    protected boolean scheduledInLogis;
    @JsonProperty("ServiceProvider")
    protected String serviceProvider;
    @JsonProperty("ReferralExtrasId")
    protected int referralExtrasId;
    @JsonProperty("VisitedPatientatHospital")
    protected boolean visitedPatientatHospital;
    @JsonProperty("SpecialInstructions")
    protected String specialInstructions;
    @JsonProperty("ChartBuiltInCERNER")
    protected boolean chartBuiltInCERNER;
    @JsonProperty("MeetsCriteria")
    protected boolean meetsCriteria;
    @JsonProperty("SignedConsentForm")
    protected boolean signedConsentForm;
    @JsonProperty("ReferralTypeName")
    protected String referralTypeName;
    @JsonProperty("ProviderAssigned")
    protected String providerAssigned;
    @JsonProperty("WelcomeCall")
    protected String welcomeCall;
    @JsonProperty("Orders")
    protected String orders;
    @JsonProperty("OrdersEntered")
    protected String ordersEntered;
    @JsonProperty("FollowUpCall")
    protected String followUpCall;
    @JsonProperty("DischargeFormServiceCall")
    protected String dischargeFormServiceCall;
    @JsonProperty("UnplannedVisitName")
    protected String unplannedVisitName;
    @JsonProperty("ReferralSourceType")
    protected String referralSourceType;
    @JsonProperty("ReferralSourcePts")
    protected String referralSourcePts;
    @JsonProperty("CancelReferralReason")
    protected String cancelReferralReason;
    @JsonProperty("RehabFacilityName")
    protected String rehabFacilityName;
    @JsonProperty("Paramedic")
    protected String paramedic;
    @JsonProperty("ReAdmitToHospital")
    protected String reAdmitToHospital;
    @JsonProperty("ChronicCareManager")
    protected String chronicCareManager;
    @JsonProperty("IsPatientatHospital")
    protected String isPatientatHospital;
    @JsonProperty("PatientLocation")
    protected String patientLocation;
    @JsonProperty("SuspectedDrg")
    protected String suspectedDrg;
    @JsonProperty("ReferralContract")
    protected String referralContract;
    @JsonProperty("ServiceContractPeriod")
    protected String serviceContractPeriod;
    @JsonProperty("DeveroMRN")
    protected String deveroMRN;
}
