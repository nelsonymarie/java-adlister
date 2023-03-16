CREATE
DATABASE IF NOT EXISTS adlister_db;

USE
adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email  VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads
(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(240) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

INSERT INTO users(username, email, password)
VALUES ('joeblow', 'joe@gmail', '11dszd1'),
       ('moeblow', 'moe@gmail', '234ed4'),
       ('sally', 'sally@gmail', '42fss');

INSERT INTO ads (title, description, user_id)
VALUES ('Dog for Sale', 'Hairy, howling husky.', (SELECT id FROM users WHERE email = 'joe@gmail')),
       ('Husky Puppies', 'Smol husky puppies.', (SELECT id FROM users WHERE email = 'joe@gmail')),
       ('Fast greyhound for sale', 'Fast boi.', (SELECT id FROM users WHERE email = 'sally@gmail')),
       ('Toyota Truck', 'It runs.', (SELECT id FROM users WHERE email = 'moe@gmail')),
       ('Loveseat', 'Black Leather.', (SELECT id FROM users WHERE email = 'moe@gmail'));