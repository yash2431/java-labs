public class ComplexNumber {
     double real;
     double imaginary;

    
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0.0;
    }


    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    
    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, -2);

        System.out.print("Complex number 1: ");
        num1.display();
        System.out.print("Complex number 2: ");
        num2.display();

        ComplexNumber sum = num1.add(num2);
        System.out.print("Sum of complex numbers: ");
        sum.display();
    }
}
