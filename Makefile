build-app:
	make image -C app

build-base-image:
	make image -C java-base

run:
	make run -C app

clean:
	make clean -C app

all: build-base-image build-app clean run
