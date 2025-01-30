// linear search
/* 
import java.util.Arrays;

class Linear{

    public int LinearSearch(int arr[],int temp){
       for(int i=0;i<arr.length;i++)
       {
            if(arr[i]==temp){
                return i;
            }
          
       }
       return -1;
  
    }



    public static void main(String[] args) {
        int arr[]={10,9,5,6,7,1};
        int temp=1;
        Linear l=new Linear();
        int result=l.LinearSearch(arr, temp);
        System.out.println("Element found at index : "+result);

    }

}

// Binary search 
class Binary{

    public int BinarySearch(int arr[],int temp,int low,int high)
    {
        while(low<=high)
        {
           int mid=(low+high)/2;
            if(arr[mid]==temp){
                return mid;
            }
            else if(arr[mid]>temp){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={10,14,14,15,16,17};
        int low=0;
        int high=arr.length-1;
        int temp=17;
        Binary b=new Binary();
        int result=b.BinarySearch(arr,temp,low,high);
        System.out.println("Element found at index : "+result);
        }
}

//Bubble sort
class Bubble{

    public void BubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            for(int a:arr)
            
            System.out.print(a+" ");
            System.out.println();
           }
            

        }
    }
    public static void main(String[] args) {
        int arr[]={10,15,9,11,13,16};
        Bubble b=new Bubble();
        System.out.println("array before sorting is : ");
        for(int a:arr)
        System.out.print(a+" ");
        
        b.BubbleSort(arr);
        System.out.println();
        System.out.println("array after sorting is : ");
        for(int a:arr)
        System.out.print(a+" ");
    }
}

// selection sort
class Selection{

    public void SelectionSort(int arr[])
    {
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            int min=i ;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                   
                }
                
                
            }
            int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            

        }

    }
    public static void main(String[] args) 
    {
        int arr[]={10,15,11,14,9,17,16,-1};
        Selection s=new Selection();
        s.SelectionSort(arr);
        System.out.println("array after sorting is : ");
        for(int a:arr)
        System.out.print(a+" ");

    }
}
// Insertion sort
class Insertion{

    public void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            
            while(j>=0 && arr[j]>key )
            {
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
            for(int a:arr)
            System.out.print(a+" ");
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int arr[]={10,15,14,11,10,9,8,18};
        Insertion i=new Insertion();
        i.InsertionSort(arr);
        System.out.println("array after sorting is : ");
        for(int a:arr)
        System.out.print(a+" ");

    }
}

// Quick sort
class Quick{

    public void QuickSort(int arr[],int low ,int high)
    {
        if(low<high)
        {
           int pi=partition(arr,low,high);
           QuickSort(arr, low, pi-1);
           QuickSort(arr, pi+1, high);
        }
    }
    public int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;

    }
    public static void main(String[] args) {
        int arr[]={10,11,9,15,14,13,12,17};
        int low=0;
        int high=arr.length-1;
        Quick q=new Quick();
        q.QuickSort(arr,low,high);
        System.out.println("array after sorting : ");
        for(int a:arr){
            System.out.print(a+" ,");
        }
    }
}

class Merge{


    public void MergeSort(int arr[],int low,int high )
    {

        if(low<high){
            int mid =(low+high)/2;
            MergeSort(arr, low, mid);
            MergeSort(arr, mid+1 , high);
            Merge(arr,low,mid,high);
        }

    }
    public void Merge(int arr[],int low,int mid ,int high) 
    {

        int n1 = (mid-low)+1;
        int n2 = high-mid;

        int larr[]=new int[n1];
        int rarr[]=new int[n2];

        for(int x1=0; x1<n1;x1++)
        {
            larr[x1]=arr[low+x1];
        }
        for(int x2=0; x2<n2;x2++)
        {
            rarr[x2]=arr[mid+1+x2];
        }
        int i=0;
        int j=0;
        int k=low;
        while (i<n1 && j<n2) 
        {
            if(larr[i]<rarr[j]){
                arr[k]=larr[i];
                i++;
                k++;

            }else{
                arr[k]=rarr[j];
                j++;
                k++;
            }
            
        }
        while (i<n1) 
        {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }


    }
    public static void main(String[] args) {
        int arr[]={10,9,11,15,14,12,17};
        int low=0;
        int high=arr.length-1;
        Merge m=new Merge();
        m.MergeSort(arr,low,high);
        System.out.println("array after sorting : ");
        for(int a:arr){
            System.out.print(a+" ,");
        }
    }
}

class Merge{

    public void MergeSort(int arr[],int low ,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            MergeSort(arr, low, mid);
            MergeSort(arr, mid+1, high);
            Merge(arr,low,mid,high);
        }

    }
    public void Merge(int arr[],int low,int mid,int high)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        int larr[]=new int [n1];
        int rarr[]=new int[n2]; 

        for(int i=0;i<n1;i++){
            larr[i]=arr[low+i];
        }

        for(int j=0;j<n2;j++){
            rarr[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=low;
        while(i<n1 &&j<n2){
            if(larr[i]<rarr[j]){
                arr[k]=larr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rarr[j];
                j++;
                k++;
            }
        }
        while (i<n1) {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,9,18,15,19,11,14,8};
        int low=0;
        int high=arr.length-1;
        Merge m=new Merge();
        m.MergeSort(arr,low,high);
        System.out.println("array after sorting is ");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}


import java.util.Scanner;

class disha{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int s=sc.nextInt();
        sc.nextLine();
        int arr[]=new int[s];
        System.out.println("enter the elements in array");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements in array are ");
        for(int a:arr){
            System.out.print(a+" ,");
        }
        System.out.println();
        System.out.println("Enter the Index at which you want to insert the elements ");
        int i=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the element you want to insert");
        int e=sc.nextInt();
        int arr1[]=new int[s+1];
        for(int j=0;j<arr1.length;j++)
        {
            if(j<i){
                arr1[j]=arr[j];
            }
            else if(j==i){
                arr1[j]=e;
            }
            else{
                arr1[j]=arr[j-1];
            }

        }
        System.out.println("New array is ");
        for(int a:arr1){
            System.out.print(a+" ,");
        }

    }
}

import java.util.Scanner;
class disha{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int s=sc.nextInt();
        sc.nextLine();
        int arr[]=new int[s];
        System.out.println("enter the elements in array");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("elements in array are ");
        for(int a:arr){
            System.out.print(a+" ,");
        }
        System.out.println();
        System.out.println("Enter the Index at which you want to delete the elements ");
        int i=sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter the element you want to delete");
        // int e=sc.nextInt();
        // for(int j=0;j<arr.length;j++){
        //     if(arr[j]!=e){
        //         System.out.println("element not present in array");
        //         break;
        //     }
        // }
        int arr1[]=new int[s-1];
        for(int j=0;j<arr.length;j++)
        {

            if(j<i){
                arr1[j]=arr[j];
            }
            else if(j==i){
                continue;
            }
            else{
                arr1[j-1]=arr[j];
            }

        }
        System.out.println("New array is ");
        for(int a:arr1){
            System.out.print(a+" ,");
        }
    }
}

// check if element is present in the array or not 
class disha{

    public String Search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==key){
                    return "element found ";
                }
            }
            return "not found";
        }
        return "not found ";
       

    }
    public static void main(String[] args) {
        int arr[]={10,15,14,11,9,12,8};
        int key=100;
        disha d=new disha();
        String result=d.Search(arr,key);
        System.out.println(result);

    }
}

// code to remove duplicacy
class disha{

    public void Duplicate(int arr[],int arr1[]){
        int index=0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<index;j++){
                if (arr[i]==arr1[j]) {
                    isDuplicate=true;
                    break;
                    
                }
                
            }
            if(!isDuplicate){
                arr1[index]=arr[i];
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,10,20,20,18,14,14,15,19,11};
        int arr1[]=new int[arr.length];
        disha d=new disha();
        d.Duplicate(arr,arr1);
        
        for(int a:arr1){
            System.out.print(a+" ");
        }
    }

}

// remove duplicate elements 
import java.util.ArrayList;
import java.util.List;

class disha{
    public static void main(String[] args) {
        List<Integer> List=new ArrayList<>();
        List.add(10);
        List.add(10);
        List.add(11);
        List.add(11);
        List.add(15);
        List.add(15);
        List.stream().distinct().forEach(n->System.out.print(n+" "));
    }
}
*/

