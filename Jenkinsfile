pipeline {
    agent any
    
    tools {
        jdk 'jdk17'
        maven 'mvn'
    }

    environment {
        DOCKERHUB_USER = "harshshah2004"
        IMAGE_NAME     = "java_multi-branch"
        TAG            = "${env.BRANCH_NAME}-${env.BUILD_NUMBER}"
        FULL_IMAGE     = "${DOCKERHUB_USER}/${IMAGE_NAME}:${TAG}"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
				    withCredentials([usernamePassword(
                    credentialsId: 'docker-hub_cred',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
					sh '''
							docker build -t ${FULL_IMAGE} .
							echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
							docker push ${FULL_IMAGE}
					   '''
					}
            }
        }

        stage('Run Container') {
            steps {
					sh '''
							docker pull ${FULL_IMAGE}
							docker rm -f ${IMAGE_NAME}-${TAG} || true
							docker run -d -p 8081:4001 --name ${IMAGE_NAME}-${TAG} ${FULL_IMAGE}:$TAG 
					   '''
            }
        }
    }
}
