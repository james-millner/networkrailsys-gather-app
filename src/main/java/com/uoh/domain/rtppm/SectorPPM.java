package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.SectorPPM Class will...
 * Created by James Millner on 28/11/2016 at 18:19.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_sector_ppm")
public class SectorPPM {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(value = "Total")
    private String total;

    @JsonProperty(value = "OnTime")
    private String onTime;

    @JsonProperty(value = "Late")
    private String late;

    @JsonProperty(value = "CancelVeryLate")
    private String cancelVeryLate;

    @JsonProperty(value = "PPM")
    private PPM ppm;

    @JsonProperty(value = "RollingPPM")
    private RollingPPM rollingPPM;

}
