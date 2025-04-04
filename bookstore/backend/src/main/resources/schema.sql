DROP TABLE IF EXISTS books;

CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    isbn VARCHAR(255) NOT NULL UNIQUE,
    description VARCHAR(2000),
    publication_date DATE,
    price DOUBLE,
    pages INTEGER,
    genre VARCHAR(255),
    in_stock BOOLEAN
);