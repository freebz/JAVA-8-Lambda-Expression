// 2.2. 대표적인 함수형 인터페이스

// 2.2.1. Supplier<T> 인터페이스

Stream<Double> stream = Stream.generate(() -> Math.random());


Stream<Double> stream = Stream.generate(() -> Math.random()).limit(100000000);


// 2.2.2. Consumer 인터페이스

List<String> list = Arrays.asList("A", "B", "C");
list.stream()
    .forEach(System.out::println);


List<String> list = Arrays.asList("A", "B", "C");
for (String s : list) {
    System.out.println(s);
}


// 2.2.3. Predicate 인터페이스

List<String> list = Arrays.asList("ABC", "DE", "FGHI");

Predicate<String> p = s -> s.length() >= 3;

boolean all = list.stream().allMatch(p);
boolean any = list.stream().anyMatch(p);
boolean none = list.stream().noneMatch(p);

System.out.println(all);
System.out.println(any);
System.out.println(none);


// 2.2.4. Function<T, R> 인터페이스

// 2.2.5. BiFunction<T, U, R> 인터페이스

// 2.2.6. UnaryOperator 인터페이스

Stream.iterate(1, x -> x * 10).limit(5)
                    .forEach(System.out::println);


// 2.2.7. BinaryOperator 인터페이스