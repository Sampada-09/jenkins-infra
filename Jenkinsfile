pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out source code..."
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Running a dummy build step..."
                sh 'echo "Pretend I am building the React app 🏗️"'
            }
        }

        stage('Test') {
            steps {
                echo "Running a test step..."
                sh 'echo "Pretend I am running tests ✅"'
            }
        }
    }

    post {
        always {
            echo "Pipeline finished (success or fail) 🚦"
        }
    }
}
