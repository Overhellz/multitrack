# multitrack

https://github.com/Overhellz/multitrack

---

## 1. Two Pointers (два указателя)

| Level  | Name                                    | Link                                                               | Repeatable | Status | Time |
|:------:|:----------------------------------------|:-------------------------------------------------------------------|:----------:|:------:|:----:|
|  Easy  | 344. Reverse String                     | https://leetcode.com/problems/reverse-string/                      |     -      |  Done  |  20  |
|  Easy  | 125. Valid Palindrome                   | https://leetcode.com/problems/valid-palindrome/                    |     -      |  Done  |  12  |
|  Easy  | 26. Remove Duplicates from Sorted Array | https://leetcode.com/problems/remove-duplicates-from-sorted-array/ |     -      |  Done  |  6   |
| Medium | 167. Two Sum II - Input Array Is Sorted | https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/    |     -      |  Done  |  3   |
| Medium | 15. 3Sum                                | https://leetcode.com/problems/3sum/                                |     +*     |  Done  |  26  |
| Medium | 11. Container With Most Water           | https://leetcode.com/problems/container-with-most-water/           |     *      |  Done  |  6   |
|  Easy  | 392. Is Subsequence                     | https://leetcode.com/problems/is-subsequence/                      |     -      |  Done  |  5   |
|  Easy  | 844. Backspace String Compare           | https://leetcode.com/problems/backspace-string-compare/            |     *      |  Done  |  10  |
|  Easy  | 88. Merge Sorted Array                  | https://leetcode.com/problems/merge-sorted-array/                  |     -      |  Done  |  15  |
|  Easy  | 283. Move Zeroes                        | https://leetcode.com/problems/move-zeroes/                         |     **     |  Done  |  14  |
| Medium | 18. 4Sum                                | https://leetcode.com/problems/4sum/                                |    ***     |  Done  |  28  |
| Medium | 16. 3Sum Closest                        | https://leetcode.com/problems/3sum-closest/                        |     **     |  Done  |  20  |

---

## 2. Sliding Window (скользящее окно)

| Level  | Name                                                       | Link                                                                                | Repeatable | Status | Time |
|:------:|:-----------------------------------------------------------|:------------------------------------------------------------------------------------|:----------:|:------:|:----:|
|  Easy  | 643. Maximum Average Subarray I                            | https://leetcode.com/problems/maximum-average-subarray-i/                           |     +*     |  Done  |  21  |
| Medium | 209. Minimum Size Subarray Sum                             | https://leetcode.com/problems/minimum-size-subarray-sum/                            |    ***     |  Done  |  25  |
| Medium | 1004. Max Consecutive Ones III                             | https://leetcode.com/problems/max-consecutive-ones-iii/                             |     *      |  Done  |  20  |
| Medium | 1493. Longest Subarray of 1's After Deleting One Element   | https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/    |            |        |      |
| Medium | 904. Fruit Into Baskets                                    | https://leetcode.com/problems/fruit-into-baskets/                                   |            |        |      |
| Medium | 3. Longest Substring Without Repeating Characters          | https://leetcode.com/problems/longest-substring-without-repeating-characters/       |     **     |   -    |      |
| Medium | 424. Longest Repeating Character Replacement               | https://leetcode.com/problems/longest-repeating-character-replacement/              |            |        |      |
| Medium | 567. Permutation in String                                 | https://leetcode.com/problems/permutation-in-string/                                |            |        |      |
| Medium | 438. Find All Anagrams in a String                         | https://leetcode.com/problems/find-all-anagrams-in-a-string/                        |     *      |  Done  |  16  |
| Medium | 713. Subarray Product Less Than K                          | https://leetcode.com/problems/subarray-product-less-than-k/                         |     *      |  Done  |  8   |
| Medium | 1358. Number of Substrings Containing All Three Characters | https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/ |            |        |      |

---

## 3. Prefix Sum (префиксная сумма)

### Типы задач

#### Топ-10 Medium

