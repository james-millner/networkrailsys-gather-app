package com.uoh.domain.vstp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.vstp.Sender Class will...
 * Created by James Millner on 05/12/2016 at 20:52.
 */
@Getter
@Setter
@Data
@Table(name = "vstp_sender")
@Embeddable
public class Sender {

    private String application;

    private String component;

    private String organisation;
}
