package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.RTPPMDataMsgV1 Class will...
 * Created by James Millner on 28/11/2016 at 18:11.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_data_msg_v1")
public class RTPPMDataMsgV1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty
    private String timestamp;

    @JsonProperty(value = "Sender")
    private Sender sender;

    @JsonProperty
    private String classification;

    @JsonProperty(value = "Publication")
    private Publication publication;

    @JsonProperty
    private String owner;

    @JsonProperty
    private String schemaLocation;

    @JsonProperty(value = "RTPPMData")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private RTPPMData rtppmData;

}
