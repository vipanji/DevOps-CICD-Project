pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/vipanji/DevOps-CICD-Project.git'
            }
        }

        stage('Build & Test') {
            steps {
                dir('app') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t book-inventory-app .'
            }
        }

        stage('Run Ansible Playbook') {
            steps {
                sh 'ansible-playbook ansible/deploy.yml'
            }
        }
    }
}

