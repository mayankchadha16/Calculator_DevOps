pipeline {
    agent any

    environment {
        docker_image = ""
    }

    stages {
        stage('Stage 1: Git Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/mayankchadha16/Calculator_DevOps.git'
            }
        }

        stage('Stage 2: Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Stage 3: Build Docker Image') {
            steps {
                script {
                    docker_image = docker.build "menkchad/calculator:latest"
                }
            }
        }

        stage('Stage 4: Push Docker Image to Hub') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        docker_image.push()
                    }
                }
            }
        }

        stage('Stage 5: Clean Docker Images') {
            steps {
                script {
                    sh 'docker container prune -f'
                    sh 'docker image prune -f'
                    // sh 'if [ -n "$(docker ps -aq)" ]; then docker rm -f $(docker ps -aq); fi'
                    // sh 'if [ -n "$(docker images -aq)" ]; then docker rmi -f $(docker images -aq); fi'
                }
            }
        }

        stage('Stage 6: Ansible Deployment') {
            steps {
                ansiblePlaybook becomeUser: null,
                credentialsId: 'localhost',
                installation: 'Ansible',
                inventory: 'Deployment/inventory',
                playbook: 'Deployment/deploy.yml'
            }
        }
    }
}
