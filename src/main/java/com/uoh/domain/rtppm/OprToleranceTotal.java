package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.OprToleranceTotal Class will...
 * Created by James Millner on 28/11/2016 at 18:13.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_opr_tolerance_total")
public class OprToleranceTotal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty
    private String timeband;

    @JsonProperty(value = "Total")
    private String total;

    @JsonProperty(value = "OnTime")
    private String onTime;

    @JsonProperty(value = "Late")
    private String late;

    @JsonProperty(value = "CancelVeryLate")
    private String cancelVeryLate;

    @ManyToOne
    @JsonIgnore
    private OperatorPage operatorPage;

}
