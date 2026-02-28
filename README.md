# multitrack

https://github.com/Overhellz/multitrack

---

|  # |       Theme        | Tasks                                                                          |
|---:|:------------------:|--------------------------------------------------------------------------------|
|  1 |    Two Pointers    | 344, 125, 26, 167++, 15++, 11++, 392, 844, 88, 283, 18, 16                     |
|  2 |   Sliding Window   | 643, 209, 1004, 1493, 904, 3+++, 424, 567, 438+, 713+, 1358, 76+               |
|  3 |     Prefix Sum     | 303+, 724, 560+++, 523+, 238+++, 1109, 304+, 1314, 525+, 974+, 1248, 53+++     |
|  4 |      Hash Map      | 706, 1+++, 136, 347+, 451, 49++, 128++, 535, 138, 166, 454                     |
|  5 |    Stack, Queue    | 20+++, 1047, 933, 2390, 71, 155++, 225, 232, 150+, 227+, 341                   |
|  6 |    Linked List     | 206+++, 21++, 141++, 707, 876, 19+, 234, 24, 2++, 138+, 142, 23+++, 143+, 25+  |
|  7 | Binary Tree (DFS)  | 104+++, 226++, 112+, 100, 101+, 543++, 236+, 105, 114, 129+, 437, 124+++, 113+ |
|  8 | Binary Search Tree | 700, 108, 98+, 701, 450, 230+, 173, 96, 95, 538                                |
|  9 | Binary Tree (BFS)  | 637, 102+++, 103+, 199++, 515, 117, 1302, 116, 987, 513, 297++                 |
| 10 |     Intervals      | 56+++, 57++, 253+, 435++, 452+, 763+, 1288, 1094, 436                          |
| 11 |   Binary Search    | 704++, 35++, 74+, 153+++, 33+++, 34++, 162+, 875+++                            |
| 12 |    Backtracking    | 784+, 257, 78+++, 46+++, 39+++, 17++, 22+++, 79++, 90+, 77+                    |

---
Hash Map
Binary Search
Two Pointers
Sliding Window
Prefix Sum
---
Stack, Queue
Linked List
Intervals
---
Binary Tree (DFS)
Binary Search Tree
Binary Tree (BFS)
---
Backtracking

---

## Retention Rating Scale

