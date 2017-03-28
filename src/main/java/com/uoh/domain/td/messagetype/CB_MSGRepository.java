package com.uoh.domain.td.messagetype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * com.uoh.domain.td.messagetype.CB_MSGRepository Class will...
 * Created by James Millner on 09/10/2016 at 16:58.
 */
public interface CB_MSGRepository extends JpaRepository<CB_MSG, Long> {

    @Query("SELECT MIN(i.id) FROM CB_MSG i")
    Long findMinId();

    List<CB_MSG> findByIdLessThanEqual(Long id);
}
