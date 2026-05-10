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

```java
// Убираем дубликаты
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Пропускаем дубликаты для i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Оптимизация: если nums[i] > 0, дальше все суммы > 0
            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Пропускаем дубликаты для left и right
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}

```

---

## 4. Sliding Window

---

## 5. Prefix Sum

```java
// Остаток от деления в java должен быть положительный
void remainder() {
    int remainder = sum % k;
    if (remainder < 0) {
        remainder += k;
    }
}
```

---

## 6. Intervals

```java

// sdfasf

```

---

## 7. Stack, Queue

---

## 8. Linked List

---

## 9. Binary Tree (DFS)

Главная идея Binary Tree DFS: рекурсивно спускайся к детям, обрабатывай текущий узел, передавай состояние вниз
(аккумуляторы) и собирай ответы наверх (post-order).

---

## 10. Binary Tree (BFS)

Главная идея Binary Tree BFS: используй очередь, обрабатывай уровень за уровнем, для каждого узла клади в очередь его
детей. Это даст тебе порядок по уровням (level-order).

---

## 11. Binary Search Tree (BST)

---

## 12. Backtracking

---
