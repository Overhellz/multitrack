package com.github.rodiond26.multitrack.p03_prefix_sum;

import java.util.HashMap;
import java.util.Map;

class Solution560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);

        int currentSum = 0;
        int answer = 0;

        for (int num : nums) {
            currentSum += num;
            int target = currentSum - k;

            if (sumCount.containsKey(target)) {
                answer += sumCount.get(target);
            }

            sumCount.put(currentSum, sumCount.getOrDefault(currentSum, 0) + 1);
        }

        return answer;
    }
}

/*
Алгоритм:
1. Создать словарь sum_count, положить sum_count[0] = 1
2. Инициализировать current_sum = 0, answer = 0
3. Для каждого элемента в массиве:
   а) current_sum += элемент
   б) target = current_sum - K
   в) если target есть в sum_count:
        answer += sum_count[target]
   г) добавить current_sum в sum_count (увеличить счётчик)
4. Вернуть answer

 */