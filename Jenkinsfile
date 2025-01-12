pipeline {
  agent any
  stages {
    stage('Stage Test') {
      steps {
        sh 'mvn test -Pprod'
      }
    }
  }
}