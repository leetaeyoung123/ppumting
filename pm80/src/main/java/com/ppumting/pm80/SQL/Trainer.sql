CREATE TABLE Trainer (
	trainerId	 	BIGINT PRIMARY KEY AUTO_INCREMENT,
	name			VARCHAR(20) NOT NULL,
	ssn 			VARCHAR(7) 	NOT NULL,
	phone 			VARCHAR(13) NOT NULL,
	passwd			VARCHAR(20) NOT NULL,
	addr 			VARCHAR(25) NOT NULL
)AUTO_INCREMENT = 1;
	-- CONSTRAINT Trainers_aid_FK FOREIGN KEY (aid) REFERENCES Point(aid)

-- ALTER TABLE Trainers ADD CONSTRAINT Trainers_aid_FK FOREIGN KEY (aid) REFERENCES Point(aid);

SELECT * FROM Trainer;
DROP TABLE Trainer;
DELETE FROM Trainer WHERE name = '백기열';

INSERT INTO Trainer (name, ssn, phone, trainerId, pw, addr) 
VALUES('백기열', '950512', '010-8538-8436', 'bky', '1234', 'daegu');