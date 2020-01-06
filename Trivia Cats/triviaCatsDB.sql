CREATE DATABASE triviaCats;


CREATE TABLE Users (
    userID int NOT NULL,
    userName varchar(20) NOT NULL,
    password_hash varchar(20) NOT NULL,
    status varchar(50) NOT NULL,
	lastLogin date,
	experience int,
	questionsAsked int,
	questionsCorrect int,
    PRIMARY KEY (userID)
);


CREATE TABLE UserPoses (
    userID int NOT NULL,
    poseID int NOT NULL,
    aquiredDate date,
   	status enum('A', 'I', 'M'),
    PRIMARY KEY (userID, poseID)
);

CREATE TABLE Poses (
    poseID int NOT NULL,
	implementationDate date NOT NULL,
	description varchar(50),
 	PRIMARY KEY (poseID)
);

CREATE TABLE Avatar (
    avatarId int NOT NULL,
    implementationDate date NOT NULL,
    description varchar(50) NOT NULL,
    PRIMARY KEY (avatarId)
);

CREATE TABLE UserAvatar (
    userID int NOT NULL,
    avatarId int NOT NULL,
    aquiredDate date,
    status enum('A', 'I', 'M').
    PRIMARY KEY (userID, avatarId)
);

CREATE TABLE ImageData (
	avatarId int NOT NULL,
    poseID int NOT NULL,
    imageData varchar(150) NOT NULL,
    status enum('A', 'I', 'M'),
    PRIMARY KEY (avatarId, poseID)
);

