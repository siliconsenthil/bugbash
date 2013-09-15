# Bugs schema
 
# --- !Ups
 
CREATE TABLE Bugs (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    description text NOT NULL,
    status varchar(255) NOT NULL,
    PRIMARY KEY (id)
);
 
# --- !Downs
 
DROP TABLE Bugs;