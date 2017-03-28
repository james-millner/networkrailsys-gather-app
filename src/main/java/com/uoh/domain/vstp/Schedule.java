package com.uoh.domain.vstp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.vstp.Schedule Class will...
 * Created by James Millner on 05/12/2016 at 20:51.
 */
@Getter
@Setter
@Data
@Table(name = "vstp_schedule")
@Embeddable
public class Schedule {

    @JsonProperty(value = "schedule_id")
    @Column(name = "response_schedule_id")
    private String schedule_id;

    @JsonProperty(value = "CIF_train_uid")
    private String CIF_train_uid;

    @JsonProperty(value = "applicable_timetable")
    private String applicable_timetable;

    @JsonProperty(value = "transaction_type")
    private String transaction_type;

    @JsonProperty(value = "schedule_end_date")
    private String schedule_end_date;

    @JsonProperty(value = "schedule_days_runs")
    private String schedule_days_runs;

    @JsonProperty(value = "CIF_bank_holiday_running")
    private String CIF_bank_holiday_running;

    @JsonProperty(value = "schedule_start_date")
    private String schedule_start_date;

    @JsonProperty(value = "train_status")
    private String train_status;

    @JsonProperty(value = "CIF_stp_indicator")
    private String CIF_stp_indicator;

    @JsonProperty(value = "schedule_segment")
    @OneToMany(mappedBy = "vstpMsg", cascade = CascadeType.ALL)
    private List<ScheduleSegment> schedule_segment = new ArrayList<ScheduleSegment>();
}
