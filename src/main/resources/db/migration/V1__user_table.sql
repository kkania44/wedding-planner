CREATE TABLE IF NOT EXISTS USERS (
    ID SERIAL NOT NULL PRIMARY KEY,
    FIRST_NAME varchar(50) NOT NULL,
    LAST_NAME varchar(50) NOT NULL,
    EMAIL varchar(50) NOT NULL,
    PHONE_NUMBER varchar(50),
    KEYCLOAK_ID uuid,
    CREATION_TIME timestamp DEFAULT now(),
    UPDATE_TIME timestamp DEFAULT now()
);
ALTER TABLE users ADD CONSTRAINT uq_users_email UNIQUE (email);
ALTER TABLE users ADD CONSTRAINT uq_users_phone_number UNIQUE (phone_number);
ALTER TABLE users ADD CONSTRAINT uq_users_keycloak_id UNIQUE (keycloak_id);
