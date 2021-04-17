---
#                Java 8 Learning 

---
#### Imperative Vs Declarative Style
> Perform Sum from 1 to 100 using How and What Style
- Imperative
```java
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.err.println("Sum Using Imperative Approach : " + sum);
```
>Sum Using Imperative Approach : 5050
- Declarative
```java
        sum = IntStream.rangeClosed(0, 100).sum();
        System.err.println("Sum using Declarative Approach : " + sum);
```
>Sum using Declarative Approach : 5050
---
#### Imperative Vs Declarative Style Example 2
> Remove duplicate from List
- Imperative
```java
        List<Integer> integerList =
        Arrays.asList(1, 2, 3, 4, 5, 6, 1, 3, 4, 3, 5, 6, 7, 8, 9, 5, 9);
        /**
         * Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (int integer : integerList) {
        if (!uniqueList.contains(integer)) {
        uniqueList.add(integer);
        }
        }
        System.out.println("Unique List : " + uniqueList);
```
>Unique List : [1, 2, 3, 4, 5, 6, 7, 8, 9]
- Declarative
```java
        /**
 * Declarative
 */
         List<Integer> integerList =
        Arrays.asList(1, 2, 3, 4, 5, 6, 1, 3, 4, 3, 5, 6, 7, 8, 9, 5, 9);

        List<Integer> uniqueList1 = integerList.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println("Unique List : " + uniqueList1);
```
>Unique List : [1, 2, 3, 4, 5, 6, 7, 8, 9]
---