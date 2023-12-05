DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS salas;

CREATE TABLE peliculas (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    calificacion_edad INT
);

CREATE TABLE salas (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    cod_pelicula INT,
    FOREIGN KEY (cod_pelicula)
        REFERENCES peliculas (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Frozen', 6);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('It', 18);

INSERT INTO salas (nombre, cod_pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas (nombre, cod_pelicula) VALUES ('Sala 2', 2);