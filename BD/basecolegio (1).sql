-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-05-2019 a las 03:32:35
-- Versión del servidor: 5.7.21-log
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `basecolegio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido Paterno` varchar(45) NOT NULL,
  `Apellido Materno` varchar(45) NOT NULL,
  `Direccion` text NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Fecha Ingreso` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Datos del alumno';

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `Nombre`, `Apellido Paterno`, `Apellido Materno`, `Direccion`, `Telefono`, `Fecha Ingreso`) VALUES
(1, 'Sebastian', 'Sanchez', 'Carmona', 'crra 35-b', '3216549870', '2019-03-20'),
(2, 'Felipe', 'Acosta', 'Rivera', 'Crra 34-26c', '3216968754', '2019-03-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colegio`
--

CREATE TABLE `colegio` (
  `idColegio` int(11) NOT NULL,
  `Nombre` text NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Correo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Datos del colegio';

--
-- Volcado de datos para la tabla `colegio`
--

INSERT INTO `colegio` (`idColegio`, `Nombre`, `Direccion`, `Telefono`, `Correo`) VALUES
(1, 'CORHUILA', 'Prado Alto', '12354879', 'corhuila@corhuila.edu.co');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Horario` varchar(45) NOT NULL,
  `Salon` varchar(45) NOT NULL,
  `fk_idProfesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Datos de la Materia';

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `Nombre`, `Horario`, `Salon`, `fk_idProfesor`) VALUES
(1, 'Calculo', '7:00 A.M', 'C210', 12),
(2, 'Ingles', '6:00 A.M', 'C503', 32);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia_has_alumno`
--

CREATE TABLE `materia_has_alumno` (
  `fk_idMateria` int(11) NOT NULL,
  `fk_idAlumno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `materia_has_alumno`
--

INSERT INTO `materia_has_alumno` (`fk_idMateria`, `fk_idAlumno`) VALUES
(1, 1),
(2, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `idProfesor` int(11) NOT NULL,
  `fk_idColegio` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido Paterno` varchar(45) NOT NULL,
  `Apellido Materno` varchar(45) NOT NULL,
  `Cedula Profesional` varchar(45) NOT NULL,
  `Dirección` text NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Materia que imparte` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Datos de los profesores';

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`idProfesor`, `fk_idColegio`, `Nombre`, `Apellido Paterno`, `Apellido Materno`, `Cedula Profesional`, `Dirección`, `Telefono`, `Materia que imparte`) VALUES
(12, 1, 'Johan ', 'Lasso', 'Rivas', '1075306237', 'Puertas del Sol', '321564879', 'Sexologia, Religion'),
(32, 1, 'Camacho', 'Lopez', 'Rivera', '5315648', 'Cabulos', '311546987', 'Fisica, Matematicas');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`);

--
-- Indices de la tabla `colegio`
--
ALTER TABLE `colegio`
  ADD PRIMARY KEY (`idColegio`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD KEY `Profesores_idProfesor` (`fk_idProfesor`);

--
-- Indices de la tabla `materia_has_alumno`
--
ALTER TABLE `materia_has_alumno`
  ADD PRIMARY KEY (`fk_idMateria`,`fk_idAlumno`),
  ADD KEY `fk_materia_has_alumno_alumno` (`fk_idAlumno`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`idProfesor`) USING BTREE,
  ADD KEY `fk_profesores_colegio` (`fk_idColegio`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `fk_materia_profesores` FOREIGN KEY (`fk_idProfesor`) REFERENCES `profesores` (`idProfesor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `materia_has_alumno`
--
ALTER TABLE `materia_has_alumno`
  ADD CONSTRAINT `fk_materia_has_alumno_alumno` FOREIGN KEY (`fk_idAlumno`) REFERENCES `alumno` (`idAlumno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_materia_has_alumno_materia` FOREIGN KEY (`fk_idMateria`) REFERENCES `materia` (`idMateria`);

--
-- Filtros para la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD CONSTRAINT `fk_profesores_colegio` FOREIGN KEY (`fk_idColegio`) REFERENCES `colegio` (`idColegio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
