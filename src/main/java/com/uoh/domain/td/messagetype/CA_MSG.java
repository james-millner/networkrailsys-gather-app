package com.uoh.domain.td.messagetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uoh.domain.td.AbstractCMessageType;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;

/**
 * com.uoh.domain.td.messagetype.CA_MSG Class will...
 * Created by James Millner on 08/10/2016 at 23:37.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "td_ca_msg")
@Data public class CA_MSG extends AbstractCMessageType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.PACKAGE) private Long id;
}
