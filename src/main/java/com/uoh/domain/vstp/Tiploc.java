package com.uoh.domain.vstp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.vstp.Tiploc Class will...
 * Created by James Millner on 05/12/2016 at 20:31.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "vstp_tiploc")
public class Tiploc {

    @JsonProperty(value = "tiploc_id")
    private String tiploc_id;

}
