//brute-force
import java.util.*;
public class Main {
    public static int isPossible(int[] books, int pages){
        int n=books.length;
        int stu=1;
        int pagesStu=0;
        for(int i=0;i<n;i++){
            if(pagesStu+books[i]<=pages){
                pagesStu+=books[i];
            }
            else{
                stu++;
                pagesStu=books[i];
            }
        }
        return stu;
    }
    public static int findPages(int[] books, int students) {
        int n=books.length;
        if(students>n){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(books[i],max);
            sum+=books[i];
        }
        for(int i=max;i<=sum;i++){
            if(isPossible(books,i)==students){
                return i;
            }
        } 
        return -1;
    }

    public static void main(String[] args) {
        int books[]={25,46,28,49,24}; 
        int students= 4;
        int ans = findPages(books, students);
        System.out.println("The answer is: " + ans);
    }
}
