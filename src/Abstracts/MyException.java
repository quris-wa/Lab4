package Abstracts;

public class MyException extends Exception{
    public static class EmptyException extends RuntimeException {
        public EmptyException(String name) {
            super(name);
        }
    }
    public static class StorylineException extends Exception {
        public StorylineException() {
            super();
        }
    }
}
