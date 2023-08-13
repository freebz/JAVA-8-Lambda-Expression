// 1.4. 메소드 참조

String::length


Consumer<String> c =
  str -> System.out.println(str);


Consumer<String> c =
  System.out::println;


Supplier<Double> s =
  () -> Math.random();


Supplier<Double> s =
  Math::random;


BinaryOperator<Integer> b =
  (x, y) -> Integer.max(x, y);


BinaryOperator<Integer> b =
  Integer::max;


Comparator<String> c =
  String::compareToIgnoreCase;


Function<String, Integer> f =
  s -> new Integer<s);


Function<String, Integer> f =
  Integer::new;