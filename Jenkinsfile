pipeline {
  agent any
  stages {
    stage('Stage Test') {
      steps {
        sh 'mvn clean test -Pprod'
      }
    }

    stage('Stage Build Images') {
      steps {
        sh 'mvn spring-boot:build-image -Pprod'
      }
    }

    stage('Stage Start Docker Containers') {
      steps {
        sh 'docker-compose down'
        sh 'docker-compose up -d --build'
      }
    }
  }
}