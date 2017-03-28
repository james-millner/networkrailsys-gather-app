package com.uoh.domain.vstp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * com.uoh.domain.vstp.ScheduleLocation Class will...
 * Created by James Millner on 05/12/2016 at 20:27.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "vstp_schedule_location")
public class ScheduleLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private ScheduleSegment scheduleSegment;

    public String scheduled_arrival_time;
    public String scheduled_departure_time;
    public String scheduled_pass_time;
    public String public_arrival_time;
    public String public_departure_time;
    public String CIF_platform;
    public String CIF_line;
    public String CIF_path;
    public String CIF_activity;
    public String CIF_engineering_allowance;
    public String CIF_pathing_allowance;
    public String CIF_performance_allowance;

    public Location location;
}
