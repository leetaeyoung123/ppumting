CREATE TABLE REPLAY(
	replay_no			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	replay_content		VARCHAR(4000)	NOT NULL,
	qna_no				BIGINT			NOT NULL,
	user_number			BIGINT			NOT NULL
	-- CONSTRAINT QNA_user_number_FK FOREIGN KEY (user_number) REFERENCES Users(userNumber)
)
