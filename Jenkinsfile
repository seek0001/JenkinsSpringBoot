pipeline {
    agent any

    tools {
        maven 'M3' // we will configure this in Jenkins
    }

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/seek0001/JenkinsSpringBoot.git', branch: 'main'
            }
       }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy (Run Spring Boot)') {
            steps {
                sh 'java -jar target/*.jar &'
            }
        }
    }
}