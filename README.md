# 🐾 PetCare – Plataforma Inteligente de Acompanhamento Veterinário

Sistema desenvolvido para o **Challenge FIAP 2026 – CLYVO VET**, com foco no acompanhamento contínuo da saúde dos pets, centralização do histórico clínico e aumento da adesão preventiva por parte dos tutores.

> **Objetivo Acadêmico:** Desenvolver uma solução tecnológica utilizando Java + Spring Boot para apoiar clínicas veterinárias no monitoramento preventivo, organização de dados clínicos e melhoria da experiência do tutor.

---

# ✨ Destaques

* ✅ API RESTful desenvolvida com Spring Boot
* ✅ Persistência de dados utilizando H2 Database
* ✅ Arquitetura em camadas (Controller, Service, Repository)
* ✅ Relacionamentos JPA entre entidades
* ✅ Validação de dados com Bean Validation
* ✅ Documentação automática com Swagger/OpenAPI
* ✅ Containerização com Docker
* ✅ Estrutura preparada para deploy em nuvem (Azure)
* ✅ Base para evolução com IA e recomendações preventivas

---

# 🎯 Objetivo do Projeto

O projeto busca resolver um problema recorrente do mercado veterinário:

> Muitos tutores procuram clínicas apenas em situações emergenciais, esquecendo retornos, vacinas, check-ups e acompanhamentos preventivos.

A plataforma PetCare propõe uma solução digital capaz de:

* Organizar o histórico clínico do pet
* Facilitar o acompanhamento veterinário
* Melhorar a comunicação entre tutor e clínica
* Incentivar cuidados preventivos
* Centralizar informações importantes do animal

---

# 🧠 Diferencial da Solução

O sistema foi projetado pensando na evolução para um modelo de acompanhamento contínuo da jornada do pet.

A proposta inclui:

* Histórico longitudinal do animal
* Controle de vacinas
* Registro de consultas
* Gestão de tutores e pets
* Base para lembretes automáticos
* Estrutura para recomendações inteligentes
* Possibilidade futura de integração com IA

---

# 📊 Principais Funcionalidades

## 🐶 Gestão de Pets

* Cadastro de pets
* Consulta de informações do animal
* Atualização de dados
* Remoção de registros

## 👤 Gestão de Tutores

* Cadastro de responsáveis
* Relacionamento tutor → pet
* Consulta e gerenciamento de dados

## 💉 Controle Veterinário

* Estrutura para controle de vacinas
* Estrutura para consultas veterinárias
* Histórico clínico organizado

## 📄 API REST

A aplicação disponibiliza endpoints RESTful para:

* Pets
* Tutores
* Vacinas
* Consultas

---

# 🛠 Tecnologias Utilizadas

| Camada              | Tecnologia      |
| ------------------- |-----------------|
| **Backend**         | Java 21          |
| **Framework**       | Spring Boot     |
| **Persistência**    | Spring Data JPA |
| **Banco de Dados**  | H2 Database     |
| **Containerização** | Docker          |
| **Build Tool**      | Maven           |
| **Cloud Ready**     | Microsoft Azure |

---

# 📁 Estrutura do Projeto

```bash
petcare/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/petcare/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── entity/
│   │   │       ├── dto/
│   │   │       └── config/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
├── Dockerfile
├── pom.xml
└── README.md
```

---

# 🚀 Início Rápido

## Pré-requisitos

Antes de executar o projeto, é necessário possuir:

* Java 21+ 
* Maven 3.9+
* Docker (opcional)
* Git

---

# 1️⃣ Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/petcare.git

