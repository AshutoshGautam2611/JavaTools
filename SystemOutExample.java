// How the JAVA System.out.println() and System.out.println() work?
// What's the pattern java followed to print the string

/*
Here, I'm not going to explain how the java PrintStream works. I'm just going to represents the pattern of System.out.print... like how java assembles it..
 */

class CustomOutput {
    // I'm just representing the code behaviour
    public void println(String data) {
        System.out.print(data + "\n");
    }
    public void print(String data) {
        System.out.print(data);
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
