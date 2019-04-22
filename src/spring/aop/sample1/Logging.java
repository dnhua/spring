package spring.aop.sample1;

public class Logging {
    public void beforeAdvice(){
        System.out.println("before method:");
    }
    public void afterAdvice(){
        System.out.println("after method");
    }

    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
