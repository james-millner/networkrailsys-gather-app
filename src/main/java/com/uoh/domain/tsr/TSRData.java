package com.uoh.domain.tsr;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * com.uoh.domain.tsr.TSRData Class will...
 * Created by James Millner on 30/01/2017 at 17:15.
 */
@Entity
public class TSRData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(value = "TSRBatchMsgV1")
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private TSRBatchMsgV1 tsrBatchMsgV1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TSRBatchMsgV1 getTsrBatchMsgV1() {
        return tsrBatchMsgV1;
    }

    public void setTsrBatchMsgV1(TSRBatchMsgV1 tsrBatchMsgV1) {
        this.tsrBatchMsgV1 = tsrBatchMsgV1;
    }
}
