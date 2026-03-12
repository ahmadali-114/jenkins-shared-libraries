def call(String projectName, String imageTag, String dockerHubUser){
    try {
        sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
    } 
    catch (err) {
        echo "Docker build failed but ignored for practice: ${err}"
    }
}
