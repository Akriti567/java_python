import java.util.*;
public class mergesort_np03cs4a220202 { //creating class 
    public static void getInput(ArrayList<Integer> al) {
        //creating object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int s = sc.nextInt();
        //printing array of elements
        for (int i = 0; i < s; i++) {
            System.out.println("Enter the index of array" +i);
            //loop until i less than size
            al.add(sc.nextInt());
        }
        System.out.println("Unsorted array: ");
        System.out.println(al);
    }
    //creating method getOutput
    public static void getOutput(ArrayList<Integer> al) {
        System.out.println("Sorted Array: ");
        System.out.print("[");
        for (int i = 0; i < al.size(); i++) {
            if (i == al.size() - 1) {
                System.out.print(al.get(i));
            } else {
                System.out.print(al.get(i) + ", ");
            }
        }
        System.out.print("]");
    }
    //creating method merge
    public static void merge(ArrayList<Integer> al, int begin, int mid_I, int end) {
        int beginning = begin;
        int midIndex = mid_I + 1;
        int ending = end;
        // while loop
        while (begin <= midIndex && midIndex <= end) {
            if (al.get(begin) > (al.get(midIndex))){
                al.add(begin, al.remove(midIndex));
                begin++;
                midIndex++;
            } else if (Objects.equals(al.get(begin), al.get(midIndex))) {
                al.add(begin , al.remove(midIndex));
                begin++;
                midIndex++;
            } else {
                begin++;
            }
        }
    }
    //creating method sort
    public static void sort(ArrayList<Integer> al, int begin, int end) {
        if(begin<end) {
            int mid_I = (begin + end) / 2;
            sort(al, begin, mid_I);
            sort(al,mid_I+1, end);
            merge(al, begin, mid_I, end);
        }
    }
    //main function
    public static void main(String[] args) {
        //creating object of this class
        // st is variable name
        mergesort_np03cs4a220202 st = new mergesort_np03cs4a220202();
        ArrayList<Integer> al = new ArrayList<>();
        //calling getInputmethod method by passing parameter using the obj
        st.getInput(al);
        //calling sort method by passing parameters using the object
        st.sort(al, 0, al.size()-1);
        //calling getOutput method by passing parameter using the object
        st.getOutput(al);
    }
}

