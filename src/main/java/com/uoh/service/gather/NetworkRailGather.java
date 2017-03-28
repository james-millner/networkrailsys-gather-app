package com.uoh.service.gather;

import com.uoh.config.SchedulerConfig;
import com.uoh.service.AbstractNetworkRailGather;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * com.uoh.service.gather.TD Class
 * <p>
 * Created by James Millner on 28/03/2017 at 11:15.
 */
@Service
public class NetworkRailGather extends AbstractNetworkRailGather {

    private Log logger = LogFactory.getLog(this.getClass());

    private static final String prefix = "/api";


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
        }
    }

    /**
     * Method to call the Train Movement api every ten seconds to pull the high volume of Train Movement messages.
     */
    @Scheduled(fixedDelay = SchedulerConfig.TEN_SECONDS)
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
        }
    }

    /**
     * Method to call the RTPPM api every day to pull the RTPPM messages, one per minute.
     */
    @Scheduled(fixedDelay = SchedulerConfig.ONE_DAY)
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
        }
    }


    /**
     * Method to call the VSTP api every day to pull the VSTP messages, low volume.
     */
    @Scheduled(fixedDelay = SchedulerConfig.ONE_DAY)
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
        }
    }
}
