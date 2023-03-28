package com.skypro.auction.dto;

import com.skypro.auction.model.Lot;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateLot {

    private String title;
    private String description;
    private Integer startPrice;
    private Integer bidPrice;

    public static CreateLot fromLot(Lot lot) {
        CreateLot createLot = new CreateLot();
        createLot.setTitle(lot.getTitle());
        createLot.setDescription(lot.getDescription());
        createLot.setStartPrice(lot.getStartPrice());
        createLot.setBidPrice(lot.getBidPrice());
        return createLot;
    }

    public Lot toLot() {
        Lot lot = new Lot();
        lot.setTitle(this.getTitle());
        lot.setDescription(this.getDescription());
        lot.setStartPrice(this.getStartPrice());
        lot.setBidPrice(this.getBidPrice());
        return lot;
    }


}
