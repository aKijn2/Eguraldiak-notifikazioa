# Dockerfile para el servicio phpmyadmin
FROM phpmyadmin/phpmyadmin

ENV PMA_HOST=mysql
ENV MYSQL_ROOT_PASSWORD=root

EXPOSE 8080

# Dockerfile para el servicio mysql
FROM mysql:5.7

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=notifikazioak
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root

EXPOSE 3306