// 1.3. 함수형 인터페이스

package java.util.function;

@FunctionalInterface
public interface IntBinaryOperator {
  int applyAsInt(int x, init y);
}


IntBinaryOperator op = new IntBinaryOperator();


IntBinaryOperator op =
  new IntBinaryOperator() {
    public int applyAsInt(int x, int y) {
      return x + y;
    }
  };


IntBinaryOperator op = (x, y) -> x + y;


IntBinaryOperator op = (x, y) -> x + y;


IntBinaryOperator op = new IntBinaryOperator();


IntBinaryOperator op =
  new IntBinaryOperator() {
    ???
  };


IntBinaryOperator op =
  new IntBinaryOperator() {
    public int applyAsInt(int x, int y) {
      ???
    }
  };


IntBinaryOperator op =
  new IntBinaryOperator() {
    public int applyAsInt(int x, int y) {
      return x + y;
    }
  };


IntBinaryOperator op = (int x, int y) -> { return x + y };


obj.test(?);


obj.test((x, y) -> x + y);


package java.util.function;

@FunctionalInterface
public interface Function<T, R> {
  R apply(T t);
}


Function<String, Integer> func =
  new Function<String, Integer>() {
    public Integer apply(String str) {
      return str.length();
    }
  }


Function<String, Integer> func =
  (str) -> str.length();


Function<String, Integer> func =
  str -> str.length();


Function<String, Integer func =
  String::length;