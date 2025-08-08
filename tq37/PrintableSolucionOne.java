package tq37;

interface PrintableOne {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements PrintableOne {
    public void setMargin() {}
    // You don't need to implement setOrientation here, as it is abstract.
}

abstract class NewsPaper extends Paper {
    public void setMargin() {}
    // It doesn't implement setOrientation yet, but it's all good because it's abstract.
}

