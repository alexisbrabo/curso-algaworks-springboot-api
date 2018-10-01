CREATE TABLE pessoa (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    logradouro VARCHAR(100),
    numero VARCHAR(50),
    complemento VARCHAR(50),
    bairro VARCHAR(50),
    cep VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(50),
    ativo TINYINT(1)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Alexis','CJ. cidade Nova 6','1192','Perto da Passarela','Coqueiro','67140290','Ananindeua','Pará',true);
INSERT INTO pessoa (nome,logradouro,numero,complemento,bairro,cep,cidade,estado,ativo) values ('Brena',null,null,null,null,null,null,null,true);
