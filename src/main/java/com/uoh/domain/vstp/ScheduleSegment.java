package com.uoh.domain.vstp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.vstp.ScheduleSegment Class will...
 * Created by James Millner on 05/12/2016 at 20:39.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "vstp_schedule_segment")
public class ScheduleSegment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonIgnore
    private VSTPMsg vstpMsg;

    @JsonProperty(value = "CIF_business_sector")
    private String CIF_business_sector;

    @JsonProperty(value = "CIF_sleepers")
    private String CIF_sleepers;

    @JsonProperty(value = "CIF_power_type")
    private String CIF_power_type;

    @JsonProperty(value = "CIF_timing_load")
    private String CIF_timing_load;

    @JsonProperty(value = "CIF_train_category")
    private String CIF_train_category;

    @JsonProperty(value = "CIF_catering_code")
    private String CIF_catering_code;

    @JsonProperty(value = "CIF_operating_characteristics")
    private String CIF_operating_characteristics;

    @JsonProperty(value = "atoc_code")
    private String atoc_code;

    @JsonProperty(value = "CIF_train_class")
    private String CIF_train_class;

    @JsonProperty(value = "CIF_headcode")
    private String CIF_headcode;

    @JsonProperty(value = "CIF_reservations")
    private String CIF_reservations;

    @JsonProperty(value = "CIF_connection_indicator")
    private String CIF_connection_indicator;

    @JsonProperty(value = "uic_code")
    private String uic_code;

    @JsonProperty(value = "CIF_traction_class")
    private String CIF_traction_class;

    @JsonProperty(value = "CIF_course_indicator")
    private String CIF_course_indicator;

    @JsonProperty(value = "CIF_speed")
    private String CIF_speed;

    @JsonProperty(value = "CIF_train_service_code")
    private String CIF_train_service_code;

    @JsonProperty(value = "CIF_service_branding")
    private String CIF_service_branding;

    @JsonProperty(value = "signalling_id")
    private String signalling_id;

    @JsonProperty(value = "schedule_location")
    @OneToMany(mappedBy = "scheduleSegment", cascade = CascadeType.ALL)
    private List<ScheduleLocation> scheduleLocation = new ArrayList<ScheduleLocation>();

}
