pipelineJob('react-frontend-pipeline') {
    description('Pipeline for React frontend: builds Docker image, pushes to GHCR, deploys to Render.')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Sampada-09/react-frontend.git')
                    }
                    branch('main')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }

    triggers {
        githubPush()
    }
}
