// 1.5. 람다식의 메리트

import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> list =
      Arrays.asList(8, 1, 3, 4, 9, 2, 7);
  }
}


import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> list =
      Arrays.asList(8, 1, 3, 4, 9, 2, 7);
    Int count = 0;
    for (int x : list) {
      if (x % 2 == 0) {
        count++;
      }
    }
    System.out.println("짝수는" + count + "개");
  }
}


import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> list =
      Arrays.asList(8, 1, 3, 4, 9, 2, 7);
    final long count = list.stream()
      .filter(x -> x % 2 == 0)
      .count();
    System.out.println("짝수는" + count + "개");
  }
}
