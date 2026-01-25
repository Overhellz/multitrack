# multitrack

https://github.com/Overhellz/multitrack

---

## 1. Two Pointers (Два указателя)

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

## 2. Sliding Window (Скользящее окно)

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

## 3. Prefix Sum (Префиксная сумма)

### Типы задач

#### 1. Классическая сумма подмассива

Самый частый сценарий — множество запросов "найти сумму на отрезке". Без префиксных сумм пришлось бы каждый раз
итерироваться, что дало бы O(n) на запрос. С префиксными суммами — O(1) после предобработки.

| Level | Name                                  | Link                                                           | Repeatable | Status | Time |
|:-----:|:--------------------------------------|:---------------------------------------------------------------|:----------:|:------:|:----:|
| Easy  | 1480. Running Sum of 1d Array         | https://leetcode.com/problems/running-sum-of-1d-array/         |     -      |  Done  |  3   |
| Easy  | 303. Range Sum Query - Immutable      | https://leetcode.com/problems/range-sum-query-immutable/       |     *      |  Done  |  7   |
| Easy  | 1588. Sum of All Odd Length Subarrays | https://leetcode.com/problems/sum-of-all-odd-length-subarrays/ |     **     |  Done  |  27  |

#### 2. Хеширование префиксных сумм

Концепция: Мы храним в хеш-таблице не просто суммы, а информацию о том, сколько раз мы уже видели конкретную сумму (или
ее модификацию) на пройденном участке.

Для чего? Чаще всего для решения задач вида "найти подмассив с суммой равной k".

Формула: Если prefixSum[j] - prefixSum[i] = k, то сумма подмассива [i, j-1] равна k. На практике при итерации мы
спрашиваем: count += map.get(prefixSum - k).

| Level  | Name                                 | Link                                                          | Repeatable | Status | Time |
|:------:|:-------------------------------------|:--------------------------------------------------------------|:----------:|:------:|:----:|
| Medium | 560. Subarray Sum Equals K           | https://leetcode.com/problems/subarray-sum-equals-k/          |    ****    |  Done  |  13  |
| Medium | 930. Binary Subarrays With Sum       | https://leetcode.com/problems/binary-subarrays-with-sum/      |    ***     |  Done  |  6   |
| Medium | 1248. Count Number of Nice Subarrays | https://leetcode.com/problems/count-number-of-nice-subarrays/ |    ***     |  Done  |  11  |

--- 

3. Префиксные суммы для модифицированных значений
   Иногда нужно считать не сумму, а что-то другое (например, количество нулей, четных чисел и т.д.).

Прием: Создаем массив prefix, где prefix[i] — количество искомых элементов на префиксе [0, i-1]. Тогда разница
prefix[r+1] - prefix[l] даст их количество на отрезке [l, r].

4. Двумерные префиксные суммы
   Для матриц (2D массива). prefix[i][j] — сумма всех элементов прямоугольника (0,0) -> (i-1, j-1).

Построение: prefix[i][j] = matrix[i-1][j-1] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1]

Сумма подматрицы (x1,y1)-(x2,y2): sum = prefix[x2+1][y2+1] - prefix[x1][y2+1] - prefix[x2+1][y1] + prefix[x1][y1]

5. Префиксные суммы + модульная арифметика (остатки)
   Частая задача: "найти подмассив, сумма которого делится на k".

Прием: Вместо самих сумм в хеш-таблице храним остатки от деления префиксной суммы на k. Если мы встречаем одинаковый
остаток в позициях i и j, то сумма элементов [i, j-1] делится на k нацело.

6. Разностный массив (Difference Array)
   Обратная техника, но тесно связанная. Позволяет выполнить множество операций "прибавить значение val на
   отрезке [l, r]" за O(1), а затем получить итоговый массив за O(n).

Шаг 1: Создаем diff длины n+1, заполняем нулями.

Шаг 2: Для операции [l, r] + val: diff[l] += val, diff[r+1] -= val.

