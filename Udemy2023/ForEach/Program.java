package Udemy2023.ForEach;

public class Program {
    public static void main(String[] args) {
        
        String[] vect = new String[] {"Maria" , "Bob", "Alex"};

        for(int i = 0; i< vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("-----------");
        for(String obj : vect){   //para cada objeto "obj", contido no vetor vect, faça:
            System.out.println(obj);
        }
    }
}
