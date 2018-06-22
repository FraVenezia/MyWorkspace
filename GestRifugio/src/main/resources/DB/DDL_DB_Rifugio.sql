CREATE DATABASE IF NOT EXISTS DB_Rifugio;

USE DB_Rifugio;

CREATE TABLE IF NOT EXISTS Room(IDRoom INT NOT NULL AUTO_INCREMENT,
                                Num INT NOT NULL UNIQUE,
								TypeRoom VARCHAR(16),
								Beds INT NOT NULL,
								Price DECIMAL(4,2) NOT NULL, 
								PRIMARY KEY (IDRoom));
								
CREATE TABLE IF NOT EXISTS Customer(IDUser INT NOT NULL AUTO_INCREMENT,
                                    Nome VARCHAR(16) NOT NULL,
									Cognome VARCHAR(16) NOT NULL,
									Indirizzo VARCHAR(32) NOT NULL,
									Email VARCHAR(32) NOT NULL,
									PRIMARY KEY(IDUser));
									
CREATE TABLE IF NOT EXISTS Booking(NumBooking INT NOT NULL AUTO_INCREMENT,
                                   IDUser INT NOT NULL,
								   BookingDate DATE NOT NULL,
								   PriceTotal DECIMAL(8,2) NOT NULL,
								   PRIMARY KEY(NumBooking),
								   FOREIGN KEY (IDUser) REFERENCES Customer(IDUser));
								   
CREATE TABLE IF NOT EXISTS BookingRoom(NumBooking INT NOT NULL,
							           IDRoom INT NOT NULL,
							           CheckIn DATE NOT NULL,
								       CheckOut DATE NOT NULL,
								       Price DECIMAL(6,2) NOT NULL,
							           FOREIGN KEY (NumBooking) REFERENCES Booking(NumBooking),
								       FOREIGN KEY (IDRoom) REFERENCES Room(IDRoom));
								  
								   
