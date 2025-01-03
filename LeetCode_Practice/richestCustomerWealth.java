class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] newArr = new int[accounts.length];

        for(int i = 0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            newArr[i] = sum;
        }

        Arrays.sort(newArr);

        return newArr[newArr.length - 1];

    }
}