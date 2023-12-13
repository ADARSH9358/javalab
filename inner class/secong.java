// ? LOCAL INNER CLASS

public class secong {
    int x=5;

    void display(){
        class inner{
            int y=10;
            void display(){
                System.out.println("hello ji "+ x+y);
            }
        }
        inner obj=new inner();
        System.out.println(obj.y);

        new inner().display();
    }

    public static void main(String[] args) {
        secong s=new secong();
        s.display();
    }
}
