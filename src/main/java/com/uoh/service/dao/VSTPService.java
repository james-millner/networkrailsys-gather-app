package com.uoh.service.dao;

import com.uoh.domain.vstp.VSTPMsg;
import com.uoh.domain.vstp.VSTPMsgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.uoh.service.dao.VSTPService Class
 * <p>
 * Created by James Millner on 29/03/2017 at 22:57.
 */
@Service
public class VSTPService {

    @Autowired
    protected VSTPMsgRepository vstpMsgRepository;

    public void save(List<VSTPMsg> vstpMsgList) {
        vstpMsgRepository.save(vstpMsgList);
    }
}
