#!/bin/bash


container_name=$(cat docker_name.txt)
/usr/local/bin/docker stop $container_name
/usr/local/bin/docker rm $container_name
rm docker_name.txt

