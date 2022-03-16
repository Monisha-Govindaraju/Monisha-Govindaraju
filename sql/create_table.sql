CREATE TABLE student_resultapp_users(
NAME VARCHAR (100) NOT NULL,
email VARCHAR(100) NOT NULL UNIQUE,
mobile_number BIGINT (10) NOT NULL UNIQUE,
department CHAR (5) NOT NULL,
batch VARCHAR (10) NOT NULL
);

SELECT * FROM student_resultapp_users;

INSERT INTO student_resultapp_users(NAME,email,mobile_number,department,batch) VALUES 
('MONISHA','ahsinom107@gmail.com',7708904929,'BME','2018-2022'); 
