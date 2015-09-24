
package com.corepoint.edims.carma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patientInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patientInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientRecordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PatientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientCell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientSecondaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientHeightFeet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientHeightInches" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientTrackingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderFacilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HosptialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HospitalEMR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HospitalFIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCareRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCarePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCareEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCPPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PCPEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPatientAdmitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPatientDischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPatientCareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPatientAdmitDiagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HospitalAssignedDRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMRFacilityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AMRRecordNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmrFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HospiceRecordNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HospiceFacilityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HospiceFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZSegment" type="{http://carma.edims.corepoint.com}zsegType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patientInfoType", propOrder = {
    "patientRecordId",
    "patientFirstName",
    "patientLastName",
    "socialSecurityNumber",
    "dateOfBirth",
    "patientGender",
    "patientCell",
    "patientSecondaryPhone",
    "patientEmail",
    "patientAddress1",
    "patientAddress2",
    "city",
    "state",
    "zip",
    "patientHeightFeet",
    "patientHeightInches",
    "patientWeight",
    "patientTrackingId",
    "senderFacilityId",
    "hosptialName",
    "hospitalEMR",
    "hospitalFIN",
    "homePhone",
    "primaryCare",
    "primaryCareRelationship",
    "primaryCarePhone",
    "primaryCareEmail",
    "pcpName",
    "pcpAddress",
    "pcpPhone",
    "pcpEmail",
    "inPatientAdmitDate",
    "inPatientDischargeDate",
    "inPatientCareType",
    "inPatientAdmitDiagnosis",
    "hospitalAssignedDRG",
    "amrFacilityId",
    "amrRecordNo",
    "amrFacilityName",
    "hospiceRecordNo",
    "hospiceFacilityId",
    "hospiceFacilityName",
    "zSegment"
})
public class PatientInfoType {

