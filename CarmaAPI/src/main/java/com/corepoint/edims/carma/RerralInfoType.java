
package com.corepoint.edims.carma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rerralInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rerralInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferralId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReferralNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralType" type="{http://edims.corepoint.com/carma}referralType"/>
 *         &lt;element name="CurrentStatus" type="{http://edims.corepoint.com/carma}statusType"/>
 *         &lt;element name="SenderFacilityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SenderFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderUserId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverFacilityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecieverFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecieverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralExpirationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublishType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherCancelrefReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralAssessment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralReminderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedDischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualDischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Diagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FollowUpRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScheduledInLogis" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ServiceProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralExtrasId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VisitedPatientatHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChartBuiltInCERNER" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MeetsCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SignedConsentForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReferralTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderAssigned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WelcomeCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Orders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersEntered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FollowUpCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DischargeFormServiceCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnplannedVisitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralSourcePts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelReferralReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RehabFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paramedic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReAdmitToHospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChronicCareManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPatientatHospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspectedDrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferralContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceContractPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeveroMRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diagnosisInfo" type="{http://edims.corepoint.com/carma}diagnosisType" minOccurs="0"/>
 *         &lt;element name="hospitalInfo" type="{http://edims.corepoint.com/carma}hospitalType" minOccurs="0"/>
 *         &lt;element name="dischargeInfo" type="{http://edims.corepoint.com/carma}dischargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="insuranceInfo" type="{http://edims.corepoint.com/carma}insuranceType" minOccurs="0"/>
 *         &lt;element name="appointmentInfo" type="{http://edims.corepoint.com/carma}appointmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rerralInfoType", propOrder = {
    "referralId",
    "referralNumber",
    "trackingNumber",
    "referralType",
    "currentStatus",
    "senderFacilityId",
    "senderFacilityName",
    "senderUserId",
    "senderName",
    "receiverFacilityId",
    "recieverFacilityName",
    "receiverUserId",
    "recieverName",
    "expirationOption",
    "referralExpirationTime",
    "publishType",
    "cancelReason",
    "otherCancelrefReason",
    "referralAssessment",
    "referralReminderDate",
    "expectedDischargeDate",
    "actualDischargeDate",
    "diagnosis",
    "followUpRequired",
    "scheduledInLogis",
    "serviceProvider",
    "referralExtrasId",
    "visitedPatientatHospital",
    "specialInstructions",
    "chartBuiltInCERNER",
    "meetsCriteria",
    "signedConsentForm",
    "referralTypeName",
    "providerAssigned",
    "welcomeCall",
    "orders",
    "ordersEntered",
    "followUpCall",
    "dischargeFormServiceCall",
    "unplannedVisitName",
    "referralSourceType",
    "referralSourcePts",
    "cancelReferralReason",
    "rehabFacilityName",
    "paramedic",
    "reAdmitToHospital",
    "chronicCareManager",
    "isPatientatHospital",
    "patientLocation",
    "suspectedDrg",
    "referralContract",
    "serviceContractPeriod",
    "deveroMRN",
    "diagnosisInfo",
    "hospitalInfo",
    "dischargeInfo",
    "insuranceInfo",
    "appointmentInfo"
})
public class RerralInfoType {

    @XmlElement(name = "ReferralId")
    protected int referralId;
    @XmlElement(name = "ReferralNumber")
    protected String referralNumber;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ReferralType", required = true)
    protected ReferralType referralType;
    @XmlElement(name = "CurrentStatus", required = true)
    protected StatusType currentStatus;
    @XmlElement(name = "SenderFacilityId")
    protected int senderFacilityId;
    @XmlElement(name = "SenderFacilityName")
    protected String senderFacilityName;
    @XmlElement(name = "SenderUserId")
    protected int senderUserId;
    @XmlElement(name = "SenderName")
    protected String senderName;
    @XmlElement(name = "ReceiverFacilityId")
    protected int receiverFacilityId;
    @XmlElement(name = "RecieverFacilityName")
    protected String recieverFacilityName;
    @XmlElement(name = "ReceiverUserId")
    protected String receiverUserId;
    @XmlElement(name = "RecieverName")
    protected String recieverName;
    @XmlElement(name = "ExpirationOption")
    protected String expirationOption;
    @XmlElement(name = "ReferralExpirationTime")
    protected String referralExpirationTime;
    @XmlElement(name = "PublishType")
    protected String publishType;
    @XmlElement(name = "CancelReason")
    protected String cancelReason;
    @XmlElement(name = "OtherCancelrefReason")
    protected String otherCancelrefReason;
    @XmlElement(name = "ReferralAssessment")
    protected String referralAssessment;
    @XmlElement(name = "ReferralReminderDate")
    protected String referralReminderDate;
    @XmlElement(name = "ExpectedDischargeDate")
    protected String expectedDischargeDate;
    @XmlElement(name = "ActualDischargeDate")
    protected String actualDischargeDate;
    @XmlElement(name = "Diagnosis")
    protected String diagnosis;
    @XmlElement(name = "FollowUpRequired")
    protected boolean followUpRequired;
    @XmlElement(name = "ScheduledInLogis")
    protected boolean scheduledInLogis;
    @XmlElement(name = "ServiceProvider")
    protected String serviceProvider;
    @XmlElement(name = "ReferralExtrasId")
    protected int referralExtrasId;
    @XmlElement(name = "VisitedPatientatHospital")
    protected boolean visitedPatientatHospital;
    @XmlElement(name = "SpecialInstructions")
    protected String specialInstructions;
    @XmlElement(name = "ChartBuiltInCERNER")
    protected boolean chartBuiltInCERNER;
    @XmlElement(name = "MeetsCriteria")
    protected boolean meetsCriteria;
    @XmlElement(name = "SignedConsentForm")
    protected boolean signedConsentForm;
    @XmlElement(name = "ReferralTypeName")
    protected String referralTypeName;
    @XmlElement(name = "ProviderAssigned")
    protected String providerAssigned;
    @XmlElement(name = "WelcomeCall")
    protected String welcomeCall;
    @XmlElement(name = "Orders")
    protected String orders;
    @XmlElement(name = "OrdersEntered")
    protected String ordersEntered;
    @XmlElement(name = "FollowUpCall")
    protected String followUpCall;
    @XmlElement(name = "DischargeFormServiceCall")
    protected String dischargeFormServiceCall;
    @XmlElement(name = "UnplannedVisitName")
    protected String unplannedVisitName;
    @XmlElement(name = "ReferralSourceType")
    protected String referralSourceType;
    @XmlElement(name = "ReferralSourcePts")
    protected String referralSourcePts;
    @XmlElement(name = "CancelReferralReason")
    protected String cancelReferralReason;
    @XmlElement(name = "RehabFacilityName")
    protected String rehabFacilityName;
    @XmlElement(name = "Paramedic")
    protected String paramedic;
    @XmlElement(name = "ReAdmitToHospital")
    protected String reAdmitToHospital;
    @XmlElement(name = "ChronicCareManager")
    protected String chronicCareManager;
    @XmlElement(name = "IsPatientatHospital")
    protected String isPatientatHospital;
    @XmlElement(name = "PatientLocation")
    protected String patientLocation;
    @XmlElement(name = "SuspectedDrg")
    protected String suspectedDrg;
    @XmlElement(name = "ReferralContract")
    protected String referralContract;
    @XmlElement(name = "ServiceContractPeriod")
    protected String serviceContractPeriod;
    @XmlElement(name = "DeveroMRN")
    protected String deveroMRN;
    protected DiagnosisType diagnosisInfo;
    protected HospitalType hospitalInfo;
    protected List<DischargeType> dischargeInfo;
    protected InsuranceType insuranceInfo;
    protected List<AppointmentType> appointmentInfo;

    /**
     * Gets the value of the referralId property.
     * 
     */
    public int getReferralId() {
        return referralId;
    }

    /**
     * Sets the value of the referralId property.
     * 
     */
    public void setReferralId(int value) {
        this.referralId = value;
    }

    /**
     * Gets the value of the referralNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralNumber() {
        return referralNumber;
    }

    /**
     * Sets the value of the referralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralNumber(String value) {
        this.referralNumber = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the referralType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferralType }
     *     
     */
    public ReferralType getReferralType() {
        return referralType;
    }

    /**
     * Sets the value of the referralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferralType }
     *     
     */
    public void setReferralType(ReferralType value) {
        this.referralType = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setCurrentStatus(StatusType value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the senderFacilityId property.
     * 
     */
    public int getSenderFacilityId() {
        return senderFacilityId;
    }

    /**
     * Sets the value of the senderFacilityId property.
     * 
     */
    public void setSenderFacilityId(int value) {
        this.senderFacilityId = value;
    }

    /**
     * Gets the value of the senderFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderFacilityName() {
        return senderFacilityName;
    }

    /**
     * Sets the value of the senderFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderFacilityName(String value) {
        this.senderFacilityName = value;
    }

    /**
     * Gets the value of the senderUserId property.
     * 
     */
    public int getSenderUserId() {
        return senderUserId;
    }

    /**
     * Sets the value of the senderUserId property.
     * 
     */
    public void setSenderUserId(int value) {
        this.senderUserId = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the receiverFacilityId property.
     * 
     */
    public int getReceiverFacilityId() {
        return receiverFacilityId;
    }

    /**
     * Sets the value of the receiverFacilityId property.
     * 
     */
    public void setReceiverFacilityId(int value) {
        this.receiverFacilityId = value;
    }

    /**
     * Gets the value of the recieverFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverFacilityName() {
        return recieverFacilityName;
    }

    /**
     * Sets the value of the recieverFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverFacilityName(String value) {
        this.recieverFacilityName = value;
    }

    /**
     * Gets the value of the receiverUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverUserId() {
        return receiverUserId;
    }

    /**
     * Sets the value of the receiverUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverUserId(String value) {
        this.receiverUserId = value;
    }

    /**
     * Gets the value of the recieverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverName() {
        return recieverName;
    }

    /**
     * Sets the value of the recieverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverName(String value) {
        this.recieverName = value;
    }

    /**
     * Gets the value of the expirationOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationOption() {
        return expirationOption;
    }

    /**
     * Sets the value of the expirationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationOption(String value) {
        this.expirationOption = value;
    }

    /**
     * Gets the value of the referralExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralExpirationTime() {
        return referralExpirationTime;
    }

    /**
     * Sets the value of the referralExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralExpirationTime(String value) {
        this.referralExpirationTime = value;
    }

    /**
     * Gets the value of the publishType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishType() {
        return publishType;
    }

    /**
     * Sets the value of the publishType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishType(String value) {
        this.publishType = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the otherCancelrefReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCancelrefReason() {
        return otherCancelrefReason;
    }

    /**
     * Sets the value of the otherCancelrefReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCancelrefReason(String value) {
        this.otherCancelrefReason = value;
    }

    /**
     * Gets the value of the referralAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralAssessment() {
        return referralAssessment;
    }

    /**
     * Sets the value of the referralAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralAssessment(String value) {
        this.referralAssessment = value;
    }

    /**
     * Gets the value of the referralReminderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralReminderDate() {
        return referralReminderDate;
    }

    /**
     * Sets the value of the referralReminderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralReminderDate(String value) {
        this.referralReminderDate = value;
    }

    /**
     * Gets the value of the expectedDischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedDischargeDate() {
        return expectedDischargeDate;
    }

    /**
     * Sets the value of the expectedDischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDischargeDate(String value) {
        this.expectedDischargeDate = value;
    }

    /**
     * Gets the value of the actualDischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDischargeDate() {
        return actualDischargeDate;
    }

    /**
     * Sets the value of the actualDischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDischargeDate(String value) {
        this.actualDischargeDate = value;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosis(String value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the followUpRequired property.
     * 
     */
    public boolean isFollowUpRequired() {
        return followUpRequired;
    }

    /**
     * Sets the value of the followUpRequired property.
     * 
     */
    public void setFollowUpRequired(boolean value) {
        this.followUpRequired = value;
    }

    /**
     * Gets the value of the scheduledInLogis property.
     * 
     */
    public boolean isScheduledInLogis() {
        return scheduledInLogis;
    }

    /**
     * Sets the value of the scheduledInLogis property.
     * 
     */
    public void setScheduledInLogis(boolean value) {
        this.scheduledInLogis = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the referralExtrasId property.
     * 
     */
    public int getReferralExtrasId() {
        return referralExtrasId;
    }

    /**
     * Sets the value of the referralExtrasId property.
     * 
     */
    public void setReferralExtrasId(int value) {
        this.referralExtrasId = value;
    }

    /**
     * Gets the value of the visitedPatientatHospital property.
     * 
     */
    public boolean isVisitedPatientatHospital() {
        return visitedPatientatHospital;
    }

    /**
     * Sets the value of the visitedPatientatHospital property.
     * 
     */
    public void setVisitedPatientatHospital(boolean value) {
        this.visitedPatientatHospital = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions(String value) {
        this.specialInstructions = value;
    }

    /**
     * Gets the value of the chartBuiltInCERNER property.
     * 
     */
    public boolean isChartBuiltInCERNER() {
        return chartBuiltInCERNER;
    }

    /**
     * Sets the value of the chartBuiltInCERNER property.
     * 
     */
    public void setChartBuiltInCERNER(boolean value) {
        this.chartBuiltInCERNER = value;
    }

    /**
     * Gets the value of the meetsCriteria property.
     * 
     */
    public boolean isMeetsCriteria() {
        return meetsCriteria;
    }

    /**
     * Sets the value of the meetsCriteria property.
     * 
     */
    public void setMeetsCriteria(boolean value) {
        this.meetsCriteria = value;
    }

    /**
     * Gets the value of the signedConsentForm property.
     * 
     */
    public boolean isSignedConsentForm() {
        return signedConsentForm;
    }

    /**
     * Sets the value of the signedConsentForm property.
     * 
     */
    public void setSignedConsentForm(boolean value) {
        this.signedConsentForm = value;
    }

    /**
     * Gets the value of the referralTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralTypeName() {
        return referralTypeName;
    }

    /**
     * Sets the value of the referralTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralTypeName(String value) {
        this.referralTypeName = value;
    }

    /**
     * Gets the value of the providerAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAssigned() {
        return providerAssigned;
    }

    /**
     * Sets the value of the providerAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAssigned(String value) {
        this.providerAssigned = value;
    }

    /**
     * Gets the value of the welcomeCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeCall() {
        return welcomeCall;
    }

    /**
     * Sets the value of the welcomeCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeCall(String value) {
        this.welcomeCall = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrders(String value) {
        this.orders = value;
    }

    /**
     * Gets the value of the ordersEntered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersEntered() {
        return ordersEntered;
    }

    /**
     * Sets the value of the ordersEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersEntered(String value) {
        this.ordersEntered = value;
    }

    /**
     * Gets the value of the followUpCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowUpCall() {
        return followUpCall;
    }

    /**
     * Sets the value of the followUpCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowUpCall(String value) {
        this.followUpCall = value;
    }

    /**
     * Gets the value of the dischargeFormServiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeFormServiceCall() {
        return dischargeFormServiceCall;
    }

    /**
     * Sets the value of the dischargeFormServiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeFormServiceCall(String value) {
        this.dischargeFormServiceCall = value;
    }

    /**
     * Gets the value of the unplannedVisitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnplannedVisitName() {
        return unplannedVisitName;
    }

    /**
     * Sets the value of the unplannedVisitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnplannedVisitName(String value) {
        this.unplannedVisitName = value;
    }

    /**
     * Gets the value of the referralSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralSourceType() {
        return referralSourceType;
    }

    /**
     * Sets the value of the referralSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralSourceType(String value) {
        this.referralSourceType = value;
    }

    /**
     * Gets the value of the referralSourcePts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralSourcePts() {
        return referralSourcePts;
    }

    /**
     * Sets the value of the referralSourcePts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralSourcePts(String value) {
        this.referralSourcePts = value;
    }

    /**
     * Gets the value of the cancelReferralReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReferralReason() {
        return cancelReferralReason;
    }

    /**
     * Sets the value of the cancelReferralReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReferralReason(String value) {
        this.cancelReferralReason = value;
    }

    /**
     * Gets the value of the rehabFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRehabFacilityName() {
        return rehabFacilityName;
    }

    /**
     * Sets the value of the rehabFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRehabFacilityName(String value) {
        this.rehabFacilityName = value;
    }

    /**
     * Gets the value of the paramedic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamedic() {
        return paramedic;
    }

    /**
     * Sets the value of the paramedic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamedic(String value) {
        this.paramedic = value;
    }

    /**
     * Gets the value of the reAdmitToHospital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReAdmitToHospital() {
        return reAdmitToHospital;
    }

    /**
     * Sets the value of the reAdmitToHospital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReAdmitToHospital(String value) {
        this.reAdmitToHospital = value;
    }

    /**
     * Gets the value of the chronicCareManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChronicCareManager() {
        return chronicCareManager;
    }

    /**
     * Sets the value of the chronicCareManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChronicCareManager(String value) {
        this.chronicCareManager = value;
    }

    /**
     * Gets the value of the isPatientatHospital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPatientatHospital() {
        return isPatientatHospital;
    }

    /**
     * Sets the value of the isPatientatHospital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPatientatHospital(String value) {
        this.isPatientatHospital = value;
    }

    /**
     * Gets the value of the patientLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientLocation() {
        return patientLocation;
    }

    /**
     * Sets the value of the patientLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientLocation(String value) {
        this.patientLocation = value;
    }

    /**
     * Gets the value of the suspectedDrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspectedDrg() {
        return suspectedDrg;
    }

    /**
     * Sets the value of the suspectedDrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspectedDrg(String value) {
        this.suspectedDrg = value;
    }

    /**
     * Gets the value of the referralContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralContract() {
        return referralContract;
    }

    /**
     * Sets the value of the referralContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralContract(String value) {
        this.referralContract = value;
    }

    /**
     * Gets the value of the serviceContractPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContractPeriod() {
        return serviceContractPeriod;
    }

    /**
     * Sets the value of the serviceContractPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContractPeriod(String value) {
        this.serviceContractPeriod = value;
    }

    /**
     * Gets the value of the deveroMRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveroMRN() {
        return deveroMRN;
    }

    /**
     * Sets the value of the deveroMRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveroMRN(String value) {
        this.deveroMRN = value;
    }

    /**
     * Gets the value of the diagnosisInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosisType }
     *     
     */
    public DiagnosisType getDiagnosisInfo() {
        return diagnosisInfo;
    }

    /**
     * Sets the value of the diagnosisInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosisType }
     *     
     */
    public void setDiagnosisInfo(DiagnosisType value) {
        this.diagnosisInfo = value;
    }

    /**
     * Gets the value of the hospitalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HospitalType }
     *     
     */
    public HospitalType getHospitalInfo() {
        return hospitalInfo;
    }

    /**
     * Sets the value of the hospitalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HospitalType }
     *     
     */
    public void setHospitalInfo(HospitalType value) {
        this.hospitalInfo = value;
    }

    /**
     * Gets the value of the dischargeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dischargeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDischargeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DischargeType }
     * 
     * 
     */
    public List<DischargeType> getDischargeInfo() {
        if (dischargeInfo == null) {
            dischargeInfo = new ArrayList<DischargeType>();
        }
        return this.dischargeInfo;
    }

    /**
     * Gets the value of the insuranceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceType }
     *     
     */
    public InsuranceType getInsuranceInfo() {
        return insuranceInfo;
    }

    /**
     * Sets the value of the insuranceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceType }
     *     
     */
    public void setInsuranceInfo(InsuranceType value) {
        this.insuranceInfo = value;
    }

    /**
     * Gets the value of the appointmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentType }
     * 
     * 
     */
    public List<AppointmentType> getAppointmentInfo() {
        if (appointmentInfo == null) {
            appointmentInfo = new ArrayList<AppointmentType>();
        }
        return this.appointmentInfo;
    }

}
