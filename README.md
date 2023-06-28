## Aspect Oriented Programming

* Typically in Spring projects we are using layered approach to build applications.
  * Web Layer
  * Business Layer
  * Data Layer
* Although each layer has different responsibilities, There are few common aspects that apply to all layers
* Such as security, logging, performance etc. This common aspects are called **Cross Cutting Concerns**
* Aspect Oriented Programming are implementing Cross Cutting Concerns
* We can implement AOP with 2 popular AOP Frameworks:
  * Spring AOP: This framework only works with Spring Beans and it is not a complete solution
  * AspectJ: This framework is complete AOP solution 
* AOP Terminology:
  * Advice: The answer that what code to execute. Like Logging, Authentication etc.
  * Pointcut: Annotation that identifies method calls to be intercepted. If you are looking for example, you can check out my codes in [LoggingAspect.java](src/main/java/com/springaop/demo/aspects/LoggingAspect.java)
  * Aspect: Framework that implements AOP
* Annotations:
  * @Before: Do something before method is called 
  * @After: Do something after method is executed irrespective of whether:
    * Method executes successfully
    * Method throws an exception
  * @AfterRunning: Do something only when a method executes successfully
  * @AfterThrowing: Do something only when a method throws an exception