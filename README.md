# Sistema de Processamento de Pedidos Online: Resiliência e Observabilidade

Este projeto é um sistema de processamento de pedidos online desenvolvido como um estudo aprofundado em arquiteturas de microsserviços, focando na implementação de padrões de projeto avançados para garantir **resiliência**, **escalabilidade** e **observabilidade**. Ele simula um fluxo de pedido que envolve múltiplos serviços, como gerenciamento de pedidos, estoque, pagamento e notificações.

---

### Visão Geral da Arquitetura

O sistema adota uma arquitetura de microsserviços desacoplada, onde cada funcionalidade de negócio é encapsulada em um serviço independente. A comunicação entre os serviços é realizada tanto de forma síncrona (via API Gateway) quanto assíncrona (via Event Streaming). O projeto enfatiza a construção de um sistema robusto que pode tolerar falhas em componentes individuais e que oferece visibilidade completa sobre seu estado operacional.

---

### Tecnologias Principais

* **Backend:**
    * **Java:** Linguagem de programação principal.
    * **Spring Boot:** Framework para o desenvolvimento rápido de microsserviços.
    * **Spring Cloud Gateway:** Para o API Gateway.
    * **Resilience4j:** Para implementação de padrões de resiliência.
    * **Spring Cloud Sleuth / Micrometer / OpenTelemetry:** Para rastreamento distribuído e coleta de métricas.
    * **Apache Kafka:** Para comunicação assíncrona e Event Streaming.
    * **Bancos de Dados Relacionais:** Para persistência de dados em cada microsserviço (ex: PostgreSQL, MySQL).

* **Frontend:**
    * **Angular:** Framework para o desenvolvimento da interface do usuário.

* **Infraestrutura e DevOps:**
    * **Docker:** Para conteinerização dos microsserviços e dependências.
    * **Docker Compose:** Para orquestração de ambiente de desenvolvimento local.
    * **Prometheus:** Para coleta e armazenamento de métricas.
    * **Grafana:** Para visualização de dashboards de monitoramento.
    * **Jaeger:** Para visualização de traces distribuídos.
    * **ELK Stack / Loki:** Para centralização e análise de logs (opcional).
    * **Kubernetes (Opcional para Deploy):** Para orquestração de contêineres em produção.

---

### Padrões de Projeto e Conceitos Avançados

Este projeto serve como um estudo prático dos seguintes padrões e conceitos:

* **Arquitetura de Microsserviços:** Decomposição de funcionalidades em serviços independentes e comunicáveis.
* **API Gateway:** Ponto de entrada unificado para os clientes, responsável por roteamento, autenticação, autorização e **API Composition** (agregando respostas de múltiplos serviços).
* **Rate Limiting:** Implementado no API Gateway para controlar o tráfego e proteger os serviços de backend contra sobrecarga.
* **Event-Driven Architecture (EDA) com Apache Kafka:** Utilização de eventos assíncronos para comunicação entre serviços, promovendo alto desacoplamento e escalabilidade.
* **Saga Orquestrada:** Coordenação de transações distribuídas através de um serviço orquestrador que escuta eventos e publica comandos/eventos no Kafka para garantir a consistência dos dados entre múltiplos microsserviços.
* **Padrões de Resiliência (com Resilience4j):**
    * **Circuit Breaker (Disjuntor):** Para isolar falhas em serviços externos e evitar cascateamento.
    * **Retry:** Para re-tentar chamadas que podem ser temporariamente instáveis.
    * **TimeLimiter:** Para impor limites de tempo em chamadas externas.
    * **Fallback Methods:** Para fornecer respostas alternativas em caso de falha.
* **Observabilidade:**
    * **Logging Centralizado:** Coleta e agregação de logs de todos os serviços.
    * **Métricas de Aplicação:** Coleta de métricas detalhadas (latency, error rates, resource usage) com Micrometer e exposição para Prometheus.
    * **Tracing Distribuído:** Rastreamento completo de requisições através de múltiplos serviços com Jaeger/OpenTelemetry.
