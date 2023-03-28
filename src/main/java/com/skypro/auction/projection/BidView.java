package com.skypro.auction.projection;

import java.time.LocalDateTime;

public interface BidView {
    String getBidderName();

    LocalDateTime getBidDate();

}