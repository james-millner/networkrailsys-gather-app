package com.uoh.service.dao;

import com.uoh.domain.td.messagetype.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.uoh.service.dao.TDService Class holds methods to save all collections of TD messages.
 * <p>
 * Created by James Millner on 28/03/2017 at 11:45.
 */
@Service
public class TDService {

    @Autowired
    private CA_MSGRepository ca_msgRepository;

    @Autowired
    private CB_MSGRepository cb_msgRepository;

    @Autowired
    private CC_MSGRepository cc_msgRepository;

    @Autowired
    private CT_MSGRepository ct_msgRepository;

    @Autowired
    private SF_MSGRepository sf_msgRepository;

    @Autowired
    private SG_MSGRepository sg_msgRepository;

    @Autowired
    private SH_MSGRepository sh_msgRepository;

    public void saveAllCAMSG(List<CA_MSG> ca_msgs) {
        ca_msgRepository.save(ca_msgs);
    }

    public void saveAllCBMSG(List<CB_MSG> cb_msgs) {
        cb_msgRepository.save(cb_msgs);
    }

    public void saveAllCCMSG(List<CC_MSG> cc_msgs) {
        cc_msgRepository.save(cc_msgs);
    }

    public void saveAllCTMSG(List<CT_MSG> ct_msgs) {
        ct_msgRepository.save(ct_msgs);
    }

    public void saveAllSFMSG(List<SF_MSG> sf_msgs) {
        sf_msgRepository.save(sf_msgs);
    }

    public void saveAllSGMSG(List<SG_MSG> sg_msgs) {
        sg_msgRepository.save(sg_msgs);
    }

    public void saveAllSHMSG(List<SH_MSG> sh_msgs) {
        sh_msgRepository.save(sh_msgs);
    }
}

