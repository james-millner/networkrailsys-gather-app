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
 * com.uoh.domain.rtppm.OperatorPage Class will...
 * Created by James Millner on 28/11/2016 at 18:13.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Getter
@Setter
@Data
@Table(name = "rtppm_operator_page")
public class OperatorPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonIgnore
    private RTPPMData rtppmData;

    @JsonProperty(value = "Operator")
    @OneToOne(cascade = CascadeType.ALL)
    private Operator operator;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OprToleranceTotal> oprToleranceTotal = new ArrayList<OprToleranceTotal>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OprServiceGrp> oprServiceGrps = new ArrayList<OprServiceGrp>();
}
