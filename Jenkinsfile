pipeline {
  agent any
  tools {
      maven 'maven 3.8.6'
      jdk 'jdk8'
  }
  stages {
    stage ('Initialize') {
        steps {
            sh '''
                 echo "PATH = ${PATH}"
                 echo "M2_HOME = ${M2_HOME}"
            '''
        }
    }
    stage('Run Tests') {
      steps {
        sh 'mvn -Dmaven.test.failure.ignore=true install'
      }
    }
  }
}
