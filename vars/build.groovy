def call(String image_name, String image_tag, String dockerHub_User){
  sh "docker build -t ${dockerHub_User}/${image_name}:{image_tag} ."
  echo "Image built sucessfully"
}
