package com.uoh.domain.tsr;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * com.uoh.domain.tsr.TSRBatchMsgV1 Class will...
 * Created by James Millner on 30/01/2017 at 16:43.
 */
@Entity
public class TSRBatchMsgV1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String timestamp;

    @JsonProperty(value = "Sender")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Sender sender;

    @JsonProperty(value = "TSRBatchMsg")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TSRBatchMsg tsrBatchMsg;

    private String systemEnvironmentCode;

    private String classification;

    @JsonProperty(value = "Publication")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Publication publication;

    private String owner;

    private String originMsgId;

    private String schemaLocation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public TSRBatchMsg getTsrBatchMsg() {
        return tsrBatchMsg;
    }

    public void setTsrBatchMsg(TSRBatchMsg tsrBatchMsg) {
        this.tsrBatchMsg = tsrBatchMsg;
    }

    public String getSystemEnvironmentCode() {
        return systemEnvironmentCode;
    }

    public void setSystemEnvironmentCode(String systemEnvironmentCode) {
        this.systemEnvironmentCode = systemEnvironmentCode;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOriginMsgId() {
        return originMsgId;
    }

    public void setOriginMsgId(String originMsgId) {
        this.originMsgId = originMsgId;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }
}
