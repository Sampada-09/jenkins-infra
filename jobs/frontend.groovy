pipelineJob('react-frontend-pipeline') {
    description('Pipeline for React frontend: builds Docker image, pushes to GHCR, deploys to Render.')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/your-org/react-frontend.git')  // 🔥 your app repo
                    }
                    branch('main')
                }
            }
            scriptPath('Jenkinsfile') // your Jenkinsfile in the app repo
        }
    }
    triggers {
        scm('H/5 * * * *') // optional: poll every 5 min (replace with webhook ideally)
    }
}
