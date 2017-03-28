package com.uoh.domain.trainmovements.header;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * com.uoh.domain.trainmovements.header.Header Class will handle the header of the TrainMovement response
 * Created by James Millner on 05/12/2016 at 16:47.
 */
@Embeddable
public class Header
{
    private String msg_type;

    private String source_dev_id;

    private String original_data_source;

    private String user_id;

    private String msg_queue_timestamp;

    private String source_system_id;

    public String getMsg_type ()
    {
        return msg_type;
    }

    public void setMsg_type (String msg_type)
    {
        this.msg_type = msg_type;
    }

    public String getSource_dev_id ()
    {
        return source_dev_id;
    }

    public void setSource_dev_id (String source_dev_id)
    {
        this.source_dev_id = source_dev_id;
    }

    public String getOriginal_data_source ()
    {
        return original_data_source;
    }

    public void setOriginal_data_source (String original_data_source)
    {
        this.original_data_source = original_data_source;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getMsg_queue_timestamp ()
    {
        return msg_queue_timestamp;
    }

    public void setMsg_queue_timestamp (String msg_queue_timestamp)
    {
        this.msg_queue_timestamp = msg_queue_timestamp;
    }

    public String getSource_system_id ()
    {
        return source_system_id;
    }

    public void setSource_system_id (String source_system_id)
    {
        this.source_system_id = source_system_id;
    }
}

