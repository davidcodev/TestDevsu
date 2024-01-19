-- Crea el usuario postgres
CREATE USER postgres WITH PASSWORD '000000';

-- Crea la base de datos y asignar permisos al usuario
CREATE DATABASE bank;
GRANT ALL PRIVILEGES ON DATABASE bank TO postgres;

--Las tablas y sus relaciones se crean al momento de levantar los microservicios