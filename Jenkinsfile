pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        chmod '+x mvnw' && sh './mvnw clean test'
      }
    }
  }
}
