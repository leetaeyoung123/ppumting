CREATE TABLE QNA (
	qna_no			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	user_number		BIGINT			NOT NULL,
	qna_title		VARCHAR(150)	NOT NULL,
	qna_content		VARCHAR(2000)	NOT NULL,
	qna_reg_date	TIMESTAMP		DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1;

SELECT * FROM QNA

drop table QNA
-- 외래키 선언 방법
-- CONSTRAINT QNA_user_number_FK FOREIGN KEY (user_number) REFERENCES Users(userNumber)

INSERT INTO QNA (qna_no, user_number, qna_title, qna_content)
VALUES (1, 7, '제목', '내용')

-- INSERT INTO QNA (name, ssn, phone, userId, pw, addr, aid)
-- VALUES('이태영', '970312', '010-2881-2498', 'lty', '1234', 'daegu', '1');

