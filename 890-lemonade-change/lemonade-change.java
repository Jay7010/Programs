class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[] = new int[3];
        Arrays.fill(arr,0);
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                arr[0]++;
                System.out.println("for 5 "+arr[0]+" "+arr[1]);
                continue;
            }
            else if(bills[i]==10){
                arr[1]++;
                while(bills[i]>5 && arr[0]>0){
                    bills[i]-=5;
                    arr[0]--;
                }
                // System.out.println(bills[i]+"for 10");
                System.out.println("for 10 "+arr[0]+" "+arr[1]);
                if(bills[i]!=5) return false;
            }
            else if(bills[i]==20){
                System.out.println("for 20 "+arr[0]+" "+arr[1]);
                while(bills[i]>10 && arr[1]>0){
                    bills[i]-=10;
                    arr[1]--;
                }
                while(bills[i]>5 && arr[0]>0){
                    bills[i]-=5;
                    arr[0]--;
                }
                System.out.println(bills[i]+"for 20");
                if(bills[i]!=5) return false;

            }
        }
        return true;

    }
}