package com.uoh.domain.td.messagetype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.uoh.domain.td.AbstractCMessageType;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;

/**
 * com.uoh.domain.td.messagetype.CC_MSG Class will...
 * Created by James Millner on 08/10/2016 at 23:39.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "td_cc_msg")
@Data public class CC_MSG extends AbstractCMessageType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.PACKAGE) private Long id;
}
