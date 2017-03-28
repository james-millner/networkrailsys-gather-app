package com.uoh.domain.vstp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;

/**
 * com.uoh.domain.vstp.VSTPMsg Class will...
 * Created by James Millner on 05/12/2016 at 21:20.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "vstp_message")
public class VSTPMsg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(value = "VSTPCIFMsgV1")
    public VSTPCIFMsgV1 vstpcifMsgV1;

}
