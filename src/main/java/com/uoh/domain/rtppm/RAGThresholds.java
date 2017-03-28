package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.RAGThresholds Class will...
 * Created by James Millner on 28/11/2016 at 18:21.
 */
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_rag_thresholds")
public class RAGThresholds {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty
    private String good;

    @JsonProperty
    private String type;

    @JsonProperty
    private String medium;

    @ManyToOne
    @JsonIgnore
    private RTPPMData rtppmData;


}
