CREATE DATABASE IF NOT EXISTS shopping_cart_localization
CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE shopping_cart_localization;

CREATE TABLE IF NOT EXISTS cart_records (
                                            id INT AUTO_INCREMENT PRIMARY KEY,
                                            total_items INT NOT NULL,
                                            total_cost DOUBLE NOT NULL,
                                            language VARCHAR(10),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS cart_items (
                                          id INT AUTO_INCREMENT PRIMARY KEY,
                                          cart_record_id INT,
                                          item_number INT NOT NULL,
                                          price DOUBLE NOT NULL,
                                          quantity INT NOT NULL,
                                          subtotal DOUBLE NOT NULL,
                                          FOREIGN KEY (cart_record_id) REFERENCES cart_records(id) ON DELETE CASCADE
    );

CREATE TABLE IF NOT EXISTS localization_strings (
                                                    id INT AUTO_INCREMENT PRIMARY KEY,
                                                    `key` VARCHAR(100) NOT NULL,
    value VARCHAR(255) NOT NULL,
    language VARCHAR(10) NOT NULL
    );

INSERT INTO localization_strings (`key`, value, language) VALUES
                                                              ('itemCount', 'Enter item count', 'en'),
                                                              ('price', 'Enter price for item', 'en'),
                                                              ('quantity', 'Enter quantity for item', 'en'),
                                                              ('cartTotal', 'Cart total', 'en');

INSERT INTO localization_strings (`key`, value, language) VALUES
                                                              ('itemCount', 'Anna tuotteiden määrä', 'fi'),
                                                              ('price', 'Anna tuotteen hinta', 'fi'),
                                                              ('quantity', 'Anna tuotteen määrä', 'fi'),
                                                              ('cartTotal', 'Ostoskorin summa', 'fi');

INSERT INTO localization_strings (`key`, value, language) VALUES
                                                              ('itemCount', 'Ange antal produkter', 'sv'),
                                                              ('price', 'Ange pris för produkt', 'sv'),
                                                              ('quantity', 'Ange antal för produkt', 'sv'),
                                                              ('cartTotal', 'Varukorgens total', 'sv');

INSERT INTO localization_strings (`key`, value, language) VALUES
                                                              ('itemCount', '商品の数を入力', 'ja'),
                                                              ('price', '商品の価格を入力', 'ja'),
                                                              ('quantity', '商品の数量を入力', 'ja'),
                                                              ('cartTotal', 'カートの合計', 'ja');

INSERT INTO localization_strings (`key`, value, language) VALUES
                                                              ('itemCount', 'أدخل عدد العناصر', 'ar'),
                                                              ('price', 'أدخل سعر العنصر', 'ar'),
                                                              ('quantity', 'أدخل كمية العنصر', 'ar'),
                                                              ('cartTotal', 'إجمالي سلة التسوق', 'ar');