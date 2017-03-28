package com.uoh.domain.td;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * com.uoh.domain.td.AbstractCMessageType Class will...
 * Created by James Millner on 08/10/2016 at 23:32.
 */
@EntityListeners({AuditingEntityListener.class})
@MappedSuperclass
@Data public abstract class AbstractSMessageType {

    @Column(length=255)
    public String address;

    @Column(length=255)
    public String data;

    @Column(length=255)
    public String msg_type;

    @Column(length=255)
    public String time;

    @Column(length=255)
    public String area_id;

    @CreatedDate
    private Date created_on;

}
