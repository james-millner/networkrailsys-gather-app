package com.uoh.domain.rtppm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * com.uoh.domain.rtppm.Publication Class will...
 * Created by James Millner on 28/11/2016 at 18:21.
 */
@Embeddable
@Getter
@Setter
@Data
@Table(name = "rtppm_publication")
public class Publication {

    @JsonProperty(value = "TopicID")
    private String topicId;
}
