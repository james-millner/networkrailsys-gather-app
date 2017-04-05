package com.uoh.service.dao;

import com.uoh.domain.rtppm.RTPPM;
import com.uoh.domain.rtppm.RTPPMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.uoh.service.dao.RTPPMService Class
 * <p>
 * Created by James Millner on 29/03/2017 at 15:24.
 */
@Service
public class RTPPMService {

    @Autowired
    public RTPPMRepository rtppmRepository;

    /**
     * Method to save a RTPPM response.
     * @param rtppm
     * @return
     */
    public RTPPM save(RTPPM rtppm) {
        return rtppmRepository.save(rtppm);
    }

    /**
     * Method to save a collection of RTPPM responses.
     * @param messages
     */
    public void saveAllRTPPM(List<RTPPM> messages) {
        rtppmRepository.save(messages);
    }

}