| Level  | Name | Link | Repeatable | Status | Time |
|:------:|:-----|:-----|:----------:|:------:|:----:|
| Medium | 560  |      |            |        |      |
| Medium | 525  |      |            |        |      |
| Medium | 974  |      |            |        |      |
| Medium | 238  |      |            |        |      |
| Medium | 523  |      |            |        |      |
| Medium | 930  |      |            |        |      |
| Medium | 1109 |      |            |        |      |
| Medium | 304  |      |            |        |      |
| Medium | 1248 |      |            |        |      |
| Medium | 1094 |      |            |        |      |

🏆 Топ-10 Medium задач по Prefix Sum:

560. Subarray Sum Equals K — АБСОЛЮТНЫЙ МУСТ-ХЭВ

525. Contiguous Array — вторая по популярности

974. Subarray Sums Divisible by K

238. Product of Array Except Self — часто отдельно спрашивают

523. Continuous Subarray Sum

930. Binary Subarrays With Sum

1109. Corporate Flight Bookings — разностный массив

304. Range Sum Query 2D - Immutable — 2D префиксные суммы

1248. Count Number of Nice Subarrays

1094. Car Pooling — разностный массив

### Статистика по частоте на собеседованиях:

#### Группа A (спрашивают постоянно)

560, 525, 974

#### Группа B (часто спрашивают)

238, 523, 304

#### Группа C (спрашивают реже):

930, 1248 — 25% (вариации 560)

1109, 1094 — 20% (difference array)

🎯 Если готовиться кодить только 5:
560 — база всех задач на subarray sum

525 — clever trick с заменой 0→-1

974 — модульная арифметика

238 — prefix/suffix product

304 — 2D extension

Эти 5 задач покрывают 90% концепций prefix sum, которые спрашивают на собеседованиях бэкенд-разработчиков.

🧠 ГРУППИРОВКА ПО ТИПАМ:
Группа 1: HashMap + Prefix Sum (самые важные)
560, 930, 1248 → {prefixSum: count}, ищем sum - K

525 → {balance: firstIndex}, ищем тот же sum

974, 523 → {remainder: index/count}, работа с остатками

Группа 2: Prefix Sum без HashMap
238 → prefix/suffix product

304 → 2D prefix sum

Группа 3: Difference Array (без HashMap)
1109, 1094 → diff[l] += x, diff[r+1] -= x

⚡ БЫСТРАЯ ПАМЯТКА:
Когда использовать MAP:
✅ Ищем подмассивы с определённой суммой/условием (560, 525, 974, 523)
✅ Нужно быстро проверять, встречалось ли значение раньше
✅ Есть условие "равно K" или "делится на K"

Когда НЕ нужен MAP:
✅ Просто предподсчёт для быстрых запросов (304, 238)
✅ Range updates (1109, 1094) → используем difference array
✅ Просто накопление суммы без поиска паттернов

Что положить в Map?
Ключ: то, что мы вычисляем (сумма, остаток, баланс)

Значение:

count — если нужно подсчитать ВСЕ подмассивы (560, 974)

firstIndex — если нужно найти САМЫЙ ДЛИННЫЙ (525, 523)

index — если нужно проверить длину/расстояние

🎯 ЧТО СПРОСИТЬ СЕБЯ ПРИ РЕШЕНИИ:
Нужно ли мне искать паттерны в префиксных суммах?

Да → нужен HashMap

Нет → возможно, достаточно массива

Что я ищу?

Конкретную разницу (K) → 560 паттерн

Повтор значения → 525 паттерн

Одинаковые остатки → 974/523 паттерн

Нужно ли считать ВСЕ или только МАКСИМАЛЬНОЕ?

Все → храним count

Максимальное → храним firstIndex

Сохраните эту таблицу — она покрывает 90% задач на prefix sum!

### Типы задач

#### 0. Понимание базовых принципов

Самый частый сценарий — множество запросов "найти сумму на отрезке". Без префиксных сумм пришлось бы каждый раз
итерироваться, что дало бы O(n) на запрос. С префиксными суммами — O(1) после предобработки.

| Level | Name                                  | Link                                                           | Repeatable | Status | Time |
|:-----:|:--------------------------------------|:---------------------------------------------------------------|:----------:|:------:|:----:|
| Easy  | 1480. Running Sum of 1d Array         | https://leetcode.com/problems/running-sum-of-1d-array/         |     -      |  Done  |  3   |
| Easy  | 303. Range Sum Query - Immutable      | https://leetcode.com/problems/range-sum-query-immutable/       |     *      |  Done  |  7   |
| Easy  | 1588. Sum of All Odd Length Subarrays | https://leetcode.com/problems/sum-of-all-odd-length-subarrays/ |     **     |  Done  |  27  |

