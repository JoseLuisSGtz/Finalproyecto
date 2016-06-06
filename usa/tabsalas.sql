-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2016 at 11:55 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyecto`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabsalas`
--

CREATE TABLE `tabsalas` (
  `Nsala` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Tipo de Sala` tinytext NOT NULL,
  `Material` tinytext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabsalas`
--

INSERT INTO `tabsalas` (`Nsala`, `Cantidad`, `Tipo de Sala`, `Material`) VALUES
(12, 2, 'sofias', 'suedt'),
(212, 4, 'Españachica', 'curry');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabsalas`
--
ALTER TABLE `tabsalas`
  ADD PRIMARY KEY (`Nsala`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
