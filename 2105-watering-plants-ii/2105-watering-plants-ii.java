class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {

        int  i = 0;

        int  j = plants.length - 1;

        int pearA = capacityA;

        int pearB = capacityB;

        int count  = 0;

        while(i < j){

            if( pearA < plants[i]){
                count++;
                pearA = capacityA;
            }
            pearA -= plants[i];
            i++;

            if(pearB < plants[j]){
              count++;
              pearB = capacityB;  
            }
            pearB -= plants[j];
            j--;
        }

        if( i == j){
              int fin  = Math.max(pearA,pearB);

              if(fin < plants[i]){
                count++;
              }
        }

        return count;
    }
}