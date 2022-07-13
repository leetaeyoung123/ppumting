CREATE TABLE Point(
	aid			BIGINT		PRIMARY KEY 	AUTO_INCREMENT,
	userNumber	BIGINT		NOT NULL,
	point		BIGINT		NOT NULL,
	accountNum	VARCHAR(11)	NOT NULL,
	CONSTRAINT Point_userNumber_FK FOREIGN KEY (userNumber) REFERENCES Users(userNumber)
) AUTO_INCREMENT = 1001;

-- 	Point테이블에 추가해줄거 
--	userNumber	BIGINT		NOT NULL,
--	CONSTRAINT Point_userNumber_FK FOREIGN KEY (userNumber) REFERENCES Users(userNumber) 


SELECT * FROM Point;

INSERT INTO Point (point, accountNum) VALUES (50000, '123-45-6789')
