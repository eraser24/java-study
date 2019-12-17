import java.util.Arrays;

public class Demo08SwitchNotice {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("args = " + Arrays.deepToString(args));
        }
    }
}
