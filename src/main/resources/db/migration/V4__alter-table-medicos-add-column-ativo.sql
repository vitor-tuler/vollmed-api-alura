ALTER TABLE medicos DROP COLUMN ativo;
ALTER TABLE medicos ADD ativo tinyint;
UPDATE medicos set ativo=1;