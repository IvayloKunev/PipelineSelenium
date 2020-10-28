#!/bin/bash



newContainerName=$(openssl rand -hex 3)
/usr/local/bin/docker run -d --name $newContainerName -p 4444:4444 -p 5901:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug:3.141.59-20200525
echo $newContainerName  > docker_name.txt
