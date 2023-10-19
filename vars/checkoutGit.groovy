def call(String gitUrl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: main]],
        userRemoteConfigs: [[url: https://github.com/vamshiyekbote/Jenkins_shared_library.git 
        ]]]
    )
}