    @XmlElement(name = "PatientRecordId")
    protected Long patientRecordId;
    @XmlElement(name = "PatientFirstName")
    protected String patientFirstName;
    @XmlElement(name = "PatientLastName")
    protected String patientLastName;
    @XmlElement(name = "SocialSecurityNumber")
    protected String socialSecurityNumber;
    @XmlElement(name = "DateOfBirth")
    protected String dateOfBirth;
    @XmlElement(name = "PatientGender")
    protected String patientGender;
    @XmlElement(name = "PatientCell")
    protected String patientCell;
    @XmlElement(name = "PatientSecondaryPhone")
    protected String patientSecondaryPhone;
    @XmlElement(name = "PatientEmail")
    protected String patientEmail;
    @XmlElement(name = "PatientAddress1")
    protected String patientAddress1;
    @XmlElement(name = "PatientAddress2")
    protected String patientAddress2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "PatientHeightFeet")
    protected String patientHeightFeet;
    @XmlElement(name = "PatientHeightInches")
    protected String patientHeightInches;
    @XmlElement(name = "PatientWeight")
    protected String patientWeight;
    @XmlElement(name = "PatientTrackingId")
    protected String patientTrackingId;
    @XmlElement(name = "SenderFacilityId")
    protected String senderFacilityId;
    @XmlElement(name = "HosptialName")
    protected String hosptialName;
    @XmlElement(name = "HospitalEMR")
    protected String hospitalEMR;
    @XmlElement(name = "HospitalFIN")
    protected String hospitalFIN;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "PrimaryCare")
    protected String primaryCare;
    @XmlElement(name = "PrimaryCareRelationship")
    protected String primaryCareRelationship;
    @XmlElement(name = "PrimaryCarePhone")
    protected String primaryCarePhone;
    @XmlElement(name = "PrimaryCareEmail")
    protected String primaryCareEmail;
    @XmlElement(name = "PCPName")
    protected String pcpName;
    @XmlElement(name = "PCPAddress")
    protected String pcpAddress;
    @XmlElement(name = "PCPPhone")
    protected String pcpPhone;
    @XmlElement(name = "PCPEmail")
    protected String pcpEmail;
    @XmlElement(name = "InPatientAdmitDate")
    protected String inPatientAdmitDate;
    @XmlElement(name = "InPatientDischargeDate")
    protected String inPatientDischargeDate;
    @XmlElement(name = "InPatientCareType")
    protected String inPatientCareType;
    @XmlElement(name = "InPatientAdmitDiagnosis")
    protected String inPatientAdmitDiagnosis;
    @XmlElement(name = "HospitalAssignedDRG")
    protected String hospitalAssignedDRG;
    @XmlElement(name = "AMRFacilityId")
    protected Integer amrFacilityId;
    @XmlElement(name = "AMRRecordNo")
    protected String amrRecordNo;
    @XmlElement(name = "AmrFacilityName")
    protected String amrFacilityName;
    @XmlElement(name = "HospiceRecordNo")
    protected String hospiceRecordNo;
    @XmlElement(name = "HospiceFacilityId")
    protected Integer hospiceFacilityId;
    @XmlElement(name = "HospiceFacilityName")
    protected String hospiceFacilityName;
    @XmlElement(name = "ZSegment")
    protected List<ZsegType> zSegment;

    /**
     * Gets the value of the patientRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPatientRecordId() {
        return patientRecordId;
    }

    /**
     * Sets the value of the patientRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPatientRecordId(Long value) {
        this.patientRecordId = value;
    }

    /**
     * Gets the value of the patientFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFirstName() {
        return patientFirstName;
    }

    /**
     * Sets the value of the patientFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFirstName(String value) {
        this.patientFirstName = value;
    }

    /**
     * Gets the value of the patientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientLastName() {
        return patientLastName;
    }

    /**
     * Sets the value of the patientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientLastName(String value) {
        this.patientLastName = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the patientGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientGender() {
        return patientGender;
    }

    /**
     * Sets the value of the patientGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientGender(String value) {
        this.patientGender = value;
    }

    /**
     * Gets the value of the patientCell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientCell() {
        return patientCell;
    }

    /**
     * Sets the value of the patientCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientCell(String value) {
        this.patientCell = value;
    }

    /**
     * Gets the value of the patientSecondaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientSecondaryPhone() {
        return patientSecondaryPhone;
    }

    /**
     * Sets the value of the patientSecondaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientSecondaryPhone(String value) {
        this.patientSecondaryPhone = value;
    }

    /**
     * Gets the value of the patientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientEmail() {
        return patientEmail;
    }

    /**
     * Sets the value of the patientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientEmail(String value) {
        this.patientEmail = value;
    }

    /**
     * Gets the value of the patientAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientAddress1() {
        return patientAddress1;
    }

    /**
     * Sets the value of the patientAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientAddress1(String value) {
        this.patientAddress1 = value;
    }

    /**
     * Gets the value of the patientAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientAddress2() {
        return patientAddress2;
    }

    /**
     * Sets the value of the patientAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientAddress2(String value) {
        this.patientAddress2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the patientHeightFeet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientHeightFeet() {
        return patientHeightFeet;
    }

    /**
     * Sets the value of the patientHeightFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientHeightFeet(String value) {
        this.patientHeightFeet = value;
    }

    /**
     * Gets the value of the patientHeightInches property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientHeightInches() {
        return patientHeightInches;
    }

    /**
     * Sets the value of the patientHeightInches property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientHeightInches(String value) {
        this.patientHeightInches = value;
    }

    /**
     * Gets the value of the patientWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientWeight() {
        return patientWeight;
    }

    /**
     * Sets the value of the patientWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientWeight(String value) {
        this.patientWeight = value;
    }

    /**
     * Gets the value of the patientTrackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientTrackingId() {
        return patientTrackingId;
    }

    /**
     * Sets the value of the patientTrackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientTrackingId(String value) {
        this.patientTrackingId = value;
    }

    /**
     * Gets the value of the senderFacilityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderFacilityId() {
        return senderFacilityId;
    }

    /**
     * Sets the value of the senderFacilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderFacilityId(String value) {
        this.senderFacilityId = value;
    }

    /**
     * Gets the value of the hosptialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHosptialName() {
        return hosptialName;
    }

    /**
     * Sets the value of the hosptialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHosptialName(String value) {
        this.hosptialName = value;
    }

    /**
     * Gets the value of the hospitalEMR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalEMR() {
        return hospitalEMR;
    }

    /**
     * Sets the value of the hospitalEMR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalEMR(String value) {
        this.hospitalEMR = value;
    }

    /**
     * Gets the value of the hospitalFIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalFIN() {
        return hospitalFIN;
    }

    /**
     * Sets the value of the hospitalFIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalFIN(String value) {
        this.hospitalFIN = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the primaryCare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCare() {
        return primaryCare;
    }

    /**
     * Sets the value of the primaryCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCare(String value) {
        this.primaryCare = value;
    }

    /**
     * Gets the value of the primaryCareRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCareRelationship() {
        return primaryCareRelationship;
    }

    /**
     * Sets the value of the primaryCareRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCareRelationship(String value) {
        this.primaryCareRelationship = value;
    }

    /**
     * Gets the value of the primaryCarePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCarePhone() {
        return primaryCarePhone;
    }

    /**
     * Sets the value of the primaryCarePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCarePhone(String value) {
        this.primaryCarePhone = value;
    }

    /**
     * Gets the value of the primaryCareEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCareEmail() {
        return primaryCareEmail;
    }

    /**
     * Sets the value of the primaryCareEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCareEmail(String value) {
        this.primaryCareEmail = value;
    }

    /**
     * Gets the value of the pcpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCPName() {
        return pcpName;
    }

    /**
     * Sets the value of the pcpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCPName(String value) {
        this.pcpName = value;
    }

    /**
     * Gets the value of the pcpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCPAddress() {
        return pcpAddress;
    }

    /**
     * Sets the value of the pcpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCPAddress(String value) {
        this.pcpAddress = value;
    }

    /**
     * Gets the value of the pcpPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCPPhone() {
        return pcpPhone;
    }

    /**
     * Sets the value of the pcpPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCPPhone(String value) {
        this.pcpPhone = value;
    }

    /**
     * Gets the value of the pcpEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCPEmail() {
        return pcpEmail;
    }

    /**
     * Sets the value of the pcpEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCPEmail(String value) {
        this.pcpEmail = value;
    }

    /**
     * Gets the value of the inPatientAdmitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPatientAdmitDate() {
        return inPatientAdmitDate;
    }

    /**
     * Sets the value of the inPatientAdmitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPatientAdmitDate(String value) {
        this.inPatientAdmitDate = value;
    }

    /**
     * Gets the value of the inPatientDischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPatientDischargeDate() {
        return inPatientDischargeDate;
    }

    /**
     * Sets the value of the inPatientDischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPatientDischargeDate(String value) {
        this.inPatientDischargeDate = value;
    }

    /**
     * Gets the value of the inPatientCareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPatientCareType() {
        return inPatientCareType;
    }

    /**
     * Sets the value of the inPatientCareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPatientCareType(String value) {
        this.inPatientCareType = value;
    }

    /**
     * Gets the value of the inPatientAdmitDiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPatientAdmitDiagnosis() {
        return inPatientAdmitDiagnosis;
    }

    /**
     * Sets the value of the inPatientAdmitDiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPatientAdmitDiagnosis(String value) {
        this.inPatientAdmitDiagnosis = value;
    }

    /**
     * Gets the value of the hospitalAssignedDRG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalAssignedDRG() {
        return hospitalAssignedDRG;
    }

    /**
     * Sets the value of the hospitalAssignedDRG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalAssignedDRG(String value) {
        this.hospitalAssignedDRG = value;
    }

    /**
     * Gets the value of the amrFacilityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAMRFacilityId() {
        return amrFacilityId;
    }

    /**
     * Sets the value of the amrFacilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAMRFacilityId(Integer value) {
        this.amrFacilityId = value;
    }

    /**
     * Gets the value of the amrRecordNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMRRecordNo() {
        return amrRecordNo;
    }

    /**
     * Sets the value of the amrRecordNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMRRecordNo(String value) {
        this.amrRecordNo = value;
    }

    /**
     * Gets the value of the amrFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmrFacilityName() {
        return amrFacilityName;
    }

    /**
     * Sets the value of the amrFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmrFacilityName(String value) {
        this.amrFacilityName = value;
    }

    /**
     * Gets the value of the hospiceRecordNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospiceRecordNo() {
        return hospiceRecordNo;
    }

    /**
     * Sets the value of the hospiceRecordNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospiceRecordNo(String value) {
        this.hospiceRecordNo = value;
    }

    /**
     * Gets the value of the hospiceFacilityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHospiceFacilityId() {
        return hospiceFacilityId;
    }

    /**
     * Sets the value of the hospiceFacilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHospiceFacilityId(Integer value) {
        this.hospiceFacilityId = value;
    }

    /**
     * Gets the value of the hospiceFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospiceFacilityName() {
        return hospiceFacilityName;
    }

    /**
     * Sets the value of the hospiceFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospiceFacilityName(String value) {
        this.hospiceFacilityName = value;
    }

    /**
     * Gets the value of the zSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZsegType }
     * 
     * 
     */
    public List<ZsegType> getZSegment() {
        if (zSegment == null) {
            zSegment = new ArrayList<ZsegType>();
        }
        return this.zSegment;
    }

}
