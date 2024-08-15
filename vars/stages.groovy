def call(String stageName)
{
    if("${stageName}" == "Build")
    {
        sh "mvn clean package"
    }
    else if ("${stageName}"=="print")
    {
        echo "welcome to learn"
    }
}