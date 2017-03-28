package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.Sender Class will...
 * Created by James Millner on 28/11/2016 at 18:22.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "rtppm_sender")
public class Sender {

    @JsonProperty(value = "application")
    private String application;

    @JsonProperty(value = "organisation")
    private String organisation;

}
