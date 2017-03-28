package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.Operator Class will...
 * Created by James Millner on 28/11/2016 at 18:14.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_operator")
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty
    private String code;

    @JsonProperty
    private String keySymbol;

    @JsonProperty
    private String name;

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

    @ManyToOne
    @JsonIgnore
    private RTPPMData rtppmData;

    @ManyToOne
    @JsonIgnore
    private OperatorPage operatorPage;

}
