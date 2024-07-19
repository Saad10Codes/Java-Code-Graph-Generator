class BinSearchWhile{
    public static boolean binarySearch(int[] array, int value)  {
        int end = array.length -1;              
         
        while (start<end){
            int middle = (end + start)/2;
            if (array[middle] == value)  {
                return true;
            }
            else if (array[middle] > value)  {
                end = middle - 1;
            }
            else    {
                start = middle + 1;
            }
        }
        return false;
    }
}