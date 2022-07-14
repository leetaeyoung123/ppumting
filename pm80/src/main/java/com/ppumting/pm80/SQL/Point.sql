CREATE TABLE Point(
	aid					BIGINT		PRIMARY KEY 	AUTO_INCREMENT,
	point				BIGINT		NOT NULL,
	accountNum			VARCHAR(11)	NOT NULL,
	userId				VARCHAR(16)		NOT NULL,
	CONSTRAINT Point_userId_FK FOREIGN KEY (userId) REFERENCES Users(userId)
) AUTO_INCREMENT = 1;


SELECT * FROM Point;
SELECT * FROM Users;

SELECT userId FROM Users WHERE userId='qwer1ds';

DROP TABLE Point;


--test
INSERT INTO Point (point, accountNum, userId)
VALUES (0, '103-25-6485', 'qwer')

-- inner join
SELECT * FROM Account, Customer WHERE Account.customerId = Customer.cid
AND Customer.ssn = '981212-1111111';

INSERT INTO Point (name, ssn, phone, userId, pw, addr, aid)
VALUES('박상규', '980618', '010-3490-3180', 'psg', '1234', 'daegu', '2');

SELECT * FROM Point p INNER JOIN Users u ON p.userId = u.userId;
SELECT userId FROM Point p INNER JOIN Users u ON p.userId = u.userId WHERE u.userId = 'sssssg06';

DELETE FROM Point WHERE name = '이태영';



--user table test
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
VALUES('test2', '970312', '010-2881-2498', 'qwer1', '1234', 'daegu');




