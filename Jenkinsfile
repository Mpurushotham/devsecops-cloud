
pipeline {
  agent any

  stages {
    stage('Build Artifact - Maven package') {
      steps {
        sh "mvn clean package -DskipTests=true"
        archive 'target/*.jar'
      }
    }
  }
}