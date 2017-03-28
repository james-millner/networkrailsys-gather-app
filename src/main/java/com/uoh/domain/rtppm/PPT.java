package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.smartcardio.ATR;

/**
 * com.uoh.domain.rtppm.PPT Class will...
 * Created by James Millner on 28/11/2016 at 18:20.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "rtppm_ppt")
public class PPT {

    @JsonProperty
    @Column(name = "rolling_ppt_text")
    private String text;

    @JsonProperty
    @Column(name = "rolling_ppt_rag_display_flag")
    private String ragDisplayFlag;

    @JsonProperty
    @Column(name = "rolling_ppt_rag")
    private String rag;

}
