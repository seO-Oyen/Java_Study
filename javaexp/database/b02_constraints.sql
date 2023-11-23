SELECT *
FROM sys.all_constraints
WHERE TABLE_NAME LIKE 'EMP%';

CREATE TABLE student01(
	name varchar2(30) CONSTRAINT sutdent01_name_nn NOT NULL
);
SELECT * FROM student01;
INSERT INTO student01 values(null);
