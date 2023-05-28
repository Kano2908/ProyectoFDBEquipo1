-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: PFEquipo1
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bacceso`
--

DROP TABLE IF EXISTS `bacceso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bacceso` (
  `id` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(100) DEFAULT NULL,
  `fecha` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `operacion` varchar(55) DEFAULT NULL,
  `tabla` varchar(55) DEFAULT NULL,
  `valorViejo` varchar(255) DEFAULT NULL,
  `valorNuevo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bacceso`
--

LOCK TABLES `bacceso` WRITE;
/*!40000 ALTER TABLE `bacceso` DISABLE KEYS */;
INSERT INTO `bacceso` VALUES (1,'Kano@localhost','2023-05-22 05:02:07','INSERT','empleado',NULL,'12 Becerra Hernandez Paulino Niño Perdido #45 Cajero'),(2,'Kano@localhost','2023-05-22 05:02:27','UPDATE','empleado','6 Castañares Roman Jennifer Citlalli Veracu Cajero','6 Castañares Roman Jennifer Citlalli Veracruz Cajero'),(3,'Kano@localhost','2023-05-22 05:02:30','DELETE','empleado','12 Becerra Hernandez Paulino Niño Perdido #45 Cajero',NULL),(4,'Kano@localhost','2023-05-22 05:02:51','INSERT','cliente',NULL,'10 Munguia Anell Victor Sauces'),(5,'Kano@localhost','2023-05-22 05:02:58','UPDATE','cliente','10 Munguia Anell Victor Sauces','10 Munguia Anell Victor Manuel Sauces'),(6,'Kano@localhost','2023-05-22 05:03:01','DELETE','cliente','5 Guiochin Solares Jesus Jarras #42',NULL),(7,'Kano@localhost','2023-05-22 05:03:22','INSERT','proveedor',NULL,'7 Ceballos Martinez Ada Acajete'),(8,'Kano@localhost','2023-05-22 05:03:25','DELETE','proveedor','5 Juarez Luna Genaro Enrriqueta Lucas #456',NULL),(9,'Kano@localhost','2023-05-22 05:03:32','UPDATE','proveedor','7 Ceballos Martinez Ada Acajete','7 Ceballos Martinez Ada Fanny Acajete'),(10,'Kano@localhost','2023-05-22 05:04:04','INSERT','producto',NULL,'7 Plato Hondo 600 ml 22.00'),(11,'Kano@localhost','2023-05-22 05:04:04','INSERT','producto',NULL,'8 Vaso Termico 8 oz, 237 ml 17.00'),(12,'Kano@localhost','2023-05-22 05:04:04','INSERT','producto',NULL,'9 Cuchara Pastelera 50 piezas 12.00'),(13,'Kano@localhost','2023-05-22 05:04:04','INSERT','producto',NULL,'10 Vaso de Gelatina 5.8 oz 28.00'),(14,'Kano@localhost','2023-05-22 05:04:04','INSERT','producto',NULL,'11 Plato Pastelero 25 piezas 19.00'),(15,'Kano@localhost','2023-05-22 05:05:04','INSERT','producto',NULL,'12 Cucharas Pasteleras 40 Piezas 25.00'),(16,'Kano@localhost','2023-05-22 05:05:19','UPDATE','producto','10 Vaso de Gelatina 5.8 oz 28.00','10 Vaso de Gelatina 5.8 oz 22.00'),(17,'Kano@localhost','2023-05-22 05:09:18','DELETE','producto','7 Plato Hondo 600 ml 22.00',NULL),(18,'Gerente','2023-05-23 01:46:21',NULL,NULL,NULL,NULL),(19,'Kano@localhost','2023-05-27 23:18:44','UPDATE','empleado','6 Castañares Roman Jennifer Citlalli Veracruz Cajero','6 Castañares Roman Jennifer Citlalli Vera Cajero'),(20,'Kano@localhost','2023-05-28 00:35:12','INSERT','empleado',NULL,'13 Alarcon Lasso Alondra Fodonga #45 Cajero'),(21,'Kano@localhost','2023-05-28 00:43:32','INSERT','empleado',NULL,'14 Alarcon Lasso Alondra Fodonga #455 Cajero'),(22,'Kano@localhost','2023-05-28 00:43:42','DELETE','empleado','14 Alarcon Lasso Alondra Fodonga #455 Cajero',NULL),(23,'Kano@localhost','2023-05-28 00:43:47','UPDATE','empleado','13 Alarcon Lasso Alondra Fodonga #45 Cajero','13 Alarcon Lasso Alondra Fodonga #455 Cajero'),(24,'Kano@localhost','2023-05-28 01:08:59','INSERT','producto',NULL,'13 Chetos Morados 15.00'),(25,'Kano@localhost','2023-05-28 01:09:07','UPDATE','producto','13 Chetos Morados 15.00','13 Chetos Morados 17.00'),(26,'Kano@localhost','2023-05-28 01:09:12','DELETE','producto','13 Chetos Morados 17.00',NULL);
/*!40000 ALTER TABLE `bacceso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int unsigned NOT NULL AUTO_INCREMENT,
  `apellidoP` varchar(25) DEFAULT NULL,
  `apellidoM` varchar(25) DEFAULT NULL,
  `nombreC` varchar(25) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Suarez','Rodriguez','Juan','Murillo Vidal #2'),(2,'Acosta','Marquez','Liliana','Constitucion #119'),(3,'Diaz','Hernandez','Paulino','Niño Perdido #56'),(4,'Jimenez','Carillo','Raquel','Benito juarez #334'),(10,'Munguia','Anell','Victor Manuel','Sauces');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerCI` AFTER INSERT ON `cliente` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'INSERT';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'cliente', NULL, CONCAT(NEW.idCliente, ' ', NEW.apellidoP, ' ', NEW.apellidoM, ' ', NEW.nombreC, ' ', NEW.direccion));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerCU` AFTER UPDATE ON `cliente` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'UPDATE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'cliente', CONCAT(OLD.idCliente, ' ',OLD.apellidoP, ' ', OLD.apellidoM, ' ', OLD.nombreC, ' ', OLD.direccion), CONCAT(NEW.idCliente, ' ',NEW.apellidoP, ' ', NEW.apellidoM, ' ', NEW.nombreC, ' ', NEW.direccion));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerCD` AFTER DELETE ON `cliente` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'DELETE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'cliente', CONCAT(OLD.idCliente, ' ',OLD.apellidoP, ' ', OLD.apellidoM, ' ', OLD.nombreC, ' ', OLD.direccion), NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `detallapedido`
