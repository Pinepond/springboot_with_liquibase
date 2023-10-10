-- liquibase formatted sql

-- changeset admin2:2-1
CREATE TABLE PRODUCT
(
    ID   BIGINT NOT NULL,
    NAME VARCHAR(255)
);