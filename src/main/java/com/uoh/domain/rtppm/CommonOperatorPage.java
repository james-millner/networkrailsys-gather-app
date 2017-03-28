package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.CommonOperatorPage Class will...
 * Created by James Millner on 28/11/2016 at 18:16.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "rtppm_common_operator_page")
public class CommonOperatorPage {

    @JsonProperty(value = "WebDisplayPeriod")
    @Column(name = "common_operator_page_webDisplayPeriod")
    private String webDisplayPeriod;

    @JsonProperty(value = "WebFixedMsg1")
    @Column(name = "common_operator_page_webFixedMsg1")
    private String webFixedMsg1;

    @JsonProperty(value = "WebFixedMsg2")
    @Column(name = "common_operator_page_webFixedMsg2")
    private String webFixedMsg2;

}

