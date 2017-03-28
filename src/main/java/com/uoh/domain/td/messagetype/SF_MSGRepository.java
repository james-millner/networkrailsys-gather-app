package com.uoh.domain.td.messagetype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * com.uoh.domain.td.messagetype.SF_MSGRepository Class will...
 * Created by James Millner on 09/10/2016 at 17:01.
 */
@Repository
public interface SF_MSGRepository extends JpaRepository<SF_MSG, Long> {

    @Query("SELECT MIN(i.id) FROM SF_MSG i")
    Long findMinId();

    List<SF_MSG> findByIdLessThanEqual(Long id);
}