Шаг 3: Проходим по diff с накоплением префиксной суммы — это и будут итоговые изменения для исходного массива.

---

3. Список задач для проработки на Leetcode

Группа 2: Модульная арифметика (остатки)

7.
    974. Subarray Sums Divisible by K — ключевая задача. Храним в хеше остатки (prefixSum % k + k) % k.
8.
    523. Continuous Subarray Sum — усложнение 974: нужна не просто делимость, а длина подмассива >= 2. В мапе храним
         индекс первого появления остатка.

Группа 3: Разностный массив

9.
    1109. Corporate Flight Bookings — идеальный пример применения разностного массива.
10.
    1094. Car Pooling — похоже на 1109, но с интерпретацией "вход-выход".

Группа 4: Двумерные префиксные суммы

11.
    304. Range Sum Query 2D - Immutable — классика для 2D. Надо понять формулы построения и запроса.
12.
    1314. Matrix Block Sum — отличная задача для закрепления 2D префиксных сумм на практике.

Группа 5: Комбинированные и неочевидные задачи

13.
    238. Product of Array Except Self — использует идею префиксных, но для произведения. Можно решить за O(1) доп.
         памяти.
14.
    525. Contiguous Array — хитрая задача. Заменяем 0 -> -1 и ищем подмассив с суммой 0 через хеш-таблицу префиксных
         сумм.

Стратегия проработки:
Начните с Easy задач, чтобы "набить руку" на построении массива.

Затем перейдите к 560 (Subarray Sum Equals K). Поймите ее досконально. Нарисуйте на бумаге.

Прорешайте задачи Группы 1, затем Группы 2.

Разберите Разностный массив на задачах 1109 и 1094.

Освойте 2D префиксные суммы на задачах 304 и 1314.

В конце попробуйте более хитрые задачи из Группы 5.

Главный паттерн для поиска подмассива с заданной суммой:
"Видел ли я раньше префиксную сумму, равную (currentPrefixSum - target)?" — это вопрос, который вы задаете хеш-таблице
на каждом шаге.

Отличная идея! Вот дополнительные задачи уровня Medium для углубленного закрепления по каждой группе.

Дополнительные Medium задачи для проработки
Группа 1: Хеширование префиксных сумм (расширение)

437. Path Sum III — Префиксные суммы на бинарном дереве. Отличная задача для переноса концепции на деревья.

325. Maximum Size Subarray Sum Equals k — Вместо количества подмассивов ищем максимальную длину подмассива с суммой k.

1546. Maximum Number of Non-Overlapping Subarrays With Sum Equals Target — Жадный подход + префиксные суммы. Встречается
      на реальных собеседованиях.

1124. Longest Well-Performing Interval — Более сложная задача с монотонной структурой. Префикс-суммы > 0.

Группа 2: Модульная арифметика (расширение)

1590. Make Sum Divisible by P — Похожа на 974, но нужно найти подмассив для удаления.

1524. Number of Sub-arrays With Odd Sum — Модификация: работа с четностью вместо остатков.

1497. Check If Array Pairs Are Divisible by k — Сортировка + подсчет остатков, хороша для понимания дополнений до k.

Группа 3: Разностный массив (расширение)

798. Smallest Rotation with Highest Score — Сложная задача, но блестяще решается разностным массивом. Показывает мощь
     техники.

1674. Minimum Moves to Make Array Complementary — Диапазонные операции с разностным массивом.

1893. Check if All the Integers in a Range Are Covered — Простая, но хорошая для закрепления подхода.

Группа 4: Двумерные префиксные суммы (расширение)

1074. Number of Submatrices That Sum to Target — Ключевая задача! Сочетание 2D префиксных сумм + 1D хеширования (как в
      560).

1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold — Префиксные суммы + бинарный поиск.

1504. Count Submatrices With All Ones — Работа с бинарной матрицей, оптимизация.

Группа 5: Комбинированные и неочевидные

1442. Count Triplets That Can Form Two Arrays of Equal XOR — Префиксные XOR вместо суммы. Вариант, который встречается
      на собеседованиях.