--

DROP TABLE IF EXISTS `detallapedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallapedido` (
  `idPedido` int unsigned NOT NULL,
  `idProducto` int unsigned NOT NULL,
  `cantidad` int unsigned DEFAULT NULL,
  `subtotal` decimal(9,2) unsigned DEFAULT NULL,
  PRIMARY KEY (`idPedido`,`idProducto`),
  KEY `fk_Pedido_has_Producto_Producto1_idx` (`idProducto`),
  KEY `fk_Pedido_has_Producto_Pedido1_idx` (`idPedido`),
  CONSTRAINT `fk_Pedido_has_Producto_Pedido1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  CONSTRAINT `fk_Pedido_has_Producto_Producto1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallapedido`
--

LOCK TABLES `detallapedido` WRITE;
/*!40000 ALTER TABLE `detallapedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallapedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallaproducto`
--

DROP TABLE IF EXISTS `detallaproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallaproducto` (
  `idVenta` int unsigned NOT NULL,
  `idProducto` int unsigned NOT NULL,
  `cantidad` int DEFAULT NULL,
  `subtotal` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`idVenta`,`idProducto`),
  KEY `fk_Venta_has_Producto_Producto1_idx` (`idProducto`),
  KEY `fk_Venta_has_Producto_Venta1_idx` (`idVenta`),
  CONSTRAINT `fk_Venta_has_Producto_Producto1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  CONSTRAINT `fk_Venta_has_Producto_Venta1` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallaproducto`
--

LOCK TABLES `detallaproducto` WRITE;
/*!40000 ALTER TABLE `detallaproducto` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallaproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `idEmpleado` int unsigned NOT NULL AUTO_INCREMENT,
  `apellidoP` varchar(20) DEFAULT NULL,
  `apellidoM` varchar(20) DEFAULT NULL,
  `nombreE` varchar(25) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `tipoEmpleado` enum('Cajero','Ayudante') DEFAULT NULL,
  PRIMARY KEY (`idEmpleado`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'Carball','Cano','Christian Noe','Jose de Alvarado #232','Cajero'),(2,'De La Luz','Sierra','Rafael Alejandro','Lazaro Cardenas','Cajero'),(6,'Castañares','Roman','Jennifer Citlalli','Vera','Cajero'),(13,'Alarcon','Lasso','Alondra','Fodonga #455','Cajero');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerEI` AFTER INSERT ON `empleado` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'INSERT';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'empleado', NULL, CONCAT(NEW.idEmpleado, ' ', NEW.apellidoP, ' ', NEW.apellidoM, ' ', NEW.nombreE, ' ', NEW.direccion, ' ', NEW.tipoEmpleado));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerEU` AFTER UPDATE ON `empleado` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'UPDATE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'empleado', CONCAT(OLD.idEmpleado, ' ',OLD.apellidoP, ' ', OLD.apellidoM, ' ', OLD.nombreE, ' ', OLD.direccion, ' ', OLD.tipoEmpleado), CONCAT(NEW.idEmpleado, ' ',NEW.apellidoP, ' ', NEW.apellidoM, ' ', NEW.nombreE, ' ', NEW.direccion, ' ', NEW.tipoEmpleado));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerED` AFTER DELETE ON `empleado` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'DELETE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'empleado', CONCAT(OLD.idEmpleado, ' ',OLD.apellidoP, ' ', OLD.apellidoM, ' ', OLD.nombreE, ' ', OLD.direccion, ' ', OLD.tipoEmpleado), NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `idPedido` int unsigned NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `cantidad` int unsigned DEFAULT NULL,
  `total` decimal(5,2) unsigned DEFAULT NULL,
  `idProveedor` int unsigned NOT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `fk_Pedido_Proveedor1_idx` (`idProveedor`),
  CONSTRAINT `fk_Pedido_Proveedor1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idProducto` int unsigned NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(45) DEFAULT NULL,
  `descripcion` varchar(40) DEFAULT NULL,
  `precio` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (8,'Vaso Termico','8 oz, 237 ml',17.00),(9,'Cuchara Pastelera','50 piezas',12.00),(10,'Vaso de Gelatina','5.8 oz',22.00),(11,'Plato Pastelero','25 piezas',19.00),(12,'Cucharas Pasteleras','40 Piezas',25.00);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerPTI` AFTER INSERT ON `producto` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'INSERT';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'producto', NULL, CONCAT(NEW.idProducto, ' ', NEW.nombreProducto, ' ', NEW.descripcion, ' ', NEW.precio));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerPTU` AFTER UPDATE ON `producto` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'UPDATE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'producto', CONCAT(OLD.idProducto, ' ', OLD.nombreProducto, ' ', OLD.descripcion, ' ', OLD.precio), CONCAT(NEW.idProducto, ' ', NEW.nombreProducto, ' ', NEW.descripcion, ' ', NEW.precio));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerPTD` AFTER DELETE ON `producto` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'DELETE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'producto', CONCAT(OLD.idProducto, ' ', OLD.nombreProducto, ' ', OLD.descripcion, ' ', OLD.precio), NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `idProveedor` int unsigned NOT NULL AUTO_INCREMENT,
  `apellidoP` varchar(25) DEFAULT NULL,
  `apellidoM` varchar(25) DEFAULT NULL,
  `nombreP` varchar(25) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Gonzales','Parra','Alejandro','Maria Enrriqueta #698'),(2,'Viveros','Hernandez','Yony','Juarez Parra #445'),(3,'Acosta','Rodriguez','Juan Carlos','Allende #456'),(4,'Marquez','Agosto','Manuel','Jose Alvarado #45'),(7,'Ceballos','Martinez','Ada Fanny','Acajete');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerPI` AFTER INSERT ON `proveedor` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'INSERT';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'proveedor', NULL, CONCAT(NEW.idProveedor, ' ', NEW.apellidoP, ' ', NEW.apellidoM, ' ', NEW.nombreP, ' ', NEW.direccion));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerPU` AFTER UPDATE ON `proveedor` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'UPDATE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'proveedor', CONCAT(OLD.idProveedor, ' ',OLD.apellidoP, ' ', OLD.apellidoM, ' ', OLD.nombreP, ' ', OLD.direccion), CONCAT(NEW.idProveedor, ' ',NEW.apellidoP, ' ', NEW.apellidoM, ' ', NEW.nombreP, ' ', NEW.direccion));
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `triggerPD` AFTER DELETE ON `proveedor` FOR EACH ROW BEGIN
    DECLARE operacion VARCHAR(55);
    
    SET operacion = 'DELETE';
    
    INSERT INTO bAcceso (usuario, fecha, operacion, tabla, valorViejo, valorNuevo)
    VALUES (USER(), NOW(), operacion, 'proveedor', CONCAT(OLD.idProveedor, ' ',OLD.apellidoP, ' ', OLD.apellidoM, ' ', OLD.nombreP, ' ', OLD.direccion), NULL);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `telefonosc`
