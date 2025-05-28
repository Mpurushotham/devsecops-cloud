
pipeline {
  agent any

  // environment {
  //   deploymentName = "devsecops"
  //   containerName = "devsecops-container"
  //   serviceName = "devsecops-svc"
  //   imageName = "siddharth67/numeric-app:${GIT_COMMIT}"
  //   applicationURL="http://devsecops-demo.eastus.cloudapp.azure.com"
  //   applicationURI="/increment/99"
  // }

  stages {

    stage('Build Artifact - Maven') {
      steps {
        sh "mvn clean package -DskipTests=true"
        archive 'target/*.jar'
      }
    }
  }
}