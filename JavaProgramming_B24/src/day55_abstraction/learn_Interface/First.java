package day55_abstraction.learn_Interface;

public interface First {



    public abstract  void write();// public abstract part is gray because we dont need it all public abstract by default

    void  read(); // its also public abstract  method


}

class Book implements First{ // how to go from interface to class we use implements word
    @Override
    public void write() {

    }

    @Override
    public void read() {

    }
}
