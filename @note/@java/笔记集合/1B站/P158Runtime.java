import java.io.IOError;
import java.io.IOException;

public class P158Runtime {
public static void main(String[] args) throws IOException{

    // cup的线程
    System.out.println(Runtime.getRuntime().availableProcessors());

    // 内存大小
    System.err.println(Runtime.getRuntime().maxMemory());

    // 运行cmd 
    // -s时间 -a取消 

    // shutdonw -s -t 1800000 时间
    Runtime.getRuntime().exec("shutdown -a");
    }
}