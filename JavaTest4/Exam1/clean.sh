echo -e "\033[31m ==========================rm app container==========================\033[0m"
#app是java程序运行的容器名
docker rm app -f

echo -e "\033[31m ==========================rm mysql container==========================\033[0m"
#mysql是mysql运行的容器名
docker rm mysql -f

echo -e "\033[31m ==========================rm app image==========================\033[0m"
#app是java程序的镜像名
docker image rm app -f

echo -e "\033[31m ==========================rm mysql image==========================\033[0m"
#mysql是mysql的镜像名
docker image rm mysql -f

echo -e "\033[31m ==========================maven clean==========================\033[0m"
mvn clean
