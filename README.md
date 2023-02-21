# CursoAppium

### Descrição

- Esta projeto se refere à aplicação Android **_CT Appium_** utilizada como prática no curso **_Testes funcionais de aplicações Android com Appium_** da Udemy.

### Setup do projeto

Para executar o projeto são necessários as seguintes aplicações/ferramentas:

- Appium Java v7.6.0
- JUnit v4.13.2
- Apache Commons-io v2.11.0
- Java
- Android Studio
- ADB
- Appium Server
- Google Chrome
- IntelliJ Idea IDE
- Git

### Clonando o projeto

- Clone o projeto:
<pre>git clone https://github.com/crisleyprestes/CursoAppium.git</pre>

- Importe o projeto para a IDE

### Estutura do projeto

O projeto é constituído dos seguintes diretórios/arquivos:

- **_src_**: Diretório com o código da automação e estruturas utilizadas no projeto. Dentro dele estão os seguintes diretórios/arquivos:
  - **_appium/core_**: Tem as classes utilizadas como base no projeto de automação, que são as seguintes:
    - **_BasePage.java_**: Classe com os métodos gerais utilizados ao longo do projeto de automação.
    - **_BaseTest.java_**: Classe com os métodos gerais utilizados na execução das classes de teste automatizadas.
    - **_DriverFactory.java_**: Classe que instancia o _driver_ do _Appium_ e determina a configuração de acesso à aplicação **_CTAppium_**.
    - **_SleepTime.java_**: Classe que passa os parâmetros de tempo utilizados ao longo do projeto de automação.
  - **_pages_**: Classes de páginas de cadas _feature_ das aplicações **_Campo de Treinamento_** e **_Seu Barriga_**.
  - **_suite_**: Tem a classe **_SuiteGeral.java_**, utilizada para ordenar a execução das classes de teste dentro da automação.
  - **_tests_**: Classes com os testes automatizados para cada _feature_ das aplicações **_Campo de Treinamento_** e **_Seu Barriga_**.
- **_resources_**: Diretório com o arquivo _.apk_ do aplicativo _Android_ utilizado no projeto de automação.

**Notas**: Cada método de teste automatizado, ao fim de sua execução gera um screenshot como evidência. Este arquivo é salvo dentro do diretório **_/target/screenshots_**.
