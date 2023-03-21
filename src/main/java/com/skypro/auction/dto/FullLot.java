package com.skypro.auction.dto;

import com.skypro.auction.model.Lot;
import com.skypro.auction.projection.BidView;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FullLot {

    private Long id;
    private String status;
    private String title;
    private String description;
    private Integer startPrice;
    private Integer currentPrice;
    private Integer bidPrice;
    //    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BidView lastBid;

    public static FullLot fromLot(Lot lot) {
        FullLot fullLot = new FullLot();
        fullLot.setId(lot.getId());
        fullLot.setStatus(lot.getStatus());
        fullLot.setTitle(lot.getTitle());
        fullLot.setDescription(lot.getDescription());
        fullLot.setStartPrice(lot.getStartPrice());
        fullLot.setBidPrice(lot.getBidPrice());
        return fullLot;
    }

    public Lot toLot() {
        Lot lot = new Lot();
        lot.setId(this.getId());
        lot.setStatus(this.getStatus());
        lot.setTitle(this.getTitle());
        lot.setDescription(this.getDescription());
        lot.setStartPrice(this.getStartPrice());
        lot.setBidPrice(this.getBidPrice());
        return lot;
    }


}
