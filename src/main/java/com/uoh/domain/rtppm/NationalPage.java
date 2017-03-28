package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.rtppm.NationalPage Class will...
 * Created by James Millner on 28/11/2016 at 18:18.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "rtppm_national_page")
public class NationalPage {

    @JsonProperty(value = "WebDisplayPeriod")
    @Column(name = "national_page_webDisplayPeriod")
    private String webDisplayPeriod;

    @JsonProperty(value = "WebFixedMsg1")
    @Column(name = "national_page_webFixedMsg1")
    private String webFixedMsg1;

    @JsonProperty(value = "WebFixedMsg2")
    @Column(name = "national_page_webFixedMsg2")
    private String webFixedMsg2;

    @JsonProperty(value = "WebMsgOfMoment")
    @Column(name = "national_page_webMsgOfMoment")
    private String webMsgOfMoment;

    @JsonProperty(value = "StaleFlag")
    @Column(name = "national_page_staleFlag")
    private String staleFlag;

    @JsonProperty(value = "NationalPPM")
    private NationalPPM nationalPPM;

    @JsonProperty(value = "Sector")
    @OneToMany(mappedBy = "rtppmData", cascade = CascadeType.ALL)
    private List<Sector> sectors = new ArrayList<Sector>();

    @JsonProperty(value = "Operator")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Operator> operators = new ArrayList<Operator>();

}
