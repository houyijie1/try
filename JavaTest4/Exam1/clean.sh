echo -e "\033[31m ==========================rm app container==========================\033[0m"
#app��java�������е�������
docker rm app -f

echo -e "\033[31m ==========================rm mysql container==========================\033[0m"
#mysql��mysql���е�������
docker rm mysql -f

echo -e "\033[31m ==========================rm app image==========================\033[0m"
#app��java����ľ�����
docker image rm app -f

echo -e "\033[31m ==========================rm mysql image==========================\033[0m"
#mysql��mysql�ľ�����
docker image rm mysql -f

echo -e "\033[31m ==========================maven clean==========================\033[0m"
mvn clean
