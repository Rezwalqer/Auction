package com.skypro.auction.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String title;
    @Column(length = 4096)
    private String description;
    private Integer startPrice;
    private Integer bidPrice;
    @OneToMany(mappedBy = "lot")
    List<Bid> bids;

}