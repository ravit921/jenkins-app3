pipeline {
    agent any
    tools {
        maven "Maven"
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
