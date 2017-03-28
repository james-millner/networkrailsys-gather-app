package com.uoh.domain.tsr;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.tsr.TSRBatchMsg Class will...
 * Created by James Millner on 30/01/2017 at 16:44.
 */
@Entity
public class TSRBatchMsg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "tsrBatchMsg", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TSR> tsr = new ArrayList<TSR>();

    @JsonProperty(value = "WONEndDate")
    private String WONEndDate;

    @JsonProperty(value = "WONStartDate")
    private String WONStartDate;

    @JsonProperty(value = "publishSource")
    private String publishSource;

    @JsonProperty(value = "batchPublishEvent")
    private String batchPublishEvent;

    @JsonProperty(value = "routeGroupCoverage")
    private String routeGroupCoverage;

    @JsonProperty(value = "publishDate")
    private String publishDate;

    @JsonProperty(value = "routeGroupCode")
    private String routeGroupCode;

    @JsonProperty(value = "routeGroup")
    private String routeGroup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TSR> getTsr() {
        return tsr;
    }

    public void setTsr(List<TSR> tsr) {
        this.tsr = tsr;
    }

    public String getWONEndDate() {
        return WONEndDate;
    }

    public void setWONEndDate(String WONEndDate) {
        this.WONEndDate = WONEndDate;
    }

    public String getWONStartDate() {
        return WONStartDate;
    }

    public void setWONStartDate(String WONStartDate) {
        this.WONStartDate = WONStartDate;
    }

    public String getPublishSource() {
        return publishSource;
    }

    public void setPublishSource(String publishSource) {
        this.publishSource = publishSource;
    }

    public String getBatchPublishEvent() {
        return batchPublishEvent;
    }

    public void setBatchPublishEvent(String batchPublishEvent) {
        this.batchPublishEvent = batchPublishEvent;
    }

    public String getRouteGroupCoverage() {
        return routeGroupCoverage;
    }

    public void setRouteGroupCoverage(String routeGroupCoverage) {
        this.routeGroupCoverage = routeGroupCoverage;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getRouteGroupCode() {
        return routeGroupCode;
    }

    public void setRouteGroupCode(String routeGroupCode) {
        this.routeGroupCode = routeGroupCode;
    }

    public String getRouteGroup() {
        return routeGroup;
    }

    public void setRouteGroup(String routeGroup) {
        this.routeGroup = routeGroup;
    }
}
