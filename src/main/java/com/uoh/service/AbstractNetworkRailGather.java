package com.uoh.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * com.uoh.service.AbstractNetworkRailGather Class
 * <p>
 * Created by James Millner on 28/03/2017 at 10:43.
 */
@Service
public class AbstractNetworkRailGather {

    private Log logger = LogFactory.getLog(this.getClass());

    @Value("${api.location}")
    public String API_URL;

    protected RestTemplate restTemplate = new RestTemplate();

    /**
     * Method to take a parameter of a requested endpoint and returns the appropriate response.
     *
     * @param endpoint
     * @return
     * @throws Exception
     */
    public ResponseEntity<String> getFeed(String endpoint) throws Exception {
        String url = String.format("%s/%s", API_URL, endpoint);
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> request = new HttpEntity<>(headers);
        return restTemplate.exchange(url, HttpMethod.GET, request, String.class);
    }
}
