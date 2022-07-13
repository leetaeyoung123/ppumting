CREATE TABLE Users (
	name VARCHAR(20) NOT NULL,
	ssn VARCHAR(7) NOT NULL,
	phone VARCHAR(13) NOT NULL,
	userId VARCHAR(16)  PRIMARY KEY,
	pw VARCHAR(20) NOT NULL,
	addr VARCHAR(25) NOT NULL
);

SELECT * FROM Users;

DROP TABLE Users;

INSERT INTO Users (name, ssn, phone, userId, pw, addr)
VALUES('박상규', '980618', '010-3490-3180', 'sssssg06', '1234', 'daegu');