-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.18

--
-- Dumping data for table author
--

INSERT INTO author(id, first_name, last_name, date_of_birth, gender) VALUES (1,'John','Green','1977-08-24','m'),(2,'Dan','Brown','1964-06-22','m'),(3,'Robert','Kiyosaki','1947-04-08','m'),(4,'Sharon','Lechter','1954-01-12','f'),(5,'John','Grisam','1955-02-08','m'),(6,'Bhagyashree','Chavan','1990-04-01','f');

--
-- Dumping data for table book
--

INSERT INTO book(id, title) VALUES (1,'The Fault in Our Stars'),(2,'Inferno'),(3,'Rich Dad Poor Dad'),(4,'The Da Vinci Code'),(5,'Angels and Demons'),(6,'A time to kill'),(7,'The Lost Symbol'),(8,'Digital Fortress'),(9,'Deception Point');

--
-- Dumping data for table book_author
--

INSERT INTO book_author(book_id, author_id) VALUES (1,1),(2,2),(3,3),(3,4),(4,2),(5,2),(6,5),(7,2),(8,2),(9,2);

--
-- Dumping data for table publisher
--

INSERT INTO publisher(id, "name") VALUES (1,'E P Dutton'),(2,'Warner Books Ed');

--
-- Dumping data for table book_publisher
--

INSERT INTO book_publisher(book_id, publisher_id, format, date_of_publishing) VALUES (1,1,'HARDCOVER','2012-01-10'),(3,2,'PAPERBACK','2000-04-01');

--
-- Dumping data for table manuscript
--

INSERT INTO manuscript(id, file, book_id) VALUES (1,'manuscript_1',1);

--
-- Dumping data for table review
--

INSERT INTO review(id,"comment", book_id) VALUES (1,'Every time I read a novel by John Green, I think, this is my favorite. It is always true until the next one comes out. The Fault In Our Stars is my absolute favorite. I love the story. I love the characters.',1),(2,'I think this is a very well written book indeed as I have a clearer view on how to handle my own finance . This book had a clear cut on basic principle of what we need to have in our mindset to succeed . ',3),(3,'The book is really easy to understand and to read, the message Robert gives is good and can help you change your mindset to be more financially independent.',3);

-- Dump completed on 2020-08-08 16:41:55
