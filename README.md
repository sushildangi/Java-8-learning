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