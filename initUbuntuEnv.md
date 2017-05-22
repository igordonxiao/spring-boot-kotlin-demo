## init ubuntu
### update mirrors
* `sudo mv /etc/apt/sources.list /etc/apt/sources.list.bak`

* `sudo vim /etc/apt/sources.list` and append content below:

deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty main restricted universe multiverse
# deb-src https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty main restricted universe multiverse
deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-updates main restricted universe multiverse
# deb-src https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-updates main restricted universe multiverse
deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-backports main restricted universe multiverse
# deb-src https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-backports main restricted universe multiverse
deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-security main restricted universe multiverse
# deb-src https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-security main restricted universe multiverse
# deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-proposed main restricted universe multiverse
# deb-src https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ trusty-proposed main restricted universe multiverse

### install java8
* wget http://download.oracle.com/otn-pub/java/jdk/8u131-b11/d54c1d3a095b4ff2b6607d096fa80163/jdk-8u131-linux-x64.tar.gz?AuthParam=1495463578_31d548ceb075172272c9403142ed8319
* mv jdk-8u131-linux-x64.tar.gz\?AuthParam\=1495463578_31d548ceb075172272c9403142ed8319 jdk-8u131-linux-x64.tar.gz;

* sudo mkdir /usr/lib/jvm
* sudo tar zxfv jdk-8u131-linux-x64.tar.gz -C  /usr/lib/jvm
* vim ~/.bashrc, content as below,
export JAVA_HOME=/usr/lib/jvm/jdk1.8.0_131
export JRE_HOME=${JAVA_HOME}/jre
export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib
export PATH=${JAVA_HOME}/bin:$PATH
* source ~/.bashrc
* java -version


### ./gradlew bootRun

### ./gradlew bootRun --debug-jvm
Above command can be used remote debug with idea, the default port is 5005