pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"
    }
  
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('build') {
            steps {
                echo 'executing maven clean install command'
                bat 'mvn clean install'
            }
        }
        
    }
}
