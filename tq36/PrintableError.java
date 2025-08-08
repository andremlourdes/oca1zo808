package tq36;

/*
The presented code is generating a compilation error because the Printable interface requires the implementation of two methods: setMargin() and setOrientation().
 The abstract class Paper implements only setMargin(),
 leaving setOrientation() unimplemented, which is only allowed if Paper is declared as abstract (which it already is).
 However, the concrete class NewsPaper inherits from Paper and also does not implement setOrientation(),
 which causes the error.📌 Two possible modifications in tq37 and tq38, made independently, that resolve the error:
 */

interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

class NewsPaper extends Paper { //Line 12
    public void setMargin() {}
    //Line 14
}
