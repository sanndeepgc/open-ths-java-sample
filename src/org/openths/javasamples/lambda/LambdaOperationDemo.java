package org.openths.javasamples.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaOperationDemo {
  static void main() {
      // mathOperationDemo();
      // exploreThePredicateInterface();

      exploreTheFunctionInterface();
  }


    private static void exploreTheFunctionInterface(){
        Function<String, Integer> function = (data) ->{
            return data == null? 0: data.trim().length();
        };

        System.out.println(function.apply(null));
        System.out.println(function.apply("              "));
        System.out.println(function.apply("Data"));
    }
    private static void exploreThePredicateInterface() {
        Predicate<String> isNotEmptyString = string1 -> string1 != null && string1.trim().length() > 0;

        System.out.println(isNotEmptyString.test(null));
        System.out.println(isNotEmptyString.test("          "));
        System.out.println(isNotEmptyString.test("Test"));

        Predicate<List<Object>> isEmptyList = list1 -> list1 == null || list1.size() == 0;

        List temp = null;

        System.out.println(isEmptyList.test(temp));
        System.out.println(isEmptyList.test(List.of(12,34)));
        System.out.println(isEmptyList.test(List.of()));

        Predicate<String> isEmpty = string1 -> string1 == null || string1.trim().length() == 0;

        System.out.println(
                isEmpty.test(null));
        System.out.println(      isEmpty.test("              "));
        System.out.println(  isEmpty.test("Data"));

        Predicate<Double> isNumberGTZero = digit1 -> digit1 > 0;

        System.out.println( isNumberGTZero.test(-90.0));
        System.out.println( isNumberGTZero.test(90.0));

    }

    static void mathOperationDemo () {
      MathOperation addOperation =
              (digit1, digit2) -> {
                  return digit1 + digit2;
              };

      System.out.println(addOperation.operate(25, 67));
      System.out.println(addOperation.operate(35, 77));

      MathOperation mulOperation =
              (digit1, digit2) -> {
                  return digit1 * digit2;
              };

      System.out.println(mulOperation.operate(3, 7));
      System.out.println(mulOperation.operate(7, 9));

      MathOperation divOperation =
              (digit1, digit2) -> {
                  if (digit2 == 0) {
                      return 0;
                  }
                  return digit1 / digit2;
              };
      System.out.println(divOperation.operate(10, 2));
      System.out.println(divOperation.operate(10, 0));

      MathOperation subOperation =
              (digit1, digit2) -> {
                  return digit1 - digit2;
              };

      System.out.println(subOperation.operate(10, 4));
  }
}
