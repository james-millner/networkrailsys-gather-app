package com.uoh.service.dao;

import com.uoh.domain.trainmovements.TrainMovement;
import com.uoh.domain.trainmovements.TrainMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.uoh.service.dao.TrainMovementService Class
 * <p>
 * Created by James Millner on 28/03/2017 at 11:53.
 */
@Service
public class TrainMovementService {

    @Autowired
    private TrainMovementRepository trainMovementRepository;

    /**
     * Method to save a collection of TrainMovement messages.
     * @param movements
     */
    public void saveAllTrainMovement(List<TrainMovement> movements) {
        trainMovementRepository.save(movements);
    }
}
