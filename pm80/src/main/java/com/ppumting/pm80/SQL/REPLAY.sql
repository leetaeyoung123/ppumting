CREATE TABLE REPLAY(
	replay_no			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	replay_content		VARCHAR(4000)	NOT NULL,
	qna_no				BIGINT			NOT NULL,
	user_number			BIGINT			NOT NULL,
	CONSTRAINT REPLAY_user_number_FK FOREIGN KEY (user_number) REFERENCES Users(userNumber)
<<<<<<< HEAD
);

SELECT * FROM REPLAY;
=======
)AUTO_INCREMENT = 1;

SELECT * FROM REPLAY;

-- INSERT INTO Users (name, ssn, phone, userId, pw, addr, aid)
-- VALUES('이태영', '970312', '010-2881-2498', 'lty', '1234', 'daegu', '1');
>>>>>>> Boardbranch
