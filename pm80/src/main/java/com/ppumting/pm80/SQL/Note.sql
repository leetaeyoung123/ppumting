SHOW TABLES;

CREATE TABLE Senduser (
	msg			VARCHAR(200) 	PRIMARY KEY,
	userNumber 	BIGINT 			NOT NULL,
	sendDate 	TIMESTAMP		NOT NULL 		DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE Senduser add FOREIGN KEY(userNumber) REFERENCES Users(userNumber);

CREATE TABLE Receiveuser (
	ring		BIGINT			PRIMARY KEY,
	userNumber	BIGINT			NOT NULL,
	msg			VARCHAR(200)	NOT NULL,
	FOREIGN KEY(userNumber) REFERENCES Users(userNumber),
	FOREIGN KEY(msg) REFERENCES Senduser(msg)
);



SELECT * FROM senduser;
SELECT * FROM Receiveuser;

DROP TABLE reciveuser;
DROP TABLE senduser;

-- 외래키 설정방법
-- Users 테이블 먼저 생성후 쿼리문 실행 또는
-- ALTER TABLE Senduser add FOREIGN KEY(userNumber) REFERENCES Users(userNumber);
-- ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
-- Senduser

-- ALTER TABLE userNumber add FOREIGN KEY(userNumber) REFERENCES Users(userNumber);
-- ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
-- Reciveuser