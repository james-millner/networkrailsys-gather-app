package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.RTPPM Class will handle the responses from Network Rail from the RTPPM Feed.
 * Created by James Millner on 28/11/2016 at 18:11.
 */
@Entity
@Table(name = "rtppm")
public class RTPPM {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(value = "RTPPMDataMsgV1")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private RTPPMDataMsgV1 rtppmDataMsgV1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RTPPMDataMsgV1 getRtppmDataMsgV1() {
        return rtppmDataMsgV1;
    }

    public void setRtppmDataMsgV1(RTPPMDataMsgV1 rtppmDataMsgV1) {
        this.rtppmDataMsgV1 = rtppmDataMsgV1;
    }
}
