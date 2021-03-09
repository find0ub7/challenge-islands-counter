#!/usr/bin/env groovy

if (env.jobType == "pipeline") {
    echo 'Pipeline called'
} else if (env.jobType == "production") {
    echo 'Production called'
} else {
    echo 'Pull Request called'
}