//selection sort
class Selection{
    public void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
             int min=i;
             for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
             }
             int temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
             for(int a:arr){
                System.out.print(a+" ");
             }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={10,11,9,8,12,16,14};
        Selection s=new Selection();
        System.out.println("array before sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
        s.SelectionSort(arr);
        System.out.println("array after sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
    }
}
//Insertion sort
class Insertion{

    public void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            int temp=arr[j+1];
            arr[j+1]=key;
            key=temp;
            for(int a:arr){
                System.out.print(a+" ");
             }
             System.out.println();
        }


    }
    public static void main(String[] args) {
        int arr[]={10,15,14,13,11,9,17,19,7};
        Insertion i=new Insertion();
        System.out.println("array before sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
        i.InsertionSort(arr);
        System.out.println("array after sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }

    }
}
// Quick sort
class Quick{

    public void QuickSort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
    }
    public int partition(int arr[],int low,int high){
        int pivot=arr[high];
        
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        for(int a:arr){
            System.out.print(a+" ");
         }
         System.out.println();

        return i+1;
      

    }
    public static void main(String[] args) {
        int arr[]={10,15,14,13,11,9,17,19,7};
        int low=0;
        int high=arr.length-1;
        Quick q=new Quick();
        System.out.println("array before sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
        q.QuickSort(arr,low,high);
        System.out.println("array after sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
    }
}
// Merge sort
class Merge{
    public void MergeSort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            MergeSort(arr, low, mid);
            MergeSort(arr, mid+1, high);
            Merge(arr,low,mid,high);
        }
    }
    public void Merge(int arr[],int low,int mid,int high){
        int n1=(mid-low)+1;
        int n2=high-mid;
        int larr[]=new int[n1];
        int  rarr[]=new int[n2];

       for(int i=0;i<n1;i++){
            larr[i]=arr[low+i];
       }
       for(int j=0;j<n2;j++){
        rarr[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=low;
        while (i<n1&&j<n2)
        {
            if(larr[i]<rarr[j]){
                arr[k]=larr[i];
                i++;
                
            }
            else{
                arr[k]=rarr[j];
                j++;
                
            }
            k++;
        } 
        while (i<n1) {
            arr[k]=larr[i];
            i++;
            k++;   
        }
        while (j<n2){
            arr[k]=rarr[j];
            j++;
            k++;  
        }

    }
    public static void main(String[] args) {
        int arr[]={10,15,14,13,11,9,17,19,7};
        
        Merge m=new Merge();
        System.out.println("array before sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
        m.MergeSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("array after sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
    }
}
// bubble sort
class Bubble{

    public void BubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                for(int a:arr){
                    System.out.print(a+" ");
                 }
                 System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,15,14,13,11,9,17,19,7};
        Bubble b=new Bubble();
        System.out.println("array before sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
        b.BubbleSort(arr);
        System.out.println();
        System.out.println("array after sorting ");
        for(int a:arr){
            System.out.print(a+" ");
         }
    }
}
