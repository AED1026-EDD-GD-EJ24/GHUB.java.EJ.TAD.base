all: 
	make compile
	make test
	make run
compile:
	find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
run:
	java -cp build miPrincipal.Principal
test:
	java -jar lib/junit-platform-console-standalone-1.5.2.jar --class-path build --scan-class-path
clean:
	rm -r ./build/*