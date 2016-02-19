image=app:1
container=app

jmx-port=9999
# ip=$(hostname -i)
# ip=$(hostname -I | awk '{print $$1}')
# neither of the above seem to be working very well in mingw
ip=192.168.99.100

clean:
	-docker stop $(container)
	-docker rm -v $(container)

image:
	docker build -t $(image) .

run:
	docker run \
		-d \
		--name $(container) \
		-p 80:8080 \
		-p $(jmx-port):$(jmx-port) \
		-e JMX_PORT=$(jmx-port) \
		-e HOST_IP=$(ip) \
		$(image)
