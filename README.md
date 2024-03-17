# springboot-jsp-using-ant-compile
springboot-jsp-using-ant-compile


Spring boot bootJar does not have provision to compile jsps using general folder structure.

https://stackoverflow.com/questions/5013917/can-i-serve-jsps-from-inside-a-jar-in-lib-or-is-there-a-workaround

following are the reference to compile the jsp files to class files using both Ant build and tomcat

C:\Tools\apache-ant-1.10.14\bin\ant -Dtomcat.home=C:\Tools\apache-tomcat-9.0.87 -Dwebapp.path=C:\Users\param\Downloads\demo\demo\src\main\webapp

There are few other resources for the same.

https://tomcat.apache.org/tomcat-9.0-doc/jasper-howto.html

https://docs.gradle.org/7.4/dsl/org.gradle.api.tasks.Copy.html


Note:
JSP class files need to be included in bootJar which need to be done.



