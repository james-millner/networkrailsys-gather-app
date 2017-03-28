package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.rtppm.OOCPage Class will...
 * Created by James Millner on 28/11/2016 at 18:17.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "rtppm_ooc_page")
public class OOCPage {

    @JsonProperty(value = "WebDisplayPeriod")
    @Column(name = "occ_page_webdisplayperiod")
    private String webDisplayPeriod;

    @JsonProperty(value = "WebFixedMsg1")
    @Column(name = "occ_page_webfixedmsg1")
    private String webFixedMsg1;

    @JsonProperty(value = "WebFixedMsg2")
    @Column(name = "occ_page_webfixedmsg2")
    private String webFixedMsg2;

    @JsonProperty(value = "Operator")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Operator> operators = new ArrayList<Operator>();

}
