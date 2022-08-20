// How the JAVA System.out.println() and System.out.println() work?
// What's the pattern java followed to print the string

/*
Here, I'm not going to explain how the java PrintStream works. I'm just going to represents the pattern of System.out.print... like how java assembles it..
 */

class CustomOutput {
    // I'm just representing the code behaviour
    // Something line PrintStream class
    public void println(String data) {
        System.out.print(data + "\n");
    }

    public void print(String data) {
        System.out.print(data);
    }

    public void println(long e) {
        // some code to print the value of e
    }

    public void println(int e) {
        // some code to print the value of e
    }

    public void println(double e) {
        // some code to print the value of e
    }

    public void println(float e) {
        // some code to print the value of e
    }

    public void println(char e) {
        // some code to print the value of e
    }

    public void println(boolean e) {
        // some code to print the value of e
    }

    public void println(Object e) {
        // This is also the representation of the println when it receives a Object as a parameter it that case
        // it just calls the toString method of that particular object.
        // For example
        // through (e) toString() method gets called and
        // whatever toString returns, it gets printed
    }
}

class CustomSystem {
    
    final public static CustomOutput out = new CustomOutput();
}

class CustomMain {
    public static void main(String gg[]) {
        // let just test it
        CustomSystem.out.println("hello");
        CustomSystem.out.println("world");
        CustomSystem.out.println("-------------------");
        CustomSystem.out.print("hello");
        CustomSystem.out.print("world");
    }
}
