package com.skypro.auction.repository;

import com.skypro.auction.model.Bid;
import com.skypro.auction.projection.BidView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BidRepository extends JpaRepository<Bid, Long> {

    @Query(
            value = "SELECT * FROM bid WHERE lot_id = ?1 ORDER BY bid_date LIMIT 1",
            nativeQuery = true
    )
    Optional<Bid> findInfoAboutFirstBidder(Long id);

    @Query(
            value = "SELECT bidder_name as bidderName, MAX(bid_date) as bidDate " +
                    "FROM bid WHERE lot_id = ?1 GROUP BY bidder_name ORDER BY COUNT(*) DESC LIMIT 1",
            nativeQuery = true
    )
    BidView findHighestNumberOfBets(Long id);

    @Query(
            value = "SELECT COUNT(*) FROM bid WHERE lot_id = ?1"
            , nativeQuery = true
    )
    Long bidCount(Long id);

    @Query(
            value = "SELECT bidder_name AS bidderName, bid_date AS bidDate FROM bid WHERE lot_id = ?1 ORDER BY bid_date DESC LIMIT 1"
            , nativeQuery = true
    )
    BidView getInfoAboutLastBidDate(Long id);
}
