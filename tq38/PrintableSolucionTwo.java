package tq38;

interface PrintableTwo {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements PrintableTwo {
    public void setMargin() {}
    // It doesn't implement setOrientation yet, but it's all good because it's abstract.
}

class NewsPaper extends Paper {
    public void setMargin() {}
    public void setOrientation() {
        // Implementation of the method required by the interface
    }
}
