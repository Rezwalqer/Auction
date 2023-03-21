-- liquibase formatted sql


-- changeset ruslan:1
CREATE TABLE bid
(
    id          BIGSERIAL PRIMARY KEY,
    bidder_name VARCHAR(255) NOT NULL,
    bid_date    TIMESTAMP    NOT NULL,
    lot_id      BIGINT REFERENCES lot (id)
);