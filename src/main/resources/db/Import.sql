INSERT INTO paciente (nome, idade, sexo, logradouro, numero, complemento, bairro, cep, cidade, estado, celular, plano, servico) VALUES ('João Silva', 30, 'M', 'Rua do Abacaxi', '10', null, 'Brasil', '38.400-12', 'Uberlândia', 'MG', 999999898, 1, 1);
INSERT INTO paciente (nome, idade, sexo, logradouro, numero, complemento, bairro, cep, cidade, estado, celular, plano, servico) VALUES ('Maria Pimentel', 60, 'F', 'Rua do Morango', '13', null, 'Engenho Novo', '38.402-14', 'Uberlândia', 'MG', 995997591, 2, 1);

INSERT INTO plano (nome) VALUES ('Sulamerica');
INSERT INTO plano (nome) VALUES ('UNIMED');
INSERT INTO plano (nome) VALUES ('Porto Seguro');
INSERT INTO plano (nome) VALUES ('Bradesco Saude');
INSERT INTO plano (nome) VALUES ('Hospital BH');

INSERT INTO servico (nome) VALUES ('Clinico Geral');
INSERT INTO servico (nome) VALUES ('Emergencia');
INSERT INTO servico (nome) VALUES ('Ortopedia');
INSERT INTO servico (nome) VALUES ('UTI');
INSERT INTO servico (nome) VALUES ('Internacao');

INSERT INTO planoservico (plano, servico) VALUES (1,1);
INSERT INTO planoservico (plano, servico) VALUES (1,2);
INSERT INTO planoservico (plano, servico) VALUES (1,3);
INSERT INTO planoservico (plano, servico) VALUES (1,5);

INSERT INTO planoservico (plano, servico) VALUES (2,1);
INSERT INTO planoservico (plano, servico) VALUES (2,2);
INSERT INTO planoservico (plano, servico) VALUES (2,4);
INSERT INTO planoservico (plano, servico) VALUES (2,5);

INSERT INTO planoservico (plano, servico) VALUES (3,1);
INSERT INTO planoservico (plano, servico) VALUES (3,2);

INSERT INTO planoservico (plano, servico) VALUES (4,1);
INSERT INTO planoservico (plano, servico) VALUES (4,2);
INSERT INTO planoservico (plano, servico) VALUES (4,3);

INSERT INTO planoservico (plano, servico) VALUES (5,1);
INSERT INTO planoservico (plano, servico) VALUES (5,2);
INSERT INTO planoservico (plano, servico) VALUES (5,3);
INSERT INTO planoservico (plano, servico) VALUES (5,4);
INSERT INTO planoservico (plano, servico) VALUES (5,5);

