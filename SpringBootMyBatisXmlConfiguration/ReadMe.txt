Guide to configure a Springboot-base Mybatis project using XML files:
Step 1: create entities you want to use (contain fields and getters, setters)
step 2: Add these declarations into application.properties:
- mybatis entity scan packages
mybatis.type-aliases-package
ex: mybatis.type-aliases-package = com.example.demo.domain
here, the com.example.demo.domain is the package you use to contain all the entities in the project
- Mapper.xml location
mybatis.mapper-locations
ex: mybatis.mapper-locations=classpath*:/mybatis/*Mapper.xml
mybatis full path: src/main/resources/mybatis.
this is the folder containing all the mapper.xml files. Each of them maps java functions in the dao interfaces to sql queries 
step 3: create dao interfaces. All of them begin with a @Mapper annotation and contain all the method declarations you want to use.