CREATE TABLE chat_messages (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_message VARCHAR(255),
    ai_response VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
