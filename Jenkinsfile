pipeline {
  agent any
  stages {
    stage('Stage Test') {
      steps {
        sh 'mvn test -Pprod'
      }
    }

    stage('Stage Build Image') {
      steps {
        sh 'mvn spring-boot:build-image -Pprod'
      }
    }
  }
}