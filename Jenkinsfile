#!/usr/bin/env groovy

def pipeline() {
    echo 'Pipeline called'
}

def production() {
    echo 'Production called'
}

def pullRequest() {
    echo 'Pull Request called'
}

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "env.jobType"
                if (env.jobType == "pipeline") {
                    load("Jenkinsfile").pipeline()
                    } else if (env.jobType == "production") {
                    load("Jenkinsfile").production()
                    } else {
                    load("Jenkinsfile").pullRequest()
                    }
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }


}