--

DROP TABLE IF EXISTS `telefonosc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonosc` (
  `idCliente` int unsigned NOT NULL,
  `telefono` bigint unsigned NOT NULL,
  PRIMARY KEY (`idCliente`,`telefono`),
  KEY `fk_TelefonosC_Cliente1_idx` (`idCliente`),
  CONSTRAINT `fk_TelefonosC_Cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonosc`
--

LOCK TABLES `telefonosc` WRITE;
/*!40000 ALTER TABLE `telefonosc` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefonosc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonose`
--

DROP TABLE IF EXISTS `telefonose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonose` (
  `idEmpleado` int unsigned NOT NULL,
  `telefono` bigint unsigned NOT NULL,
  PRIMARY KEY (`idEmpleado`,`telefono`),
  KEY `fk_TelefonosE_Empleado_idx` (`idEmpleado`),
  CONSTRAINT `fk_TelefonosE_Empleado` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonose`
--

LOCK TABLES `telefonose` WRITE;
/*!40000 ALTER TABLE `telefonose` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefonose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonosp`
--

DROP TABLE IF EXISTS `telefonosp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonosp` (
  `idProveedor` int unsigned NOT NULL,
  `telefono` bigint unsigned NOT NULL,
  PRIMARY KEY (`idProveedor`,`telefono`),
  KEY `fk_TelefonosP_Proveedor1_idx` (`idProveedor`),
  CONSTRAINT `fk_TelefonosP_Proveedor1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonosp`
--

LOCK TABLES `telefonosp` WRITE;
/*!40000 ALTER TABLE `telefonosp` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefonosp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `contraseña` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Admin','12345'),(2,'Gerente','12345');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = cp850 */ ;
/*!50003 SET character_set_results = cp850 */ ;
/*!50003 SET collation_connection  = cp850_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`Kano`@`localhost`*/ /*!50003 TRIGGER `tAcceso` AFTER INSERT ON `usuario` FOR EACH ROW BEGIN
  INSERT INTO bAcceso (usuario, fecha) VALUES (NEW.usuario, CURRENT_TIMESTAMP);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `idVenta` int unsigned NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `cantidad` int unsigned DEFAULT NULL,
  `total` decimal(9,2) unsigned DEFAULT NULL,
  `idEmpleado` int unsigned NOT NULL,
  `idCliente` int unsigned NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `fk_Venta_Empleado1_idx` (`idEmpleado`),
  KEY `fk_Venta_Cliente1_idx` (`idCliente`),
  CONSTRAINT `fk_Venta_Cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `fk_Venta_Empleado1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-27 19:46:18
