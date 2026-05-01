# multitrack

https://github.com/Overhellz/multitrack

---

## 1. Hash Map

```java
// Сортировка Map по значению
Comparator<? super T> comparator = Map.Entry.comparingByValue(Comparator.reverseOrder());
```

```java
// Хеш строки по количеству символов
private int hashByCharCountWithCase(String str) {
    int[] count = new int[52];  // 0-25: a-z, 26-51: A-Z
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c >= 'a' && c <= 'z') {
            count[c - 'a']++;
        } else if (c >= 'A' && c <= 'Z') {
            count[26 + (c - 'A')]++;
        }
    }
    return Arrays.hashCode(count);
}

private int hashByCharCountFullAscii(String str) {
    int[] count = new int[256];  // все ASCII символы
    for (int i = 0; i < str.length(); i++) {
        count[str.charAt(i)]++;
    }
    return Arrays.hashCode(count);
}

```


---

## 2. Binary Search
 
---

## 3. Two Pointers
 
---

## 4. Sliding Window
 
---

## 5. Prefix Sum
 
---

## 6. Intervals
 
---

## 7. Stack, Queue
 
---

## 8. Linked List
 
---

## 9. Binary Tree (DFS)
 
---

## 11. Binary Tree (BFS)
 
---

## 10. Binary Search Tree
 
---

## 12. Backtracking
 
---
