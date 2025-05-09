INSERT INTO users (name, email, password) VALUES ('Alex',  'alex@gmail.com', '$2a$10$e1zv4PUeNpbrbRYpJmk0euJnt5xNI0PGcYMxrSX8t6kJrAmOZSS/S');
INSERT INTO users (name, email, password) VALUES ('Maria','maria@gmail.com', '$2a$10$e1zv4PUeNpbrbRYpJmk0euJnt5xNI0PGcYMxrSX8t6kJrAmOZSS/S');
INSERT INTO users (name, email, password) VALUES ('Julio Cesar', 'jccintr@gmail.com', '$2a$10$e1zv4PUeNpbrbRYpJmk0euJnt5xNI0PGcYMxrSX8t6kJrAmOZSS/S');

INSERT INTO roles (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO roles (authority) VALUES ('ROLE_ADMIN');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO user_role (user_id, role_id) VALUES (3, 1);