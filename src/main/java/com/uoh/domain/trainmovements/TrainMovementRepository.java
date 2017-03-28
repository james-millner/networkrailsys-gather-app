package com.uoh.domain.trainmovements;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * com.uoh.domain.trainmovements.TrainMovementRepository Class will handle data from the database in relation to Train Movement data.
 *
 * Created by James Millner on 05/12/2016 at 17:44.
 */
public interface TrainMovementRepository extends JpaRepository<TrainMovement, Long> {

    List<TrainMovement> findByIdLessThanEqual(Long id);

    @Query("SELECT MIN(i.id) FROM TrainMovement i")
    Long getMinID();

    @Query("SELECT i FROM TrainMovement i WHERE i.body.event_source = :source")
    List<TrainMovement> findAllBySource(@Param("source") String source);

    @Query("SELECT i FROM TrainMovement i WHERE i.body.event_type = :eventType")
    List<TrainMovement> findAllByEventType(@Param("eventType") String eventType);

    @Query("SELECT i FROM TrainMovement i WHERE i.header.msg_type = :messageType")
    List<TrainMovement> findAllByMessageType(@Param("messageType") String messageType);

    @Query("SELECT i FROM TrainMovement i WHERE i.body.variation_status = :variation")
    List<TrainMovement> findAllByVariationStatus(@Param("variation") String variation);
}
