package com.uoh.domain.networkrail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * com.uoh.domain.networkrail.NetworkRailResponseRepository Class will...
 * Created by James Millner on 13/02/2017 at 17:50.
 */
public interface NetworkRailResponseRepository extends JpaRepository<NetworkRailResponse, Long> {

    public Long countByProcessed(Boolean processed);

    @Query("SELECT MAX(t.id) FROM NetworkRailResponse t")
    Long getMaxId();

    public List<NetworkRailResponse> findByFeedType(NetworkRailResponse.FeedType feedType);

    public List<NetworkRailResponse> findByFeedTypeAndProcessed(NetworkRailResponse.FeedType type, Boolean processed);
}
