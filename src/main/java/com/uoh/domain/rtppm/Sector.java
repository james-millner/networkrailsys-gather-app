package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.Sector Class will...
 * Created by James Millner on 28/11/2016 at 18:19.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_sector")
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty
    private String sectorDesc;

    @JsonProperty
    private String sectorCode;

    @JsonProperty(value = "SectorPPM")
    @OneToOne(cascade = CascadeType.ALL)
    private SectorPPM sectorPPM;

    @ManyToOne
    @JsonIgnore
    private RTPPMData rtppmData;
}
