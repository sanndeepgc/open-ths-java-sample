package org.openths.javasamples.inheritance.sealed_class;

public class DemoMain {

    static void main(){
        Status success = new SuccessMessage("Data is an output object", "Successful operation");
        Status failure = new FailureMessage("data is an input object", "Failure Operation");

        System.out.println(success);
        System.out.println(failure);
    }

}
