package w9;

public class Final {
    public static void main(String[] args){
        for(int i=0;i<=15;i++){
            Worker worker=new Worker(i);
            worker.start();
        }
    }
}
