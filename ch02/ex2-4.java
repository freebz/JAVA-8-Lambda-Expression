// 2.4. 대표적인 종단조작 메소드

// 2.4.1. 종단조작 count 메소드

List<String> list = Arrays.asList("A", "B", "C", "D");
System.out.println(
    list.stream.count()
);


// 2.4.2. 종단조작 max, min 메소드

Map<Integer, String> map = ····;
String str = map.get(1);


List<String> list1 = Arrays.asList("ABC", "DE", "FGHI", "J");
String max1 = list1.stream().max(
  (x, y) -> x.length() - y.length()
).orElse("최대값 없음");

String min1 = list1.stream().min(
  (x, y) -> x.length() - y.length()
).orElse("최소값 없음");

System.out.println(max1);
System.out.println(min1);

List<String> list2 = Arrays.asList();

String max2 = list2.stream().max(
  (x, y) -> x.length() - y.length()
).orElse("최대값 없음");

String min2 = list2.stream().min(
  (x, y) -> x.length() - y.length()
).orElse("최소값 없음");

System.out.println(max2);
System.out.println(min2);

// FGHI
// J
// 최대값 없음
// 최소값 없음


// 2.4.3. 종단조작 sum, average 메소드

int[] arr = {1, 3, 5, 7 9};
System.out.println(
  Arrays.stream(arr).sum()
);
System.out.println(
  Arrays.stream(arr).average().orElse(0.0);
);


// 2.4.4. 종단조작 reduce 메소드

Optional<T> reduce(BinaryOperator<T> accumulator)
T reduce(T identity, BinaryOperator<T> accumulator)


List<String> list = Arrays.asList("A", "B", "C", "D", "E");
Optional<String> optional =
  list.stream()
      .reduce((x, y) -> x + y);
System.out.println(
  optional.orElse("")
);


List<String> list = Arrays.asList("A", "B", "C", "D", "E");
String str = list.stream()
        .reduce("", (x, y) -> x + y);
System.out.println(str);


OptionalInt reduce(IntBinaryOperator op)
int reduce(int identity, IntBinaryOperator op)


// 2.4.5. 종단조작 collect 메소드

<R> R collect(
  Supplier<R> supplier,
  BiConsumer<R, ? super T> accumulator,
  BiConsumer<R, R> combiner)


Stream<String> stream =
    Stream.of("A", "B", "C", "D", "E");
ArrayList<String> list =
    stream.collect(
        () -> new ArrayList<String>(),
        (l, str) -> l.add(str),
        (l1, l2) -> l1.addAll(l2)
    );
list.stream()
    .forEach(System.out::println);


Stream<String> stream =
    Stream.of("A", "B", "C", "D", "E");
ArrayList<String> list =
    stream.collect(
        ArrayList<String>::new,
        ArrayList<String>::add,
        ArrayList<String>::addAll
    );
list.stream()
    .forEach(System.out::println);


<R, A> R collect(Collector<? super T, A, R> collector)


Stream<String> stream =
    Stream.of("A", "B", "C", "D", "E");
ArrayList<String> list =
    stream.collect(Collectors.toList());
list.stream()
    .forEach(System.out::println);


Stream<String> stream =
    Stream.of("A", "B", "C", "D", "E");
Set<String> set =
    stream.collect(Collectors.toSet());
set.stream().forEach(System.out::println);