-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'John','Green','1977-08-24','m'),(2,'Dan','Brown','1964-06-22','m'),(3,'Robert','Kiyosaki','1947-04-08','m'),(4,'Sharon','Lechter','1954-01-12','f'),(5,'John','Grisam','1955-02-08','m'),(6,'Bhagyashree','Chavan','1990-04-01','f');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'The Fault in Our Stars'),(2,'Inferno'),(3,'Rich Dad Poor Dad'),(4,'The Da Vinci Code'),(5,'Angels and Demons'),(6,'A time to kill'),(7,'The Lost Symbol'),(8,'Digital Fortress'),(9,'Deception Point');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `book_author`
--

LOCK TABLES `book_author` WRITE;
/*!40000 ALTER TABLE `book_author` DISABLE KEYS */;
INSERT INTO `book_author` VALUES (1,1),(2,2),(3,3),(3,4),(4,2),(5,2),(6,5),(7,2),(8,2),(9,2);
/*!40000 ALTER TABLE `book_author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `book_publisher`
--

LOCK TABLES `book_publisher` WRITE;
/*!40000 ALTER TABLE `book_publisher` DISABLE KEYS */;
INSERT INTO `book_publisher` VALUES (1,1,'HARDCOVER','2012-01-10'),(3,2,'PAPERBACK','2000-04-01');
/*!40000 ALTER TABLE `book_publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `manuscript`
--

LOCK TABLES `manuscript` WRITE;
/*!40000 ALTER TABLE `manuscript` DISABLE KEYS */;
INSERT INTO `manuscript` VALUES (1,'manuscript_1',1);
/*!40000 ALTER TABLE `manuscript` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES (1,'E P Dutton'),(2,'Warner Books Ed');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'Every time I read a novel by John Green, I think, this is my favorite. It is always true until the next one comes out. The Fault In Our Stars is my absolute favorite. I love the story. I love the characters.',1),(2,'I think this is a very well written book indeed as I have a clearer view on how to handle my own finance . This book had a clear cut on basic principle of what we need to have in our mindset to succeed . ',3),(3,'The book is really easy to understand and to read, the message Robert gives is good and can help you change your mindset to be more financially independent.',3);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'demo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-08 16:41:55
