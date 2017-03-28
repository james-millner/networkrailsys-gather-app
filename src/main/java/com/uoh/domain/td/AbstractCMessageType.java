package com.uoh.domain.td;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
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
@Data public abstract class AbstractCMessageType {

    @Column(length=255)
    @Setter(AccessLevel.PACKAGE)
    public String time;

    @Column(length=255)
    @Setter(AccessLevel.PACKAGE)
    public String area_id;

    @Column(length=255)
    @Setter(AccessLevel.PACKAGE)
    public String msg_type;

    @Column(name = "dest_from", length=255)
    @Setter(AccessLevel.PACKAGE)
    public String from;

    @Column(name = "dest_to", length=255)
    @Setter(AccessLevel.PACKAGE)
    public String to;

    @Column(length=255)
    @Setter(AccessLevel.PACKAGE)
    public String descr;

    @Column(length=255)
    @Setter(AccessLevel.PACKAGE)
    public String report_time;

    @CreatedDate
    @Getter(AccessLevel.PACKAGE)
    private Date created_on;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getReport_time() {
        return report_time;
    }

    public void setReport_time(String report_time) {
        this.report_time = report_time;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
