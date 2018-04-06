#!/bin/sh

java -jar -Dspring.profiles.active=$PROFILE -Djava.security.egd=file:/dev/urandom bootapp.jar