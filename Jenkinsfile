pipeline {
    agent any

    tools {
        maven 'MyMaven'   // Jenkins Tools এ configure করা Maven এর নাম
        jdk 'MyJava'        // Jenkins Tools এ configure করা JDK এর নাম
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