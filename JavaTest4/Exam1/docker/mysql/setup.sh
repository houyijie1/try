#����mysql bash
# MYSQL_ROOT_PASSWORD Ϊdocker-compose�еĻ�������
mysql -uroot -p$MYSQL_ROOT_PASSWORD <<EOF

#��docker�е���sql�ļ�
source /mysql/test.sql