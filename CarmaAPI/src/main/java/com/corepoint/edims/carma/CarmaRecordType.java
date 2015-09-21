
package com.corepoint.edims.carma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carmaRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carmaRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://edims.corepoint.com/carma}headerType" minOccurs="0"/>
 *         &lt;element name="patientInfo" type="{http://edims.corepoint.com/carma}patientInfoType" minOccurs="0"/>
 *         &lt;element name="referralInfo" type="{http://edims.corepoint.com/carma}rerralInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carmaRecordType", propOrder = {
    "header",
    "patientInfo",
    "referralInfo"
})
public class CarmaRecordType {

    protected HeaderType header;
    protected PatientInfoType patientInfo;
    protected RerralInfoType referralInfo;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the patientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PatientInfoType }
     *     
     */
    public PatientInfoType getPatientInfo() {
        return patientInfo;
    }

    /**
     * Sets the value of the patientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientInfoType }
     *     
     */
    public void setPatientInfo(PatientInfoType value) {
        this.patientInfo = value;
    }

    /**
     * Gets the value of the referralInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RerralInfoType }
     *     
     */
    public RerralInfoType getReferralInfo() {
        return referralInfo;
    }

    /**
     * Sets the value of the referralInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerralInfoType }
     *     
     */
    public void setReferralInfo(RerralInfoType value) {
        this.referralInfo = value;
    }

}
