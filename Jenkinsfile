node {
    if (env.jobType == "pipeline") {
        echo 'Pipeline steps called'
    } else if (env.jobType == "production") {
        echo 'Production steps called'
    } else {
        echo 'Pull Request steps called'
        stage("Build PR") {
            sh "echo Building...."
            sh "exit 1"
        }
    }
}