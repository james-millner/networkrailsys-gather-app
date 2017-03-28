package com.uoh.domain.td.messagetype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * com.uoh.domain.td.messagetype.SG_MSGRepository Class will...
 * Created by James Millner on 09/10/2016 at 17:01.
 */
public interface SG_MSGRepository extends JpaRepository<SG_MSG, Long> {

    @Query("SELECT MIN(i.id) FROM SG_MSG i")
    Long findMinId();

    List<SG_MSG> findByIdLessThanEqual(Long id);
}
