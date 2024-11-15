CREATE TABLE IF NOT EXISTS items
(
    id         BIGSERIAL PRIMARY KEY,
    article_id BIGINT                              NOT NULL,
    group_id   BIGINT                              NOT NULL,
    account_id BIGINT                              NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE INDEX items_account_id_group_id_idx ON items (account_id, group_id);
