
package com.corepoint.edims.carma;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PatientNoShow_FollowUp"/>
 *     &lt;enumeration value="AssignProvider"/>
 *     &lt;enumeration value="EditAppointment_FollowUp"/>
 *     &lt;enumeration value="PatientNoShow"/>
 *     &lt;enumeration value="EndService"/>
 *     &lt;enumeration value="DischargeFromPostAcute"/>
 *     &lt;enumeration value="Referral"/>
 *     &lt;enumeration value="PatientDeceased"/>
 *     &lt;enumeration value="FollowUpComplete"/>
 *     &lt;enumeration value="VisitComplete"/>
 *     &lt;enumeration value="ScheduleInLogis_FollowUp"/>
 *     &lt;enumeration value="FollowUpCall"/>
 *     &lt;enumeration value="FortyEightHourCall"/>
 *     &lt;enumeration value="ScheduleVisit"/>
 *     &lt;enumeration value="CallPatient"/>
 *     &lt;enumeration value="UnderReview"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("PatientNoShow_FollowUp")
    PATIENT_NO_SHOW_FOLLOW_UP("PatientNoShow_FollowUp"),
    @XmlEnumValue("AssignProvider")
    ASSIGN_PROVIDER("AssignProvider"),
    @XmlEnumValue("EditAppointment_FollowUp")
    EDIT_APPOINTMENT_FOLLOW_UP("EditAppointment_FollowUp"),
    @XmlEnumValue("PatientNoShow")
    PATIENT_NO_SHOW("PatientNoShow"),
    @XmlEnumValue("EndService")
    END_SERVICE("EndService"),
    @XmlEnumValue("DischargeFromPostAcute")
    DISCHARGE_FROM_POST_ACUTE("DischargeFromPostAcute"),
    @XmlEnumValue("Referral")
    REFERRAL("Referral"),
    @XmlEnumValue("PatientDeceased")
    PATIENT_DECEASED("PatientDeceased"),
    @XmlEnumValue("FollowUpComplete")
    FOLLOW_UP_COMPLETE("FollowUpComplete"),
    @XmlEnumValue("VisitComplete")
    VISIT_COMPLETE("VisitComplete"),
    @XmlEnumValue("ScheduleInLogis_FollowUp")
    SCHEDULE_IN_LOGIS_FOLLOW_UP("ScheduleInLogis_FollowUp"),
    @XmlEnumValue("FollowUpCall")
    FOLLOW_UP_CALL("FollowUpCall"),
    @XmlEnumValue("FortyEightHourCall")
    FORTY_EIGHT_HOUR_CALL("FortyEightHourCall"),
    @XmlEnumValue("ScheduleVisit")
    SCHEDULE_VISIT("ScheduleVisit"),
    @XmlEnumValue("CallPatient")
    CALL_PATIENT("CallPatient"),
    @XmlEnumValue("UnderReview")
    UNDER_REVIEW("UnderReview");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
