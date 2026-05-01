package com.github.rodiond26.multitrack.finals.p02_binary_search;

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
        int hours = 0;
        for (int pile : piles) {
            hours = hours + (pile - 1) / speed + 1;
            if (hours > h) {
                return false;
            }
        }
        return true;
    }

    private int getMaxPile(int[] piles) {
        int maxPile = piles[0];
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        return maxPile;
    }
}
