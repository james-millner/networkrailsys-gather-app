package com.uoh.domain.td.messagetype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * com.uoh.domain.td.messagetype.SH_MSGRepository Class will...
 * Created by James Millner on 09/10/2016 at 17:02.
 */
public interface SH_MSGRepository extends JpaRepository<SH_MSG, Long> {

    @Query("SELECT MIN(i.id) FROM SH_MSG i")
    Long findMinId();

    List<SH_MSG> findByIdLessThanEqual(Long id);
}
