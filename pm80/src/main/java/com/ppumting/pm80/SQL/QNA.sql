CREATE TABLE QNA (
	qna_no			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	user_number		BIGINT			NOT NULL,
	qna_title		VARCHAR(150)	NOT NULL,
	qna_content		VARCHAR(2000)	NOT NULL,
	qna_reg_date	TIMESTAMP		DEFAULT CURRENT_TIMESTAMP,
	qna_visible		BIGINT(1)		DEFAULT 1 NOT NULL
	-- CONSTRAINT QNA_user_number_FK FOREIGN KEY (user_number) REFERENCES Users(userNumber)
)

SELECT * FROM QNA

drop table QNA
-- 외래키 선언 방법
-- CONSTRAINT QNA_user_number_FK FOREIGN KEY (user_number) REFERENCES Users(userNumber)

