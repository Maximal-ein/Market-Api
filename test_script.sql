CREATE TABLE shop
(
	shop_id serial PRIMARY KEY,
	shop_name varchar(128) NOT NULL,
	address text NOT NULL
);

CREATE TABLE product
(
	product_id serial PRIMARY KEY,
	product_name varchar(128) NOT NULL,
	price int NOT NULL,
	amount int NOT NULL,
	product_key int UNIQUE NOT NULL
);

ALTER TABLE product
ADD COLUMN shop_id int NOT NULL;

ALTER TABLE product
ADD CONSTRAINT product_shop
FOREIGN KEY(shop_id) REFERENCES shop(shop_id);

CREATE TABLE customer
(
	customer_id serial PRIMARY KEY,
	customer_full_name varchar(64) NOT NULL,
	email varchar(32) UNIQUE NOT NULL
);

CREATE TABLE sell
(
	sell_id serial PRIMARY KEY,
	shop_id int REFERENCES shop(shop_id),
	product_id int REFERENCES product(product_id),
	customer_id int REFERENCES customer(customer_id),
	amount_sold int NOT NULL
);

INSERT INTO shop
VALUES
(DEFAULT, 'shopName1', 'address1'),
(DEFAULT, 'shopName2', 'address2'),
(DEFAULT, 'shopName3', 'address3'),
(DEFAULT, 'shopName4', 'address4'),
(DEFAULT, 'shopName5', 'address5');

INSERT INTO product
VALUES
(DEFAULT, 'name1', 1, 10, 11111, 1),
(DEFAULT, 'name2', 2, 20, 22222, 2),
(DEFAULT, 'name3', 3, 30, 33333, 2),
(DEFAULT, 'name4', 4, 40, 44444, 3),
(DEFAULT, 'name5', 5, 50, 55555, 5);

INSERT INTO customer
VALUES
(DEFAULT, 'customer1', '1@mail.ru'),
(DEFAULT, 'customer2', '2@mail.ru'),
(DEFAULT, 'customer3', '3@mail.ru'),
(DEFAULT, 'customer4', '4@mail.ru'),
(DEFAULT, 'customer5', '5@mail.ru');

INSERT INTO sell
VALUES
(DEFAULT, 1, 1, 1, 5),
(DEFAULT, 2, 3, 1, 12),
(DEFAULT, 3, 1, 2, 3),
(DEFAULT, 2, 2, 3, 8),
(DEFAULT, 3, 2, 4, 10),
(DEFAULT, 3, 3, 4, 5),
(DEFAULT, 1, 4, 4, 2),
(DEFAULT, 2, 5, 4, 3);