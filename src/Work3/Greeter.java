package Work3;

// public class Greeter {
//     private String formality;

//     public String greet() {
//         switch (this.formality) {
//             case "formal":
//                 return "Good evening, sir.";
//             case "casual":
//                 return "Sup bro?";
//             case "intimate":
//                 return "Hello Darling!";
//             default:
//                 return "Hello.";
//         }
//     }

//     public void setFormality(String formality) {
//         this.formality = formality;
//     }
// }

interface Greeting {
    String greet();
}

class FormalGreeting implements Greeting {
    public String greet() {
        return "Good evening, sir.";
    }
}

class CasualGreeting implements Greeting {
    public String greet() {
        return "Sup bro?";
    }
}

class IntimateGreeting implements Greeting {
    public String greet() {
        return "Hello Darling!";
    }
}

public class Greeter {
    private Greeting greeting;

    public String greet() {
        return greeting.greet();
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
}