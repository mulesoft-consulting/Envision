
package com.corepoint.edims.carma;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dischargeToType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dischargeToType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Post-Acute Facility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dischargeToType")
@XmlEnum
public enum DischargeToType {

    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Post-Acute Facility")
    POST_ACUTE_FACILITY("Post-Acute Facility");
    private final String value;

    DischargeToType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DischargeToType fromValue(String v) {
        for (DischargeToType c: DischargeToType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
