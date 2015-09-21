
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.corepoint.edims.carma.CarmaRecordType;


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
 *         &lt;element ref="{http://edims.corepoint.com/carma}carmaRecord" minOccurs="0"/>
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
    "carmaRecord"
})
@XmlRootElement(name = "SendPatientXMLData")
public class SendPatientXMLData {

    @XmlElement(namespace = "http://edims.corepoint.com/carma")
    protected CarmaRecordType carmaRecord;

    /**
     * Gets the value of the carmaRecord property.
     * 
     * @return
     *     possible object is
     *     {@link CarmaRecordType }
     *     
     */
    public CarmaRecordType getCarmaRecord() {
        return carmaRecord;
    }

    /**
     * Sets the value of the carmaRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarmaRecordType }
     *     
     */
    public void setCarmaRecord(CarmaRecordType value) {
        this.carmaRecord = value;
    }

}
