package com.uoh.domain.dto;

import com.uoh.domain.td.messagetype.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.dto.TD Class
 * <p>
 * Created by James Millner on 09/03/2017 at 14:46.
 */
@Getter
@Setter
@Data public class TD {

    List<CA_MSG> ca_msgs = new ArrayList<>();
    List<CB_MSG> cb_msgs = new ArrayList<>();
    List<CC_MSG> cc_msgs = new ArrayList<>();
    List<CT_MSG> ct_msgs = new ArrayList<>();
    List<SH_MSG> sh_msgs = new ArrayList<>();
    List<SG_MSG> sg_msgs = new ArrayList<>();
    List<SF_MSG> sf_msgs = new ArrayList<>();
}
