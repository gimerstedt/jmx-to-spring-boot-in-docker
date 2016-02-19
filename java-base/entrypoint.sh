#!/bin/sh
set -e
if [ -z $HOST_IP ]; then
	export HOST_IP=127.0.0.1
fi
if [ -z $JMX_PORT ]; then
	export JMX_PORT=1099
fi

if [ "$1" = "java" ]; then
	java \
		-Dcom.sun.management.jmxremote \
		-Djava.rmi.server.hostname=$HOST_IP \
		-Dcom.sun.management.jmxremote.port=$JMX_PORT \
		-Dcom.sun.management.jmxremote.rmi.port=$JMX_PORT \
		-Dcom.sun.management.jmxremote.local.only=false \
		-Dcom.sun.management.jmxremote.authenticate=false \
		-Dcom.sun.management.jmxremote.ssl=false \
		-jar \
		/*.jar
fi
exec "$@"
