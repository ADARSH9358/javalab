public class Vector {
    private double arr[];

    public Vector() {
        this.arr = new double[5];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = i;
        }
    }

    public Vector(double a[]) {
        this.arr = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            this.arr[i] = a[i];
        }
    }

    public Vector(Vector vec) {
        this.arr = new double[vec.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = vec.arr[i];
        }
    }

    public void set(int index, double value) {
        this.arr[index] = value;
    }

    public double get(int index) {
        return this.arr[index];
    }

    public void multiply(double scalar) {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] *= scalar;
        }
    }

    public double multiply(Vector vec) {
        double dot = 0;
        for (int i = 0; i < Math.min(this.arr.length, vec.arr.length); i++) {
            dot += this.arr[i] * vec.arr[i];
        }
        return dot;
    }

    public void print() {
        for (double d : this.arr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] array1 = { 1.0, 2.0, 3.0 };
        Vector vector1 = new Vector(array1);

        Vector vector2 = new Vector(vector1); // Copy constructor

        vector1.set(1, 5.0);
        vector2.set(2, 7.0);

        System.out.println("Vector 1: ");
        vector1.print();
        System.out.println("Vector 2: ");
        vector2.print();

        vector1.multiply(2.0);
        System.out.println("Vector 1 after scalar multiplication: ");
        vector1.print();

        double dotProduct = vector2.multiply(vector1);
        System.out.println("Dot product of Vector 2 and Vector 1: " + dotProduct);
    }
}
