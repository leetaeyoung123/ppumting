SHOW TABLES;

CREATE TABLE Senduser (
	msg			VARCHAR(200) 	PRIMARY KEY,
	userNumber 	BIGINT 			NOT NULL,
	sendDate 	TIMESTAMP		NOT NULL 		DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE Senduser ADD CONSTRAINT FK_SendUser_Users_userNumber FOREIGN KEY (userNumber) REFERENCES Users(userNumber);

CREATE TABLE Receiveuser (
	ring		BIGINT			PRIMARY KEY DEFAULT 0,
	userNumber	BIGINT			NOT NULL,
	msg			VARCHAR(200)	NOT NULL,
	CONSTRAINT FK_ReceiveUser_Users_userNumber FOREIGN KEY(userNumber) REFERENCES Users(userNumber),
	CONSTRAINT FK_Receiveuser_SendUser_msg FOREIGN KEY(msg) REFERENCES Senduser(msg)
);

SELECT * FROM senduser;
SELECT * FROM Receiveuser;

DROP TABLE Receiveuser;
DROP TABLE senduser;

