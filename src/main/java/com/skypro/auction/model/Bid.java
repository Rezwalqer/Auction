package com.skypro.auction.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bidderName;
    private LocalDateTime bidDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ManyToOne(fetch = FetchType.LAZY)
    private Lot lot;

}