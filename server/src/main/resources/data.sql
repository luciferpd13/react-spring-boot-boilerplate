 CREATE TABLE NOTES (
       id BIGINT NOT NULL AUTO_INCREMENT,
       title varchar(255),
       description varchar(255),
       primary key (id)
 );
INSERT INTO NOTES (title, description) VALUES
  ('Yoga', 'Purify your Soul'),
  ('Boxing', 'Great Sport');