package com.uoh.domain.td.messagetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uoh.domain.td.AbstractSMessageType;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;

/**
 * com.uoh.domain.td.messagetype.SH_MSG Class will...
 * Created by James Millner on 08/10/2016 at 23:40.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "td_sh_msg")
@Data public class SH_MSG extends AbstractSMessageType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.PACKAGE) private Long id;

}
