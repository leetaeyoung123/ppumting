CREATE TABLE Point(
	aid			BIGINT		PRIMARY KEY 	AUTO_INCREMENT,
	point		BIGINT		NOT NULL,
	accountNum	VARCHAR(11)	NOT NULL,
	userNumber	BIGINT		NOT NULL,
	CONSTRAINT Point_userNumber_FK FOREIGN KEY (userNumber) REFERENCES Users(userNumber)
) AUTO_INCREMENT = 1001;

-- 	Point테이블에 추가해줄거 
--	userNumber	BIGINT		NOT NULL,
--	CONSTRAINT Point_userNumber_FK FOREIGN KEY (userNumber) REFERENCES Users(userNumber)

SELECT * FROM Point;
SELECT * FROM Users;

DROP TABLE Point;

INSERT INTO Point (point, accountNum, userNumber) VALUES (70000, '789-45-1234', 2)

-- inner join
SELECT * FROM Account, Customer WHERE Account.customerId = Customer.cid
AND Customer.ssn = '981212-1111111';

INSERT INTO Users (name, ssn, phone, userId, pw, addr, aid)
VALUES('박상규', '980618', '010-3490-3180', 'psg', '1234', 'daegu', '2');

SELECT * FROM Point p INNER JOIN Users u ON p.userNumber = u.userNumber;
SELECT * FROM Point p INNER JOIN Users u ON p.userNumber = u.userNumber WHERE u.name = '이태영';

DELETE FROM Point WHERE name = '이태영';







