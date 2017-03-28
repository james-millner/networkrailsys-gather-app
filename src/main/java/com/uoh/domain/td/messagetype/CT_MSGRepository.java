package com.uoh.domain.td.messagetype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * com.uoh.domain.td.messagetype.CT_MSGRepository Class will...
 * Created by James Millner on 09/10/2016 at 17:00.
 */
public interface CT_MSGRepository extends JpaRepository<CT_MSG, Long> {

    @Query("SELECT MIN(i.id) FROM CT_MSG i")
    Long findMinId();

    List<CT_MSG> findByIdLessThanEqual(Long id);
}
