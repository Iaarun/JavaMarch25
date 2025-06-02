package testNgDemo;


import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {


    public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method testethod) {

        annotation.setRetryAnalyzer(RetryAnalyzer.class);

    }
}
