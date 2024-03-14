public class Hello {
    public static void main(String[] args)
    {
        System.out.println("HelloWorld!");
        int[] arr = {3,2,23,434,1};
        MyTools a = new MyTools();
        a.getArr(arr);
        a.showArr(arr);
      
    }
}
class MyTools
{

    public int[] getArr(int[] arr)
    {
        int[] arrNew = new int[arr.length];
        int temp = 0;
        for(int i =0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i;j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public void showArr(int[] arr)
    {
        System.out.println(" =========== ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
