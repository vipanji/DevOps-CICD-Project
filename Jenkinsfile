pipeline {
    agent any

    environment {
        IMAGE_NAME = 'book-api'
        DOCKER_REGISTRY = 'local'
    }

    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/vipanji/DevOps-CICD-Project.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker stop $IMAGE_NAME || true && docker rm $IMAGE_NAME || true'
                sh 'docker run -d --name $IMAGE_NAME -p 8080:8080 $IMAGE_NAME'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution finished.'
        }
    }
}
