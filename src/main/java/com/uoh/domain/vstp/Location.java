package com.uoh.domain.vstp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.vstp.Location Class will...
 * Created by James Millner on 05/12/2016 at 20:30.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "vstp_location")
public class Location {

    @JsonProperty(value = "tiploc")
    public Tiploc tiploc;

}
