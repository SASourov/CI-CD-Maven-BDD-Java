pipeline {
    agent any

    tools {
        maven 'Maven-3.9'   // Jenkins Tools এ configure করা Maven এর নাম
        jdk 'JDK-17'        // Jenkins Tools এ configure করা JDK এর নাম
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true
        }
    }
}