1423. Maximum Points You Can Obtain from Cards — Можно решать через префиксные суммы (ищем минимальный подмассив в
      середине).

1171. Remove Zero Sum Consecutive Nodes from Linked List — Префиксные суммы на связном списке.

Важные подгруппы для собеседований:
А. Задачи на максимум/минимум суммы подмассива
Базовый случай: 53. Maximum Subarray (Kadane's algorithm)

С префикс-суммами: 209. Minimum Size Subarray Sum — Префиксные суммы + бинарный поиск/два указателя

862. Shortest Subarray with Sum at Least K — Сложная, но важная. Префиксные суммы + монотонная очередь (Monotonic Deque)

Б. Задачи с несколькими измерениями

1477. Find Two Non-overlapping Sub-arrays Each With Target Sum — Динамическое программирование + префиксные суммы.

1983. Widest Pair of Indices With Equal Range Sum — Два массива, сводится к префикс-разности.

Рекомендации по приоритету для собеседования:
Обязательный минимум (самые частые на собеседованиях):

560. Subarray Sum Equals K — фундамент

974. Subarray Sums Divisible by K — работа с остатками

304. Range Sum Query 2D - Immutable — 2D префиксные суммы

1074. Number of Submatrices That Sum to Target — комбинация 2D + 1D

525. Contiguous Array — неочевидное применение

1109. Corporate Flight Bookings — разностный массив

Для углубленной подготовки:

7.
    862. Shortest Subarray with Sum at Least K — если позиция требует продвинутых алгоритмов
8.
    437. Path Sum III — деревья + префиксные суммы
9.
    798. Smallest Rotation with Highest Score — сложный разностный массив
10.
    1442. Count Triplets That Can Form Two Arrays of Equal XOR — префиксный XOR

Полезные паттерны для запоминания:
"Подмассив с суммой k": map.get(currentSum - target)

"Подмассив с суммой, делящейся на k": map.get((currentSum % k + k) % k)

"Работа с бинарными массивами": замена 0→-1 для поиска баланса

"Операции на отрезках": разностный массив diff[l] += val, diff[r+1] -= val

"Матричные запросы": 2D префиксные суммы по формуле включения-исключения

Проработав эти задачи, вы будете готовы к любым вопросам на префиксные суммы на собеседовании бэкенд-разработчика.
Начинайте с основных (помеченных как фундаментальные), затем переходите к более сложным.

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

4 Hash Map
Easy: 706, 1, 136
Medium: 347, 451, 49, 128, 535, 138, 166, 454

5 Stack, Queue
Easy: 20, 1047, 933
Medium: 2390, 71, 155, 225, 232, 150, 227, 341

6 Linked List
Easy: 206, 21, 141
Medium: 707, 876, 19, 234, 24, 148, 2, 138, 142

7 Binary Tree, DFS
Easy: 104, 226, 112
Medium: 100, 101, 543, 236, 105, 114, 129, 437

8 Binary Search Tree
Easy: 700, 108
Medium: 98, 701, 450, 230, 173, 96, 95, 538

9 Binary Tree, BFS
Easy: 637
Medium: 102, 103, 199, 515, 117, 1302, 116, 987, 513

10 Heap
Easy: 703, 1046
Medium: 215, 347, 451, 23, 378, 973, 621, 767, 1054

11 Intervals
Medium: 56, 57, 253, 435, 452, 763, 1288, 1094, 436

12 Graph, intro
Medium: 841, 1971, 133, 1557, 797, 399, 684, 802

13 Graph, part 1
Medium: 547, 200, 695, 1466, 2368, 542, 130, 417, 1020

14 Graph, part 2
Medium: 1091, 994, 1926, 752, 433, 1129, 207, 210, 310

15 LRU
Medium: 146, 355, 380

16 Trie, Autocomplete
Medium: 208, 1268, 211, 648, 677, 676, 720

0 Реализация структур данных:
Medium: 380, 588, 895 380, 588, 895 –
