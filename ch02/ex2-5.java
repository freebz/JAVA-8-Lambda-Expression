// 2.5. 대표적인 중간조작 메소드

// 2.5.1. 중간조작 filter 메소드

Stream<String> stream =
    Stream.of("ABC", "DE", "FGH", "IJ", "KLMN");
List<String> list =
    stream.filter(
      s -> s.length() >= 3
    ).collect(Collectors.toList());
list.forEach(System.out::println);


Stream<String> stream =
    Stream.of("ABC", "DE", "FGH", "IJ", "KLMN");
List<String> list =
    stream.filter(
      s -> s.length() >= 3
    ).collect(Collectors.toList());
list.forEach(System.out::println);


// 2.5.2. 중간조작 map 메소드

Stream<String> stream1 =
    Stream.of("abc", "de", "fghi");
Stream<String> stream2 =
    stream1.map(s -> s.toUpperCase());
stream2.forEach(System.out::println);


Stream<String> stream1 =
    Stream.of("abc", "de", "fghi");
Stream<Integer> stream2 =
    stream1.map(s -> s.length());
stream2.forEach(System.out::println);


Stream<String> stream1 =
    Stream.of("abc", "de", "fghi");
Stream<Integer> stream2 =
    stream1.map(String::length);
stream2.forEach(System.out::println);


Stream<String> stream1 =
    Stream.of("abc", "de", "fghi");
Stream<Integer> stream2 =
    stream1.mapToInt(String::length);
System.out.println(stream2.sum());


// 2.5.3 중간조작 sorted 메소드

Stream<String> stream =
    Stream.of("EF", "WXYZ", "LMNOP", "ABC");
stream.sorted()
    .forEach(System.out::println);


Stream<String> stream =
    Stream.of("EF", "WXYZ", "LMNOP", "ABC");
stream.sorted(
    (s1, s2) -> s1.length() - s2.length()
).forEach(System.out::println);


class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getname() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override public String toString() {
        return "NAME : " + name + " AGE : " + age;
    }
}


Stream<Person> stream =
    Stream.of(
        new Person("John", 38),
        new Person("Mike", 19),
        new Person("Bob", 26)
    );


stream.sorted(
    Comparator.comparing(
        Person::getName
    )
).forEach(System.out::println);

// NAME : Bob AGE : 26
// NAME : John AGE : 38
// NAME : Mike AGE : 19


stream.sorted(
    Comparator.comparing(
        Person::getAge
    )
).forEach(System.out::println);

// NAME : John AGE : 38
// NAME : Bob AGE : 26
// NAME : Mike AGE : 19