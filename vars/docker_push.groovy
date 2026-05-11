def call(String ImageName, String ImageTag){
  withCredentials([
    usernamePassword(
      credentialsId: "DockerHubCredential", 
      passwordVariable: "DockerHubPass", 
      usernameVariable: "DockerHubUser"
    )
  ]){
      sh "docker login -u $DockerHubUser -p $DockerHubPass"
      sh "docker image tag ${ImageName}:${ImageTag} ${DockerHubUser}/${ImageName}:${ImageTag}"
      sh "docker push ${DockerHubUser}/${ImageName}:${ImageTag}"
  }
}
