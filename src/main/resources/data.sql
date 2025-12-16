INSERT INTO duenio (id_duenio, nombre, apellido, telefono, correo, direccion)
VALUES (1, 'Paula', 'García', 666111222, 'paula@mail.com', 'Calle Flor, 12');

INSERT INTO duenio (id_duenio, nombre, apellido, telefono, correo, direccion)
VALUES (2, 'Carlos', 'López', 666333444, 'carlos@mail.com', 'Av. Sol, 45');

INSERT INTO duenio (id_duenio, nombre, apellido, telefono, correo, direccion)
VALUES (3, 'Lucía', 'Martín', 666555666, 'lucia@mail.com', 'Plaza Luna, 7');


-- =========================
-- MASCOTA
-- =========================
INSERT INTO mascota (id_mascota, nombre, especie, raza, fecha_nac, peso, id_duenio)
VALUES (1, 'Luna', 'Perro', 'Labrador', '2020-05-10', 25.5, 1);

INSERT INTO mascota (id_mascota, nombre, especie, raza, fecha_nac, peso, id_duenio)
VALUES (2, 'Misu', 'Gato', 'Siames', '2021-03-15', 4.2, 2);

INSERT INTO mascota (id_mascota, nombre, especie, raza, fecha_nac, peso, id_duenio)
VALUES (3, 'Rocky', 'Perro', 'Bulldog', '2019-11-20', 18.0, 1);



INSERT INTO veterinario (id_vet, nombre, apellido, especialidad, num_colegiado, horario)
VALUES (1, 'Ana', 'Sánchez', 'CLINICA_GENERAL', 'COL123', 'Lunes-Viernes 9-17');

INSERT INTO veterinario (id_vet, nombre, apellido, especialidad, num_colegiado, horario)
VALUES (2, 'Javier', 'Pérez', 'CIRUGIA', 'COL456', 'Martes-Sábado 10-18');

INSERT INTO veterinario (id_vet, nombre, apellido, especialidad, num_colegiado, horario)
VALUES (3, 'María', 'Ruiz', 'EXOTICOS', 'COL789', 'Lunes-Jueves 8-16');



-- CITA
INSERT INTO cita (fecha, hora, estado, id_mascota, id_veterinario)
VALUES ('2025-01-10', '10:00:00', 'PENDIENTE', 1, 1);

INSERT INTO cita (fecha, hora, estado, id_mascota, id_veterinario)
VALUES ('2025-01-12', '11:30:00', 'CONFIRMADA', 2, 2);

INSERT INTO cita (fecha, hora, estado, id_mascota, id_veterinario)
VALUES ('2025-01-15', '09:00:00', 'CANCELADA', 3, 3);


-- =========================
-- HISTORIAL
-- =========================
INSERT INTO historial (id_historial, tratamiento, diagnostico, observaciones, id_mascota)
VALUES (1, 'Vacunación', 'Chequeo general', 'Todo correcto', 1);

INSERT INTO historial (id_historial, tratamiento, diagnostico, observaciones, id_mascota)
VALUES (2, 'Desparasitación', 'Parásitos intestinales', 'Se recomienda control en 3 meses', 2);

INSERT INTO historial (id_historial, tratamiento, diagnostico, observaciones, id_mascota)
VALUES (3, 'Cirugía', 'Fractura de pata', 'Operación exitosa, recuperación en curso', 3);


-- =========================
-- COMPRA
-- =========================
INSERT INTO compra (id_compra, nombre, tipo, precio)
VALUES (1, 'CONSULTA', 'SERVICIO', 30.0);

INSERT INTO compra (id_compra, nombre, tipo, precio)
VALUES (2, 'VACUNA', 'SERVICIO', 20.0);

INSERT INTO compra (id_compra, nombre, tipo, precio)
VALUES (3, 'DESPARACITACION', 'SERVICIO', 15.0);

INSERT INTO compra (id_compra, nombre, tipo, precio)
VALUES (4, 'MEDICAMENTO', 'PRODUCTO', 12.5);


