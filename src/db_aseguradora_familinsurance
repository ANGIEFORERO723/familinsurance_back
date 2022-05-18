-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-05-2022 a las 22:28:36
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_aseguradora_familinsurance`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_services`
--

CREATE TABLE `tb_services` (
  `Id` int(10) NOT NULL,
  `Nombre` varchar(200) NOT NULL,
  `Descripcion` text NOT NULL,
  `Imagen` varchar(200) NOT NULL,
  `Categoria` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_services`
--

INSERT INTO `tb_services` (`Id`, `Nombre`, `Descripcion`, `Imagen`, `Categoria`) VALUES
(1, 'Pagos', 'Tus pagos a través de PSE,  débito automático, bancos y financieras. Conoce los medios de pago y puntos disponibles', 'https://angieforero723.github.io/familinsurance/assets/img/icons/credit-card.png', 'Servicios principales'),
(2, 'chatea con nosotros', 'Chatea con nosotros para que tu experiencia en nuestra página web sea más facil.', 'https://angieforero723.github.io/familinsurance/assets/img/icons/chat.png', 'Servicios principales'),
(3, 'Factura electronica', 'Recibe tu factura electrónica o notas crédito a tu correo registrado.\n', 'https://angieforero723.github.io/familinsurance/assets/img/icons/factura.png', 'Servicios principales'),
(4, 'Experiencia familinsuerance', 'Cuentanos tu experian vivida con Familinsurance', 'https://angieforero723.github.io/familinsurance/assets/img/icons/experiencia.png', 'Servicios principales'),
(5, 'E-cliente', 'Registrate en E-Cliente, la plataforma virtual que te conecta con tus Seguros Familinsurance.\n', 'https://angieforero723.github.io/familinsurance/assets/img/icons/web.png', 'Servicios principales'),
(6, 'Centros medicos', 'Ingresa  y agenda tu cita a través de nuestra plataforma en los Centros Médicos  Familsurance.', 'https://angieforero723.github.io/familinsurance/assets/img/icons/salud.png', 'Salud'),
(7, 'Directrio medico', ' Comunicate a nuestras sedes desde nuestras lineas telefonicas ', 'https://angieforero723.github.io/familinsurance/assets/img/icons/directorio.png', 'Salud'),
(8, 'Reembolsos y autorizaciones', 'Realiza tu rembolso y autorizaciones desde el correo electronico familinsurance@familin.com', 'https://angieforero723.github.io/familinsurance/assets/img/icons/reembolso.png', 'Salud'),
(9, 'Especialistas virtuales', 'seccion donde te daran atencion por teleconsulta', 'https://github.com/ANGIEFORERO723/familinsurance/blob/main/docs/assets/img/icons/cell.png?raw=true', 'Salud'),
(10, 'Orientacion en casa', 'Aquí recogemos algunas nociones que te pueden servir a la hora de elegir la orientación de las distintas estancias de tu casa', 'https://github.com/ANGIEFORERO723/familinsurance/blob/main/docs/assets/img/icons/call2.png?raw=true', 'Salud'),
(11, 'Centro de Ayudas Diagnósticas', 'Dentro de esta área se realizan procedimientos relacionados con la recuperación física y funcional de las personas que presentan alguna discapacidad', 'https://angieforero723.github.io/familinsurance/assets/img/icons/ayuda.png', 'Salud'),
(12, 'Familinsurance E - Card Autos', 'La cobertura de Familisurance de Autos paga los daños o perjuicios a un vehículo alquilado ocasionados por un choque, robo, acto de vandalismo o incendio.\n', 'https://angieforero723.github.io/familinsurance/assets/img/icons/cell.png', 'Autos'),
(13, '¿Qué hacer en caso de accidente?', 'Estar tranquilo porque tus beneficiarios recibirán una indemnización en caso de que fallezcas en un accidente o como consecuencia de este. \n', 'https://angieforero723.github.io/familinsurance/assets/img/icons/car.png', 'Autos'),
(14, 'Talleres Familinsurance', 'Te presentamos nuestra amplia red de talleres y concesionarios vehiculares para la atención en daños propios, etc.', 'https://angieforero723.github.io/familinsurance/assets/img/icons/taller.png', 'Autos'),
(15, 'Peritación Digital', 'Realiza tu solicitud para cuando se presente un daño en tu hogar o empresa.', 'https://angieforero723.github.io/familinsurance/assets/img/icons/home.png', 'Hogar'),
(16, 'Familinsurance E-Card Hogar', 'Protege tus muebles con el Seguro de Hogar Familisurance, ideal para tus necesidades. ¡Entra ya! Seguro Hogar.', 'https://angieforero723.github.io/familinsurance/assets/img/icons/home2.png', 'Hogar');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_services`
--
ALTER TABLE `tb_services`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_services`
--
ALTER TABLE `tb_services`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
