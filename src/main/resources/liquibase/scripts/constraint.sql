-- liquibase formatted sql

-- changeset ruslan:3
ALTER TABLE lot
    ADD CONSTRAINT title_length check (length(title) >= 3 and length(title) <= 64);

-- changeset ruslan:4
ALTER TABLE lot
    ADD CONSTRAINT description_length check (length(description) >= 1 and length(description) <= 4096);

-- changeset ruslan:5
ALTER TABLE lot
    ADD CONSTRAINT start_price_length check (start_price >= 1 and start_price <= 100);

-- changeset ruslan:6
ALTER TABLE lot
    ADD CONSTRAINT bid_price_length check (bid_price >= 1 and bid_price <= 100);