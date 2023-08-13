// 2.1. 스트림이란?

List<String> list =
  Array.asList("A", "B", "C", "D");

Stream<String> stream = list.stream();


String[] arr1 = {"A", "B", "C"};
Stream<String> stream1 = Arrays.stream(arr1);

int[] arr2 = {1, 2, 3};
IntStream stream2 = Arrays.stream(arr2);

long[] arr3 = {1L, 2L, 3L};
LongStream stream3 = Arrays.stream(arr3);


Stream<String> stream1 =
    Stream.of("A", "B", "C");

IntStream stream2 =
    IntStream.of(1, 2, 3);


LongStream stream3 =
    LongStream.of(1L, 2L, 3L);

DoubleStream stream4 =
    DoubleStream.of(1.0, 2.0, 3.0);