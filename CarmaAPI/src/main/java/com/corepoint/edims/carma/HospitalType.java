
package com.corepoint.edims.carma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hospitalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hospitalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MedicalRecordNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "hospitalType", propOrder = {
    "roomNo",
    "roomLocation",
    "medicalRecordNumber",
    "zSegment"
})
public class HospitalType {

    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "RoomLocation")
    protected String roomLocation;
    @XmlElement(name = "MedicalRecordNumber")
    protected String medicalRecordNumber;
    @XmlElement(name = "ZSegment")
    protected List<ZsegType> zSegment;

    /**
     * Gets the value of the roomNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * Sets the value of the roomNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

    /**
     * Gets the value of the roomLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomLocation() {
        return roomLocation;
    }

    /**
     * Sets the value of the roomLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomLocation(String value) {
        this.roomLocation = value;
    }

    /**
     * Gets the value of the medicalRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    /**
     * Sets the value of the medicalRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalRecordNumber(String value) {
        this.medicalRecordNumber = value;
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
