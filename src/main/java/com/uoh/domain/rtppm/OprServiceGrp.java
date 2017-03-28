package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.OprServiceGrp Class will...
 * Created by James Millner on 28/11/2016 at 18:15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_opr_service_grp")
public class OprServiceGrp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty
    private String CancelVeryLate;

    @JsonProperty
    private String Late;

    @JsonProperty
    private PPM PPM;

    @JsonProperty
    private String name;

    @JsonProperty
    private String timeband;

    @JsonProperty
    private RollingPPM RollingPPM;

    @JsonProperty
    private String OnTime;

    @JsonProperty
    private String sectorCode;

    @JsonProperty
    private String Total;

    @ManyToOne
    @JsonIgnore
    private OperatorPage operatorPage;
}