cd petcare
```

---

# 2️⃣ Executar Localmente

## Via Maven

```bash
mvn spring-boot:run
```

A aplicação estará disponível em:

```bash
http://localhost:8080
```

---

# 🗄 Banco de Dados H2

O projeto utiliza o banco H2 para ambiente acadêmico e desenvolvimento.

## Console do H2

```bash
http://localhost:8080/h2-console
```

### Configuração padrão

```properties
JDBC URL: jdbc:h2:mem:petcare
User Name: sa
Password:
```

---

# 📡 Exemplos de Endpoints

## 🐾 Pets

### `GET /pets`

Retorna todos os pets cadastrados.

### `GET /pets/{id}`

Retorna um pet específico.

### `POST /pets`

Cadastra um novo pet.

### Exemplo de Requisição

```json
{
  "nome": "Thor",
  "especie": "Cachorro",
  "idade": 5,
  "raca": "Golden Retriever"
}
```

---

## 👤 Tutores

### `GET /tutores`

Lista todos os tutores.

### `POST /tutores`

Cadastra um novo tutor.

### Exemplo

```json
{
  "nome": "João Silva",
  "email": "joao@email.com"
}
```

---

# 🧩 Arquitetura da Aplicação

A aplicação segue uma arquitetura em camadas:

```text
Controller → Service → Repository → Database
```

## 📌 Camadas

### Controller

Responsável por expor os endpoints REST.

### Service

Contém as regras de negócio.

### Repository

Responsável pela comunicação com o banco de dados.

### Entity

Representa as tabelas e relacionamentos.

---

# 🔒 Validações

O projeto utiliza Bean Validation para garantir integridade dos dados.

Exemplos:

```java
@NotBlank
@Email
@Positive
```

---

# 🐳 Docker

## Build da Imagem

```bash
docker build -t petcare .
```

---

## Executar Container

```bash
docker run -p 8080:8080 petcare
```

A aplicação ficará disponível em:

```bash
http://localhost:8080
```

---

# ☁️ Deploy em Nuvem

O projeto está preparado para deploy em ambientes cloud utilizando:

* Microsoft Azure
* Docker
* Máquinas Virtuais Linux

A proposta futura inclui:

* Deploy automatizado via Azure CLI
* Containerização completa com Docker Compose
* Persistência de banco em volume Docker

---

# 📚 Conceitos Aplicados

O projeto utiliza diversos conceitos vistos durante o curso:

* Programação Orientada a Objetos (POO)
* APIs RESTful
* Spring Boot
* JPA/Hibernate
* Relacionamentos entre entidades
* Validação de dados
* Arquitetura em camadas
* Docker
* Cloud Computing
* Integração com banco relacional

---

# 🔗 Repositório

Adicionar link oficial:

```text
https://github.com/Cristian9655/petcare-api.git
```

---

# 📄 Licença

Projeto desenvolvido para fins acadêmicos no Challenge FIAP 2026.

---

# ✏️ Observações

* Projeto em evolução contínua
* Estrutura preparada para expansão futura
* Solução focada em prevenção veterinária e retenção clínica
* Base arquitetural preparada para integração com IA e automações

---

# 👨💻 Integrante
* Nome completo: Cristian Alvaro Condori Paucara
* RM: 550509
* Responsabilidades: projeto feita para concluir tarefa em devops

---

# ☁️ Deploy Azure + Docker — PetCare API (PARTE DA MATERIA DEVOPS)

Guia completo para criação da infraestrutura na Azure e execução da aplicação **PetCare API** utilizando Docker e banco de dados H2 conteinerizado.

> Projeto desenvolvido para o Challenge FIAP 2026 utilizando Java + Spring Boot, Docker e Microsoft Azure.

---

# 🚀 PARTE 1 — Criação da VM na Azure

## 📌 1. Fazer upload do script no Azure Bash ("criacao.sh" está disponivel no repositorio dentro pasta "scriptAz""):

Arquivo utilizado :

```bash
criacao.sh
```

---

## 📌 2. Dar permissão de execução ao script

```bash
chmod +x criacao.sh
```

---

## 📌 3. Remover caracteres do Windows (CRLF)

Esse comando evita problemas de compatibilidade no Linux/Cloud Shell.

```bash
sed -i 's/\r$//' criacao.sh
```

---

## 📌 4. Executar o script

```bash
./criacao.sh
```

O script irá:

* Criar Resource Group
* Criar Máquina Virtual Linux
* Abrir portas necessárias
* Instalar Docker
* Instalar Git e ferramentas auxiliares

---

# 🔐 5. Conectar na Máquina Virtual

Após a criação da VM:

1. Acesse o Portal Azure
2. Localize a VM criada
3. Copie o comando SSH
4. Conecte via CMD, PowerShell ou terminal Linux

---

## 🖥️ Dados da VM

| Campo    | Valor                |
| -------- | -------------------- |
| Usuário  | `azureuser`          |
| Hostname | `vm-cristian5550509` |

---

# 🐳 PARTE 2 — Configuração do Projeto Docker

## 📌 1. Clonar o repositório

```bash
git clone https://github.com/Cristian9655/petcare-api.git
```

---

## 📌 2. Entrar na pasta do projeto

```bash
cd petcare-api
```

---

# 🗄️ Configuração do Banco H2

## 📌 3. Criar volume Docker

O volume garante persistência dos dados do banco.

```bash
docker volume create h2-data
```

---

## 📌 4. Criar rede Docker

```bash
docker network create petcare-network
```

---

## 📌 5. Subir container do H2

```bash
docker run -d \
--name h2db \
--network petcare-network \
-p 9090:9090 \
-p 81:81 \
-v h2-data:/opt/h2-data \
-e H2_OPTIONS='-ifNotExists' \
oscarfonts/h2
```

---

## 📌 6. Verificar containers em execução

```bash
docker ps
```

---

# ⚙️ Build e Execução da API

## 📌 7. Build da aplicação

```bash
docker build -t petcare-api .
```

---

## 📌 8. Subir container da API

```bash
docker run -d \
--name petcare-api \
--network petcare-network \
-p 8080:8080 \
petcare-api
```

---

## 📌 9. Verificar containers novamente

```bash
docker ps
```

Containers esperados:

* `h2db`
* `petcare-api`

---

# 🧪 TESTES

# 📡 Acessar API

Endpoint principal:

```bash
http://IP-DA-VM:8080/tutores
```

Exemplo:

```bash
http://SEU-IP:8080/tutores
```

---

# 🗄️ Acessar Console do H2

```bash
http://IP-DA-VM:8080/h2-console
```


---

# 🐳 Estrutura Docker Utilizada

| Serviço     | Porta  |
| ----------- | ------ |
| PetCare API | `8080` |
| H2 TCP      | `9090` |
| H2 Console  | `81`   |

---

# ☁️ Recursos Utilizados na Azure

* Azure Virtual Machine (Linux)
* Azure Resource Group
* Docker
* Git
* H2 Database
* Spring Boot


---

# 🧹 EXCLUSÃO DA VM

Após finalizar os testes e validações:

```bash
az group delete --name rg-cristian5550509 --yes
```

Esse comando remove:

* Máquina Virtual
* Disco
* IP público
* Network Interface
* Recursos vinculados

---

# 📚 Tecnologias Utilizadas

| Tecnologia      | Finalidade      |
|-----------------| --------------- |
| Java 21         | Backend         |
| Spring Boot     | API REST        |
| Docker          | Containerização |
| H2 Database     | Banco de dados  |
| Microsoft Azure | Cloud Computing |
| GitHub          | Versionamento   |

---

# 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos no Challenge FIAP 2026.

Aluno: Cristian
RM: 550509

---
