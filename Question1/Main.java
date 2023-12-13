
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n = 10;
        int tCount = 8;
        int perThread = n / tCount;
        AddThread t[] = new AddThread[tCount];
        int sum = 0;
        int i;
        for (i = 0; i < tCount; i++) {
            t[i] = new AddThread(i * perThread + 1, (i + 1) * perThread);
            try{
            Thread.sleep(100);
            }
            catch(InterruptedException e){

            }
        }

        for (int j = 0; j < t.length; j++) {
            t[j].join();
        }

        for (int j = 0; j < t.length; j++) {
            sum += t[j].getSum();
        }

        for (int j = i * perThread + 1; j <= n; j++) {
            sum += j;
        }

        System.out.println(sum);

    }
}