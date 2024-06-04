CREATE TABLE emails (
    email_id BINARY(16) PRIMARY KEY,
    user_id BINARY(16),
    email_from VARCHAR(255),
    email_to VARCHAR(255),
    subject VARCHAR(255),
    text TEXT,
    send_date_email TIMESTAMP,
    status_email VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES ms_user.users(id)
);
