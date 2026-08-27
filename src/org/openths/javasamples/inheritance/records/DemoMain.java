package org.openths.javasamples.inheritance.records;

public class DemoMain {

    static void main(){
        Status successStatus = new SuccessRecordMessage( "Data is an Object", "Operation successful" );
        Status failureStatus = new FailureRecordMessage("Data is an object", new Exception("Unknown Exception"));

        System.out.println(successStatus);
        System.out.println(failureStatus);
    }
}
