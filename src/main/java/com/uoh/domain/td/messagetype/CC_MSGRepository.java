package com.uoh.domain.td.messagetype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * com.uoh.domain.td.messagetype.CC_MSGRepository Class will...
 * Created by James Millner on 09/10/2016 at 17:00.
 */
public interface CC_MSGRepository extends JpaRepository<CC_MSG, Long> {

    @Query("SELECT MIN(i.id) FROM CC_MSG i")
    Long findMinId();

    List<CC_MSG> findByIdLessThanEqual(Long id);
}
