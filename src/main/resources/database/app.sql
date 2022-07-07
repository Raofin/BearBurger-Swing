## schema ##

CREATE DATABASE bearburger_swing;

USE bearburger_swing;

CREATE TABLE users
(
    id       INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY UNIQUE,
    username VARCHAR(30) NOT NULL UNIQUE,
    email    VARCHAR(30) NOT NULL UNIQUE,
    pass     VARCHAR(30) NOT NULL,
    phone    VARCHAR(15) NOT NULL,
    gender   VARCHAR(6)  NOT NULL,
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE foods
(
    id          INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY UNIQUE,
    category    VARCHAR(30) NOT NULL,
    title       VARCHAR(30) NOT NULL UNIQUE,
    description TEXT        NOT NULL,
    price       INT(10)     NOT NULL
);


## data ##

INSERT INTO users (username, email, pass, phone, gender)
VALUES ('Raofin', 'hello@raofin.net', 'Asdfgh', '+8801234567890', 'Male'),
       ('Sazzad', 'sazzad96@gmail.com', 'sazzaz123', '+1263343299123', 'Male'),
       ('Authoi', 'authoi123@gmail.com', 'authoi999', '+2369543156441', 'Female'),
       ('Bill Gates', 'billgates@outlook.com', 'billgates68457', '+6963343233159', 'Male'),
       ('Elon Musk', 'elonmusk@yahoo.com', 'elon123', '+9668508170248', 'Male'),
       ('Jack Ma', 'jackma@gmail.com', 'jackma144', '+1667698473784', 'Male'),
       ('Steve Jobs', 'stevejobs@icloud.com', 'steve1213', '+1527475095845', 'Male'),
       ('Jeff Bezos', 'jeffbezos@gmail.com', 'jeffbe1334', '+8966295324845', 'Male'),
       ('Mark Zuckerberg', 'markzuckerberg@live.com', 'markz131', '+2657146731697', 'Male'),
       ('Sundar Pichai', 'sundarpichai@gmail.com', 'sundarp296', '+9815680737969', 'Male');

INSERT INTO foods (category, title, description, price)
VALUES ('Burger', 'Cheese Burger', 'Prepared with beef patty, cheese, burger sauce, pickles & onion', 650),
       ('Burger', 'Bacon Cheese Burger', 'Prepared with beef patty, 2 slices cheese, bacon & burger sauce', 500),
       ('Burger', 'Double Cheese Burger', 'Prepared with 2 beef patties, double cheese, burger sauce & onion', 640),
       ('Burger', 'Lil Smoke', 'Prepared with beef patty, cheese, bbq sauce, burger sauce, pickles & onion', 160),
       ('Burger', 'Beef Smoke', 'Prepared with 2 beef patties, 2 slices cheese, bbq sauce, burger sauce & onion', 280),
       ('Burger', 'Juicy Burger', 'Prepared with potato juice, beef patties, double cheese & burger sauce', 960),
       ('Pizza', 'BBQ Chicken Pizza', 'Topped with grilled chicken, bbq sauce & mozzarella cheese', 240),
       ('Pizza', 'Chicken Meatball Pizza', 'Topped with chicken meatball, tomato sauce & mozzarella cheese', 960),
       ('Pizza', 'Chicken Tikka Pizza', 'Topped with chicken tikka, tomato sauce & mozzarella cheese', 350),
       ('Pizza', 'Beef Meatball Pizza', 'Prepared with frank sausage, bacon, scallion, sauce & cheddar cheese', 560),
       ('Pizza', 'Vegetable Pizza', 'Topped with capsicum, mushroom, sweet corn, onion & black olive', 480),
       ('Pizza', 'Chicken Chunky Pizza', 'Topped with black olive, tomato, capsicum & green chili', 510),
       ('Salad', 'Cashewnut Salad', 'Topped with cashew nout and veggies', 310),
       ('Salad', 'Seafood Salad', 'Topped with seafood and lots of veggies and virgin olive oil', 360),
       ('Salad', 'Grilled Chicken Salad', 'Topped with chicken and secret spice ', 310),
       ('Salad', 'Russian Salad', 'Authentic russian taste with lots of veggies and secret sauce', 370),
       ('Salad', 'Korean Beef Salad', 'Made with beed in korean spice and sauce', 560),
       ('Pasta', 'Bitch Lasagna', 'Baked casserole made with wide flat pasta and layered with fillings such as ragú.', 996),
       ('Pasta', 'Ovenbaked Pasta', 'Topped with black olive, chicken, capsicum & green chili', 450),
       ('Pasta', 'BBQ Grill Chicken Pasta', 'Topped with grilled chicken, bbq sauce & mozzarella cheese', 340),
       ('Pasta', 'Seafood Pasta', 'Topped with seafood & mushroom', 350),
       ('Pasta', 'American Mac & Cheese', 'Topped with macarony & mozzarella cheese', 560),
       ('Drinks', 'Lemonade', 'Taste of fresh lemon and freshness', 110),
       ('Drinks', 'Iced lemon Tea', 'Lemon tea but with chilled ice', 200),
       ('Drinks', 'Lemon lassi', 'Taste of lassi with tanginess of lemon', 170),
       ('Drinks', 'Milk Shake', 'Taste of heavy cream and milk', 140),
       ('Drinks', 'Mango Smoothie', 'Tate of mangoes infused with cream and milk', 270),
       ('Coffee', 'Espresso', 'Shots of pure coffee', 120),
       ('Coffee', 'Cappuccino', 'Shots of pure coffee induced milk', 260),
       ('Coffee', 'Americano', 'SHots of pure Coffee in American style ', 310),
       ('Coffee', 'Latte', '30% coffee with heavy milk ', 370),
       ('Desert', 'Brownie', 'Mix of chocolate and magic', 130),
       ('Desert', 'Red Velvet', 'Magic of bakery in red color', 260),
       ('Desert', 'Choco Fudge', 'Chocolate cheese and creaminess ', 190),
       ('Desert', 'Oreo and Cheese', 'Crunchy oreo crust and creamy cheese feeling', 190),
       ('Desert', 'Blueberry Cheese Dip', 'Mix of blueberry cheesy feeling', 170),
       ('Sides', 'Medium French Fry', 'Delicious french fry in medium', 90),
       ('Sides', 'Large French Fry', 'Delicious french fry in large', 110),
       ('Sides', 'Chicken Fingers', 'Chicken fried in finger sized', 130),
       ('Sides', 'Naga Drumsticks', 'Soft spicy chicken with crunchy outer', 120);