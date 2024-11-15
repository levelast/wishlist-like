CREATE TABLE IF NOT EXISTS groups
(
    id         BIGSERIAL PRIMARY KEY,
    account_id BIGINT                              NOT NULL,
    name       VARCHAR(255)                        NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE INDEX groups_account_id_idx ON groups (account_id);
