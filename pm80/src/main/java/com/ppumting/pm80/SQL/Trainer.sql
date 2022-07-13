CREATE TABLE Trainers (
	TrainerNumber 	BIGINT PRIMARY KEY AUTO_INCERMENT,
	name			VARCHAR(20) NOT NULL,
	ssn 			VARCHAR(7) 	NOT NULL,
	phone 			VARCHAR(13) NOT NULL,
	trainerId 		VARCHAR(16) NOT NULL,
	pw 				VARCHAR(20) NOT NULL,
	addr 			VARCHAR(25) NOT NULL
)AUTO_INCREMENT = 1;

SELECT * FROM Trainers;
DROP TABLE Trainers;

INSERT INTO Trainers (name, ssn, phone, userId, pw, addr, aid)
VALUES('백기열', '950512', '010-8538-8436', 'bky', '1234', 'daegu', '1');