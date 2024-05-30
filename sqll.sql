CREATE SCHEMA MAHASISWA;

CREATE TABLE MAHASISWA.PROFIL (
    NIM VARCHAR(20) PRIMARY KEY,
    PROGRAM_STUDI VARCHAR(50),
    NAMA VARCHAR(100),
    ANGKATAN INT,
    TGL_LAHIR DATE,
    ALAMAT TEXT,
    EMAIL VARCHAR(100)
);

INSERT INTO mahasiswa.PROFIL (nim, program_studi, nama, angkatan, tgl_lahir, alamat, email) 
VALUES
('096456466', 'Teknik Informatika', 'Bambang Subino', 2013, '2001-05-21', 'Jl. Mawar No. 15, Jakarta', 'subino.bammbang@gmail.com');
