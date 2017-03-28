package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.rtppm.RTPPMData Class will...
 * Created by James Millner on 28/11/2016 at 18:12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_data")
public class RTPPMData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String snapshotTStamp;

    @JsonProperty(value = "SystemMsg")
    private String systemMsg;

    @JsonProperty(value = "RAGThresholds")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RAGThresholds> ragThresholds = new ArrayList<RAGThresholds>();

    @JsonProperty(value = "WebPPMLink")
    private String webPPMLink;

    @JsonProperty(value = "PPT")
    private PPT ppt;

    @JsonProperty(value = "NationalPage")
    private NationalPage nationalPage;

    @JsonProperty(value = "OOCPage")
    private OOCPage oocPage;

    @JsonProperty(value = "CommonOperatorPage")
    private CommonOperatorPage commonOperatorPage;

    @JsonProperty(value = "OperatorPage")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OperatorPage> operatorPages = new ArrayList<OperatorPage>();

    @OneToOne
    @JsonIgnore
    private RTPPMDataMsgV1 rtppmDataMsgV1;
}
