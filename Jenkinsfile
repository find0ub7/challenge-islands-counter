#!/usr/bin/env groovy

if (env.jobType == "pipeline") {
    echo 'Pipeline steps called'
} else if (env.jobType == "production") {
    echo 'Production steps called'
} else {
    echo 'Pull Request steps called????'
    System.exit(-1)
}