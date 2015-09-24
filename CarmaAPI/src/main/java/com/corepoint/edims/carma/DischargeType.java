
package com.corepoint.edims.carma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dischargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dischargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DischargeInfoId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReferralTrackerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DischartgeToType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DischargeWithType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyFAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostAcuteProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemindDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dischargeType", propOrder = {
    "dischargeInfoId",
    "referralTrackerId",
    "dischartgeToType",
    "dischargeWithType",
    "agencyName",
    "agencyAddress",
    "agencyPhone",
    "agencyFAX",
    "facilityTypeId",
    "facilityType",
    "facilityName",
    "facilityAddress",
    "facilityCity",
    "facilityZip",
    "facilityPhone",
    "facilityFax",
    "facilityState",
    "postAcuteProvider",
    "remindDays",
    "dischargeDate",
    "transferDate",
    "zSegment"
})
public class DischargeType {

    @XmlElement(name = "DischargeInfoId")
    protected Integer dischargeInfoId;
    @XmlElement(name = "ReferralTrackerId")
    protected Long referralTrackerId;
    @XmlElement(name = "DischartgeToType")
    protected String dischartgeToType;
    @XmlElement(name = "DischargeWithType")
    protected String dischargeWithType;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "AgencyAddress")
    protected String agencyAddress;
    @XmlElement(name = "AgencyPhone")
    protected String agencyPhone;
    @XmlElement(name = "AgencyFAX")
    protected String agencyFAX;
    @XmlElement(name = "FacilityTypeId")
    protected String facilityTypeId;
    @XmlElement(name = "FacilityType")
    protected String facilityType;
    @XmlElement(name = "FacilityName")
    protected String facilityName;
    @XmlElement(name = "FacilityAddress")
    protected String facilityAddress;
    @XmlElement(name = "FacilityCity")
    protected String facilityCity;
    @XmlElement(name = "FacilityZip")
    protected String facilityZip;
    @XmlElement(name = "FacilityPhone")
    protected String facilityPhone;
    @XmlElement(name = "FacilityFax")
    protected String facilityFax;
    @XmlElement(name = "FacilityState")
    protected String facilityState;
    @XmlElement(name = "PostAcuteProvider")
    protected String postAcuteProvider;
    @XmlElement(name = "RemindDays")
    protected String remindDays;
    @XmlElement(name = "DischargeDate")
    protected String dischargeDate;
    @XmlElement(name = "TransferDate")
    protected String transferDate;
    @XmlElement(name = "ZSegment")
    protected List<ZsegType> zSegment;

    /**
     * Gets the value of the dischargeInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDischargeInfoId() {
        return dischargeInfoId;
    }

    /**
     * Sets the value of the dischargeInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDischargeInfoId(Integer value) {
        this.dischargeInfoId = value;
    }

    /**
     * Gets the value of the referralTrackerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferralTrackerId() {
        return referralTrackerId;
    }

    /**
     * Sets the value of the referralTrackerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferralTrackerId(Long value) {
        this.referralTrackerId = value;
    }

    /**
     * Gets the value of the dischartgeToType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischartgeToType() {
        return dischartgeToType;
    }

    /**
     * Sets the value of the dischartgeToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischartgeToType(String value) {
        this.dischartgeToType = value;
    }

    /**
     * Gets the value of the dischargeWithType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeWithType() {
        return dischargeWithType;
    }

    /**
     * Sets the value of the dischargeWithType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeWithType(String value) {
        this.dischargeWithType = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the agencyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyAddress() {
        return agencyAddress;
    }

    /**
     * Sets the value of the agencyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyAddress(String value) {
        this.agencyAddress = value;
    }

    /**
     * Gets the value of the agencyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyPhone() {
        return agencyPhone;
    }

    /**
     * Sets the value of the agencyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyPhone(String value) {
        this.agencyPhone = value;
    }

    /**
     * Gets the value of the agencyFAX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyFAX() {
        return agencyFAX;
    }

    /**
     * Sets the value of the agencyFAX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyFAX(String value) {
        this.agencyFAX = value;
    }

    /**
     * Gets the value of the facilityTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityTypeId() {
        return facilityTypeId;
    }

    /**
     * Sets the value of the facilityTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityTypeId(String value) {
        this.facilityTypeId = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityType(String value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    /**
     * Gets the value of the facilityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityAddress() {
        return facilityAddress;
    }

    /**
     * Sets the value of the facilityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityAddress(String value) {
        this.facilityAddress = value;
    }

    /**
     * Gets the value of the facilityCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCity() {
        return facilityCity;
    }

    /**
     * Sets the value of the facilityCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCity(String value) {
        this.facilityCity = value;
    }

    /**
     * Gets the value of the facilityZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityZip() {
        return facilityZip;
    }

    /**
     * Sets the value of the facilityZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityZip(String value) {
        this.facilityZip = value;
    }

    /**
     * Gets the value of the facilityPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityPhone() {
        return facilityPhone;
    }

    /**
     * Sets the value of the facilityPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityPhone(String value) {
        this.facilityPhone = value;
    }

    /**
     * Gets the value of the facilityFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityFax() {
        return facilityFax;
    }

    /**
     * Sets the value of the facilityFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityFax(String value) {
        this.facilityFax = value;
    }

    /**
     * Gets the value of the facilityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityState() {
        return facilityState;
    }

    /**
     * Sets the value of the facilityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityState(String value) {
        this.facilityState = value;
    }

    /**
     * Gets the value of the postAcuteProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAcuteProvider() {
        return postAcuteProvider;
    }

    /**
     * Sets the value of the postAcuteProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAcuteProvider(String value) {
        this.postAcuteProvider = value;
    }

    /**
     * Gets the value of the remindDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemindDays() {
        return remindDays;
    }

    /**
     * Sets the value of the remindDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemindDays(String value) {
        this.remindDays = value;
    }

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeDate(String value) {
        this.dischargeDate = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferDate(String value) {
        this.transferDate = value;
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
