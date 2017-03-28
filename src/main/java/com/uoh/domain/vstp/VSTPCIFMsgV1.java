package com.uoh.domain.vstp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * com.uoh.domain.vstp.VSTPCIFMsgV1 Class will...
 * Created by James Millner on 05/12/2016 at 20:53.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "vstp_vstp_cif_msgv1")
public class VSTPCIFMsgV1 {

    @JsonProperty(value = "schemaLocation")
    public String schemaLocation;

    @JsonProperty(value = "classification")
    public String classification;

    @JsonProperty(value = "timestamp")
    public String timestamp;

    @JsonProperty(value = "owner")
    public String owner;

    @JsonProperty(value = "originMsgId")
    public String originMsgId;

    @JsonProperty(value = "Sender")
    public Sender sender;

    @JsonProperty(value = "schedule")
    public Schedule schedule;

}
