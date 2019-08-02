### Maven学习

#### 1.2.插件

插件提供一个目标的集合，执行语法：

``mvn [plugin-name]：[goal-name] ``

示例：`mvn compiler:compile`   //Java工程用插件里的compile-goal编译；

**插件类型**：

* 构建插件    在构建是执行，pom.xml的元素中配置；
* 报告插件   网站生成过程中执行，也是pom.xml的元素中配置；



mvn clean package

清理目标目录，构建工程并打包输出为最终的jar文件；

#### 1.3.外部依赖

在pom.xml文件中指定外部依赖，

```xml
          <dependency>
             <groupId>ldapjdk</groupId>
             <artifactId>ldapjdk</artifactId>
             <scope>system</scope>
             <version>1.0</version>
             <systemPath>${basedir}\src\lib\ldapjdk.jar</systemPath>
          </dependency>
# groupId为library的名称；
# artifactId为library的名称；
# scope是作用域的范围
# systemPath为相对于工程位置的系统路径；
```





## 2. maven

### 2.1 命令

命令格式：`mvn [plugin-name]:[goal-name]`，参数有：

```shell
-D 指定参数，如：-Dmaven.test.skip=true 跳过单元测试；
-P 指定Profile配置，用于区分环境；
-e 显示maven运行出错的信息；
-o 离线执行命令
-X 显示maven允许的debug信息；
-U 强制远程更新snapshot的插件或依赖
```

* mvn package

  打包命令；

* mvn compile

  编译源代码；

* mvn test

  运行测试；

* mvn clean 

  清理maven项目；

* mvn install

  安装项目到本地仓库；

* mvn:deploy 

  发布项目到远程仓库；

* mvn dependency:tree 

  显示maven依赖树；

* mvn tomcat:deploy 

  运行打包部署；

### 2.2 POM

POM是项目对象模型，包含配置信息。用来做jar包的版本控制，

```shell
groupId  //公司组织ID
artifactID  //项目的ID标识，工程的名称；
version  //工程的版本号
```

父子模块：

**子模块需要有parent元素**，一般是jar或pom，通过parent元素与父项目关联。

```xml
<parent>
	<groupId>...</groupId>
	<artifactId>父项目的ID</artifactId>
    <version>...</version>
</parent>
```

父模块要有modules元素，packaging元素，父项目通过以下配置与子项目关联

```xml
<packaging>pom</packaging>
<modules>
        <module>provider</module>
        <module>consumer</module>
        <module>api</module>
</modules>
```

最后通过在父项目中执行 mvn clean install将子项目打包编译为1个项目。

### 2.3 版本

snapshot  存放快照版本；开发时可以频繁发布snapshot版本，以便调用新功能；

release  存放正式版；稳定了再发布正式版；

### 2.4 仓库

1. 本地仓库

   maven在本地存储构件的地方；在settings.xml中修改localRepository元素；

2. 远程仓库

   中央仓库，默认的远程库，在settings.xml中改。访问远程仓库需要添加认证配置信息\<server>.

3. **关系**

   从仓库解析依赖，先找本地，本地找不到再找远程仓库，

### 2.5 快速找POM依赖

  访问http://mvnrepository.com/ 网站，在里面搜索jar包，选择相应jar包的版本号，将里面的maven配置拷贝进pom.xml中。

在IDEA中，点进pom.xml，然后alt+insert，点击dependency，搜索需要的依赖包就行了。

### 2.6 maven解决jar包冲突

 maven在解析pom.xml时，同一个jar包只保留一个。

解决：1.手动方法：添加\<exclusion>标签排除指定的jar包

```xml
<exclusion>
	<groupId>...</groupId>
    <artifactId>...</artifactId>
</exclusion>
```

2. 版本锁定原则，用在继承项目的父项目中

   将不同模块共同的依赖抽取出来，设置版本号；

   在父pom.xml中，将公共依赖进行声明，需要声明版本号

   ```xml
   <dependencyManagement>
       <dependencies>
           <dependency>
               <groupId>org.springframework</groupId>
               <artifactId>spring-beans</artifactId>
               <version>${spring.versio}</version>
           </dependency>
       </dependencies>
   </dependencyManagement>
   
   子模块在使用spring-bean的jar包时就不用声明版本了
   ```

   3. 在依赖树图上选中要除外的依赖，右击选exclude就行。

   ### 2.7 生命周期

   * clean生命周期

     清理项目，clean是清理上一次构建生成的文件

   * default (build)生命周期

     构建项目，compile编译项目的主源码，test-compile编译项目的测试代码，test使用单元测试框架运行测试，package打包成可发布的格式，install 将包安装到本地仓库，deploy将包复制到远程仓库

   * site

     建立项目站点，生成项目战点文档。

   ### 2.8 执行单元测试

   1. 在pom中加junit依赖，

   2. 默认会执行src/test/java 目录下的测试类：*Test.java    Test\*.java   *TestCase.java类

   3. 动态执行要测试的类：

      ```shel
      mvn test -Dtest=demonmavenTest  指定单个测试类；
      mvn test -Dtest=demo*Test 指定多个，不同的以逗号隔开；
      ```

      

   **跳过测试**：

   * 在pom中配置：

     ```xml
     <configuration>
     	<skipTests>true</skipTests>
     </configuration>
     ```

   * 在命令行加入参数：  

     ```she
     mvn clean package -DskipTests=true
     或者 mvn clean package -Dmaven.test.skip=true
     ```

     

     





   

   

   

   

   

   

   









































