create database DoctorDB;
use DoctorDB;

create table Patient (
Patient_ID INT PRIMARY key auto_increment ,
Username varchar(100) not null,
Email varchar(100) not null,
Tele varchar(12) not null

);

create table Doctor (
Doctor_ID INT PRIMARY key auto_increment,
Name varchar(100) not null,
Speciality varchar(100) not null
);

create table Appoinment (
Appoinment_ID INT PRIMARY key auto_increment,
Appoinment_Date DATE,
Motif varchar(100) not null,
Patient_ID INT,
Doctor_ID INT ,
foreign key (Patient_ID) references Patient(Patient_ID),
foreign key (Doctor_ID) references Doctor(Doctor_ID)

);

select * from Patient;
select * from Doctor;
select * from Appoinment;

drop database DoctorDB;