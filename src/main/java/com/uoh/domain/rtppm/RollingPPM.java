package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.RollingPPM Class will
 *
 * Created by James Millner on 28/11/2016 at 18:15.
 */
@Embeddable
@Getter
@Setter
@Data
public class RollingPPM {

    @JsonProperty
    @Column(name = "rolling_ppm_trend_id")
    private String trendInd;

    @JsonProperty
    @Column(name = "rolling_ppm_rag")
    private String rag;

    @JsonProperty
    @Column(name = "rolling_ppm_text")
    private String text;

    @JsonProperty
    @Column(name = "rolling_ppm_displayflag")
    private String displayFlag;


}
