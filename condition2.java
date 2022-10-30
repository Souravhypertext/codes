import java.util.*;

public class condition2 {
    /**
     * @param args
     */
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();

//         if(button ==1){
//             System.out.println("hello");
//         }else if(button ==1){
//             System.out.println("Namaste");
//         }else{
//             System.out.println("bonjour");
//         }
//     }
   
// }


switch(button){
   case 1 :System.out.println("hello");
   break;
   case 2 : System.out.println("Namaste");
   break;
   case 3 : System.out.println("bonjour");
   break;
   default : System.out.println("invalid button");
}
        }
    }
}