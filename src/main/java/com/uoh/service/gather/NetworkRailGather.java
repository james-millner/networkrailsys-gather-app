package com.uoh.service.gather;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uoh.config.SchedulerConfig;
import com.uoh.domain.dto.TD;
import com.uoh.domain.dto.TrainMovement;
import com.uoh.domain.dto.VSTP;
import com.uoh.domain.rtppm.RTPPM;
import com.uoh.domain.tsr.TSRData;
import com.uoh.service.AbstractNetworkRailGather;
import com.uoh.service.dao.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * com.uoh.service.gather.NetworkRailGather Class
 * <p>
 * Created by James Millner on 28/03/2017 at 11:15.
 */
@Service
public class NetworkRailGather extends AbstractNetworkRailGather {

    private Log logger = LogFactory.getLog(this.getClass());

    private static final String prefix = "/api";

    @Autowired
    private TDService tdService;

    @Autowired
    private TrainMovementService trainMovementService;

    @Autowired
    private RTPPMService rtppmService;

    @Autowired
    private VSTPService vstpService;

    @Autowired
    private TSRService tsrService;

    /**
     * Method to call the TD api every five seconds to pull the high volume of TD messages.
     */
    @Scheduled(fixedDelay = SchedulerConfig.FIVE_SECONDS)
    public void getTDResponses() {
        logger.info("Getting TD message response.");

        ResponseEntity<String> responseEntity = null;

        try {
            responseEntity = getFeed(prefix + "/td");
        } catch (Exception e) {
            logger.fatal(e);
        }

        //Check if a valid response was found.
        if(responseEntity != null)
        {
            //Store TD data.
            logger.info(responseEntity.getBody());
            ObjectMapper mapper = new ObjectMapper();
            try {
                TD tdResponse = mapper.readValue(responseEntity.getBody(), TD.class);

                tdService.saveAllCAMSG(tdResponse.getCa_msgs());
                tdService.saveAllCBMSG(tdResponse.getCb_msgs());
                tdService.saveAllCCMSG(tdResponse.getCc_msgs());
                tdService.saveAllCTMSG(tdResponse.getCt_msgs());
                tdService.saveAllSFMSG(tdResponse.getSf_msgs());
                tdService.saveAllSHMSG(tdResponse.getSh_msgs());
                tdService.saveAllSGMSG(tdResponse.getSg_msgs());

            } catch (Exception e){
                logger.fatal(e);
            }
        }
    }

    /**
     * Method to call the Train Movement api every ten seconds to pull the high volume of Train Movement messages.
     */
    @Scheduled(fixedDelay = SchedulerConfig.TEN_SECONDS, initialDelay = SchedulerConfig.TEN_SECONDS)
    public void getTrainMovementResponses() {
        logger.info("Getting Train Movement message response.");

        ResponseEntity<String> responseEntity = null;

        try {
            responseEntity = getFeed(prefix + "/train-movement");
        } catch (Exception e) {
            logger.fatal(e);
        }

        //Check if a valid response was found.
        if(responseEntity != null)
        {
            //Store TD data.
            logger.info(responseEntity.getBody());
            ObjectMapper mapper = new ObjectMapper();
            try {
                TrainMovement response = mapper.readValue(responseEntity.getBody(), TrainMovement.class);

                trainMovementService.saveAllTrainMovement(response.getMovements());
            } catch (Exception e){
                logger.fatal(e);
            }
        }
    }

    /**
     * Method to call the RTPPM api every hour to pull the RTPPM messages, one per minute.
     */
    @Scheduled(fixedDelay = SchedulerConfig.ONE_HOUR, initialDelay = SchedulerConfig.FIFTEEN_SECONDS)
    public void getRTPPMResponses() {
        logger.info("Getting RTPPM messages response.");

        ResponseEntity<String> responseEntity = null;

        try {
            responseEntity = getFeed(prefix + "/rtppm");
        } catch (Exception e) {
            logger.fatal(e);
        }

        //Check if a valid response was found.
        if(responseEntity != null)
        {
            //Store TD data.
            logger.info(responseEntity.getBody());
            ObjectMapper mapper = new ObjectMapper();
            try {
                JsonNode rtppmtree = new ObjectMapper().readTree(responseEntity.getBody());
                for(JsonNode n : rtppmtree) {
                    RTPPM rtppm = mapper.readValue(n.toString(), RTPPM.class);
                    rtppmService.save(rtppm);
                }
            } catch (Exception e) {
                logger.fatal(e);
            }
        }
    }


    /**
     * Method to call the VSTP api every hour to pull the VSTP messages, low volume.
     */
    @Scheduled(fixedDelay = SchedulerConfig.ONE_HOUR)
    public void getVSTPResponses() {
        logger.info("Getting VSTP messages response.");

        ResponseEntity<String> responseEntity = null;

        try {
            responseEntity = getFeed(prefix + "/vstp");
        } catch (Exception e) {
            logger.fatal(e);
        }

        //Check if a valid response was found.
        if(responseEntity != null)
        {
            //Store TD data.
            logger.info(responseEntity.getBody());
            try {
                VSTP vstp = new ObjectMapper().readValue(responseEntity.getBody(), VSTP.class);
                vstpService.save(vstp.getVstpMsgs());
            } catch (Exception e) {
                logger.fatal(e);
            }
        }
    }

    /**
     * Method to call the TSR api every friday at 7pm to pull the TSR messages, very low volume.
     */
    @Scheduled(cron = "0 0 19 ? * FRI")
    public void getTSRResponses() {
        logger.info("Getting TSR messages response.");

        ResponseEntity<String> responseEntity = null;

        try {
            responseEntity = getFeed(prefix + "/tsr");
        } catch (Exception e) {
            logger.fatal(e);
        }

        //Check if a valid response was found.
        if(responseEntity != null)
        {
            //Store TD data.
            logger.info(responseEntity.getBody());
            ObjectMapper mapper = new ObjectMapper();
            try {
                JsonNode rtppmtree = new ObjectMapper().readTree(responseEntity.getBody());
                for(JsonNode n : rtppmtree) {
                    TSRData tsrData = mapper.readValue(n.toString(), TSRData.class);
                    tsrService.saveTSR(tsrData);
                }
            } catch (Exception e) {
                logger.fatal(e);
            }
        }
    }
}
