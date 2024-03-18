# springboot-jsp-using-ant-compile
springboot-jsp-using-ant-compile


Spring boot bootJar does not have provision to compile jsps using general folder structure.

https://stackoverflow.com/questions/5013917/can-i-serve-jsps-from-inside-a-jar-in-lib-or-is-there-a-workaround

following are the reference to compile the jsp files to class files using both Ant build and tomcat

C:\Tools\apache-ant-1.10.14\bin\ant -Dtomcat.home=C:\Tools\apache-tomcat-9.0.87 -Dwebapp.path=C:\Users\param\Downloads\demo\demo\src\main\webapp

There are few other resources for the same.

https://tomcat.apache.org/tomcat-9.0-doc/jasper-howto.html

https://docs.gradle.org/7.4/dsl/org.gradle.api.tasks.Copy.html


C:\Users\param\OneDrive\Documents\GitHub\springboot-jsp-using-ant-compile\src\main\webapp\WEB-INF\classes>jar cvf jsp.jar org
added manifest
adding: org/(in = 0) (out= 0)(stored 0%)
adding: org/apache/(in = 0) (out= 0)(stored 0%)
adding: org/apache/jsp/(in = 0) (out= 0)(stored 0%)
adding: org/apache/jsp/jsp/(in = 0) (out= 0)(stored 0%)
adding: org/apache/jsp/jsp/editEmployee_jsp.class(in = 21753) (out= 8222)(deflated 62%)
adding: org/apache/jsp/jsp/error_jsp.class(in = 5711) (out= 2591)(deflated 54%)
adding: org/apache/jsp/jsp/hello_jsp.class(in = 5635) (out= 2534)(deflated 55%)
adding: org/apache/jsp/jsp/index_jsp.class(in = 7244) (out= 3268)(deflated 54%)


Copy jsp.jar file to WEB-INF/lib.

Note:
JSP class files need to be included in bootJar which need to be done.



