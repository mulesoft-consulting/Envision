
package com.corepoint.edims.carma;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referralType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="referralType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OutPatient"/>
 *     &lt;enumeration value="InPatient"/>
 *     &lt;enumeration value="Discharge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "referralType")
@XmlEnum
public enum ReferralType {

    @XmlEnumValue("OutPatient")
    OUT_PATIENT("OutPatient"),
    @XmlEnumValue("InPatient")
    IN_PATIENT("InPatient"),
    @XmlEnumValue("Discharge")
    DISCHARGE("Discharge");
    private final String value;

    ReferralType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferralType fromValue(String v) {
        for (ReferralType c: ReferralType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