| Retention | Description                                             |
|:---------:|:--------------------------------------------------------|
|     5     | Solved independently, within time.                      |
|     4     | Solved independently, but too slow / minor errors.      |
|     3     | Recalled algorithm, but code had errors / needed hints. |
|     2     | Vaguely remembered the topic, couldn't solve.           |
|     1     | Complete failure (didn't recognize the problem).        |

---

## 1. Hash Map

| Level  | Name                              | Link                                                        | Retention |
|:------:|:----------------------------------|:------------------------------------------------------------|:----------|
|  Easy  | 706                               | https://leetcode.com/problems/design-hashmap/               |           |
|  Easy  | 1. Two Sum                        | https://leetcode.com/problems/two-sum/                      | 5         |
|  Easy  | 136. Single Number                | https://leetcode.com/problems/single-number/                | 5         |
| Medium | 347. Top K Frequent Elements      | https://leetcode.com/problems/top-k-frequent-elements/      | 4         |
| Medium | 451. Sort Characters By Frequency | https://leetcode.com/problems/sort-characters-by-frequency/ | 5         |
| Medium | 49. Group Anagrams                | https://leetcode.com/problems/group-anagrams/               |           |
| Medium | 128. Longest Consecutive Sequence | https://leetcode.com/problems/longest-consecutive-sequence/ |           |
| Medium | 535                               |                                                             |           |
| Medium | 138                               |                                                             |           |
| Medium | 166                               |                                                             |           |
| Medium | 454                               |                                                             |           |

Лёгкие

706 — Проектирование HashMap (понять, как устроена внутри)

1 — Две суммы (абсолютный базис)

136 — Число, которое встречается один раз (биты + мапа)

Средние

347 — Топ K частых элементов (Bucket Sort / Heap)

451 — Сортировка символов по частоте (как 347, но строки)

49 — Группировка анаграмм (сортировка или кастомный ключ)

128 — Самая длинная последовательность (поиск начала)

535 — Кодирование TinyURL (система дизайн)

138 — Копирование списка со случайной ссылкой (копирование с мапой)

Сложные

166 — Дробь в десятичную (циклы в делении)

454 — Четыре суммы II (разбиение на пары)



---

## 1. Two Pointers (два указателя)

| Level  | Name                                    | Link                                                               | Repeatable | Status |
|:------:|:----------------------------------------|:-------------------------------------------------------------------|:----------:|:------:|
|  Easy  | 344. Reverse String                     | https://leetcode.com/problems/reverse-string/                      |     -      |  Done  |
|  Easy  | 125. Valid Palindrome                   | https://leetcode.com/problems/valid-palindrome/                    |     -      |  Done  |
|  Easy  | 26. Remove Duplicates from Sorted Array | https://leetcode.com/problems/remove-duplicates-from-sorted-array/ |     -      |  Done  |
| Medium | 167. Two Sum II - Input Array Is Sorted | https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/    |     -      |  Done  |
| Medium | 15. 3Sum                                | https://leetcode.com/problems/3sum/                                |     +*     |  Done  |
| Medium | 11. Container With Most Water           | https://leetcode.com/problems/container-with-most-water/           |     *      |  Done  |
|  Easy  | 392. Is Subsequence                     | https://leetcode.com/problems/is-subsequence/                      |     -      |  Done  |
|  Easy  | 844. Backspace String Compare           | https://leetcode.com/problems/backspace-string-compare/            |     *      |  Done  |
|  Easy  | 88. Merge Sorted Array                  | https://leetcode.com/problems/merge-sorted-array/                  |     -      |  Done  |
|  Easy  | 283. Move Zeroes                        | https://leetcode.com/problems/move-zeroes/                         |     **     |  Done  |
| Medium | 18. 4Sum                                | https://leetcode.com/problems/4sum/                                |    ***     |  Done  |
| Medium | 16. 3Sum Closest                        | https://leetcode.com/problems/3sum-closest/                        |     **     |  Done  |

---

## 2. Sliding Window (скользящее окно)

| Level  | Name                                                       | Link                                                                                | Repeatable | Status |
|:------:|:-----------------------------------------------------------|:------------------------------------------------------------------------------------|:----------:|:------:|
|  Easy  | 643. Maximum Average Subarray I                            | https://leetcode.com/problems/maximum-average-subarray-i/                           |     +*     |  Done  |
| Medium | 209. Minimum Size Subarray Sum                             | https://leetcode.com/problems/minimum-size-subarray-sum/                            |    ***     |  Done  |
| Medium | 1004. Max Consecutive Ones III                             | https://leetcode.com/problems/max-consecutive-ones-iii/                             |     *      |  Done  |
| Medium | 1493. Longest Subarray of 1's After Deleting One Element   | https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/    |            |        |
| Medium | 904. Fruit Into Baskets                                    | https://leetcode.com/problems/fruit-into-baskets/                                   |            |        |
| Medium | 3. Longest Substring Without Repeating Characters          | https://leetcode.com/problems/longest-substring-without-repeating-characters/       |     **     |   -    |
| Medium | 424. Longest Repeating Character Replacement               | https://leetcode.com/problems/longest-repeating-character-replacement/              |            |        |
| Medium | 567. Permutation in String                                 | https://leetcode.com/problems/permutation-in-string/                                |            |        |
| Medium | 438. Find All Anagrams in a String                         | https://leetcode.com/problems/find-all-anagrams-in-a-string/                        |     *      |  Done  |
| Medium | 713. Subarray Product Less Than K                          | https://leetcode.com/problems/subarray-product-less-than-k/                         |     *      |  Done  |
| Medium | 1358. Number of Substrings Containing All Three Characters | https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/ |            |        |

---

## 3. Prefix Sum (префиксная сумма)

| Level  | Name                                 | Link                                                          | Repeatable | Status |
|:------:|:-------------------------------------|:--------------------------------------------------------------|:----------:|:------:|
|  Easy  | 303. Range Sum Query - Immutable     | https://leetcode.com/problems/range-sum-query-immutable/      |     **     |  Done  |
|  Easy  | 724. Find Pivot Index                | https://leetcode.com/problems/find-pivot-index/               |            |        |
| Medium | 560. Subarray Sum Equals K           | https://leetcode.com/problems/subarray-sum-equals-k/          |            |        |
| Medium | 523. Continuous Subarray Sum         | https://leetcode.com/problems/continuous-subarray-sum/        |            |        |
| Medium | 238. Product of Array Except Self    | https://leetcode.com/problems/product-of-array-except-self/   |            |        |
| Medium | 1109. Corporate Flight Bookings      | https://leetcode.com/problems/corporate-flight-bookings/      |            |        |
| Medium | 304. Range Sum Query 2D - Immutable  | https://leetcode.com/problems/range-sum-query-2d-immutable/   |            |        |
| Medium | 1314. Matrix Block Sum               | https://leetcode.com/problems/matrix-block-sum/               |            |        |
| Medium | 525. Contiguous Array                | https://leetcode.com/problems/contiguous-array/               |            |        |
| Medium | 974. Subarray Sums Divisible by K    | https://leetcode.com/problems/subarray-sums-divisible-by-k/   |            |        |
| Medium | 1248. Count Number of Nice Subarrays | https://leetcode.com/problems/count-number-of-nice-subarrays/ |            |        |

---



---

## 5. Stack, Queue (стек, очередь)

| Level  | Name                                           | Link                                                                    | Repeatable | Status |
|:------:|:-----------------------------------------------|:------------------------------------------------------------------------|:----------:|:------:|
|  Easy  | 20. Valid Parentheses                          | https://leetcode.com/problems/valid-parentheses/                        |     -      |  Done  |
|  Easy  | 1047. Remove All Adjacent Duplicates In String | https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/ |     -      |  Done  |
|  Easy  | 933. Number of Recent Calls                    | https://leetcode.com/problems/number-of-recent-calls/                   |     -      |  Done  |
| Medium | 2390. Removing Stars From a String             | https://leetcode.com/problems/removing-stars-from-a-string/             |     -      |  Done  |
| Medium | 71. Simplify Path                              | https://leetcode.com/problems/simplify-path/                            |     -      |  Done  |
| Medium | 155. Min Stack                                 | https://leetcode.com/problems/min-stack/                                |     -      |  Done  |
|  Easy  | 225. Implement Stack using Queues              | https://leetcode.com/problems/implement-stack-using-queues/             |            |        |
|  Easy  | 232. Implement Queue using Stacks              | https://leetcode.com/problems/implement-queue-using-stacks/             |            |        |
| Medium | 150. Evaluate Reverse Polish Notation          | https://leetcode.com/problems/evaluate-reverse-polish-notation/         |     -      |  Done  |
| Medium | 227. Basic Calculator II                       | https://leetcode.com/problems/basic-calculator-ii/                      |            |        |
| Medium | 341. Flatten Nested List Iterator              | https://leetcode.com/problems/flatten-nested-list-iterator/             |            |        |

---

## 6. Linked List

| Stage | Level  | Name                                 | Link                                                            | Repeatable | Status |
|:-----:|:------:|:-------------------------------------|:----------------------------------------------------------------|:----------:|:------:|
|   1   | Medium | 707. Design Linked List              | https://leetcode.com/problems/design-linked-list/               |    ***     |        |
|   1   |  Easy  | 206. Reverse Linked List             | https://leetcode.com/problems/reverse-linked-list/              |    +**     |  Done  |
|   1   | Medium | 876. Middle of the Linked List       | https://leetcode.com/problems/middle-of-the-linked-list/        |     **     |  Done  |
|   1   |  Easy  | 21. Merge Two Sorted Lists           | https://leetcode.com/problems/merge-two-sorted-lists/           |     **     |  Done  |
|   2   |  Easy  | 141. Linked List Cycle               | https://leetcode.com/problems/linked-list-cycle/                |     **     |  Done  |
|   2   | Medium | 19. Remove Nth Node From End of List | https://leetcode.com/problems/remove-nth-node-from-end-of-list/ |            |        |
|   2   | Medium | 2. Add Two Numbers                   | https://leetcode.com/problems/add-two-numbers/                  |            |        |
|   2   | Medium | 234. Palindrome Linked List          | https://leetcode.com/problems/palindrome-linked-list/           |            |        |
|   3   | Medium | 143                                  |                                                                 |            |        |
|   3   | Medium | 23                                   |                                                                 |            |        |
|   3   | Medium | 138. Copy List with Random Pointer   | https://leetcode.com/problems/copy-list-with-random-pointer/    |            |        |
|   4   | Medium | 142. Linked List Cycle II            | https://leetcode.com/problems/linked-list-cycle-ii/             |            |        |
|   4   | Medium | 24. Swap Nodes in Pairs              | https://leetcode.com/problems/swap-nodes-in-pairs/              |            |        |
|   4   | Medium | 25                                   |                                                                 |            |        |

---

## 7. Binary Tree, DFS

| Level  | Name                              | Link                                                        | Repeatable | Status |
|:------:|:----------------------------------|:------------------------------------------------------------|:----------:|:------:|
|  Easy  | 104. Maximum Depth of Binary Tree | https://leetcode.com/problems/maximum-depth-of-binary-tree/ |    ***     |  Done  |
|  Easy  | 226. Invert Binary Tree           | https://leetcode.com/problems/invert-binary-tree/           |    ***     |  Done  |
|  Easy  | 112                               |                                                             |            |        |
| Medium | 100                               |                                                             |            |        |
| Medium | 101                               |                                                             |            |        |
| Medium | 543                               |                                                             |            |        |
| Medium | 236                               |                                                             |            |        |
| Medium | 105                               |                                                             |            |        |
| Medium | 114                               |                                                             |            |        |
| Medium | 129                               |                                                             |            |        |
| Medium | 437                               |                                                             |            |        |

---

## 8. Binary Search Tree

| Level  | Name                                            | Link                                                                      | Repeatable | Status |
|:------:|:------------------------------------------------|:--------------------------------------------------------------------------|:----------:|:------:|
|  Easy  | 700. Search in a Binary Search Tree             | https://leetcode.com/problems/search-in-a-binary-search-tree/             |            |        |
|  Easy  | 108. Convert Sorted Array to Binary Search Tree | https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ |            |        |
| Medium | 98. Validate Binary Search Tree                 | https://leetcode.com/problems/validate-binary-search-tree/                |            |        |
| Medium | 701. Insert into a Binary Search Tree           | https://leetcode.com/problems/insert-into-a-binary-search-tree/           |            |        |
| Medium | 450. Delete Node in a BST                       | https://leetcode.com/problems/delete-node-in-a-bst/                       |            |        |
| Medium | 230. Kth Smallest Element in a BST              | https://leetcode.com/problems/kth-smallest-element-in-a-bst/              |            |        |
| Medium | 173                                             |                                                                           |            |        |
| Medium | 96                                              |                                                                           |            |        |
| Medium | 95                                              |                                                                           |            |        |
| Medium | 538                                             |                                                                           |            |        |

---

## 9 Binary Tree, BFS

| Level  | Name | Link | Repeatable | Status |
|:------:|:-----|:-----|:----------:|:------:|
|  Easy  | 637  |      |            |        |
| Medium | 102  |      |            |        |
| Medium | 103  |      |            |        |
| Medium | 199  |      |            |        |
| Medium | 515  |      |            |        |
| Medium | 117  |      |            |        |
| Medium | 1302 |      |            |        |
| Medium | 116  |      |            |        |
| Medium | 987  |      |            |        |
| Medium | 513  |      |            |        |

---

## 10. Heap

Easy: 703, 1046

Medium: 215, 347, 451, 23, 378, 973, 621, 767, 1054

---

## 11 Intervals

Medium: 56, 57, 253, 435, 452, 763, 1288, 1094, 436

---

## 12 Graph, intro

Medium: 841, 1971, 133, 1557, 797, 399, 684, 802

---

## 13. Graph, part 1

Medium: 547, 200, 695, 1466, 2368, 542, 130, 417, 1020

---

## 14 Graph, part 2

Medium: 1091, 994, 1926, 752, 433, 1129, 207, 210, 310

---

## 15 LRU

Medium: 146, 355, 380

| Level  | Name                              | Link                                                      | Repeatable | Status |
|:------:|:----------------------------------|:----------------------------------------------------------|:----------:|:------:|
| Medium | 146. LRU Cache                    | https://leetcode.com/problems/lru-cache/                  |            |        |
| Medium | 355. Design Twitter               | https://leetcode.com/problems/design-twitter/             |            |        |
| Medium | 380. Insert Delete GetRandom O(1) | https://leetcode.com/problems/insert-delete-getrandom-o1/ |            |        |

---

## 16 Trie, Autocomplete

| Level  | Name | Link | Repeatable | Status |
|:------:|:-----|:-----|:----------:|:------:|
| Medium | 208  |      |            |        |
| Medium | 1268 |      |            |        |
| Medium | 211  |      |            |        |
| Medium | 648  |      |            |        |
| Medium | 677  |      |            |        |
| Medium | 676  |      |            |        |
| Medium | 720  |      |            |        |

---

## 0 Реализация структур данных:

Medium: 380, 588, 895 380, 588, 895 –
