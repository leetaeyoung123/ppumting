CREATE TABLE Trainers (
	trainerNumber 	BIGINT PRIMARY KEY AUTO_INCREMENT,
	name			VARCHAR(20) NOT NULL,
	ssn 			VARCHAR(7) 	NOT NULL,
	phone 			VARCHAR(13) NOT NULL,
	trainerId 		VARCHAR(16) NOT NULL,
	pw 				VARCHAR(20) NOT NULL,
	addr 			VARCHAR(25) NOT NULL,
	aid  			BIGINT 		NOT NULL,
	ring 			BIGINT 		NOT NULL DEFAULT 0
)AUTO_INCREMENT = 1;
	-- CONSTRAINT Trainers_aid_FK FOREIGN KEY (aid) REFERENCES Point(aid)

ALTER TABLE Trainers ADD CONSTRAINT Trainers_aid_FK FOREIGN KEY (aid) REFERENCES Point(aid);

SELECT * FROM Trainers;
DROP TABLE Trainers;

INSERT INTO Trainers (name, ssn, phone, trainerId, pw, addr, aid)
VALUES('백기열', '950512', '010-8538-8436', 'bky', '1234', 'daegu', '1');