def call(String ImageName, String ImageTag){
  sh "docker run ${ImageName}:${ImageTag}"
  echo "Code Deployed Successfully"
}
