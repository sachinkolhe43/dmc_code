CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR(20), last_name VARCHAR(20), email VARCHAR(30) UNIQUE, passwd VARCHAR(30), mobile VARCHAR(16));

INSERT INTO users(first_name, last_name, email, passwd, mobile) VALUES ('Nilesh', 'Ghule', 'nilesh@sunbeam.com', 'nilesh', '9527331338');
INSERT INTO users(first_name, last_name, email, passwd, mobile) VALUES ('Nitin', 'Kudale', 'nitin@sunbeam.com', 'nitin', '9881208115');
INSERT INTO users(first_name, last_name, email, passwd, mobile) VALUES ('Prashant', 'Lad', 'prashant@sunbeam.com', 'prashant', '9881208115');

CREATE TABLE quotes(id INT PRIMARY KEY AUTO_INCREMENT, quote VARCHAR(500), author VARCHAR(40), user_id INT, created_at TIMESTAMP);

INSERT INTO quotes(quote, author, user_id, created_at) VALUES('Knowledge is interrelated!', 'Vijay Gokhale', 1, NOW());
INSERT INTO quotes(quote, author,  user_id, created_at) VALUES('Stay hungry, Stay foolish.', 'Steve Jobs', 2, NOW());
INSERT INTO quotes(quote, author,  user_id, created_at) VALUES('Show must go on.', 'Brian May', 2, NOW());

CREATE TABLE fav_quotes(user_id INT, quote_id INT, FOREIGN KEY (quote_id) REFERENCES quotes(id) ON DELETE CASCADE, UNIQUE(user_id, quote_id)); 
