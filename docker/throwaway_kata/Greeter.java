// Part of the workload the AOT caches are recorded from. It has to exist before
// any learner's kata does, so what the caches hold are the compiler's classes
// and JUnit's rather than any kata's, and they speed up whatever a learner
// writes. It is shaped like a real kata all the same, a class and a test
// asserting against it, so that the same code paths are the ones that run.
public class Greeter {

    public String greeting() {
        return "hello";
    }
}
