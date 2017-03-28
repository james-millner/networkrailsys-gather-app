package com.uoh.domain.tsr;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * com.uoh.domain.tsr.TSR Class will...
 * Created by James Millner on 30/01/2017 at 16:45.
 */
@Entity
public class TSR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty(value = "MileageFrom")
    private String mileageFrom;

    @JsonProperty(value = "RouteCode")
    private String routeCode;

    @JsonProperty(value = "RouteGroupName")
    private String routeGroupName;

    @JsonProperty(value = "Direction")
    private String direction;

    @JsonProperty(value = "RouteOrder")
    private String routeOrder;

    @JsonProperty(value = "TSRID")
    private String tsrID;

    @JsonProperty(value = "SubunitFrom")
    private String subunitFrom;

    @JsonProperty(value = "SubunitTo")
    private String subunitTo;

    @JsonProperty(value = "FreightSpeed")
    private String freightSpeed;

    @JsonProperty(value = "ToLocation")
    private String toLocation;

    @JsonProperty(value = "FromLocation")
    private String fromLocation;

    @JsonProperty(value = "MileageTo")
    private String mileageTo;

    @JsonProperty(value = "MovingMileage")
    private String movingMileage;

    @JsonProperty(value = "ValidToDate")
    private String validToDate;

    @JsonProperty(value = "publishDate")
    private String publishDate;

    @JsonProperty(value = "Reason")
    private String reason;

    @JsonProperty(value = "Comments")
    private String comments;

    @JsonProperty(value = "LineName")
    private String lineName;

    @JsonProperty(value = "TSRReference")
    private String tsrReference;

    @JsonProperty(value = "publishEvent")
    private String publishEvent;

    @JsonProperty(value = "Requestor")
    private String requestor;

    @JsonProperty(value = "creationDate")
    private String creationDate;

    @JsonProperty(value = "PassengerSpeed")
    private String passengerSpeed;

    @JsonProperty(value = "ValidFromDate")
    private String validFromDate;

    @JsonProperty(value = "SubunitType")
    private String subunitType;

    @ManyToOne
    private TSRBatchMsg tsrBatchMsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMileageFrom() {
        return mileageFrom;
    }

    public void setMileageFrom(String mileageFrom) {
        this.mileageFrom = mileageFrom;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getRouteGroupName() {
        return routeGroupName;
    }

    public void setRouteGroupName(String routeGroupName) {
        this.routeGroupName = routeGroupName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getRouteOrder() {
        return routeOrder;
    }

    public void setRouteOrder(String routeOrder) {
        this.routeOrder = routeOrder;
    }

    public String getTsrID() {
        return tsrID;
    }

    public void setTsrID(String tsrID) {
        this.tsrID = tsrID;
    }

    public String getSubunitFrom() {
        return subunitFrom;
    }

    public void setSubunitFrom(String subunitFrom) {
        this.subunitFrom = subunitFrom;
    }

    public String getSubunitTo() {
        return subunitTo;
    }

    public void setSubunitTo(String subunitTo) {
        this.subunitTo = subunitTo;
    }

    public String getFreightSpeed() {
        return freightSpeed;
    }

    public void setFreightSpeed(String freightSpeed) {
        this.freightSpeed = freightSpeed;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getMileageTo() {
        return mileageTo;
    }

    public void setMileageTo(String mileageTo) {
        this.mileageTo = mileageTo;
    }

    public String getMovingMileage() {
        return movingMileage;
    }

    public void setMovingMileage(String movingMileage) {
        this.movingMileage = movingMileage;
    }

    public String getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getTsrReference() {
        return tsrReference;
    }

    public void setTsrReference(String tsrReference) {
        this.tsrReference = tsrReference;
    }

    public String getPublishEvent() {
        return publishEvent;
    }

    public void setPublishEvent(String publishEvent) {
        this.publishEvent = publishEvent;
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getPassengerSpeed() {
        return passengerSpeed;
    }

    public void setPassengerSpeed(String passengerSpeed) {
        this.passengerSpeed = passengerSpeed;
    }

    public String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }

    public String getSubunitType() {
        return subunitType;
    }

    public void setSubunitType(String subunitType) {
        this.subunitType = subunitType;
    }

    public TSRBatchMsg getTsrBatchMsg() {
        return tsrBatchMsg;
    }

    public void setTsrBatchMsg(TSRBatchMsg tsrBatchMsg) {
        this.tsrBatchMsg = tsrBatchMsg;
    }
}
