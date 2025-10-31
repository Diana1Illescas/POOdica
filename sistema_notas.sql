-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-10-2025 a las 08:40:54
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_notas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auditoria_notas`
--

CREATE TABLE `auditoria_notas` (
  `auditoria_id` varchar(6) NOT NULL,
  `nota_id` varchar(6) NOT NULL,
  `nota_anterior` decimal(4,2) DEFAULT NULL,
  `nota_nueva` decimal(4,2) DEFAULT NULL,
  `usuario_modificador` varchar(6) DEFAULT NULL,
  `fecha_modificacion` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `auditoria_notas`
--

INSERT INTO `auditoria_notas` (`auditoria_id`, `nota_id`, `nota_anterior`, `nota_nueva`, `usuario_modificador`, `fecha_modificacion`) VALUES
('', 'N00006', 65.00, 75.00, 'U00002', '2025-10-31 07:34:15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `estudiante_id` varchar(6) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `cedula` varchar(10) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `usuario_id` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiantes`
--

INSERT INTO `estudiantes` (`estudiante_id`, `nombre`, `apellido`, `cedula`, `direccion`, `usuario_id`) VALUES
('E00001', 'Dayanara', 'Bautista', '2350083057', 'Coop. San Ignacio', 'U00003'),
('E00003', 'Andy', 'Laglaguano', '2350083059', 'Av. Rio Toachi', 'U00005');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `materia_id` varchar(6) NOT NULL,
  `nombre_materia` varchar(50) NOT NULL,
  `creditos` int(11) DEFAULT 3
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`materia_id`, `nombre_materia`, `creditos`) VALUES
('M00001', 'Matemáticas', 4),
('M00002', 'Programación', 5),
('M00003', 'Base de Datos', 4),
('M00004', 'Redes', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE `notas` (
  `nota_id` varchar(6) NOT NULL,
  `estudiante_id` varchar(6) NOT NULL,
  `materia_id` varchar(6) NOT NULL,
  `nota` decimal(4,2) DEFAULT NULL CHECK (`nota` >= 0 and `nota` <= 100),
  `fecha_registro` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `notas`
--

INSERT INTO `notas` (`nota_id`, `estudiante_id`, `materia_id`, `nota`, `fecha_registro`) VALUES
('N00002', 'E00001', 'M00002', 92.00, '2025-10-31 05:25:57'),
('N00003', 'E00001', 'M00003', 78.25, '2025-10-31 05:25:57'),
('N00006', 'E00003', 'M00001', 75.00, '2025-10-31 05:25:57'),
('N00007', 'E00003', 'M00003', 72.00, '2025-10-31 05:25:57');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `rol_id` varchar(6) NOT NULL,
  `nombre_rol` varchar(30) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`rol_id`, `nombre_rol`, `descripcion`) VALUES
('R00001', 'Administrador', 'Control total del sistema'),
('R00002', 'Docente', 'Puede gestionar notas'),
('R00003', 'Estudiante', 'Solo puede ver sus notas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario_id` varchar(6) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `clave` varchar(50) NOT NULL,
  `rol_id` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario_id`, `nombre_usuario`, `clave`, `rol_id`) VALUES
('U00001', 'admin_bautista', 'admin123', 'R00001'),
('U00002', 'docente_bautista', 'docente123', 'R00002'),
('U00003', 'estu_dayanara', 'estu123', 'R00003'),
('U00005', 'estu_andy', 'estu123', 'R00003');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vw_mis_notas`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vw_mis_notas` (
`nota_id` varchar(6)
,`nombre_materia` varchar(50)
,`nota` decimal(4,2)
,`fecha_registro` timestamp
,`estudiante` varchar(101)
,`nombre_usuario` varchar(50)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `vw_mis_notas`
--
DROP TABLE IF EXISTS `vw_mis_notas`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vw_mis_notas`  AS SELECT `n`.`nota_id` AS `nota_id`, `m`.`nombre_materia` AS `nombre_materia`, `n`.`nota` AS `nota`, `n`.`fecha_registro` AS `fecha_registro`, concat(`e`.`nombre`,' ',`e`.`apellido`) AS `estudiante`, `u`.`nombre_usuario` AS `nombre_usuario` FROM (((`notas` `n` join `materias` `m` on(`n`.`materia_id` = `m`.`materia_id`)) join `estudiantes` `e` on(`n`.`estudiante_id` = `e`.`estudiante_id`)) join `usuarios` `u` on(`e`.`usuario_id` = `u`.`usuario_id`)) WHERE `u`.`nombre_usuario` = current_user() ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `auditoria_notas`
--
ALTER TABLE `auditoria_notas`
  ADD PRIMARY KEY (`auditoria_id`),
  ADD KEY `nota_id` (`nota_id`),
  ADD KEY `usuario_modificador` (`usuario_modificador`);

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`estudiante_id`),
  ADD KEY `usuario_id` (`usuario_id`);

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`materia_id`);

--
-- Indices de la tabla `notas`
--
ALTER TABLE `notas`
  ADD PRIMARY KEY (`nota_id`),
  ADD KEY `estudiante_id` (`estudiante_id`),
  ADD KEY `materia_id` (`materia_id`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`rol_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario_id`),
  ADD KEY `rol_id` (`rol_id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `auditoria_notas`
--
ALTER TABLE `auditoria_notas`
  ADD CONSTRAINT `auditoria_notas_ibfk_1` FOREIGN KEY (`nota_id`) REFERENCES `notas` (`nota_id`),
  ADD CONSTRAINT `auditoria_notas_ibfk_2` FOREIGN KEY (`usuario_modificador`) REFERENCES `usuarios` (`usuario_id`);

--
-- Filtros para la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD CONSTRAINT `estudiantes_ibfk_1` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`usuario_id`);

--
-- Filtros para la tabla `notas`
--
ALTER TABLE `notas`
  ADD CONSTRAINT `notas_ibfk_1` FOREIGN KEY (`estudiante_id`) REFERENCES `estudiantes` (`estudiante_id`),
  ADD CONSTRAINT `notas_ibfk_2` FOREIGN KEY (`materia_id`) REFERENCES `materias` (`materia_id`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`rol_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
