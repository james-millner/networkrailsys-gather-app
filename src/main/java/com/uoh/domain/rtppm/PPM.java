package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.PPM Class will...
 * Created by James Millner on 28/11/2016 at 18:19.
 */
@Embeddable
@Getter
@Setter
@Data
public class PPM {

    @JsonProperty
    @Column(name = "ppm_text")
    private String text;

    @JsonProperty
    @Column(name = "ppm_rag_display_flag")
    private String ragDisplayFlag;

    @JsonProperty
    @Column(name = "ppm_rag")
    private String rag;

}