* **DTOs (Data Transfer Objects):** Uso de objetos de transferência de dados para padronizar a comunicação entre serviços e camadas.

---


# Sistema de Processamento de Pedidos Online: Resiliência e Observabilidade

Este projeto é um sistema de processamento de pedidos online desenvolvido como um estudo aprofundado em arquiteturas de microsserviços, focando na implementação de padrões de projeto avançados para garantir **resiliência**, **escalabilidade** e **observabilidade**. Ele simula um fluxo de pedido que envolve múltiplos serviços, como gerenciamento de pedidos, estoque, pagamento e notificações.

---

### Visão Geral da Arquitetura

O sistema adota uma arquitetura de microsserviços desacoplada, onde cada funcionalidade de negócio é encapsulada em um serviço independente. A comunicação entre os serviços é realizada tanto de forma síncrona (via API Gateway) quanto assíncrona (via Event Streaming). O projeto enfatiza a construção de um sistema robusto que pode tolerar falhas em componentes individuais e que oferece visibilidade completa sobre seu estado operacional.

---

### Tecnologias Principais

* **Backend:**
    * **Java:** Linguagem de programação principal.
    * **Spring Boot:** Framework para o desenvolvimento rápido de microsserviços.
    * **Spring Cloud Gateway:** Para o API Gateway.
    * **Resilience4j:** Para implementação de padrões de resiliência.
    * **Spring Cloud Sleuth / Micrometer / OpenTelemetry:** Para rastreamento distribuído e coleta de métricas.
    * **Apache Kafka:** Para comunicação assíncrona e Event Streaming.
    * **Bancos de Dados Relacionais:** Para persistência de dados em cada microsserviço (ex: PostgreSQL, MySQL).

* **Frontend:**
    * **Angular:** Framework para o desenvolvimento da interface do usuário.

* **Infraestrutura e DevOps:**
    * **Docker:** Para conteinerização dos microsserviços e dependências.
    * **Docker Compose:** Para orquestração de ambiente de desenvolvimento local.
    * **Prometheus:** Para coleta e armazenamento de métricas.
    * **Grafana:** Para visualização de dashboards de monitoramento.
    * **Jaeger:** Para visualização de traces distribuídos.
    * **ELK Stack / Loki:** Para centralização e análise de logs (opcional).
    * **Kubernetes (Opcional para Deploy):** Para orquestração de contêineres em produção.

---

### Padrões de Projeto e Conceitos Avançados

Este projeto serve como um estudo prático dos seguintes padrões e conceitos:

* **Arquitetura de Microsserviços:** Decomposição de funcionalidades em serviços independentes e comunicáveis.
* **API Gateway:** Ponto de entrada unificado para os clientes, responsável por roteamento, autenticação, autorização e **API Composition** (agregando respostas de múltiplos serviços).
* **Rate Limiting:** Implementado no API Gateway para controlar o tráfego e proteger os serviços de backend contra sobrecarga.
* **Event-Driven Architecture (EDA) com Apache Kafka:** Utilização de eventos assíncronos para comunicação entre serviços, promovendo alto desacoplamento e escalabilidade.
* **Saga Orquestrada:** Coordenação de transações distribuídas através de um serviço orquestrador que escuta eventos e publica comandos/eventos no Kafka para garantir a consistência dos dados entre múltiplos microsserviços.
* **Padrões de Resiliência (com Resilience4j):**
    * **Circuit Breaker (Disjuntor):** Para isolar falhas em serviços externos e evitar cascateamento.
    * **Retry:** Para re-tentar chamadas que podem ser temporariamente instáveis.
    * **TimeLimiter:** Para impor limites de tempo em chamadas externas.
    * **Fallback Methods:** Para fornecer respostas alternativas em caso de falha.
