CREATE TABLE IF NOT EXISTS role (
                                    id BIGSERIAL PRIMARY KEY,
                                    authority VARCHAR(255) DEFAULT 1
);

INSERT INTO role VALUES(1, 'USER') ON CONFLICT DO NOTHING;
INSERT INTO role VALUES(2, 'ADMIN') ON CONFLICT DO NOTHING;

CREATE TABLE IF NOT EXISTS account (
                                       id UUID PRIMARY KEY,
                                       username VARCHAR(255) NOT NULL,
                                       email VARCHAR(255) NOT NULL,
                                       password VARCHAR(255) NOT NULL,
                                       CONSTRAINT uc_email UNIQUE (email)
);

CREATE TABLE IF NOT EXISTS account_roles (
                                             id BIGSERIAL PRIMARY KEY,
                                             role_id BIGINT,
                                             account_id UUID,
                                             CONSTRAINT fk_role FOREIGN KEY (role_id) REFERENCES role (id),
                                             CONSTRAINT fk_account FOREIGN KEY (account_id) REFERENCES account (id)
);
