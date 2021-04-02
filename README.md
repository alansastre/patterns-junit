


## Ciclo de vida: 

* clean (3 fases)
* default (23 fases)
* site (4 fases)


Dentro del ciclo default:

* validate
* compile
* test-compile
* test
* package
* verify
* install
* deploy

mvn deploy 

## Plugins:

## Maven clean plugin:

mvn clean:clean
mvn clean

## Compiler plugin

mvn plugin:fase

mvn compiler:compile
mvn compile

## Maven resources plugin 

mvn resources:resources

Leen la etiqueta resources del pom.xml

## Maven surefire plugin

mvn surefire:test

---
```
verify sonar:sonar -Dsonar.projectKey=scarrasco85_patterns-junit -Dsonar.organization=scarrasco85 -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=42c09b8eb12a660ce847be12ac3dba1885f253ad -Dsonar.branch.name=develop
```
---