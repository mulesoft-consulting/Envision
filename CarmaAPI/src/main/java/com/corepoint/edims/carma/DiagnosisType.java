
package com.corepoint.edims.carma;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diagnosisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnosisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICDs" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DiagnosisID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DiagnosisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZSegment" type="{http://carma.edims.corepoint.com}zsegType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherDiagnostics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "diagnosisType", propOrder = {
    "icDs",
    "otherDiagnostics",
    "zSegment"
})
public class DiagnosisType {

    @XmlElement(name = "ICDs")
    protected List<DiagnosisType.ICDs> icDs;
    @XmlElement(name = "OtherDiagnostics")
    protected String otherDiagnostics;
    @XmlElement(name = "ZSegment")
    protected List<ZsegType> zSegment;

    /**
     * Gets the value of the icDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getICDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosisType.ICDs }
     * 
     * 
     */
    public List<DiagnosisType.ICDs> getICDs() {
        if (icDs == null) {
            icDs = new ArrayList<DiagnosisType.ICDs>();
        }
        return this.icDs;
    }

    /**
     * Gets the value of the otherDiagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDiagnostics() {
        return otherDiagnostics;
    }

    /**
     * Sets the value of the otherDiagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDiagnostics(String value) {
        this.otherDiagnostics = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DiagnosisID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DiagnosisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "diagnosisID",
        "diagnosisType",
        "zSegment"
    })
    public static class ICDs {

        @XmlElement(name = "DiagnosisID")
        protected String diagnosisID;
        @XmlElement(name = "DiagnosisType")
        protected String diagnosisType;
        @XmlElement(name = "ZSegment")
        protected List<ZsegType> zSegment;

        /**
         * Gets the value of the diagnosisID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiagnosisID() {
            return diagnosisID;
        }

        /**
         * Sets the value of the diagnosisID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiagnosisID(String value) {
            this.diagnosisID = value;
        }

        /**
         * Gets the value of the diagnosisType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiagnosisType() {
            return diagnosisType;
        }

        /**
         * Sets the value of the diagnosisType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiagnosisType(String value) {
            this.diagnosisType = value;
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

}
