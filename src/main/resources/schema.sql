Create schema Wynajem
use wynajem
CREATE TABLE IF NOT EXISTS Osoba (id int(11) NOT NULL AUTO_INCREMENT, name varchar(128) DEFAULT NULL, PRIMARY KEY (id) ) 
CREATE TABLE rezerwacja ( id int(11) NOT NULL AUTO_INCREMENT, okresNajmu date DEFAULT NULL, wynajmujaca_id int DEFAULT NULL, Najemca_id int DEFAULT NULL, koszt int(11) DEFAULT NULL, PRIMARY KEY (id), CONSTRAINT FK_WYNAJMUJACY FOREIGN KEY (wynajmujaca_id)  REFERENCES Osoba (id), CONSTRAINT FK_DNAJEMCA FOREIGN KEY (Najemca_id)  REFERENCES Osoba (id)) 

CREATE TABLE mieszkanie(id int(11) NOT NULL AUTO_INCREMENT, nazwa varchar(128) DEFAULT NULL, cenaJednostkowa int DEFAULT NULL, powierzchnia int DEFAULT NULL, opis varchar(200) DEFAULT NULL, rezerwacja_id int DEFAULT NULL, PRIMARY KEY (id), CONSTRAINT FK_REZERWACJ_idx FOREIGN KEY (rezerwacja_id) REFERENCES rezerwacja(id))




