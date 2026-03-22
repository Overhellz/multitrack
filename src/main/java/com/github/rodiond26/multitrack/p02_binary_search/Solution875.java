package com.github.rodiond26.multitrack.p02_binary_search;

class Solution875 {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = getMaxPile(piles);

        while (minSpeed < maxSpeed) {
            int midSpeed = minSpeed + (maxSpeed - minSpeed) / 2;
            boolean canFinish = canEatAllBananas(piles, midSpeed, h);
            if (canFinish) {
                maxSpeed = midSpeed;
            } else {
                minSpeed = midSpeed + 1;
            }
        }
        return minSpeed;
    }

    private boolean canEatAllBananas(int[] piles, int speed, int h) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded = hoursNeeded + (pile - 1) / speed + 1;
            if (hoursNeeded > h) {
                return false;
            }
        }
        return true;
    }

    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
