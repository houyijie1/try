#进入mysql bash
# MYSQL_ROOT_PASSWORD 为docker-compose中的环境变量
mysql -uroot -p$MYSQL_ROOT_PASSWORD <<EOF

#在docker中导入sql文件
source /mysql/test.sql