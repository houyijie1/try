echo -e "\033[31m ==========================build mysql==========================\033[0m"
#����mysql���� ����Ϊmysql
docker build -t mysql ./docker/mysql

echo -e "\033[31m ==========================package==========================\033[0m"
#���java����
mvn package -DskipTests

echo -e "\033[31m ==========================cp==========================\033[0m"
#���������jar��java��DockerFileĿ¼��
cp -f ./target/*.jar ./docker/java/app.jar

echo -e "\033[31m ==========================build app==========================\033[0m"
#����java������ ����Ϊapp
docker build -t app ./docker/java
