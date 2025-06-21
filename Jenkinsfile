pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main',url: 'https://github.com/vipanji/DevOps-CICD-Project.git'
            }
        }

        stage('Build with Maven') {
            steps {
                dir('app') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Run Tests') {
            steps {
                dir('app') {
                    sh 'mvn test'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('app') {
                    sh 'docker build -t book-api .'
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run -d -p 8080:8080 --name book-api book-api'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution finished.'
        }
    }
}


