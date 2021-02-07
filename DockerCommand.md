#Commands

| **Command**      | **Description** |
| ----------- | ----------- |
| **docker run**   _image_   | run the image       |
| **docker run**   _-d image_   | run the image in background      |
| **docker run**   _-it image_ --name somename --entrypoint=/bin/bash  | run the image -i --> attach input -t --> attach output      |
| **docker run**   _-p hostPort:dockerPort  | -p port mapping  |
| **docker run**   _-v /path/to/host/dir:/path/to/container/dir  | volume mapping |
| **docker run**   _-e environmentname=environmentvalue   | environment value |
| **docker run**   _--env-file ./env.list_   | environment value list |
|**docker network create** _network networkname_|Create network|
| **docker run**   _--network networkname_  | Creating Network |
| **docker images**   | show all the images in our machine        |
|**docker ps**|show all running containers|
|**docker ps -a**|show all running containers including stopped containers|
|**docker pull** _[repository-host:port]/[owner]/image[:tag]_|repository-host:port=hub.docker.com owner=library tag=latest|
|**docker stop** _container id / name_||
|**docker system prune -f**|To remove all the stopped container|
|**docker system prune -a**|To remove all the stopped container|
|**docker build** -t=sumeetagrawal/currentdate .|. for current directory|
|**docker logs** _containername_|Get Container Logs Output|