package revisao01;

public class rev_Ex07 {
    public static void main(String[] args){
        int i = 4;
        int con = 1;
        while (true){
            System.out.println(i + " x " + con + " = " + (i * con));
            con++;
            if (con > 10){
                break;
            }
        }
    }
}
