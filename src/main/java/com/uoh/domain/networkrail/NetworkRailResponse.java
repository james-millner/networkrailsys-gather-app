package com.uoh.domain.networkrail;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * com.uoh.domain.networkrail.NetworkRailResponse Class will...
 * Created by James Millner on 13/02/2017 at 17:47.
 */
@Entity
@Table(name = "networkrail_responses")
public class NetworkRailResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public enum FeedType {
        RTPPM("RTPPM_FEED"),
        TD("TD_FEED"),
        TrainMovement("TRAIN_MOVEMENT_FEED"),
        TSR("TSR_FEED"),
        VSTP("VSTP_FEED");

        private final String displayName;

        FeedType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return this.displayName;
        }
    }

    private FeedType feedType;

    @Type(type="text")
    private String rawJSON;

    private boolean processed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FeedType getFeedType() {
        return feedType;
    }

    public void setFeedType(FeedType feedType) {
        this.feedType = feedType;
    }

    public String getRawJSON() {
        return rawJSON;
    }

    public void setRawJSON(String rawJSON) {
        this.rawJSON = rawJSON;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
