package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.NationalPPM Class will...
 * Created by James Millner on 28/11/2016 at 18:20.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "rtppm_nationalppm")
public class NationalPPM {

    @JsonProperty(value = "Total")
    @Column(name = "national_ppm_total")
    private String total;

    @JsonProperty(value = "OnTime")
    @Column(name = "national_ppm_onTime")
    private String onTime;

    @JsonProperty(value = "Late")
    @Column(name = "national_ppm_late")
    private String late;

    @JsonProperty(value = "CancelVeryLate")
    @Column(name = "national_ppm_cancelVeryLate")
    private String cancelVeryLate;

    @JsonProperty(value = "PPM")
    private PPM ppm;

    @JsonProperty(value = "RollingPPM")
    private RollingPPM rollingPPM;

}
