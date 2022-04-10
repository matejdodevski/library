DROP TABLE Country IF EXISTS;

CREATE TABLE Country (
                                Id BIGINT NOT NULL AUTO_INCREMENT,
                                Name CHARACTER VARYING(50) NOT NULL,
                                Continent CHARACTER VARYING(20) NOT NULL,
                                CONSTRAINT PK_Country PRIMARY KEY (Id)
);
CREATE UNIQUE INDEX PK_Country ON Country (Id);



--

DROP TABLE BookCategory IF EXISTS ;

CREATE TABLE BookCategory (
                                     Id BIGINT NOT NULL AUTO_INCREMENT,
                                     Name CHARACTER VARYING(50) NOT NULL,
                                     CONSTRAINT PK_BookCategory PRIMARY KEY (Id)
);
CREATE UNIQUE INDEX PK_BookCategory ON BookCategory (Id);

--

-- PUBLIC.AUTHOR definition

-- Drop table

-- DROP TABLE PUBLIC.AUTHOR;

CREATE TABLE Author (
                               Id BIGINT NOT NULL AUTO_INCREMENT,
                               Name CHARACTER VARYING(50) NOT NULL,
                               Surname CHARACTER VARYING(20) NOT NULL,
                               CountryId BIGINT NOT NULL,
                               CONSTRAINT PK_Author PRIMARY KEY (Id)

);
CREATE UNIQUE INDEX PK_Author ON Author (Id);


-- PUBLIC.AUTHOR foreign keys

ALTER TABLE Author ADD CONSTRAINT FK_Author_Country FOREIGN KEY (CountryId) REFERENCES Country(Id) ON DELETE RESTRICT ON UPDATE RESTRICT;

----------

-- PUBLIC.BOOK definition

-- Drop table

 DROP TABLE Book IF EXISTS ;

CREATE TABLE Book (
                             Id BIGINT NOT NULL AUTO_INCREMENT,
                             Name CHARACTER VARYING(50) NOT NULL,
                             CategoryId BIGINT NOT NULL,
                             AuthorId BIGINT NOT NULL,
                             AvailableCopies INTEGER NOT NULL,
                             CONSTRAINT PK_Book PRIMARY KEY (Id)
);

CREATE UNIQUE INDEX PK_Book ON Book (Id);


-- PUBLIC.BOOK foreign keys

ALTER TABLE Book ADD CONSTRAINT FK_Book_Category FOREIGN KEY (CategoryId) REFERENCES BookCategory(Id) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE Book ADD CONSTRAINT FK_Book_Author FOREIGN KEY (AuthorId) REFERENCES Author(Id) ON DELETE RESTRICT ON UPDATE RESTRICT;