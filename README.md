# CursoAppium

### Descrição

- Esta projeto se refere à aplicação Android **_CT Appium_** utilizada como prática no curso **_Testes funcionais de aplicações Android com Appium_** da Udemy.

### Setup do projeto

- Para executar o projeto são necessários as seguintes aplicações/ferramentas:

  - [Appium Java v7.6.0](https://mvnrepository.com/artifact/io.appium/java-client/7.6.0)
  - [JUnit v4.13.2](https://mvnrepository.com/artifact/junit/junit/4.13.2)
  - [Apache Commons-io v2.11.0](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)
  - [Java v8u361](https://www.oracle.com/br/java/technologies/javase/javase8u211-later-archive-downloads.html)
  - [Android Studio](https://developer.android.com/studio)
  - [ADB](https://developer.android.com/studio/command-line/adb?hl=pt-br)
  - [uiautomatorviewer](https://www.guru99.com/uiautomatorviewer-tutorial.html)
  - [Appium Server](https://github.com/appium/appium-desktop)
  - [Google Chrome v110.0.5481.178](https://www.google.com/intl/pt-BR/chrome/)
  - [IntelliJ Idea IDE](https://www.jetbrains.com/idea/download/#section=windows) 
  - [Git v2.39.1](https://git-scm.com/downloads)

### Clonando o projeto

- Clone o projeto via CLI:
<pre>
git clone https://github.com/crisleyprestes/ProjetoBasico.git
</pre>

- Aguarde o _clone_ ser finalizado.

- Na sua IDE de preferência, faça o _import_ do projeto.


### Estutura do projeto

O projeto é constituído dos seguintes diretórios/arquivos:

- **_src_**: Contém o código da automação e estruturas utilizadas no projeto.
  - **_appium/core_**: Contém as classes utilizadas no projeto de automação.
  - **_pages_**: Contém as classes de cada _feature_ das aplicações automatizadas.
  - **_suite_**: Contém a classe que ordena a execução dos teste da automação.
  - **_tests_**: Contém as classes com os testes automatizados.
- **_resources_**: Contém a _.apk_ do aplicativo utilizado no projeto de automação.

**Notas**: 
  - Cada teste automatizado, gera um screenshot como evidência de execução. O arquivo é salvo no diretório **_/target/screenshots_** e não é _commitado_ no GitHub.
