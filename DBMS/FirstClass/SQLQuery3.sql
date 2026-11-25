/*create table studentinfo
(
	Rollno int primary key not null identity,
	name varchar(50),
	Gender varchar(6),
	Dob date
)*/
select * from studentinfo

/*insert into studentinfo(name , Gender , Dob)
	values  ('Yochan','Male','2005-11-11'),
			('Mochan','Male','2005-11-11'),
			('Dada','Female','2000-01-11')*/

select * from studentinfo where name = 'Yochan'
select name from studentinfo where name = 'Yochan'