* **Observabilidade:**
    * **Logging Centralizado:** Coleta e agregação de logs de todos os serviços.
    * **Métricas de Aplicação:** Coleta de métricas detalhadas (latency, error rates, resource usage) com Micrometer e exposição para Prometheus.
    * **Tracing Distribuído:** Rastreamento completo de requisições através de múltiplos serviços com Jaeger/OpenTelemetry.
* **DTOs (Data Transfer Objects):** Uso de objetos de transferência de dados para padronizar a comunicação entre serviços e camadas.

---

### Arquitetura do Projeto
![Arquitetura](/imgs/Projeto%20Vendas.png)

---

### Estrutura do Projeto
O projeto é organizado como um repositório multi-módulo Maven, com as seguintes divisões principais:
```plaintext
Backend
├── api-gateway/            # Módulo do API Gateway
├── common-libs/            # Módulos para DTOs e Eventos compartilhados
│   ├── common-models/
│   └── common-events/
├── ms-pedidos/             # Microsserviço de Pedidos
├── ms-estoque/             # Microsserviço de Estoque
├── ms-pagamento/           # Microsserviço de Pagamento
├── ms-notificacao/         # Microsserviço de Notificações
├── monitoring/             # Configurações para Prometheus, Grafana, Jaeger
└── kubernetes/             # Manifestos Kubernetes para deploy
Frontend
├──Web(Angular)             #Frontend simples em Angular para testes de API
```
---

### Como Executar o Projeto

Para colocar o projeto em funcionamento, siga as instruções abaixo:

#### Pré-requisitos:

* Docker instalado.
* Node.js e Angular CLI instalados globalmente (para o frontend).
* Java Development Kit (JDK) 17 ou superior.
* Maven (se for construir os JARs manualmente antes do Docker).

#### 1. Backend (Microsserviços e Infraestrutura Local)

1.  Navegue até a pasta raiz do projeto no seu terminal 
2.  Execute o seguinte comando para construir as imagens Docker dos microsserviços e iniciar todos os serviços definidos no `docker-compose.yml` (Kafka, Prometheus, Grafana, Jaeger, etc.):

    ```bash
    docker-compose up --build
    ```
    Este comando pode levar um tempo na primeira execução para baixar as imagens base e construir as suas.

#### 2. Frontend

1.  Navegue até a pasta do frontend (`Frontend/Web` na raiz do projeto).
2.  Instale as dependências do projeto:

    ```bash
    npm install
    ```

3.  Inicie o servidor de desenvolvimento do Angular:

    ```bash
    ng serve
    ```
    Isso geralmente iniciará o frontend em `http://localhost:4200`.

Após esses passos, o API Gateway estará acessível em uma porta definida (8080), e o frontend deverá conseguir interagir com ele. As ferramentas de monitoramento (Prometheus, Grafana, Jaeger) também estarão acessíveis nas portas configuradas no `docker-compose.yml`.

---

### Melhorias e Próximos Passos (Senioridade)

* **Testes Abrangentes:** Adicionar testes de unidade, integração e end-to-end.
* **Segurança:** Implementar segurança mais robusta (ex: JWT, Spring Security) em todos os serviços.
* **CI/CD:** Configurar pipelines de Integração Contínua e Entrega Contínua (Jenkins, GitLab CI/CD, GitHub Actions).
* **Implantação em Nuvem:** Deploy do sistema em plataformas de nuvem (AWS, GCP, Azure) usando Kubernetes (EKS, GKE, AKS).
* **Bancos de Dados NoSQL:** Avaliar o uso de bancos NoSQL para casos de uso específicos (ex: logs de auditoria, cache).
* **Performance Tuning:** Otimização da JVM e consultas de banco de dados.

---

### Contribuição

Contribuições são bem-vindas! Se você tiver sugestões de melhoria ou quiser adicionar funcionalidades, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

### Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

**Desenvolvido por:** ![Thalyson](https://github.com/nooneknowws)
