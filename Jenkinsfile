pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh 'chmod +x mvnw' 
        sh 'mvn -N io.takari:maven:wrapper -Dmaven=3.8.4'
        sh './mvnw clean test'
      }
    }
  }
}
