package com.uoh.service.dao;

import com.uoh.domain.tsr.TSRData;
import com.uoh.domain.tsr.TSRDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.uoh.service.dao.TSRService Class
 * <p>
 * Created by James Millner on 30/03/2017 at 20:08.
 */
@Service
public class TSRService {

    @Autowired
    private TSRDataRepository tsrDataRepository;

    public TSRData saveTSR(TSRData data) {
        return tsrDataRepository.save(data);
    }

}
