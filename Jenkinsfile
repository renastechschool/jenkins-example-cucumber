pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh 'chmod +x mvnw' 
        sh 'pwd'
        sh './mvnw clean test'
      }
    }
  }
}
