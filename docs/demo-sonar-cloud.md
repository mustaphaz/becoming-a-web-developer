# Demo Sonar Cloud

SonarQube architectuur
----------------------
SonarQube bestaat uit drie belangrijke onderdelen:
1. SonarQube source en web server
2. de database
3. de analysers  
De analysers analyseren de source code en werken de database bij. Vervolgens worden de resultaten van de analyse
 weergegeven in de web interface.
![SonarQube Architectuur](img/sonarqube_arch.png)

SonarQube met eigen server
--------------------------
\# **Database installatie**  
Voor SonarQube heb je een database nodig, waarin SonarQube alle resultaten op kan slaan die de analysers genereren.

\# **Server and SonarQube installatie**
- De volgende stap is het installeren van een web server. De webserver verbindt de database met SonarQube.
- Hiervoor moet je de juiste database connectie string uitcommentariëren in de `sonar.properties` file in the `conf` folder aanpassen.
- Als je de webserver start krijg je de web console te zien.

\# **Analysers**  
- De analysers zijn de brug tussen de code die je wilt analyseren en de SonarQube database. Er zijn verschillende analysers beschikbaar.
Deze scanner moet je downloaden en in je SonarQube installatiemap plaatsen. 
- Daarna moet je deze configureren via de `sonar-runner.properties` file in the `/conf` folder.
- De inhoud van de `sonar-runner.properties`  file moet gelijk zijn aan de `sonar.properties` file.
- Daarna moet je een  environment variabele `SONAR_RUNNER_HOME` maken die wijst naar deze folder.
- Voeg daarna de /bin directory toe aan jouw path variable.  
! `Runner` is de oude naam voor `Scanner`.

\# **Analyseer het project**
- Maak een `sonar-project.properties` file aan en plaatst deze in jouw projectmap.
- Start de sonar-scanner
- Als het gelukt is zijn de resultaten opgeslagen in de database en kun je deze inzien via de web interface.

SonarCloud
----------
Om jouw project te laten controleren via SonarCloud moet het volgende worden aangepast:

\# **GRADLE**
- voeg de volgende classpath dependency toe aan de `build.gradle` file:
```groovy
    classpath "org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:{versienummer}"
```
- voeg de sonarqube plugin toe:
```groovy
    plugins {
        id "org.sonarqube" version "{versienummer}"
    }
```
- pas de plugin toe:
```groovy
    apply plugin: "org.sonarqube"
```
- voeg een task toe:
```groovy
    sonarqube {
        properties {
            property "sonar.host.url", "https://sonarcloud.io"
            property "sonar.login", sonarToken
            property "sonar.organization", "{organization-naam}"
            property "sonar.projectName", "{project-naam}" // voor weergave in de web interface
            property "sonar.projectKey", "{project-key}"  // wordt gebruikt voor identificatie van het project
            property "sonar.jacoco.reportPaths", "${project.buildDir}/jacoco/test.exec"
        }
    }
```
- maak een `gradle.properties` file aan om daarin het token op te geven:
```groovy
    sonarToken = token
```

\# **JENKINS**
- voeg een stap toe aan de jenkins file:
```groovy
    stage("Sonar Analysis") {
      steps {
          timestamps {
              script {
                  sh "./gradlew sonarqube --info --stacktrace -Dsonar.branch.name=$BRANCH_NAME"
              }
          }
      }
    }
```

Let op! De eerste keer dat je een analyse draait moet dat een reguliere analyse op de master zijn en kun je geen branch parameter opgeven. 
Daarna kun je wel een specifieke branch opgeven voor de analyse.  

- voeg de sonarqube plugin toe aan jenkins:  
Deze plugin is nodig zodat Jenkins verbinding kan maken met de SonarQube server en de analyse kan triggeren.
