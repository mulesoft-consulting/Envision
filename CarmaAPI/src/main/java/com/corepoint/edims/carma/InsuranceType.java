
package com.corepoint.edims.carma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryInsuranceTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPrimaryInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCardHolderSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPatientGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPatientMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryInsuranceTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherSecondaryInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCardHolderSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryPatientGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryPatientMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInsuranceInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "insuranceType", propOrder = {
    "primaryInsuranceTypeId",
    "primaryCompanyName",
    "otherPrimaryInsurance",
    "primaryCardHolderName",
    "primaryCardHolderSSN",
    "primaryPatientGroupId",
    "primaryPatientMemberId",
    "secondaryInsuranceTypeId",
    "secondaryCompanyName",
    "otherSecondaryInsurance",
    "secondaryCardHolderName",
    "secondaryCardHolderSSN",
    "secondaryPatientGroupId",
    "secondaryPatientMemberId",
    "additionalInsuranceInfo",
    "zSegment"
})
public class InsuranceType {

    @XmlElement(name = "PrimaryInsuranceTypeId")
    protected String primaryInsuranceTypeId;
    @XmlElement(name = "PrimaryCompanyName")
    protected String primaryCompanyName;
    @XmlElement(name = "OtherPrimaryInsurance")
    protected String otherPrimaryInsurance;
    @XmlElement(name = "PrimaryCardHolderName")
    protected String primaryCardHolderName;
    @XmlElement(name = "PrimaryCardHolderSSN")
    protected String primaryCardHolderSSN;
    @XmlElement(name = "PrimaryPatientGroupId")
    protected String primaryPatientGroupId;
    @XmlElement(name = "PrimaryPatientMemberId")
    protected String primaryPatientMemberId;
    @XmlElement(name = "SecondaryInsuranceTypeId")
    protected String secondaryInsuranceTypeId;
    @XmlElement(name = "SecondaryCompanyName")
    protected String secondaryCompanyName;
    @XmlElement(name = "OtherSecondaryInsurance")
    protected String otherSecondaryInsurance;
    @XmlElement(name = "SecondaryCardHolderName")
    protected String secondaryCardHolderName;
    @XmlElement(name = "SecondaryCardHolderSSN")
    protected String secondaryCardHolderSSN;
    @XmlElement(name = "SecondaryPatientGroupId")
    protected String secondaryPatientGroupId;
    @XmlElement(name = "SecondaryPatientMemberId")
    protected String secondaryPatientMemberId;
    @XmlElement(name = "AdditionalInsuranceInfo")
    protected String additionalInsuranceInfo;
    @XmlElement(name = "ZSegment")
    protected List<ZsegType> zSegment;

    /**
     * Gets the value of the primaryInsuranceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryInsuranceTypeId() {
        return primaryInsuranceTypeId;
    }

    /**
     * Sets the value of the primaryInsuranceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryInsuranceTypeId(String value) {
        this.primaryInsuranceTypeId = value;
    }

    /**
     * Gets the value of the primaryCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCompanyName() {
        return primaryCompanyName;
    }

    /**
     * Sets the value of the primaryCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCompanyName(String value) {
        this.primaryCompanyName = value;
    }

    /**
     * Gets the value of the otherPrimaryInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPrimaryInsurance() {
        return otherPrimaryInsurance;
    }

    /**
     * Sets the value of the otherPrimaryInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPrimaryInsurance(String value) {
        this.otherPrimaryInsurance = value;
    }

    /**
     * Gets the value of the primaryCardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCardHolderName() {
        return primaryCardHolderName;
    }

    /**
     * Sets the value of the primaryCardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCardHolderName(String value) {
        this.primaryCardHolderName = value;
    }

    /**
     * Gets the value of the primaryCardHolderSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCardHolderSSN() {
        return primaryCardHolderSSN;
    }

    /**
     * Sets the value of the primaryCardHolderSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCardHolderSSN(String value) {
        this.primaryCardHolderSSN = value;
    }

    /**
     * Gets the value of the primaryPatientGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPatientGroupId() {
        return primaryPatientGroupId;
    }

    /**
     * Sets the value of the primaryPatientGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPatientGroupId(String value) {
        this.primaryPatientGroupId = value;
    }

    /**
     * Gets the value of the primaryPatientMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPatientMemberId() {
        return primaryPatientMemberId;
    }

    /**
     * Sets the value of the primaryPatientMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPatientMemberId(String value) {
        this.primaryPatientMemberId = value;
    }

    /**
     * Gets the value of the secondaryInsuranceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryInsuranceTypeId() {
        return secondaryInsuranceTypeId;
    }

    /**
     * Sets the value of the secondaryInsuranceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryInsuranceTypeId(String value) {
        this.secondaryInsuranceTypeId = value;
    }

    /**
     * Gets the value of the secondaryCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCompanyName() {
        return secondaryCompanyName;
    }

    /**
     * Sets the value of the secondaryCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCompanyName(String value) {
        this.secondaryCompanyName = value;
    }

    /**
     * Gets the value of the otherSecondaryInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSecondaryInsurance() {
        return otherSecondaryInsurance;
    }

    /**
     * Sets the value of the otherSecondaryInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSecondaryInsurance(String value) {
        this.otherSecondaryInsurance = value;
    }

    /**
     * Gets the value of the secondaryCardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCardHolderName() {
        return secondaryCardHolderName;
    }

    /**
     * Sets the value of the secondaryCardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCardHolderName(String value) {
        this.secondaryCardHolderName = value;
    }

    /**
     * Gets the value of the secondaryCardHolderSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCardHolderSSN() {
        return secondaryCardHolderSSN;
    }

    /**
     * Sets the value of the secondaryCardHolderSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCardHolderSSN(String value) {
        this.secondaryCardHolderSSN = value;
    }

    /**
     * Gets the value of the secondaryPatientGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryPatientGroupId() {
        return secondaryPatientGroupId;
    }

    /**
     * Sets the value of the secondaryPatientGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryPatientGroupId(String value) {
        this.secondaryPatientGroupId = value;
    }

    /**
     * Gets the value of the secondaryPatientMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryPatientMemberId() {
        return secondaryPatientMemberId;
    }

    /**
     * Sets the value of the secondaryPatientMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryPatientMemberId(String value) {
        this.secondaryPatientMemberId = value;
    }

    /**
     * Gets the value of the additionalInsuranceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInsuranceInfo() {
        return additionalInsuranceInfo;
    }

    /**
     * Sets the value of the additionalInsuranceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInsuranceInfo(String value) {
        this.additionalInsuranceInfo = value;
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
