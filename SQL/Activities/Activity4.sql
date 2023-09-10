REM   Script: Activity4
REM   Activity4

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

describe salesman


CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5001, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5002, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5003, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5004, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5005, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5001, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5002, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5003, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5004, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5005, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman 
;

