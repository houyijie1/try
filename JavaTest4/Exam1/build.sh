echo -e "\033[31m ==========================build mysql==========================\033[0m"
#构建mysql镜像 命名为mysql
docker build -t mysql ./docker/mysql

echo -e "\033[31m ==========================package==========================\033[0m"
#打包java程序
mvn package -DskipTests

echo -e "\033[31m ==========================cp==========================\033[0m"
#拷贝打包的jar到java的DockerFile目录下
cp -f ./target/*.jar ./docker/java/app.jar

echo -e "\033[31m ==========================build app==========================\033[0m"
#构建java程序镜像 命名为app
docker build -t app ./docker/java
