package com.uoh.domain.trainmovements;

import com.uoh.domain.trainmovements.body.Body;
import com.uoh.domain.trainmovements.header.Header;

import javax.persistence.*;

/**
 * com.uoh.domain.trainmovements.TrainMovement Class will...
 * Created by James Millner on 05/12/2016 at 16:49.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "train_movement")
public class TrainMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Body body;

    private Header header;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Body getBody ()
    {
        return body;
    }

    public void setBody (Body body)
    {
        this.body = body;
    }

    public Header getHeader ()
    {
        return header;
    }

    public void setHeader (Header header)
    {
        this.header = header;
    }
}
