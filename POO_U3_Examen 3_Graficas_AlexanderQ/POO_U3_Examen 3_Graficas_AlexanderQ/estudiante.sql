-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-08-2023 a las 19:46:57
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `estudiante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `codigo` int(40) NOT NULL,
  `estu_codigo` varchar(40) NOT NULL,
  `estu_cedula` int(10) NOT NULL,
  `estu_apellido` varchar(40) NOT NULL,
  `estu_nombre` varchar(40) NOT NULL,
  `estu_mail` varchar(40) NOT NULL,
  `estu_telefono` int(10) NOT NULL,
  `estu_direccion` varchar(40) NOT NULL,
  `estu_materia` varchar(40) NOT NULL,
  `estu_estado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`codigo`, `estu_codigo`, `estu_cedula`, `estu_apellido`, `estu_nombre`, `estu_mail`, `estu_telefono`, `estu_direccion`, `estu_materia`, `estu_estado`) VALUES
(1, 'L004321', 213456789, 'Quizhpe', 'Alexander', 'amquizhpe@espe.edu.ec', 987654321, 'Juan', 'POO', 'Aprobado'),
(3, 'dcfgvhb', 1234, 'sdfg', 'gfd', 'gfd6543', 6543, 'bfvdd', 'COMPUTACION', 'Inactivo'),
(4, 'loosdf', 45, 'vc', 'fd', 'df', 78, 'bn', 'EDO', 'Reprobado'),
(5, 'loosdf', 45, 'vc', 'fd', 'df', 78, 'bn', 'EDO', 'Aprobado'),
(7, 'hasfd', 23, '23ewsd', 'sd', 'sdf', 23, 'dsf', 'CALCULO', 'Aprobado'),
(8, 'hasfd', 23, '23ewsd', 'sd', 'sdf', 23, 'dsf', 'CALCULO', 'Reprobado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `estu_codigo` int(11) NOT NULL,
  `estu_nombre` varchar(40) NOT NULL,
  `estu_apellido` varchar(40) NOT NULL,
  `estu_asignatura` varchar(40) NOT NULL,
  `estu_promedio` double NOT NULL,
  `estu_estado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiantes`
--

INSERT INTO `estudiantes` (`estu_codigo`, `estu_nombre`, `estu_apellido`, `estu_asignatura`, `estu_promedio`, `estu_estado`) VALUES
(8, 'Alexander', 'Quizhpe', 'CALCULO', 17, 'APROVADO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `lab_codigo` int(11) NOT NULL,
  `lab_numlab` int(40) NOT NULL,
  `lab_nombre` varchar(40) NOT NULL,
  `lab_hora` varchar(40) NOT NULL,
  `lab_materia` varchar(40) NOT NULL,
  `lab_dia` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `horario`
--

INSERT INTO `horario` (`lab_codigo`, `lab_numlab`, `lab_nombre`, `lab_hora`, `lab_materia`, `lab_dia`) VALUES
(6, 3, 'Computacion', '13:00 - 14:00', 'POO', 'Jueves'),
(7, 12, 'asa', '07:00 - 08:00', 'asd', 'Lunes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `lab_codigo` int(40) NOT NULL,
  `lab_num` varchar(40) NOT NULL,
  `lab_nombre` varchar(40) NOT NULL,
  `lab_encarg` varchar(40) NOT NULL,
  `lab_capa` int(40) NOT NULL,
  `lab_bloque` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`lab_codigo`, `lab_num`, `lab_nombre`, `lab_encarg`, `lab_capa`, `lab_bloque`) VALUES
(1, '1', 'Quimica/Fisica', 'Francisco', 30, 'Bloque A'),
(2, '23', 'Computacion', 'Ivan', 20, 'Bloque B');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `profe_codigo` bigint(20) NOT NULL,
  `profe_cedula` bigint(20) NOT NULL,
  `profe_nombre` varchar(40) NOT NULL,
  `profe_apellido` varchar(40) NOT NULL,
  `profe_celular` bigint(20) NOT NULL,
  `profe_mail` varchar(40) NOT NULL,
  `profe_titulo` varchar(40) NOT NULL,
  `profe_estado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`profe_codigo`, `profe_cedula`, `profe_nombre`, `profe_apellido`, `profe_celular`, `profe_mail`, `profe_titulo`, `profe_estado`) VALUES
(7, 2300400799, 'Alexander', 'Quizhpe', 987654321, 'alexandermqc2004@hotmail.com', 'ING. Sistemas', 'CONTRATO'),
(8, 123, 's', 'd', 54, 'sdug', 'suidfh', 'Nombramiento'),
(10, 9459837, 's', 'd', 54, 'sdug', 'suidfh', 'Contrato');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usu_codigo` int(40) NOT NULL,
  `usu_usuario` varchar(40) NOT NULL,
  `usu_pass` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usu_codigo`, `usu_usuario`, `usu_pass`) VALUES
(1, 'amquizhpe', '210904'),
(2, 'alexmig14', '12345'),
(3, 'alexa', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`estu_codigo`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`lab_codigo`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`lab_codigo`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`profe_codigo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usu_codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `codigo` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  MODIFY `estu_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `lab_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `lab_codigo` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `profe_codigo` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usu_codigo` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
