
package com.corepoint.edims.carma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appointmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppointmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppointmentNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherAppointmentPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPatientToBeSeenWithIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appointmentType", propOrder = {
    "appointmentId",
    "scheduledTime",
    "scheduleType",
    "appointmentNote",
    "status",
    "otherAppointmentPreference",
    "otherPatientToBeSeenWithIn",
    "createdAt"
})
public class AppointmentType {

    @XmlElement(name = "AppointmentId")
    protected int appointmentId;
    @XmlElement(name = "ScheduledTime")
    protected String scheduledTime;
    @XmlElement(name = "ScheduleType")
    protected String scheduleType;
    @XmlElement(name = "AppointmentNote")
    protected String appointmentNote;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "OtherAppointmentPreference")
    protected String otherAppointmentPreference;
    @XmlElement(name = "OtherPatientToBeSeenWithIn")
    protected String otherPatientToBeSeenWithIn;
    @XmlElement(name = "CreatedAt")
    protected String createdAt;

    /**
     * Gets the value of the appointmentId property.
     * 
     */
    public int getAppointmentId() {
        return appointmentId;
    }

    /**
     * Sets the value of the appointmentId property.
     * 
     */
    public void setAppointmentId(int value) {
        this.appointmentId = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledTime(String value) {
        this.scheduledTime = value;
    }

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleType(String value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the appointmentNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentNote() {
        return appointmentNote;
    }

    /**
     * Sets the value of the appointmentNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentNote(String value) {
        this.appointmentNote = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the otherAppointmentPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAppointmentPreference() {
        return otherAppointmentPreference;
    }

    /**
     * Sets the value of the otherAppointmentPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAppointmentPreference(String value) {
        this.otherAppointmentPreference = value;
    }

    /**
     * Gets the value of the otherPatientToBeSeenWithIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPatientToBeSeenWithIn() {
        return otherPatientToBeSeenWithIn;
    }

    /**
     * Sets the value of the otherPatientToBeSeenWithIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPatientToBeSeenWithIn(String value) {
        this.otherPatientToBeSeenWithIn = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

}
