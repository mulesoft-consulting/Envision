package com.envision.mule.corepoint.mixin;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AppointmentTypeMixin {
    @JsonProperty("AppointmentId")
    protected int appointmentId;
    @JsonProperty("ScheduledTime")
    protected String scheduledTime;
    @JsonProperty("ScheduleType")
    protected String scheduleType;
    @JsonProperty("AppointmentNote")
    protected String appointmentNote;
    @JsonProperty("Status")
    protected String status;
    @JsonProperty("OtherAppointmentPreference")
    protected String otherAppointmentPreference;
    @JsonProperty("OtherPatientToBeSeenWithIn")
    protected String otherPatientToBeSeenWithIn;
    @JsonProperty("CreatedAt")
    protected String createdAt;
}
