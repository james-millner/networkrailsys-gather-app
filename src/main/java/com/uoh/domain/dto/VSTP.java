package com.uoh.domain.dto;

import com.uoh.domain.vstp.VSTPMsg;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * com.uoh.domain.dto.VSTP Class
 * <p>
 * Created by James Millner on 14/03/2017 at 22:02.
 */
@Setter
@Getter
@Data
public class VSTP {

    List<VSTPMsg> vstpMsgs = new ArrayList<VSTPMsg>();
}