#### 1. Хеширование префиксных сумм

Концепция: Мы храним в хеш-таблице не просто суммы, а информацию о том, сколько раз мы уже видели конкретную сумму (или
ее модификацию) на пройденном участке.

Для чего? Чаще всего для решения задач вида "найти подмассив с суммой равной k".

Формула: Если prefixSum[j] - prefixSum[i] = k, то сумма подмассива [i, j-1] равна k. На практике при итерации мы
спрашиваем: count += map.get(prefixSum - k).

| Level  | Name                                 | Link                                                          | Repeatable | Status | Time |
|:------:|:-------------------------------------|:--------------------------------------------------------------|:----------:|:------:|:----:|
| Medium | 560. Subarray Sum Equals K           | https://leetcode.com/problems/subarray-sum-equals-k/          |    +***    |  Done  |  13  |
| Medium | 930. Binary Subarrays With Sum       | https://leetcode.com/problems/binary-subarrays-with-sum/      |    ***     |  Done  |  6   |
| Medium | 1248. Count Number of Nice Subarrays | https://leetcode.com/problems/count-number-of-nice-subarrays/ |    ***     |  Done  |  11  |
| Medium | 525. Contiguous Array                | https://leetcode.com/problems/contiguous-array/               |    ***     |  Done  |  20  |

#### 2. Модульная арифметика (остатки)

974. Subarray Sums Divisible by K — ключевая задача. Храним в хеше остатки (prefixSum % k + k) % k.

523. Continuous Subarray Sum — усложнение 974: нужна не просто делимость, а длина подмассива >= 2. В мапе храним
     индекс первого появления остатка.

#### 3. Разностный массив

    1109. Corporate Flight Bookings — идеальный пример применения разностного массива.
 
    1094. Car Pooling — похоже на 1109, но с интерпретацией "вход-выход".

#### 4: Двумерные префиксные суммы

    304. Range Sum Query 2D - Immutable — классика для 2D. Надо понять формулы построения и запроса.
 
    1314. Matrix Block Sum — отличная задача для закрепления 2D префиксных сумм на практике.

#### 5: Комбинированные и неочевидные задачи

    238. Product of Array Except Self — использует идею префиксных, но для произведения. Можно решить за O(1) доп.
         памяти.
 
    525. Contiguous Array — хитрая задача. Заменяем 0 -> -1 и ищем подмассив с суммой 0 через хеш-таблицу префиксных
         сумм.

--- 

| Level  | Name                                 | Link                                                          | Repeatable | Status | Time |
|:------:|:-------------------------------------|:--------------------------------------------------------------|:----------:|:------:|:----:|
|  Easy  | 303. Range Sum Query - Immutable     | https://leetcode.com/problems/range-sum-query-immutable/      |     **     |  Done  |  21  |
|  Easy  | 724. Find Pivot Index                | https://leetcode.com/problems/find-pivot-index/               |            |        |      |
| Medium | 560. Subarray Sum Equals K           | https://leetcode.com/problems/subarray-sum-equals-k/          |            |        |      |
| Medium | 523. Continuous Subarray Sum         | https://leetcode.com/problems/continuous-subarray-sum/        |            |        |      |
| Medium | 238. Product of Array Except Self    | https://leetcode.com/problems/product-of-array-except-self/   |            |        |      |
| Medium | 1109. Corporate Flight Bookings      | https://leetcode.com/problems/corporate-flight-bookings/      |            |        |      |
| Medium | 304. Range Sum Query 2D - Immutable  | https://leetcode.com/problems/range-sum-query-2d-immutable/   |            |        |      |
| Medium | 1314. Matrix Block Sum               | https://leetcode.com/problems/matrix-block-sum/               |            |        |      |
| Medium | 525. Contiguous Array                | https://leetcode.com/problems/contiguous-array/               |            |        |      |
| Medium | 974. Subarray Sums Divisible by K    | https://leetcode.com/problems/subarray-sums-divisible-by-k/   |            |        |      |
| Medium | 1248. Count Number of Nice Subarrays | https://leetcode.com/problems/count-number-of-nice-subarrays/ |            |        |      |

