package com.uoh.domain.trainmovements.body;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * com.uoh.domain.trainmovements.body.Body Class will handle the body of the response from Train Movement responses.
 * Created by James Millner on 05/12/2016 at 16:46.
 */
@Embeddable
@Getter
@Setter
public class Body
{
    private String event_type;

    private String gbtt_timestamp;

    private String planned_timestamp;

    private String original_loc_stanox;

    private String timetable_variation;

    private String current_train_id;

    private String original_loc_timestamp;

    private String next_report_run_time;

    private String delay_monitoring_point;

    private String actual_timestamp;

    private String reporting_stanox;

    private String correction_ind;

    private String event_source;

    private String train_file_address;

    private String platform;

    private String division_code;

    private String train_terminated;

    private String train_id;

    private String offroute_ind;

    private String variation_status;

    private String train_service_code;

    private String toc_id;

    private String loc_stanox;

    private String auto_expected;

    private String route;

    private String direction_ind;

    private String next_report_stanox;

    private String planned_event_type;

    private String line_ind;

    private String orig_loc_timestamp;

    private String orig_loc_stanox;

    private String canx_timestamp;

    private String canx_reason_code;

    private String dep_timestamp;

    private String canx_type;

    private String schedule_source;

    private String tp_origin_timestamp;

    private String schedule_type;

    private String creation_timestamp;

    private String origin_dep_timestamp;

    private String d1266_record_number;

    private String sched_origin_stanox;

    private String train_call_type;

    private String train_uid;

    private String train_call_mode;

    private String schedule_wtt_id;

    private String schedule_start_date;

    private String schedule_end_date;

    private String tp_origin_stanox;
}
