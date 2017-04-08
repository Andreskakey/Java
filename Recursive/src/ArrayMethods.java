import java.io.*;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArrayMethods {
// ask the user for input to fill the arrays
    public static void fillFromUser(int[] a){
        //precondition: the array a has been declared
        // and instantiated by the user of the method
        //postcondition: the array a will be filled by the
        // from positon 0 to position a.length-1. Note:
        // an array is an object so the actual values of
        // the array being passes will be changed by this method
        // since java makes a copy of the address of the object and
        // therefore, the local variable a[] will point to the same
        // array as the int array passed by the user.
       
        for (int i=0; i<a.length; i++)
        a[i]=Integer.parseInt(JOptionPane.showInputDialog("Please enter next array element"));
    }
    // ask the user for input to fill the arrays
    public static void fillFromUser(double[] a){
        //precondition: the array a has been declared
        // and instantiated by the user of the method
        //postcondition: the array a will be filled by the
        // from positon 0 to position a.length-1. Note:
        // an array is an object so the actual values of
        // the array being passes will be changed by this method
        // since java makes a copy of the address of the object and
        // therefore, the local variable a[] will point to the same
        // array as the int array passed by the user.
       
        for (int i=0; i<a.length; i++)
        a[i]=Double.parseDouble(JOptionPane.showInputDialog("Please enter next array element"));
    }
    public static void fillFromUser(int[] a,int n){
        //precondition: the array a has been declared
        // and instantiated by the user of the method
        // n is how elements to be filled beginning with 0
        // and ending with n-1
        //postcondition: the array a will be filled by the
        // from positon 0 to position n-1. Note:
        // an array is an object so the actual values of
        // the array being passes will be changed by this method
        // since java makes a copy of the address of the object and
        // therefore, the local variable a[] will point to the same
        // array as the int array passed by the user.
       
        for (int i=0; i<n; i++)
        a[i]=Integer.parseInt(JOptionPane.showInputDialog("Please enter next array element"));
    }
    /*
    public static void fillIntFromUser(int t){
        // this method will attempt to read an integer
        // from a user, but Java passes all predefined types
        // by value. thus, a local variable t will have it's value
        // changed but it will not be reflected in the actual parameter
        // (integer) that was passed to the method by the user
        t=Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer"));
        System.out.println("value of local int t  "+ t);
    }
    */
    public static void printArray(int a[]){
    //precondition: array has already been filled
    //postcondition: the array will be printed one
    // entry per line
        for (int i=0; i<a.length; i++)
            System.out.println("Element"+i+": "+a[i]);
}
    public static void printArray(int a[], int cols){
        //precondition: array has already been filled
        //postcondition: the array will be printed with cols
        // entries per line
            for (int i=0; i<a.length; i++)
                {System.out.print(" "+a[i]);
                 if ((i+1)%cols==0)
                     System.out.println();
                }
    }
    public static void printArray(int a[], int cols, int n){
        //precondition: array has already been filled
        //postcondition: the first n elements of the array will be printed with cols
        // entries per line
            for (int i=0; i<n; i++)
                {System.out.print(" "+a[i]);
                 if ((i+1)%cols==0)
                     System.out.println();
                }
    }
    public static void printArray(double a[]){
        //precondition: array has already been filled
        //postcondition: the array will be printed one
        // entry per line
            for (int i=0; i<a.length; i++)
                System.out.println("Element"+i+": "+a[i]);
    }
        public static void printArray(double a[], int cols){
            //precondition: array has already been filled
            //postcondition: the array will be printed with cols
            // entries per line
                for (int i=0; i<a.length; i++)
                    {System.out.print(" "+a[i]);
                     if ((i+1)%cols==0)
                         System.out.println();
                    }
        }
        public static void printArray(double a[], int cols, int n){
            //precondition: array has already been filled
            //postcondition: the first n elements of the array will be printed with cols
            // entries per line
                for (int i=0; i<n; i++)
                    {System.out.print(" "+a[i]);
                     if ((i+1)%cols==0)
                         System.out.println();
                    }
        }
        public static void printArray(String a[]){
            //precondition: array has already been filled
            //postcondition: the array will be printed one
            // entry per line
                for (int i=0; i<a.length; i++)
                    System.out.println("Element"+i+": "+a[i]);
        }
            public static void printArray(String a[], int cols){
                //precondition: array has already been filled
                //postcondition: the array will be printed with cols
                // entries per line
                    for (int i=0; i<a.length; i++)
                        {System.out.print(" "+a[i]);
                         if ((i+1)%cols==0)
                             System.out.println();
                        }
            }
            public static void printArray(String a[], int cols, int n){
                //precondition: array has already been filled
                //postcondition: the first n elements of the array will be printed with cols
                // entries per line
                    for (int i=0; i<n; i++)
                        {System.out.print(" "+a[i]);
                         if ((i+1)%cols==0)
                             System.out.println();
                        }
            }
            public static void printArray(boolean a[]){
                //precondition: array has already been filled
                //postcondition: the array will be printed one
                // entry per line
                    for (int i=0; i<a.length; i++)
                        System.out.println("Element"+i+": "+a[i]);
            }
                public static void printArray(boolean a[], int cols){
                    //precondition: array has already been filled
                    //postcondition: the array will be printed with cols
                    // entries per line
                        for (int i=0; i<a.length; i++)
                            {System.out.print(" "+a[i]);
                             if ((i+1)%cols==0)
                                 System.out.println();
                            }
                }
                public static void printArray(boolean a[], int cols, int n){
                    //precondition: array has already been filled
                    //postcondition: the first n elements of the array will be printed with cols
                    // entries per line
                        for (int i=0; i<n; i++)
                            {System.out.print(" "+a[i]);
                             if ((i+1)%cols==0)
                                 System.out.println();
                            }
                }
                public static void printArray(char a[]){
                    //precondition: array has already been filled
                    //postcondition: the array will be printed one
                    // entry per line
                        for (int i=0; i<a.length; i++)
                            System.out.println("Element"+i+": "+a[i]);
                }
                    public static void printArray(char a[], int cols){
                        //precondition: array has already been filled
                        //postcondition: the array will be printed with cols
                        // entries per line
                            for (int i=0; i<a.length; i++)
                                {System.out.print(" "+a[i]);
                                 if ((i+1)%cols==0)
                                     System.out.println();
                                }
                    }
                    public static void printArray(char a[], int cols, int n){
                        //precondition: array has already been filled
                        //postcondition: the first n elements of the array will be printed with cols
                        // entries per line
                            for (int i=0; i<n; i++)
                                {System.out.print(" "+a[i]);
                                 if ((i+1)%cols==0)
                                     System.out.println();
                                }
                    }
    /* Quiz 8: write overloaded methods to sum an array of int and an array of double
     * for each type there should be three methods (6 all together). the first assumes the
     * entire array has been filled and sums all the elements from 0 to a.length-1
     * and returns the result as either an int or a double.  The second has two input parameters, the first
     * the array and the second the number of elements to be added. The third has three input parameters, the first the array
     * the second the number of elements to be added and the third the starting position. In the third method
     * the precondition must state that the number of elements to be added plus the starting point cannot exceed the length of the array
     *
     *
     */
    public static int listSum(int a[]){
    int sum=0;
    for(int i=0;i<a.length;i++)
        sum=sum+ a[i];
    return sum;
                          
                        }
    public static int listSum(int a[], int n){
                            int sum=0;
                            for(int i=0;i<n;i++){
                                    sum=sum+a[i];
                        }
                            return sum;
                        }
                      
                           public static int listSum(int a[], int n, int m){
                               int sum=0;
                                for(int i=m;i<m+n;i++){
                                        sum=sum+a[i];

                                }
                                
                             return sum;
                              
                              
                        }
                         
                           public static double listSum(double a[]){
                            double sum=0;
                            for(int i=0;i<a.length;i++)
                                sum=sum+ a[i];
                            return sum;
                          
                        }
                      
                        public static double listSum(double a[], int n){
                            double sum=0;
                            for(int i=0;i<n;i++){
                                    sum=sum+a[i];
                        }
                            return sum;
                        }
                      
                           public static double listSum(double a[], int n, int m){
                               double sum=0;
                                for(int i=m;i<m+n;i++){
                                        sum=sum+a[i];
                     
                                
                          
                              
                              
                        }
                                return sum;
                           }
                          
public static void resetArray(int[] a){
    for(int i=0;i<a.length;i++)
        a[i]=0;
}

public static void resetArray(int[] a, int n){
    for(int i=0;i<n;i++)
        a[i]=0;
}
public static void resetArray(double[] a){
    for(int i=0;i<a.length;i++)
        a[i]=0;
}

public static void resetArray(double[] a, int n){
    for(int i=0;i<n;i++)
        a[i]=0;
}

public static void fillRandom(int a[]){
    for(int i=0;i<a.length;i++)
        a[i]=(int)(Math.random()*2147483648l);
   
}
public static void fillRandom(int a[], int n){
    for(int i=0;i<n;i++)
        a[i]=(int)(Math.random()*2147483648l);
   
}
public static void fillRandom(int a[],int r1, int r2){
    // precondition: r1 and r2 are positive integers with r2>r1
    // postcondition: Array a will be filled with integers in the above range from
    // r1..r2
    for(int i=0;i<a.length;i++)
        a[i]=(int)(Math.random()*(r2-r1+1))+r1;
   
}
public static void fillRandom(int a[], int n, int r1, int r2){
    for(int i=0;i<n;i++)
        a[i]=(int)(Math.random()*(r2-r1))+r1;
   
}



public static void fillRandom(double a[],int r1, int r2){
    // precondition: r1 and r2 are positive integers with r2>r1
    // postcondition: Array a will be filled with doubles in the above range from
    // r1..r2 not including r2
    for(int i=0;i<a.length;i++)
        a[i]=(Math.random()*(r2-r1))+r1;
   
}
public static void fillRandom(double a[], int n, int r1, int r2){
    for(int i=0;i<n;i++)
        a[i]=(Math.random()*(r2-r1))+r1;
   
}

// some descriptive statistics

public static int findPosOfLow(int[] a){
    int lowPos=0;
    for (int i=1; i<a.length; i++)
        if (a[i]<a[lowPos])
            lowPos=i;
    return lowPos;
}
public static int findLow(int[] a){
    return (a[findPosOfLow(a)]);
}
public static int findPosOfLow(double[] a){
    int lowPos=0;
    for (int i=1; i<a.length; i++)
        if (a[i]<a[lowPos])
            lowPos=i;
    return lowPos;
}
public static double findLow(double[] a){
    return (a[findPosOfLow(a)]);
}
public static int findPosOfLow(int[] a, int r1, int r2){
    int lowPos=r1;
    for (int i=r1; i<=r2; i++)
        if (a[i]<a[lowPos])
            lowPos=i;
    return lowPos;
}
public static int findLow(int[] a, int r1, int r2){
    return (a[findPosOfLow(a,r1,r2)]);
}
public static int findPosOfLow(double[] a, int r1, int r2){
    int lowPos=r1;
    for (int i=r1; i<=r2; i++)
        if (a[i]<a[lowPos])
            lowPos=i;
    return lowPos;
}
public static double findLow(double[] a, int r1, int r2){
    return (a[findPosOfLow(a,r1,r2)]);
}
public static int findPosOfHigh(int[] a){
    int highPos=0;
    for (int i=1; i<a.length; i++)
        if (a[i]>a[highPos])
            highPos=i;
    return highPos;
}
public static int findPosOfHigh(int[] a, int r1, int r2){
    int highPos=r1;
    for (int i=r1; i<=r2; i++)
        if (a[i]>a[highPos])
            highPos=i;
    return highPos;
}
public static int findHigh(int[] a){
   
    return a[findPosOfHigh(a)];
}
public static int findHigh(int[] a, int r1, int r2){
   
    return a[findPosOfHigh(a,r1,r2)];
}
// find more descriptive statistics

public static double mean(int a[]){
    return (double)listSum(a)/a.length;
}
public static double mean(int a[], int n){
    return (double)listSum(a,n)/a.length;
}
// overloaded methods for double
public static int findPosOfHigh(double[] a){
    int highPos=0;
    for (int i=1; i<a.length; i++)
        if (a[i]>a[highPos])
            highPos=i;
    return highPos;
}
public static int findPosOfHigh(double[] a, int r1, int r2){
    int highPos=r1;
    for (int i=r1; i<=r2; i++)
        if (a[i]>a[highPos])
            highPos=i;
    return highPos;
}
public static double findHigh(double[] a){
   
    return a[findPosOfHigh(a)];
}
public static double findHigh(double[] a, int r1, int r2){
   
    return a[findPosOfHigh(a,r1,r2)];
}
// find more descriptive statistics

public static double mean(double a[]){
    return (double)listSum(a)/a.length;
}
public static double mean(double a[], int n){
    return (double)listSum(a,n)/a.length;
}
public static double variance(int a[]){
    double v=0;
    double m=mean(a);
    for (int i=1; i<a.length; i++)
        v+=(a[i]-m)*(a[i]-m);
    return v/a.length;
}
public static double variance(int a[], int n){
    double v=0;
    double m=mean(a,n);
    for (int i=1; i<n; i++)
        v+=(a[i]-m)*(a[i]-m);
    return v/n;
}

public static double sDev(int a[]){
    return Math.sqrt(variance(a));
}
public static double sDev(int a[], int n){
    return Math.sqrt(variance(a, n));
}

public static int median(int a[]){
    // this destroys the original contents of a, putting it in order
    selectionSort(a);
    return a[a.length/2];
}
public static int medianFast(int a[]){
    // do not destroy array a
    int b[]=new int[a.length];
    copyArray(a,b); // copies a into b
    int pos;
    for (int pass=0;pass<=b.length/2+1;pass++)
        {pos=findPosOfLow(b,pass,b.length-1);
         swap(b,pass,pos);
        }
    return b[b.length/2];
}

public static void copyArray(int a[], int b[]){
    for (int i=0; i<a.length; i++)
        b[i]=a[i];
}
public static void freq(int a[], int f[]){
    // precondition: a contains nonnegative integers f contains all zeroes
    // postcondition: returns an array f that contains the frequenies
    // of how often each integer beginning with 0 occurs in the array a
   
    for(int i=0;i<a.length;i++)
        f[a[i]]++;
   
}
public static void freq(int a[], int n, int[] f){
    // precondition: a contains nonnegative integers f contains all zeroes
    // postcondition: returns an array f that contains the frequencies
    // of how often each integer beginning with 0 occurs in the array a
   
    for(int i=0;i<n;i++)
        f[a[i]]++;
   
}

public static void fastIntSort(int[] a){
    // use distribution counting
    int m=findHigh(a); // this is the largest element in the array
    int f[]=new int[m+1]; // we assume all array elements are non-negative
    freq(a,f); // this creates a frequency distribution
    int k=0; // point to a array
    // the sort logic follows
    for (int i=0; i<f.length; i++)
         for (int j=0; j<f[i]; j++)
             a[k++]=i; // write i into a f[i] times
             
}
// unlike fastIntSort above, selection sort can be used
// to sort doubles, strings, chars as well as integers

public static void selectionSort(int a[]){
    //precondition: the array a has been filled
    //postcondition: the array a will be sorted from
    //low to high (ascending order)
// this is a big O of N^2 algorithm (quadratic) as opposed to
// distribution counting above which is much faster--big O of N (linear)   
   
    // selection sort requires n-1 passes where n is the length of the array
// at the end of pass i, the ith element is swapped with the largest element >=i
    int pos;
    for (int pass=0;pass<a.length-1;pass++)
        {pos=findPosOfLow(a,pass,a.length-1); // this method returns position of lowest elem
                                                                        //beginning at pos. pass, ending at position a.length-1
         swap(a,pass,pos); // this method does the swap of the two elements at postions pass and pos
        }
   
}
public static void selectionSort(int a[], int n){
    //precondition: the array a has been filled thru first n elements
    //postcondition: the array a will be sorted from
    //low to high (ascending order)
// this is a big O of N^2 algorithm (quadratic) as opposed to
// distribution counting above which is much faster--big O of N (linear)   
   
    // selection sort requires n-1 passes where n is the length of the array
// at the end of pass i, the ith element is swapped with the largest element >i
    int pos;
    for (int pass=0;pass<n-1;pass++)
        {pos=findPosOfLow(a,pass,n-1);
         swap(a,pass,pos);
        }

   
       
       
    }

public static void swap(int a[], int m, int n){
    int t=a[m]; // hold the mth element
    a[m]=a[n]; // put the nth element into the mth element
    a[n]=t; // complete the swap
}
//combine two arrays
public static void concatArrays(int a[], int b[], int c[]){
    // precondition: combine two arrays by concatenating b to a giving c
    //postcondition: c will contain the concatenated arrays
int k=0; // k will be subscript for c array
for (int i=0; i<a.length; i++) // step thru a array
    c[k++]=a[i];
for (int j=0; j<b.length; j++)
    c[k++]=b[j];

}

// merge logic follows
public static void mergeArrays(int[] a, int[] b, int[] c){
    // precondition: a and b are sorted in ascending order
    // postcondition: c will contain the merged lists, maintaining the order
    int i=0; // subscript for a array
    int j=0; // subcript for b array
    int k;
    for (k=0; k<a.length+b.length;k++){
        if (i==a.length||j==b.length)// a or b array is done
            break;
        if (a[i]<b[j])
            c[k]=a[i++];
        else
            c[k]=b[j++];
    }
    if (i<a.length) // add the remaining element from array a
        for (int l=i; l<a.length; l++) // step thru rest of a
            c[k++]=a[l];
    if (j<b.length) // add the remaining element from array a
        for (int l=j; l<b.length; l++) // step thru rest of a
            c[k++]=b[l];
   
}
public static void generateCsvFile(String sFileName,int[] a,
        double[] b,int m)
                          {
                               try
                               {
                                   FileWriter writer = new FileWriter(sFileName);
                        for (int i=0;i<m;i++){
                                if (a[i]==0&&b[i]==0&&i>0)
                                        break;
                                else
                                   writer.append(Integer.toString(a[i])+","+ b[i]+"\n");

                                 //  writer.append('\n');

                               }

                                   //generate whatever data you want

                                   writer.flush();
                                   writer.close();
                               }
                               catch(IOException e)
                               {
                                    e.printStackTrace();
                               }
                           }
public static int readCsvFile(String fName,double[] low,
        double[] high){
     
    


     int ctr1=0;
     int temp;
     double last;
     String fileName=fName;
try {
 BufferedReader br = new BufferedReader( new FileReader(fileName));
 StringTokenizer str = null;


 while( (fileName = br.readLine()) != null)                                                                                  //
     
                        {

                            str = new StringTokenizer(fileName);                                                                                                    //
   
                     
                                                                             // Parse Open column
   
                         low[ctr1] =
     Double.parseDouble(str.nextToken(","));                                                                       
   
                         high[ctr1] = Double.parseDouble(str.nextToken(","));
                        // close[ctr1] = Double.parseDouble(str.nextToken(","));
                       //  dirL[ctr1] = Integer.parseInt((str.nextToken(",")));
                        // dirH[ctr1] = Integer.parseInt(str.nextToken(","));

                       //  System.out.println("" +low[ctr1]+ " , "+high[ctr1]);
                         ctr1++;                                                                                                                                                                 ;                    //  increment line counter


                        }

                    }

                    catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    catch (IOException e) {
                        e.printStackTrace();
                    }
                        return ctr1;
               }
public static boolean isEqual(int[] a, int[] b){
    //precondition: both arrays have same dimension
    // postcondition: return true if all elements same
   
    int i;
    for (i=0; i<a.length; i++)
        if (a[i]!=b[i])
            break;
    if (i<a.length)
        return false;
    else
        return true;
}
public static void clone(int[] a, int[] b){
    // preconditon: assume b has same dimension as a
    // a will be copied into b
   
    for (int i=0; i<a.length; i++)
        b[i]=a[i];
}
/* the search problem is to search an array a for a match on a
 * search argument v, return the position of the first match
 * or a.length if no match is found
 */
  public static int linearSrch(int[] a,int v){
      //precondition: the array is completely filled
      //postcondition:return the position of the first match
      //or a.length if no match
      int i=0;
      for (;i<a.length;i++)
          if (a[i]==v)
              break; // we leave loop because we have a match
      return i;
  }
 
  public static int linearSrch(int[] a,int st, int v){
      //precondition: the array is completely filled
      //postcondition:return the position of the first match from position st on
      //or a.length if no match
      int i=st;
      for (;i<a.length;i++)
          if (a[i]==v)
              break; // we leave loop because we have a match
      return i;
  } 
  public static int binarySrch(int[] a, int v, int s, int e){
      /*precondition: array a is filled and sorted from low to high, s is the start pos and e the end pos
       *postcondition: return first match beginning at pos s, ending at position e
       *
       */
      // base case is when e<s in which case no match
         if (e<s)
             return a.length;
         int guess=(e+s)/2;
         if  (v<a[guess])// this means my guess is too big
             // throw out all elements to the right of guess including guess
             return binarySrch(a,v,s,guess-1);
         else
             if (v>a[guess])
                 return binarySrch(a,v,guess +1,e);
             else
                 return guess;
  }
  public static int interpolationSrch(int[] a, int v, int s, int e){
      /*precondition: array a is filled and sorted from low to high, s is the start pos and e the end pos
       *postcondition: return first match beginning at pos s, ending at position e
       *
       */
      // base case is when e<s in which case no match
         if (e<s)
             return a.length;
         // int guess=(e+s)/2;
         // form ratio of v/ (range of values)
        // double ratio=(double)v/(a[e]- a[s]+1);
         int guess=s+(int)((v-a[s]) *(e-s+1))/(a[e]-a[s]+1);
         System.out.println("guess:"+guess);
         if  (v<a[guess])// this means my guess is too big
             // throw out all elements to the right of guess including guess
            
             return interpolationSrch(a,v,s,guess-1);
         else
             if (v>a[guess])
                 return interpolationSrch(a,v,guess +1,e);
             else
                 return guess;
  }
 public static int binarySrch(int[] a, int v){
     int guess=(a.length-1)/2;
     int s=0;
     int e=a.length-1;
     while (a[guess]!=v && s<e)
     {
          if  (v<a[guess])
              e=--guess;
          else
              s=++guess;
          guess=(s+e)/2;}
     if (a[guess]==v)
         return guess;
     else
         return a.length; // this means no match
     
 }
 public static int interpolationSearch(int[] sortedArray, int toFind){
      // Returns index of toFind in sortedArray, or -1 if not found
      int low = 0;
      int high = sortedArray.length - 1;
      int mid;
     
      while (sortedArray[low] <= toFind && sortedArray[high] >= toFind) {
       mid = low +
             ((toFind - sortedArray[low]) * (high - low)) /
             (sortedArray[high] - sortedArray[low]);  //out of range is possible  here
     
       if (sortedArray[mid] < toFind)
        low = mid + 1;
       else if (sortedArray[mid] > toFind)
        // Repetition of the comparison code is forced by syntax limitations.
        high = mid - 1;
       else
        return mid;
      }
     
      if (sortedArray[low] == toFind)
       return low;
      else
       return -1; // Not found
     }
 public static void reverse(int[] a){
     // Precondition: a has been filled
    //  Post-condition: elements in a are reversed
     
     for (int i=0; i<a.length/2; i++)
         swap(a,i, a.length-1-i);
 }
 public static void scalarMult(double c, double[][] d, int row, int col){
     
     // precondition: the matrix has been filled. row is number of rows, col number of cols
     // postcondition: every element of d will have been multiplied by c
     
     
     // a nested if will run through all the array elements (row, col)
     
     for (int i=0; i <row; i++)
         for (int j=0; j<col; j++)
             d[i][j ] = c * d[i][j];
     
     
 }
 
 public static void addition( double[][] d, double[][] a, double b[][], int row, int col){
     
     // precondition: the matrices a and b have been filled. row is number of rows, col number of cols
     // matrix d has same dimension as a and b
     // postcondition: every element of d will be the sum of the corresponding elements of a and b
     
     
     // a nested if will run through all the array elements (row, col)
     
     for (int i=0; i <row; i++)
         for (int j=0; j<col; j++)
             d[i][j ] = a[i][j] + b[i][j];
 }
 public static void subtraction( double[][] d, double[][] a, double b[][], int row, int col){
     
     // precondition: the matrices a and b have been filled. row is number of rows, col number of cols
     // matrix d has same dimension as a and b
     // postcondition: every element of d will be the difference of the corresponding elements of a and b
     
     
     // a nested if will run through all the array elements (row, col)
     
     for (int i=0; i <row; i++)
         for (int j=0; j<col; j++)
             d[i][j ] = a[i][j] - b[i][j];
 }
 public static void multiplication     ( double[][] d, double[][] a, double b[][]){
 
     // precondition: the matrices a and b have been filled.
     // matrix d rows = matrix a rows and matrix d cols= matric b cols. the number of cols of a is
     // equal to the number of rows of b
     // postcondition: every element of d will be the dot product of the corresponding elements of a and b
     // as shown in class
     
     
     // a nested if will run through all the array elements (row, col)
     for (int i=0; i <d.length; i++)
         for (int j=0; j<d[0].length; j++)
             d[i][j ] = dotProduct(a,b,i,j); // find dot product of the ith row of a with the jth col of b
 
 }
 private static double dotProduct(double[][] a, double b[][], int r, int c){
     // precondition: the matrices a and b have been filled. row is number of rows, col number of cols
     // postcondition: returns the dot product of the rth row of a with the cth col of b
    // note the dot product of the two vectors r and c will have length equal to the columns of a
    // which is just a[0].length
     double sum=0;
     for (int i=0; i<a[0].length; i++)
         sum+=a[r][i] * b[i][c];
     return sum; // goes back to multiplication
 }
 public static void printMat(double[][] a){
     // how to find number of rows of  matrix a
     
     for (int r=0; r<a.length;r++)
     {
         for (int c=0; c<a[0].length; c++)
             System.out.print(" " + a[r][c]); // end inner for loop
         System.out.println(); // print a blank line
     } // end outer for loop
 }
 public static void insertionSort(int[] a) {
     // o{n^2) algorithm very efficient for lists that are almost sorted
     int j;
     for (int i=1; i<a.length; i++){
         // find the proper location for the ith element
         int t=a[i];
         j=i-1;
         while (j>=0 && a[i]< a[j])j--; // j is the pos. we move a[i] into
         for (int k=i-1; k > j; k--) // move over one position to the right
             a[k+1]=a[k];
         // move the ith element ot the jth element
       
         a[j+1]=t;
 }
}
 public static void insertionSort(int[] a, int st, int end) {
     // o{n^2) algorithm very efficient for lists that are almost sorted
     int j;
     for (int i=st +1; i<end+1; i++){
         // find the proper location for the ith element
         int t=a[i];
         j=i-1;
         while (j>=0 && a[i]< a[j])j--; // j is the pos. we move a[i] into
         for (int k=i-1; k > j; k--) // move over one positiion to the right
             a[k+1]=a[k];
         // move the ith element ot the jth element
       
         a[j+1]=t;
 }
}
 //public static void quickSort(int a[]){}
 public static void qS(int a[], int s, int e){
     int p;  
   if (e-s+1>4) {
       p=partition(a,s,e); // divide list in two with pivot in final place
       qS(a,s,p-1); // recursively call quicksort for the  left list
       qS(a,p+1,e);    // recursively call quicksort for the right list
       }
   else insertionSort(a, s,e); // use insertion sort for small lists
       
                     
       
     }
 private static void medianOfThree(int a[], int s, int e){
         if (a[s]> a[(s+e)/2]) swap(a, s, (s+e)/2);
         if (a[e]> a[(s+e)/2]) swap(a, e, (s+e)/2);
         else if (a[e] < a[s]) swap(a,e,s);
     }

 private static int partition(int a[], int s, int e){
     medianOfThree(a, s, e); // call median of three to insure a decent pivot
     int t=a[e]; // store pivot
     int lp=s-1;
     int rp=e;
     while (lp < rp){
       
         do --rp; while (a[rp]>t); //stop rp if less or equal pivot
         do ++lp; while (a[lp]<t);  //stop lp if greater or eq. pivot
         swap(a,lp,rp);
     }
     a[e]=a[rp]; // undo last swap
     a[rp]=a[lp]; // and move pivot
     a[lp]=t;    // to final location
     return lp;
 }
 public static void shellSort(int a[])
 {
     int increment = a.length / 3 + 1;

     // Sort by insertion sort at diminishing increments.
   while ( increment > 1 )
     {
       for ( int start = 0; start < increment; start++ )
           insertSort(a, start, increment );
      
     increment = increment / 3 + 1;
    }
   // Do a final pass with an increment of 1.
     // (This has to be outside the previous loop because
    // the formula above for calculating the next
     // increment will keep generating 1 repeatedly.)
     insertSort( a,0, 1 );    }

     /**
 59:       Insertion sort modified to sort elements at a
 60:       fixed increment apart.
 61:
 62:       The code can be revised to eliminate the initial
 63:       'if', but I found that it made the sort slower.
 64:
 65:       @param start      the start position
 66:       @param increment  the increment
 67:    */
  private static void insertSort(int a[], int start, int increment )
  {
     int j, k, temp;

    for ( int i = start + increment; i < a.length; i += increment )
     {
        j = i;
       k = j - increment;
        if ( a[j] < a[k] )
       {
           // Shift all previous entries down by the current
           // increment until the proper place is found.
          temp = a[j];          do
    {
         a[j] = a[k];
        j = k;
          k = j - increment;
        } while ( j != start && a[k] > temp );          a[j] = temp;
   }
 }
 }

public static void cocktailSort(int a[]){
    // precondition: the array has been filled
    // postcondition: it will be sorted low to high
        boolean swapped; // has a swap been made
          do
          { swapped = false;
            for (int i = 0; i<a.length-1; i++)
           
              if (a[ i ] > a[ i + 1 ] ) // test whether the two elements are in the wrong order
              { swap( a, i ,  i + 1 ); // let the two elements change places
                swapped = true;}
             
           
            if (swapped = false)
              // we can exit the outer loop here if no swaps occurred.
              break;
          
            swapped = false; // start checking from right to left
            for (int i = a.length -2;i>=0; i--)
                 if (a[ i ] > a[ i + 1 ] ) // test whether the two elements are in the wrong order
                  { swap( a, i ,  i + 1 ); // let the two elements change places
                    swapped = true;}
          }
          while (swapped); // if no elements have been swapped, then the list is sorted

}


}