-- =========================
-- CLIENTE (dueños)
-- =========================
INSERT INTO cliente (id_cliente, nombre, apellidos, telefono, correo, direccion)
VALUES (1, 'Paula', 'García', 666111222, 'paula@mail.com', 'Calle Flor, 12');

INSERT INTO cliente (id_cliente, nombre, apellidos, telefono, correo, direccion)
VALUES (2, 'Carlos', 'López', 666333444, 'carlos@mail.com', 'Av. Sol, 45');

INSERT INTO cliente (id_cliente, nombre, apellidos, telefono, correo, direccion)
VALUES (3, 'Lucía', 'Martín', 666555666, 'lucia@mail.com', 'Plaza Luna, 7');

-- =========================
-- MASCOTA (pacientes)
-- =========================
INSERT INTO mascota (id_mascota, nombre, especie, raza, fecha_nac, peso, id_cliente)
VALUES (1, 'Luna', 'Perro', 'Labrador', '2020-05-10', 25.5, 1);

INSERT INTO mascota (id_mascota, nombre, especie, raza, fecha_nac, peso, id_cliente)
VALUES (2, 'Michi', 'Gato', 'Siames', '2021-03-15', 4.2, 2);

INSERT INTO mascota (id_mascota, nombre, especie, raza, fecha_nac, peso, id_cliente)
VALUES (3, 'Rocky', 'Perro', 'Bulldog', '2019-11-20', 30.0, 3);

-- =========================
-- VETERINARIO
-- =========================
INSERT INTO veterinario (id_vet, nombre, apellido, especialidad, num_colegiado, horario)
VALUES (1, 'Ana', 'Sánchez', 'CLINICA_GENERAL', 'COL123', 'Lunes-Viernes 9-17');

INSERT INTO veterinario (id_vet, nombre, apellido, especialidad, num_colegiado, horario)
VALUES (2, 'Javier', 'Pérez', 'CIRUGIA', 'COL456', 'Martes-Sábado 10-18');

INSERT INTO veterinario (id_vet, nombre, apellido, especialidad, num_colegiado, horario)
VALUES (3, 'María', 'Ruiz', 'EXOTICOS', 'COL789', 'Lunes-Jueves 8-16');

-- =========================
-- CITA
-- =========================
INSERT INTO cita (id_cita, fecha, hora, estado, id_mascota, id_veterinario)
VALUES (1, '2025-01-10', '10:00:00', 'PENDIENTE', 1, 1);

INSERT INTO cita (id_cita, fecha, hora, estado, id_mascota, id_veterinario)
VALUES (2, '2025-01-12', '11:30:00', 'CONFIRMADA', 2, 2);

INSERT INTO cita (id_cita, fecha, hora, estado, id_mascota, id_veterinario)
VALUES (3, '2025-01-15', '09:00:00', 'CANCELADA', 3, 3);

-- =========================
-- HISTORIAL MÉDICO
-- =========================
INSERT INTO historial (id_historial, tratamiento, diagnostico, observaciones, id_mascota)
VALUES (1, 'Vacuna Rabia', 'Prevención', 'Mascota tranquila, sin complicaciones', 1);

INSERT INTO historial (id_historial, tratamiento, diagnostico, observaciones, id_mascota)
VALUES (2, 'Desparasitación', 'Parásitos intestinales', 'Se recomienda repetir en 6 meses', 2);

INSERT INTO historial (id_historial, tratamiento, diagnostico, observaciones, id_mascota)
VALUES (3, 'Cirugía', 'Fractura pata delantera', 'Recuperación favorable', 3);

-- =========================
-- SERVICIO / PRODUCTO
-- =========================
INSERT INTO servicio (id_servicio, nombre, precio, tipo)
VALUES (1, 'CONSULTA', 30.0, 'SERVICIO');

INSERT INTO servicio (id_servicio, nombre, precio, tipo)
VALUES (2, 'VACUNA', 20.0, 'SERVICIO');

INSERT INTO servicio (id_servicio, nombre, precio, tipo)
VALUES (3, 'DESPARACITACION', 25.0, 'SERVICIO');

INSERT INTO servicio (id_servicio, nombre, precio, tipo)
VALUES (4, 'MEDICAMENTO', 15.5, 'PRODUCTO');

