pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        chmod +r /home/tes/pom.xml
        sh './mvnw clean test'
      }
      post {
        always {
          junit '**/surefire-reports/*.xml'
          cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: 'target/cucumber.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
        }
      }
    }
  }
}