---

## 4. Hash Map (хеш-таблица)

| Level  | Name                              | Link                                                        | Repeatable | Status | Time |
|:------:|:----------------------------------|:------------------------------------------------------------|:----------:|:------:|:----:|
|  Easy  | 706                               |                                                             |            |        |      |
|  Easy  | 1. Two Sum                        | https://leetcode.com/problems/two-sum/                      |     -      |  Done  |      |
|  Easy  | 136. Single Number                | https://leetcode.com/problems/single-number/                |     -      |  Done  |      |
| Medium | 347. Top K Frequent Elements      | https://leetcode.com/problems/top-k-frequent-elements/      |     *      |  Done  |      |
| Medium | 451. Sort Characters By Frequency | https://leetcode.com/problems/sort-characters-by-frequency/ |     -      |  Done  |      |
| Medium | 49. Group Anagrams                | https://leetcode.com/problems/group-anagrams/               |     *      |  Done  |      |
| Medium | 128. Longest Consecutive Sequence | https://leetcode.com/problems/longest-consecutive-sequence/ |     *      |  Done  |      |
| Medium | 535                               |                                                             |            |        |      |
| Medium | 138                               |                                                             |            |        |      |
| Medium | 166                               |                                                             |            |        |      |
| Medium | 454                               |                                                             |            |        |      |

---

## 5. Stack, Queue (стек, очередь)

| Level  | Name | Link | Repeatable | Status | Time |
|:------:|:-----|:-----|:----------:|:------:|:----:|
|  Easy  | 20   |      |            |        |      |
|  Easy  | 1047 |      |            |        |      |
|  Easy  | 933  |      |            |        |      |
| Medium | 2390 |      |            |        |      |
| Medium | 71   |      |            |        |      |
| Medium | 155  |      |            |        |      |
| Medium | 225  |      |            |        |      |
| Medium | 232  |      |            |        |      |
| Medium | 150  |      |            |        |      |
| Medium | 227  |      |            |        |      |
| Medium | 341  |      |            |        |      |

---

## 6. Linked List

Easy: 206, 21, 141
Medium: 707, 876, 19, 234, 24, 148, 2, 138, 142

| Level  | Name | Link | Repeatable | Status | Time |
|:------:|:-----|:-----|:----------:|:------:|:----:|
|  Easy  | 206  |      |            |        |      |
|  Easy  | 21   |      |            |        |      |
|  Easy  | 141  |      |            |        |      |
| Medium | 707  |      |            |        |      |
| Medium | 876  |      |            |        |      |
| Medium | 19   |      |            |        |      |
| Medium | 234  |      |            |        |      |
| Medium | 24   |      |            |        |      |
| Medium | 2    |      |            |        |      |
| Medium | 138  |      |            |        |      |
| Medium | 142  |      |            |        |      |

---

## 7. Binary Tree, DFS

Easy: 104, 226, 112
Medium: 100, 101, 543, 236, 105, 114, 129, 437

| Level  | Name | Link | Repeatable | Status | Time |
|:------:|:-----|:-----|:----------:|:------:|:----:|
|  Easy  | 206  |      |            |        |      |
|  Easy  | 21   |      |            |        |      |
|  Easy  | 141  |      |            |        |      |
| Medium | 707  |      |            |        |      |
| Medium | 876  |      |            |        |      |
| Medium | 19   |      |            |        |      |
| Medium | 234  |      |            |        |      |
| Medium | 24   |      |            |        |      |
| Medium | 2    |      |            |        |      |
| Medium | 138  |      |            |        |      |
| Medium | 142  |      |            |        |      |

---

## 8. Binary Search Tree

Easy: 700, 108
Medium: 98, 701, 450, 230, 173, 96, 95, 538

---

## 9 Binary Tree, BFS

Easy: 637
Medium: 102, 103, 199, 515, 117, 1302, 116, 987, 513

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

---

## 16 Trie, Autocomplete

Medium: 208, 1268, 211, 648, 677, 676, 720

---

## 0 Реализация структур данных:

Medium: 380, 588, 895 380, 588, 895 –
