CREATE TABLE Point(
	aid					BIGINT		PRIMARY KEY 	AUTO_INCREMENT,
	point				BIGINT		NOT NULL,
	accountNum			VARCHAR(11)	NOT NULL,
	userId				VARCHAR(16)		NOT NULL,
	CONSTRAINT Point_userId_FK FOREIGN KEY (userId) REFERENCES Users(userId)
) AUTO_INCREMENT = 1;


SELECT * FROM Point;
SELECT * FROM Users;

DROP TABLE Point;

INSERT INTO Point (point, accountNum, userId)
VALUES (100000, '123-45-6789', 'sssssg06')


-- inner join
SELECT * FROM Account, Customer WHERE Account.customerId = Customer.cid
AND Customer.ssn = '981212-1111111';

INSERT INTO Users (name, ssn, phone, userId, pw, addr, aid)
VALUES('박상규', '980618', '010-3490-3180', 'psg', '1234', 'daegu', '2');

SELECT * FROM Point p INNER JOIN Users u ON p.userId = u.userId;
SELECT * FROM Point p INNER JOIN Users u ON p.userId = u.userId WHERE u.userId = 'sssssg06';

DELETE FROM Point WHERE name = '이태영';







